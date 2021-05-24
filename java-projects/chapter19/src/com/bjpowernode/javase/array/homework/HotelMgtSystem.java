package com.bjpowernode.javase.array.homework;

import java.util.Scanner;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/8 20:04
 * Description:
 *  该项目题目要求去"homework" module的Hotel里面找
 */


class HotelMgtSystem {
    public static void main(String[] args){
        //创建hotel对象
        //Hotel hotel=new Hotel();
        //hotel.print();

        /*
        如果管理员账号密码登录成功则进入欢迎界面
        否则程序结束
         */
        if(args.length!=2){
            System.out.println("不好意思，该程序需要您输入账号以及密码，例如'admin' ,'123456'");
            return;
        }
        String userName=args[0];
        String passWord=args[1];
        if(!("blithe".equals(args[0])&&"qishinijiushi".equals(passWord))){
            System.out.println("不好意思您的账号不存在或密码错误，该系统仅供系统管理员访问");
            System.exit(0);
        }
        System.out.println("欢迎"+userName+"进入酒店管理系统\n------------------------------------------------------------------");
        System.out.println("该系统目前提供以下三种服务："+"\n查看所有房间状态（请输入1）\n订房（请输入2）\n退房（请输入3）\n退出管理系统（请输入0）");
        Hotel hotel=new Hotel();
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.print("请输入您想要查询的功能,并按下enter键结束：");
            int a=s.nextInt();
            //这里声明一个房间号变量方便后续调用。
            int fangJianHao;
            //这里声明一个c输入变量，方便后面方法调用
            Scanner c=new Scanner(System.in);
            if(a==1){// 查看房间列表状态
                hotel.print();
            }
            else if(a==2){// 订房
            /*
            这个代码的缺点就是要么输入错误return整个程序直接结束，对客户来说特别不方便
            如果不return的话这个就没法使用order这个方法会报错
            if(!((101<=fangJianHao&&fangJianHao<=110)||(201<=fangJianHao&&fangJianHao<=210)||(301<=fangJianHao&&fangJianHao>=310))){
                System.out.println("不好意思，不存在该房间");
                return;
            }

             */

                do{
                    System.out.print("请在这里输入您想预定的房间号(目前房间仅有3层，1层中含10个房间--例如第一层第一间是101)：");
                    fangJianHao=c.nextInt();
                    if(!(fangJianHao%100<=10&&fangJianHao<=310&&fangJianHao>=0)){
                        System.out.println("不好意思，您输入的房间号有误！");
                    }
                }while(!(fangJianHao%100<=10&&fangJianHao<=310&&fangJianHao>=0));
                hotel.oder(fangJianHao);
                /*
                //输出订房成功的结果
                System.out.println("恭喜您订房("+fangJianHao+")成功！！");

                 */
            }
            else if(a==3){// 退房
                do{
                    System.out.print("请在这里输入您想退的房间号(目前房间仅有3层，1层中含10个房间--例如第一层第一间是101)：");
                    fangJianHao=c.nextInt();
                    if(!(fangJianHao % 100 <= 10 && fangJianHao <= 310 && fangJianHao >= 0)){
                        System.out.println("不好意思，您输入的房间号有误！");
                    }
                }while(!(fangJianHao % 100 <= 10 && fangJianHao <=310 && fangJianHao >= 0));
                hotel.exit(fangJianHao);
                /*
                //输出退房成功的结果
                System.out.println("恭喜您成功退订房间("+fangJianHao+")！！");
                    --->这句话会导致即使该房间已被占用仍然会输出结果订房成功！
                 */
            }
            else if( a== 0){
                System.out.println("欢迎下次使用本操作系统！！！");
                return;
            }
            else{// 出错了
                System.out.println("不好意思，您输入的指令无法识别，请检查后重新输入！");
            }
        }
    }
}
