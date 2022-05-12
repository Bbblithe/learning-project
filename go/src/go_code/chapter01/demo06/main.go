package main

import (
	"fmt"
	"unsafe"
)


// 演示golang中整数类型的使用
func main(){
	var i int = 1
	fmt.Println(i)

	var a int8 = -128
	fmt.Println(a)

	// 如何查看某个变量的数据类型
	fmt.Printf("n1 的类型是 %T",a)
	fmt.Println()

	// 如何查看某个变量的字节大小和数据类型
	var n2 int64 = 10
	fmt.Printf("n2的类型%T,n2占用的字节%d",n2,unsafe.Sizeof(n2));

}