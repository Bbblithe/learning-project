package test014;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 09:58
 * Description:
 * 什么时候成员变量声明为静态变量呢？
 *      -所有对象都有这个属性，并且所有对象的这个属性的值是一样的，建议定义为静态变量，节省内存的开销。
 *
 * 什么时候成员变量声明为实例变量呢？
 *      -所有对象都有这个属性，但是这个属性的值会随着对象的变换而变化【不同的对象的这个属性具体的值不同】
 *
 * 静态变量在类加载的时候初始化，内存在方法区开辟。访问的时候不需要创建对象，直接使用"类名.变量名"的方式访问
 *
 * 关于java中的static：
 *      1、static英语单词翻译为静态的
 *      2、static修饰的方法是静态方法
 *      3、static修饰的变量是静态变量
 *      4、所有static修饰的元素都称为静态的，都可以使用类名.的方式访问，当然也可以使用引用.的方式进行访问，【但不建议】
 *      5、static修饰的所有元素都是类级别的特征，和具体的对象无关。
 */


class ChineseTest {
    public static void main(String[] args){
        //创建中国人对象1
        Chinese zhangsan=new Chinese("513902","张三");
        System.out.println(zhangsan.id+","+zhangsan.name+","+Chinese.country);

        //创建中国人对象2
        Chinese lisi=new Chinese("513903","李四"+Chinese.country);
        System.out.println(lisi.id+","+lisi.name+",");

        //创建中国人对象3
        Chinese wangwu=new Chinese("513904","王五");
        System.out.println(wangwu.id+","+wangwu.name+","+Chinese.country);

        System.out.println(Chinese.country);

        //以下访问说明，countey的访问跟对象没有关系。即使zhangsan引用空
        //也仍然能够访问并未没有空指针异常，说明还是通过类名.方式访问。
        System.out.println(zhangsan.country);
        zhangsan=null;
        //所有的静态的数据都是可以采用类名.,也可以采用引用.，但是建议采用类名.的方式访问
        //采用引用.的方式访问的时候，即使引用是null，也不会出现空指针异常。因为访问静态的数据不需要对象的存在。
        System.out.println(zhangsan.country);
    }
}
