package main

import(
	"fmt"
)

func main(){
	// string的基本使用
	var address string = "北京天津 123 adf"
	fmt.Println(address)

	// golang中的字符串一旦赋值，字符串就不能修改了，在go中字符串是不可变得
	// var str = "hello"
	// str[0] = 'H' // 这里就不能去修改str的内容，即go中的字符串是不可变的

	/*
	字符串的两种表现形式：
		1、双引号，会识别转义字符
		2、反引号，可以实现防止攻击，输出源码等效果
	*/
	
	// 使用的是反引号
	str3 := `package main

	import(
		"fmt"
		"unsafe"
	)
	
	func main(){
		// 且只能使用ture 或者false
		var b = false
		fmt.Println("b =",b)
		fmt.Println("b的占用空间是 = ",unsafe.Sizeof(b))
	}`
	fmt.Println(str3)

	var a int 
	var b float32
	var c float64
	var isMarried bool
	var name string
	// "%v"表示按照变量的值输出
	fmt.Printf("a=%d,b=%f,c=%f,isMarried=%v, name=%v",a,b,c,isMarried,name)
}