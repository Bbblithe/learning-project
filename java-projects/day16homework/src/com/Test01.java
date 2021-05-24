package com;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/5 20:00
 * Description:
 */


class Test01 {
    public static void main(String[] args) {
        MyMath mm=new MyMath();
        //IDEA工具中纠正错误的快捷键alt+回车
        mm.mySum(new Compute() {
            public int sum(int a, int b) {
                return a+b;
            }
        }, 100, 200);
    }
}
