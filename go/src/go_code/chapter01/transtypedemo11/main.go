package main

import(
	"fmt"
)

// golang中所有的转换都需要强制转换
func main(){
	var i int32 = 100
	// 希望将i => float
	var n1 float32 = float32(i)
	var n2 int8 = int8(n1) // 被转换的是变量存储的数据（即值），变量本身的数据并没有发生变化
	fmt.Printf("n1的数据类型%T\n",n1)
	fmt.Printf("i = %d,n1 = %f,n2=%d",i,n1,n2)
}