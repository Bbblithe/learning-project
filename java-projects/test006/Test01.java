package test006;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 11:15
 * Description:
 *
 * java语言当中方法调用的时候涉及到参数传递到问题，
 * 参数传递实际上传递的是变量中保存的具体值。
 *
 * int i=10;
 * add(i); 等同与：add(10);
 */


class Test01 {
    public static void main(String[] args) {
        int i =10;
        Test01.add(i);
        System.out.println("main--->"+i);
    }
    public static void add(int i){
        i++;
        System.out.println("add---->"+i);
    }
}

