package main

import "fmt"

func main(){
	var name string
	var age byte
	var sal float32
	var isPassed bool
	// 方式1
	// fmt.Print("请输入姓名：")
	// fmt.Scanln(&name)
	// fmt.Print("请输入年龄：")
	// fmt.Scanln(&age)
	// fmt.Print("请输入薪水：")
	// fmt.Scanln(&sal)
	// fmt.Print("输入通过：")
	// fmt.Scanln(&isPassed)

	fmt.Scanf("%s %d %f %w",&name,&age,&sal,&isPassed)
	fmt.Printf("名字是 %v\n 年龄是%v\n 薪水是%v\n 通过%v\n",name,age,sal,isPassed)
}