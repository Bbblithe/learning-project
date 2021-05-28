#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define ROW 9
#define COL 9
#define ROWS ROW+2
#define COLS COL+2
#define EASY_COUNT 10;

void InitBoard(char board[ROWS][COLS] , int rows , int cols , char set){
    int i = 0 ;
    int j = 0 ;
    for( i = 0 ; i < rows ; i ++){
        for( j = 0 ; j < cols ; j ++){
            board[i][j] = set;
        }
    }
}

void DisplayBoard(char board[ROWS][COLS] , int row , int col){
    int i,j;
    // 打印列号
    for(i = 0 ; i <= col ; i++){
        printf("%d ", i );
    } 
    printf("\n");
    for( i = 1 ; i <= row ; i++){
        printf("%d ", i);
        for( j = 1 ; j <= col ; j ++){
            printf("%c ",board[i][j]);
        }
        printf("\n");
    }
}

void setMine(char board[ROWS][COLS], int row , int col){
    int count = EASY_COUNT;
    while(count){
        int x = rand() % row + 1; // 1 - 9
        int y = rand() % col + 1;
        if(board[x][y] == '0'){
            board[x][y] = '1';
            count --;
        }
    }
}

int get_mine_around(char mine[ROWS][COLS] , int x, int y){
    return mine[x -1][y] + mine[x - 1][y + 1] + mine[x][y +1] +
    mine[x + 1][y + 1] + mine[x + 1][y] + mine[x + 1][y - 1] +
    mine[x][y - 1] + mine[x - 1][y - 1] - 8 * '0';
}

void Refresh(char mine[ROWS][COLS] , char check[ROWS][COLS] , char mine2[ROWS][COLS] , int x , int y){
    int count = get_mine_around(mine , x , y);
    if(!count && x > 0 && y > 0 && mine2[x][y] != ' '){
        mine2[x][y] = ' ';
        Refresh(mine, check, mine2, x - 1, y);
		Refresh(mine, check, mine2, x + 1, y);
		Refresh(mine, check, mine2, x, y + 1);
		Refresh(mine, check, mine2, x, y - 1);
    }
    check[x][y] = count + '0';
}

void FindMine(char mine[ROWS][COLS] , char check[ROWS][COLS] ,char copymine[ROWS][COLS], int row , int col){
    int x , y ;
    int count = EASY_COUNT;
    int win = 0 ;
    while(win < row*col - count){
        printf("请输入排查雷的坐标:>");
        scanf("%d%d",&x,&y);
        if(x >= 1 && x <= row && y >=1 && y <= col){
            // 坐标合法
            // 1.踩雷
            if (mine[x][y] == '1'){
                printf("很遗憾，你被炸死了\n");
                DisplayBoard(mine , row , col);
                break;
            }else{ // 2.不是雷
                // 计算x,y坐标周围有几个雷
                // int count = get_mine_around(mine , x , y);
                // check[x][y] = count + '0';
                Refresh(mine , check , copymine , x , y);
                DisplayBoard(check , row , col);
                win ++;
            }
        }else{
            printf("输入坐标非法，请重新输入!\n");
        }
    }
    if(win == row*col - count){
        printf("恭喜你，排雷成功\n");
        DisplayBoard(mine , row , col);
    }
}

void copy(char copymine[ROWS][COLS], char mine[ROWS][COLS],int row,int col){
	int i = 0, j = 0;
	for (i = 0; i < row; i++){
		for (j = 0; j < col; j++){
			copymine[i][j] = mine[i][j];
		}
    }
}

void menu(){
    printf("*******************\n");
    printf("***1.play 0.exit***\n");
    printf("*******************\n");
}

void game(){
    // 雷的信息存储

    // 1.布置好的雷的信息
    char mine[ROWS][COLS] = { 0 };// 11*11

    // 2.排查出的雷的信息
    char check[ROWS][COLS] = { 0 };

    // 3.复制一份雷图用来操作使用递归
    char copymine[ROWS][COLS] = { '0' };
    copy(copymine , mine , ROW , COL);

    // 初始化
    InitBoard(mine , ROWS , COLS , '0');
    InitBoard(check , ROWS , COLS , '*');
    // 打印棋盘
    DisplayBoard(check , ROW , COL);
    // 1.布置雷
    setMine(mine , ROW , COL);
    DisplayBoard(mine , ROW ,COL);

    // 2.扫雷
    FindMine(mine , check , copymine , ROW , COL);
}

void test(){
    int input = 0 ;
    srand((unsigned int)time(NULL));
    do{
        menu();
        printf("请选择:>");
        scanf("%d",&input);
        switch(input){
            case 1:
                game();
                break;
            case 0:
                printf("退出游戏\n");
                break;
            default:
                printf("选择错误\n");
                break;
        }
    }while(input);
}

int main(){
    test();
    return 0;
}