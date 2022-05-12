package main

import(
	"fmt"
)

func main(){
	var c1 byte = 'a'
	var c2 byte = '0'

	// 当我们直接输出byte值，就是输出对应的字符ASC码值
	fmt.Println("c1 =",c1)
	fmt.Println("c2 =",c2)
	// 如果我们希望输出对应的字符，需要使用格式化输出
	fmt.Printf("c1=%c c2=%c \n",c1,c2)

	// var c3 byte = '被' 
	// go中使用utf-8编码格式，汉字占三个字节
	var c3 int = '被'
	fmt.Printf("c3 = %c\n",c3)

}