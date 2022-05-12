package main

import(
	"fmt"
)

var (

	// fun1是一个全局变量，fun1就是一个全局匿名函数
	Fun1 = func(n1 int, n2 int) int {
		return n1 * n2;
	}
)

func main(){
	// 在定义匿名函数的时候，就直接调用，这种匿名函数只能调用一次

	// 案例演示，求两个数的和，使用匿名的方式完成
	res1 := func (n1 int ,n2 int) int {
		return n1 + n2;
	}(10,20)

	fmt.Println("result =",res1);

	// 将匿名函数func (n1 int, n2 int) int赋给a变量
	// a的数据类型就是函数类型, 此时我们可以通过a完成调用
	a := func (n1 int ,n2 int) int {
		return n1 - n2;
	}
	rest2 := a(1,3);
	fmt.Println("rest2 =",rest2);
	// 全局匿名函数的使用
	res4 := Fun1(4,9);
	fmt.Println("res4 =",res4);
}