package main

import "fmt"

type myFunType func(int, int) int // 这时myFunc 就是 func(int, int) int 数据类型


func fuck(a int, b int) int{
	return a+b
}

func funcFunc(myfun myFunType,a int, b int) int {
	return myfun(a,b)
}

func getSumAndSub(n1 int, n2 int) (sum int, sub int){
	sum = n1 + n2
	sub = n1 - n2
	return 
}	

// 可变性参数
func getAllSum(n1 int,args... int) int{
	sum := n1
	for i:=0 ; i < len(args) ; i ++{
		sum += args[i]
	}
	return sum
}

// golang支持自定义数据类型
func main(){
	type myInt int // 给int取了别名，但是go仍然认为myInt和int是两个类型
	var num1 myInt
	var num2 int
	num1 = 40
	num2 = int(num1)// 各位这里依然需要显式转换
	fmt.Println(num1,num2)
	fu := fuck

	result3 := funcFunc(fu,10,29)

	fmt.Println(result3)

	var sum,sub int
	sum,sub = getSumAndSub(10,10)
	fmt.Println(sum,sub)
	fmt.Println("all Sum =",getAllSum(1,2,3,4,35,3,54,34))
}