/**
 * Author:  blithe.xwj
 * Date:    2020/12/6 21:45
 * Description:
 */


class Test {
    public static void main(String[] args) {
        Object x=new XiXi();
        Object[] obj={x};
        MyStack ms=new MyStack(11);

        ms.push(x);
        Object y=new XiXi();
        ms.pop();
        ms.push(y);
        ms.push(new XiXi());
        ms.push(new XiXi());


    }
}
