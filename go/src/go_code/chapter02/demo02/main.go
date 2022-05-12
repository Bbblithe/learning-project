package main

import "fmt"

func main(){
	// 在golang中， ++ 和 -- 只能独立使用
	var i int = 8
	var a int
	fmt.Println(i,a)
	// a  = i ++  错误i++只能独立使用
	// if i ++ > 0{ 仍然有问题
	// }
	 // ++ i 在golang中没有前置++
}