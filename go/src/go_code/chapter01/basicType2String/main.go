package main

import(
	"fmt"
	"strconv"
)

// 显示golang中的基本数据类型转换成string
func main(){
	var num1 int = 90
	var num2 float64 = 23.456
	// var b bool = true
	// var myChar byte = 'h'
	var str string;

	// 1、使用fmt包中的函数Sprintf
	str = fmt.Sprintf("%d",num1)
	fmt.Printf("str type %T str=%v \n",str,str)

	str = fmt.Sprintf("%f",num2)
	fmt.Printf("str type %T str=%v \n",str,str)

	// 2、第二种方式 strconv 转换
	var num3 int = 99
	var num4 float64 = 23.44
	// var b2 bool = true

	str = strconv.FormatInt(int64(num3),10)
	fmt.Printf("str type %T str=%q \n",str,str)

	// 'f'代表输出格式：十进制，10代表小数点后10位，64代表是float64位
	str = strconv.FormatFloat(num4,'f',10,64)
	fmt.Printf("str type %T str=%q \n",str,str)
}