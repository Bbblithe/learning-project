package xu.wen.jie.javase.exception;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/25 20:40
 * Description:
 * 测试改良之后的MyStack
 * 注意：最后这个例子，是异常最重要的案例。必须掌握。自定义异常在实际开发中的应用。
 */


class ExceptionTest16 {
    public static void main(String[] args) {
        // 创建栈对象
        MyStack stack = new MyStack();
        // 压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            //这里栈就满了
            stack.push(new Object());

        } catch (MyStackOperationException e) {
            // 输出异常的简单信息
            System.out.println(e.getMessage());
        }

        // 弹栈
        try{
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();


        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
