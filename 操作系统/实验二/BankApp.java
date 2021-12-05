package 操作系统.实验二;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/12/3 08:34
 * Description:
 */


public class BankApp {
    static int Finish[];

    static int Available[] = {3,3,2};
    static int Max[][] = {{7,5,3},{3,2,2},{9,0,2},{2,2,2},{4,3,3}};
    static int Allocation[][] = {{0,1,0},{2,0,0},{3,0,2},{2,1,1},{0,0,2}};
    static int Need[][] = {{7,4,3},{1,2,2},{6,0,0},{0,1,1},{4,3,1}};
    static int over[] = new int[5];

    public static void main(String[] args) throws IOException{
        int process = 0;
        int result = 0 ;
        int Request[] = new int[3];
        int sourceNum = 0 ;

        while(true) {
            while (true) {
                if (isProcessAllOver() == 1) {
                    System.out.println("系统中全部进程完毕！");
                    return;
                }
                systemStatus();
                System.out.print("请输入操作进程:");
                process = getInt();
                if (process == 0) {
                    System.out.println("放弃申请，退出系统！");
                    return;
                } else if (process < 1 || process > 5 || over[process - 1] == 1) {
                    System.out.println("系统无此进程！");
                } else {
                    break;
                }
            }
            System.out.println("此进程申请各资源（A，B，C）数目：");
            for (int i = 0; i < 3; i++) {
                System.out.print((char) (65 + i) + "资源:");
                sourceNum = getInt();
                Request[i] = sourceNum;
            }

            result = Banker(process, Request);
            if (result == 0) {
                Allow(process, Request);
            }else{
                forbiddenSeason(result);
            }
        }
    }

    public static int Banker(int process , int[] request){
        int num = 0;
        int Finish[] = new int[5];
        int work[] = new int[5];
        int tempAvailable[] = new int[3];
        int tempAllocation[][] = new int[5][3];
        int tempNeed[][] = new int[5][3];
        for(int i = 0 ; i < 3 ; i ++){
            if(request[i] > Available[i]){ // 由于请求数量大于所空闲数量，因此放弃分配
                return 1;
            }
        }

        for(int i = 0 ; i < 3 ; i ++){
            if(request[i] > Need[process - 1][i]){
                return 2;
            }
        }

        for(int i = 0 ; i < 3 ; i ++){
            tempAvailable[i] = Available[i];
        }
        for(int i = 0 ; i < 5 ; i ++){
            for(int j = 0 ; j < 3 ; j ++){
                tempAllocation[i][j] = Allocation[i][j];
            }
        }

        for(int i = 0 ; i < 5 ; i ++){
            for(int j = 0 ; j < 3 ; j ++){
                tempNeed[i][j] = Need[i][j];
            }
        }

        for(int i = 0 ; i < 3 ; i ++){
            tempAvailable[i] -= request[i];
            tempAllocation[process-1][i] += request[i];
            tempNeed[process-1][i] -= request[i];
        }

        for(int i = 0 ; i < 3 ; i ++){
            work[i] = tempAvailable[i];
        }

        // 查找运行完后是否系统是否安全，检查安全序列
        for(int m = 1 ; m <= 5 ; m ++){
            for(int n = 0 ; n < 5 ; n ++){
                num = 0 ;
                if(Finish[n] == 0 && over[n] == 0){
                    for(int p = 0 ; p < 3; p ++){
                        if(tempNeed[n][p] <= work[p]){
                            num ++;
                        }
                    }
                    if(num == 3){
                        for(int p = 0 ; p < 3 ; p ++){
                            work[p] += tempAllocation[n][p];
                        }
                        Finish[n] = 1;
                    }
                }
            }
        }
        for(int r = 0 ; r < 5 ; r ++){
            if(Finish[r] == 0 && over[r] == 0){
                return 3;
            }
        }
        return 0;
    }

    public static int isProcessAllOver(){
        int processNum = 0 ;
        for(int i = 0 ; i < 5 ; i ++){
            if(over[i] == 1){
                processNum++;
            }
        }
        if(processNum == 5){
            return 1;
        }
        return 0;
    }

    public static void systemStatus(){
        System.out.println("此刻系统存在的进程：");
        for(int i = 0 ; i < 5 ; i ++){
            if(over[i] == 0){
                System.out.print("P" + (i+1) +"  ");
            }
        }
        System.out.println("");
        System.out.println("此刻系统可利用资源（单位：个）：");
        System.out.println("A  B  C");
        for(int i = 0 ; i < 3 ; i ++){
            System.out.print(Available[i] + "  ");
        }
        System.out.println("");
        System.out.println("此刻各进程占有资源如下（单位：个):\n   A B C");
        for(int i = 0 ; i < 5 ; i ++){
            if(over[i] == 1){
                continue;
            }
            System.out.print("P" + (i + 1) + " ");
            for(int j = 0 ; j < 3 ; j ++){
                System.out.print(Allocation[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("各进程运行完毕还需要各资源如下（单位：个）：\n" + "   A B C");
        for(int i = 0 ;i < 5 ; i++){
            if(over[i] == 1){
                continue;
            }
            System.out.print("P" + (i+1) + " ");
            for(int j = 0 ; j < 3; j ++){
                System.out.print(Need[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void forbiddenSeason(int reason){
        System.out.println("不能满足申请，此进程挂起，原因:");
        switch (reason){
            case 1:
                System.out.println("申请的资源量大于系统可提供的资源量！");
                break;
            case 2:
                System.out.println("申请的资源中有某种资源大于其声明的需求量");
                break;
            case 3:
                System.out.println("若满足申请，系统将进入不安全状态，可能导致死锁");
        }
    }

    public static void Allow(int process ,int[] request){
        System.out.print("满足申请条件！");
        int overNum = 0;
        for(int i = 0 ; i < 3 ; i ++){
            Allocation[process - 1][i] += request[i];
            Need[process-1][i] -= request[i];
            Available[i] -= request[i];
        }
        for(int i = 0 ; i < 3; i++){
            if(Need[process-1][i] == 0){
                overNum++;
            }
        }
        if(overNum == 3){ // 该进程运行完毕
            for(int i = 0 ; i < 3 ; i ++){
                Available[i] += Allocation[process-1][i];
                over[process - 1] = 1;
            }
            System.out.println("进程P" + process + "所需资源已经全部满足，此进程运行完毕！");
        }
    }

    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static int getInt() throws IOException{
        return Integer.valueOf(getString());
    }
}
