package main

import "fmt"

func main(){
	// golang的变量使用方式
	var i int // int 的默认值是0
	fmt.Println("i=",i)

	// 第二种，根据赋值自动判断变量类型（类型推导）
	var num = 10.11
	fmt.Println("num =",num);

	// 第三种：省略var，注意：=左侧的变脸更不应该是已经声明过的，否则会导致编译错误
	// 下面的方式等价 var name string  name = "tom"
	// ":=" 的 ':' 不能省略
	name := "tom"
	fmt.Println("name =",name)
}