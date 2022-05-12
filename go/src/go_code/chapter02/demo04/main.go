package main

import(
	"fmt"
)

func main(){

	// 字符串遍历方式
	var str string = "hello world!\n"
	for i := 0 ; i < len(str) ; i ++{
		fmt.Printf("%c",str[i])
	}

	// for-range
	str = "abc ~ok 日内瓦"
	for index,val := range str{
		fmt.Printf("index = %v,val = %c \n",index,val)
	}
}