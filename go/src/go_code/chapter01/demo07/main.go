package main

import(
	"fmt"
)

// 演示golang中小数类型的使用
func main(){
	var price float32 = 89.12
	fmt.Println("price =",price)
	var num1 float32 = -0.00000
	var num2 float32 = -78123.09
	fmt.Println(num1,num2)

	var num3 float32 = -123.0000901
	var num4 float64 = -123.0000901
	fmt.Println("num3 =",num3,"num4 =",num4);
	// golang的浮点型的默认数据类型是
	var num5 = 123.3
	fmt.Printf("golang默认类型转换的浮点数数据类型是%T\n",num5)

	// 十进制数形式
	num6 := 5.12
	num7 := .123

	fmt.Println("num6=",num6,"num=",num7)

	// 科学计数法
	num8 := 3.1415e2 //  3.1415 * 10^2
	fmt.Println("num8 =",num8)
	num9 := 3.141592e-2
	fmt.Println("num9 =",num9)
}