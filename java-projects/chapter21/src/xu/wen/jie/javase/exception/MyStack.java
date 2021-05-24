package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/7 19:41
 * Description:
 *
 *  这个作业版本是老师写的。我自己写的没实现了满栈提示，我的
 */


class MyStack {
    // 向栈当中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存在到数组中。
    // 因为数组是我们学java的第一容器
    // 为什么选择Object类型数组？因为这个栈可以存储java中的任何引用类型的数据
    // new Animal()对象可以放进去，new Person()对象也可以放进去。因为Animal和person的超级父类就是Object。
    // 包括String类型的数据也可以存储进去。因为String 父类也是Object。
    private Object[] elements;

    //栈帧，永远指向栈顶部元素
    //那么，这个默认初始值应该是多少。注意：最初的栈是空的，一个元素都没有。
    //private int index = 0;//如果index采用0，表示栈帧指向了顶部元素的上方。
    //private int index = -1;// 若果index采用-1，表示栈帧指向了顶部元素。

    private int index;


    /**
     * 无参构造方法。默认初始化栈容量10。
     */
    public MyStack(){
        //一维数组动态初始化
        //默认初始化容量是10
        this.elements=new Object[10];

        //this.setElements(new Object[10]);

        //给index初始化
        this.index = -1;
    }

    //这是一个压栈的方法

    /**
     * @param obj 这个一个被压的元素，也就是一个对象。压进去的是他的引用地址
     */
    public void push(Object obj) throws MyStackOperationException {
        if(index>=(elements.length-1)){
            // 改良之前
            //System.out.println("压栈失败，栈已满！");
            //return;


            // 创建异常对象
            //MyStackOperationException e = new MyStackOperationException("压栈失败，栈已满");
            // 手动将异常对象抛出去！
            //throw e;// 这里捕捉没有意义，自己new一个异常，自己捉，没有意义。栈已满这个信息你需要传递出去。

            // 合并（手动抛出异常！）
            throw new MyStackOperationException("压栈失败，栈已满");
        }
        /*
        index++;
        elements[index]=obj;

         */
        //上面可以合并为下列代码
        elements[++index]=obj;
        System.out.println("压栈"+obj+"元素成功，栈帧指向"+index);
    }

    public void pop() throws MyStackOperationException {
        if(index<0){
            throw new MyStackOperationException("弹栈失败，栈已空");
        }
        System.out.println("弹栈"+elements[index]+"元素成功，栈帧指向"+(index-1));
        elements[index--]=null;
    }

    //set和get也许用不上，但是你必须写上，这是规矩。你使用IDEA生成就完事了。
    //封装：第一步：属性私有化，第二步：对外提供set和get方法。
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
