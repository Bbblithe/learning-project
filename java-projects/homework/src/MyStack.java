/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 21:21
 * Description:
 *  编写程序，使用一维数组，模拟栈数据结构。
 *  需求：
 *      1、这个栈可以存储java中的任何引用类型的数据。
 *      2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
 *      3、在栈中提供pop方法模拟弹栈。（栈空了，也要有提示信息。）
 *      4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
 *      5、假设栈的默认初始化容量是10。（请注意无参构造方法的编写方式。）
 *
 *      public class MyStack{   //栈类
 *          //提供一个数组来存储栈中的元素
 *          Object elements= new Object[10];
 *
 *          //栈帧（永远指向栈顶部的元素）
 *          //每加一个元素，栈帧+1
 *          //每减一个元素，栈帧-1
 *          int index = 0;
 *
 *          //构造方法
 *          //构造方法是不是应该给一维数组一个初始化容量。
 *
 *          //push方法(push方法压栈)
 *          //压栈表示栈中多一个元素。
 *          //但是栈如果已满，压栈失败。
 *          //这个方法的参数以及返回值类型自己定义。
 *
 *          //pop方法(pop方法弹栈)
 *          //弹栈表示栈中少一个元素。
 *          //但是栈如果已空，弹栈失败。
 *          //这个方法的参数以及返回值类型自己定义。
 *      }
 *
 *      main(){
 *          测试...
 *      }
 */


class MyStack {
    Object[] elements;
    int index;

    public MyStack(){

    }

    public MyStack(int index){
        this.index=index;
        this.elements=new Object[10];
    }

    public int push(Object oj){
        if(index==elements.length-1){
            System.out.println("压栈失败，栈已满！");
        }
        elements[index-1]=oj;
        return index+1;
    }

    public int pop(){
        if(index==elements.length-1){
            System.out.println("弹栈失败，栈已空");
        }
        elements[index-1]=null;
        return index-1;
    }
}

class XiXi{

}