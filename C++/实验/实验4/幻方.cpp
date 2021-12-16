#include <iostream>
#include<iomanip> // 引入
using namespace std;
#define SIZE 30

class ins{
public:
    ins(int n){
        // int array[n][n] = {0};
        for(int i = 0 ; i < SIZE ; i ++){
            for(int j = 0 ; j < SIZE ; j ++){
                array[i][j] = 0;
            }
        }        
        int x = 0;int y = n/2;
        array[x][y] = 1;
        int px,py;
        for(int i = 1 ; i < n*n ; i ++){
            x--;y++;
            if(x < 0){
                x = n - 1;
            }
            if(y > n - 1){
                y = 0;
            }
            if(array[x][y] != 0){
                x = px + 1;
                y = py;
            }
            array[x][y] = i + 1;
            px = x;
            py = y;
        }
    }

    int check(int n){
        int sum = 0;
        int temp = 0;
        for(int j = 0 ; j < n ; j ++){
            sum += array[0][j];
        }       

        // 检查每行之和
        for(int i = 1 ; i < n ; i ++){
            temp = 0 ;
            for(int j = 0 ; j < n ; j ++){
                temp += array[i][j];
            }
            if(sum != temp){
                return 0;
            }
        }

        // 检查每列之和
        for(int i = 0 ; i < n ; i ++){
            temp = 0;
            for(int j = 0 ; j < n ; j ++){
                temp += array[j][i];
            }
            if(sum != temp){
                return 0;
            }
        }

        // 检查主反对角线之和
        int t = 0;
        temp = 0; // 添加了这一行
        for(int i=0; i<n; i++){
            temp += array[i][i];
            t +=array[i][n-i-1];
        }
        if(temp != sum || t != sum){
            return 0;
        }
        return 1;
    }

    void show(int n){
        int weishu = 0;
        int num = n*n;
        for(weishu = 1 ; num /= 10 ; weishu ++);
        for(int a = 0 ; a < n ; a ++){
            for(int b = 0 ; b < n ; b ++){
                // cout << array[a][b] << " ";
                cout << setw(weishu) << array[a][b] << setw(weishu) << " ";
            }
            cout << endl;
        }
    }

    // int array[n][n];
    int array[SIZE][SIZE];
};

// void huanfang(int n){
//     int array[SIZE][SIZE] = {0};
//     int x = 0;int y = n/2;
//     array[x][y] = 1;
//     int px,py;
//     for(int i = 1 ; i < n*n ; i ++){
//         x--;y++;
//         if(x < 0){
//             x = n - 1;
//         }
//         if(y > n - 1){
//             y = 0;
//         }
//         if(array[x][y] != 0){
//             x = px + 1;
//             y = py;
//         }
//         array[x][y] = i + 1;
//         px = x;
//         py = y;
//     }

//     for(int a = 0 ; a < n ; a ++){
//         for(int b = 0 ; b < n ; b ++){
//             cout << array[a][b] << " ";
//         }
//         cout << endl;
//     }
// }

int main(){
    // huanfang(3);
    int n = 0;
    while(1){
        cout << "请输入1 - 30 之间奇数的以生成奇数幻方:" ;
        cin >> n;
        if(n % 2){
            break;
        }
        cout << "请输入正确的奇数" << endl;
    }
    ins h(n);
    h.show(n);
    cout << (h.check(n) ? "经检验，该矩阵是幻方！" : "经检验，该矩阵不是幻方") << endl;
    return 0;
}