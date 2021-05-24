package javase.reflect;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/14 09:43
 * Description:
 * 研究一下：Class.forName()方法发生了什么？
 *      机制，重点：
 *          如果你只是希望一个类的静态代码块执行，其他代码一律不执行，
 *          你可以使用：
 *              Class.forName("完整类名");
 *          这个方法的执行会导致类加载，类加载时静态代码块执行。
 *
 * 提示：
 *  后面JDBC技术的时候我们还需要。
 */


class ReflectTest04 {
    public static void main(String[] args) {
        try {
            // Class.forName()这个方法的执行会导致：类加载。
            Class.forName("javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

