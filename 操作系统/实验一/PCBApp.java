package 操作系统.实验一;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/26 08:55
 * Description:
 */


public class PCBApp {
    static PCB ready = null;
    static PCB p = new PCB();
    public static void main(String[] args) throws IOException{
        int h = 0;
        char ch = 0;
        input();
        int size = space();
        while(size != 0 && ready != null){
            h ++;
            System.out.println("正在运行的次数:" + h);
            p = ready;
            ready =p.link;
            p.link = null;
            p.state = 'R';
            check();
            running();
            System.out.println("输入任意值，按Enter继续");
            ch = getChar();
        }
        System.out.println("所有进程已完成");
    }

    public static void sort(){
        PCB first,second;
        int insert = 0;
        if(ready == null || (p.priority > ready.priority)){
            p.link = ready;
            ready = p;
        }else{
            first = ready;
            second = first.link;
            while(second != null){
                if(p.priority > second.priority){
                    p.link = second;
                    first.link = p;
                    second = null;
                    insert = 1;
                }else{
                    first = first.link;
                    second = second.link;
                }
            }
            if(insert == 0){
                first.link = p;
            }
        }
    }

    public static void input() throws IOException{
        int num;
        System.out.print("请输入创建进程数量:") ;
        num = getInt();
        for(int i = 0 ; i < num ; i ++ ){
            p = new PCB();
            System.out.print("请输入进程名:");
            p.name = getString();
            System.out.print("请输入进程优先级:");
            p.priority = getInt();
            System.out.print("请输入进程所需时间:");
            p.nTime = getInt();
            p.rTime = 0 ;
            p.state = 'w';
            p.link = null;
            sort();
        }
    }

    public static int space(){
        int i = 0;PCB pcb = ready;
        while(pcb != null){
            pcb = pcb.link;
            i ++;
        }
        return i;
    }


    public static void check(){
        PCB pr = new PCB();
        System.out.println("当前正在运行的进程为" + p.name);
        System.out.println(p);;
        pr = ready;
        System.out.println("当前就绪队列状态为 : ");
        while(pr != null){
            System.out.println(pr);
            pr = pr.link;
        }
    }

    public static void destroy(){
        System.out.println("进程"+p.name+"已经执行完毕");
        p = null;
    }

    public static void running(){
        p.rTime ++;
        if(p.rTime == p.nTime){
            destroy();
        }else{
            if(p.priority != 0) {
                p.priority--;
            }
            p.state = 'w';
            sort();
        }
    }


    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static char getChar() throws IOException{
        return getString().charAt(0);
    }

    public static int getInt() throws IOException{
        return Integer.valueOf(getString());
    }
}
