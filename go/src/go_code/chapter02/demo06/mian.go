package main

import "fmt"

// go语言中不支持函数的重载

func test(a *int){
	*a ++
	fmt.Println("test a = " ,a)
}

func main(){
	num := 20
	fmt.Println("main num = " ,&num)
	test(&num)
	fmt.Println(num);
}
