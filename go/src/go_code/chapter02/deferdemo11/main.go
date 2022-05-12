package main

import (
	"fmt"
)

// defer 延迟执行，在return之后再执行defer后面的语句，一般作为关闭流使用
// 多个defer的执行顺序的是后进先出
// 执行defer时，会同时将defer涉及到的语句中的变量值也压入栈中，
func sum(n1 int,n2 int) int {
	// 当执行到defer时，暂时不执行，会将defer后面的语句压入到独立的栈
	// 当函数执行完毕后，再从defer栈中取出语句执行
	defer fmt.Println("ok1 n1=",n1)
	defer fmt.Println("ok2 n2=",n2)
	n1 ++
	n2 ++
	res := n1 + n2;
	fmt.Println("res =",res)
	return res
}

func main(){
	sum(2,3)
}