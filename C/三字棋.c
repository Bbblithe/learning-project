#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ROW 3
#define COL 3

void InitBoard(char arr[ROW][COL],int row,int col){
    int i,j;
    for(i = 0 ; i < row ; i ++){
        for(j = 0 ; j < col ; j ++){
            arr[i][j] = ' ';
        }
    }
}

void DisplayBoard(char board[ROW][COL] , int row ,int col){    
    for(int i = 0 ; i < row ; i ++){
        // // 1.打印一行的数据
        // printf(" %c | %c | %c \n",board[i][0],board[i][1],board[i][2]);
        // // 2.打印分割行
        // if( i < row - 1){
        //     printf("---|---|---\n");
        // }
        int j;
        for(j = 0 ; j < col ; j ++){
            // 1.打印一行的数据
            printf(" %c ",board[i][j]);
            if(j < col - 1){
                printf("|");
            }
        }
        printf("\n");
        // 2.打印分割行
        if(i < row - 1){
            for( j = 0 ; j < col ; j ++){
                printf("---");
                if(j < col - 1){
                    printf("|");
                }
            }
            printf("\n");
        }
    }
}

void PlayerMove(char board[ROW][COL] , int row , int col){
    int x = 0 ;
    int y = 0 ;
    printf("玩家走:>\n");
    while(1){
        printf("请输入要下的坐标:>");
        scanf("%d%d",&x,&y);
        if(x >= 1 && x <= row && y >= 1 && y <= col){
            if(board[x - 1][y - 1] == ' '){
                board[x - 1][y - 1] = '*';
                break;
            }else{
                printf("该坐标被占用\n");
            }
        }else{
            printf("坐标非法，重新输入\n");
        }
    }
}

void ComputerMove(char board[ROW][COL] , int row , int col){
    int x = 0 ;
    int y = 0 ;
    printf("电脑走:>\n");
    while(1){
        x = rand() % row;
        y = rand() % col;
        if(board[x][y] == ' '){
            board[x][y] = '#';
            break;
        }
    }
}

// 返回1，表示棋盘满了
// 返回0，表示棋盘没满
int IsFull(char board[ROW][COL] , int row , int col){
    int i,j;
    for(i = 0 ; i < row ; i ++){
        for( j = 0 ; j < col ; j++ ){
            if(board[i][j] == ' '){
                return 0;
            }
        }
    }
    return 1;
}

// 告诉四种状态
// 玩家赢 - '*'
// 电脑赢 - '#'
// 平局   - 'Q'
// 继续   - 'C'

char IsWin(char board[ROW][COL], int row , int col){
    int i = 0 ;
    // 横三行
    for(i = 0 ; i < row ; i ++){
        if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' '){
            return board[i][0];
        }
    }
    // 竖三列
    for(i = 0 ; i < col ; i ++){
        if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' '){
            return board[0][i];
        }
    }
    // 正对角线
    if( board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
        return board[0][0];
    }

    // 反对角线
    if( board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] != ' '){
        return board[1][1];
    }

    // 判断是否平局
    if(IsFull(board , ROW , COL) == 1){
        return 'Q';
    }
    return 'C';
}

// 测试三子棋游戏
void menu(){
    printf("*******************\n");
    printf("***1.play 0.exit***\n");
    printf("*******************\n");
}

/*
   ｜   ｜   
---｜---｜---
   ｜   ｜ 
---｜---｜---
   ｜   ｜   
*/

// 游戏的整个算法实现
void game(){
    char ret;
    // 数组-存放走出的棋盘信息
    char board[ROW][COL] = {'0'}; // 全部空格
    // 初始化棋盘
    InitBoard(board,ROW,COL);
    // 打印棋盘
    DisplayBoard(board,ROW,COL);
    // 下棋
    while(1){
        // 玩家下棋
        PlayerMove(board,ROW,COL);
        DisplayBoard(board,ROW,COL);
        //判断玩家是否赢
        ret = IsWin(board,ROW,COL);
        if(ret != 'C'){
            break;
        }

        // 电脑下棋
        ComputerMove(board,ROW,COL);
        DisplayBoard(board,ROW,COL);
        // 判断电脑是否赢
        ret = IsWin(board,ROW,COL);
        if(ret != 'C'){
            break;
        }
    }
    if( ret == '*'){
        printf("玩家赢\n");
    }else if( ret == '#'){
        printf("电脑赢\n");
    }else{
        printf("平局\n");
    }

}

void test(){
    int input ;
    srand((unsigned int)time(NULL));
    do{
        menu();
        printf("请选择:> ");
        scanf("%d",&input);
        switch (input){
            case 1:
                game();
                break;
            case 0:
                printf("退出游戏\n");
                break;
            default:
                printf("选择错误，请重新选择\n");
                break;
        }
    }while(input);
}

int main(){
    test();
    return 0;
}