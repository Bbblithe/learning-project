package main

import "fmt"

// 在go中函数也是一种数据类型
// 可以赋值给一个变量，该变量就是一个函数类型的变量，通过该变量可以调用函数

func getSum(n1 int, n2 int) int {
	return n1 + n2
}

// 函数既然是一种数据类型，则函数也可以作为形参来调用
func myFun(funvar func(int ,int) int, num1 int ,num2 int) int {
	return funvar(num1,num2)
}

func main(){
	a := getSum
	fmt.Printf("a的类型%T,\ngetSum的类型是%T,\n",a,getSum)
	res := a(10, 40) // 等价 res := getSum(10, 40)
	fmt.Println("res =",res)

	result := myFun(a,19,21)

	fmt.Println("result =",result)
}