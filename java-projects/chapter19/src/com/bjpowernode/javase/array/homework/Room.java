package com.bjpowernode.javase.array.homework;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/8 20:06
 * Description:
 */


class Room {
    private int no;
    /**
     * 房间类型:标准间 单人间 总统套房
     */
    private String type;
    /**
     * 房间状态（是否空闲）
     * ture 空闲，房间可以被预定。
     * false 表示占用，房间不能被预定。
     */
    private boolean status;

    // 构造方法
    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //setter and getter 方法
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //IDEA工具对于boolean的变量，生成的get方法的方法名是：isXxxx()
    //如果你不喜欢，可以修改为getXxx()
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //equals方法重写
    //equals 是用来比较两个房间是否相同的。
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null||!(obj instanceof Room)) return false;
        Room ro= (Room) obj;
        //当前房间编号 等于 传过来的房间对象的房间编号。认为是同一个房间。
        return this.no==ro.no;
    }
    //toString方法重写
    //toString目的就是将java对象转换成字符串类型形式。
    //怎么转，转换成什么，由程序员自己制定：目的就是：简单，清晰明了。
    //我不看对象内存地址，用户需要看一个具体的信息。
    public String toString(){
        return "房间号："+no+"、房间类型："+type+"["+(status? "1空闲]    ":"占用]   ");
    }
    // 编写一个零时程序测试一下
    // 一会可以删除这个main方法
    /*
    public static void main(String[] args){
        Room room=new Room(101,"标准间",true);
        System.out.println(room);
    }

     */
}
