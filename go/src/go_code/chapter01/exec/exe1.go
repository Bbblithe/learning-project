package main

import(
	"fmt"
)

func main(){

	// var n1 int32 = 12
	// var n2 int64
	// var n3 int8

	// // n2 = n1 + 20 // int32 ---> int64 错误
	// // n3 = n1 + 20 // int32 ---> int8 错误

	// n2 = int64(n1 + 20)
	// n3 = int8(n1+20)
	// fmt.Println(n2,n3)

	var n1 int32 = 12
	var n3 int8
	var n4 int8

	n4 = int8(n1) + 127 // 编译通过，但是会溢出，结果不是12 + 127
	// n3 = int8(n1) + 128 // 编译无法通过，因为128已经超过了int8的范围

	fmt.Println(n1,n3,n4)
}