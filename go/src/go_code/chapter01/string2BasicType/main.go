package main

import(
	"fmt"
	"strconv"
)

// string转换成基本数据类型
func main(){
	var str string = "true"
	var flag bool

	flag,_ = strconv.ParseBool(str)
	fmt.Printf("flag type = %T flag = %v \n",flag,flag)

	var str2 string = "1235234"
	var n1 int64
	n1,_ = strconv.ParseInt(str2,10,64)
	fmt.Printf("n1 type = %T  n1 = %v \n",n1,n1)

	var str3 string = "123.123123"
	var f1 float64
	f1,_ = strconv.ParseFloat(str3,32)
	fmt.Printf("f1 type = %T  f1 = %v \n",f1,f1)
}