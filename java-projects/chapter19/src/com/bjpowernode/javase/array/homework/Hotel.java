package com.bjpowernode.javase.array.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/8 23:18
 * Description:
 *  酒店对象，酒店中有二维数组，二维数组模拟大厦。
 *
 */


class Hotel {
    /**
     * 二维数组，模拟大厦所有的房间
     */
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼
    public Hotel(){
        //一共有几层，每层的房间类型是什么，每个房间的编号是什么。
        //我们可以先写死。一共三层：一层单人间、二层标准间、三层总统套房
        /**
         * 房间编号
         * 1楼：101 102 103 104 105 106...
         * 2楼：201 202 203 204 205 206...
         * 3楼：301 302 303 304 305 306...
         */
        //动态初始化
        rooms =new Room[3][10];//3行10列，3层楼，每层10个房间。

        // 创建30个Room对象，放到数组当中。
        // 怎么放？
        for(int i=0;i<rooms.length;i++){ //i是下标 0 1 2，i+1是楼层
            for(int a=0;a<rooms[i].length;a++){
                if(i==0){
                    //一层
                    rooms[i][a]= new Room(((i+1)*100)+a+1,"单人间",true);
                }
                else if(i==1){
                    //二层
                    rooms[i][a]= new Room(((i+1)*100)+a+1,"标准间",true);
                }
                else{
                    //三层
                    rooms[i][a]= new Room(((i+1)*100)+a+1,"总统套房",true);
                }
            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print(){
        //打印所有房间状态
        for(int i=0;i<rooms.length;i++){
            //里面for循环负责输出一层。
            for(int a=0;a<rooms[i].length;a++){
                System.out.print(rooms[i][a]);
            }
            //换行
            System.out.println();
        }
    }

    /**
     * 订房方法
     * @param roomNo 调用此方法时需要传递一个房间编号过来，这个房间编号是前台小姐姐带客户输入的。
     */
    public void oder(int roomNo){
        //订房最主要的是将房间的status修改为false，
        //Room对象的status修改为false
        //假设房间编号是207,所以该房间数组的编号应该是rooms[1][6]
        //通过房间编号演算出下标。获取房间对象。
        //将其房间对象的status改成false

        //该if重句的目的是为了防止房间已经有人再次预定
        if(rooms[(roomNo/100)-1][(roomNo%100)-1].isStatus()){
            //这里是将房间状态修改为占用
            rooms[(roomNo/100)-1][(roomNo%100)-1].setStatus(false);
            System.out.println("恭喜你成功预定房间（"+roomNo+"）");
            return;
        }
        System.out.println("不好意思，该房间已经被预定");
    }

    /**
     * 退房方法
     * @param roomNO 调用此方法跟订房原理相同，前台输入房间号，再通过数学逻辑将房间号转换为数组下标进行退房实现
     */
    public void exit(int roomNO){
        //这里的if是为了防止该房间本身就无人，二次退房
        if(!(rooms[(roomNO/100)-1][(roomNO%100)-1].isStatus())){
            rooms[(roomNO/100)-1][(roomNO%100)-1].setStatus(true);
            System.out.println("恭喜你成功退订房间（"+roomNO+"）");
            return;
        }
        System.out.println("不好意思，该房间还未被出租");
    }
}
