package main

import(
	"fmt"
	"math/rand"
	"time"
)

func main(){
	rand.Seed(time.Now().Unix())
	i := 0
	for {
		if (rand.Intn(100) + 1 == 99){
			fmt.Println("次数",i)
			break
		}
		i ++
	}
}