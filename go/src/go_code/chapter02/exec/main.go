package main

import(
	"strings"
	"fmt"
)

func makeSuffix(suffix string) func(string) string{
	return func(file string) string {
		if(strings.HasSuffix(file,suffix)){
			return file
		}
		return file + ".jpg"
	}
}


func main(){
	fun := makeSuffix(".jpg")
	fmt.Println(fun("abc.jp"))
}