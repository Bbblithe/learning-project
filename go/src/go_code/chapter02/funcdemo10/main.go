package main

import(
	"fmt"
)

// 累加器
func AddUpper() func (int) int { // 这里的返回值是一个匿名函数
	var n int = 10;
	var str = "hello"
	var gag = "dada"
	// 可以这样理解，闭包就是类，函数是操作，n是字段，函数和他使用的n构成闭包
	return func (x int) int {  // 但是这个匿名函数引用到函数外的n，因此这个匿名函数就和n形成了一个整体，构成闭包
		n = n + x 
		str += fmt.Sprint(x)
		fmt.Println("str =",str)
		fmt.Println(gag)
		return n
	}
}


func main(){
	f := AddUpper()
	// 当我们反复的调用f函数时，因为n是初始化一次，因此没调用一次就进行累计
	fmt.Println(f(1)) // 11
	fmt.Println(f(2)) // 13
	fmt.Println(f(3)) // 16
}