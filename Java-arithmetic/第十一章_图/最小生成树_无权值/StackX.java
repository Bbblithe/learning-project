package 第十一章_图.最小生成树_无权值;

/**
 * Author:  blithe.xwj
 * Date:    2022/3/8 20:59
 * Description:
 */


class StackX {
    private int maxSize = 20;
    private int[] stackArray;
    private int top;

    public StackX(){
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        stackArray[++top] = value;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return(top == -1);
    }
}

