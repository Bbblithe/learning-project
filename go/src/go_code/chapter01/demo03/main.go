package main

import "fmt"

// 全局变量的声明以及定义
var a1 = 100
var a2 = 11.2
var name = "blithe"

// 上面的声明方式，也可以改成一次性声明
var(
	c1 = 100
	c2 = 22.2
	name2 = "andy"
)

func main(){
	// 该案例演示golang如何一次性声明多个变量
	// var n1,n2,n3 int
	// fmt.Println("n1 =",n1)
	// fmt.Println("n2 =",n2)
	// fmt.Println("n3 =",n3)

	// // 一次性声明多个变量的方式
	// var a1,name,a3 = 100, "tom", 888
	// fmt.Println("a1 =",a1)
	// fmt.Println("a3 =",a3)
	// fmt.Println("name =",name)

	// 一次性声明多个变量使用类型推导
	n1,name,n3 := 100,"tom", 888
	fmt.Println("n1 =",n1, "name =", name, "n3 =",n3)
}