package main

import(
	"fmt"
	"unsafe"
)

func main(){
	// 且只能使用ture 或者false
	var b = false
	fmt.Println("b =",b)
	fmt.Println("b的占用空间是 = ",unsafe.Sizeof(b))
}