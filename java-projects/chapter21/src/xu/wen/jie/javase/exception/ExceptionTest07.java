package xu.wen.jie.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Author:  blithe.xwj
 * Date:    2020/12/24 19:44
 * Description:
 * 深入try..catch
 *      1、catch后面小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
 *      2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
 *      3、catch写多个的时候，从上到下，必须遵守从小到大。
 */


class ExceptionTest07 {
    /*
    public static void main(String[] args) throws Exception, FileNotFoundException,NullPointerException {

    }

     */

    /*public static void main(String[] args) throws Exception{

    }

     */
    public static void main(String[] args) {
        /*
        try{
            FileInputStream fis = new FileInputStream("/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            System.out.println("以上出现异常，这里无法执行！");
        }catch(FileNotFoundException e){
            System.out.println("文件不存在！");
        }

        System.out.println("hello world");

         */

        /*try{
            FileInputStream fis = new FileInputStream("/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            System.out.println("以上出现异常，这里无法执行！");
        }catch(IOException e){ // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }

         */

        /*try{
            FileInputStream fis = new FileInputStream("/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            System.out.println("以上出现异常，这里无法执行！");
        }catch(Exception e){
            System.out.println("文件不存在！");
        }
         */

        /*try{
            // 创建输入流
            FileInputStream fis = new FileInputStream("/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            // 读文件
            fis.read();
        }catch(Exception e){ // 所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }

         */

        /*try{
            // 创建输入流
            FileInputStream fis = new FileInputStream("1/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            // 读文件
            fis.read();
        }catch(FileNotFoundException e){ // 所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }catch(IOException e){
            System.out.println("读文件报错了！");
        }
         */

        // 编译报错。
        /*
        try{
            // 创建输入流
            FileInputStream fis = new FileInputStream("1/Users/xuwenjie/Desktop/2015022136徐文杰.docx");
            // 读文件IOException e
            fis.read();
        }catch(IOException e){ // 所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }catch(FileNotFoundException e){
            System.out.println("读文件报错了！");
        }
         */

        // JDK8的一个新特性，卧槽了都，刚刚弄了半天，原来是自己的jdklanguage版本没选对！
        try{
            // 创建输入流
            FileInputStream fis = new FileInputStream("1/Users/xuwenjie/Desktop/2015022136徐文杰.docx");

            // 进行数学运算
            System.out.println(100 / 0);// 这个异常是运行时异常，编写程序时可以处理，也可以不处理
        } catch(FileNotFoundException | ArithmeticException e){ // 所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }
    }
}

