package main

import(
	"fmt"
)

func main(){
	// 基本数据类型在内存布局
	var a int = 10
	var pt *int = &a

	// i的地址是多少呢
	fmt.Println("i的地址",pt,&a,&pt,*pt)
}