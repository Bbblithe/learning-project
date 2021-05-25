#include <stdio.h>
/*
中国古代数学家张丘建在他的《算经》中提出了一个著名的“百钱买百鸡问题”，
鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，百钱买百鸡，问翁、母、雏各几何？
*/
int main(){
    int cock,hen,chick;
    for(int cock = 0 ; cock <= 20 ; cock++){
        for(int hen = 0 ; hen <= 33; hen++){
            for(int chick = 0 ; chick <= 300 ; chick ++){
                if((cock * 15 + hen * 9 + chick * 1) == 300 && (cock + hen + chick == 100)){
                    printf("%d,%d,%d\n",cock,hen,chick);
                }
            }
        }
    }
    return 0;
}