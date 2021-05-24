package test013;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 09:58
 * Description:
 */


class ChineseTest {
    public static void main(String[] args){
        //创建中国人对象1
        Chinese zhangsan=new Chinese("513902","张三","China");
        System.out.println(zhangsan.id+","+zhangsan.name+","+zhangsan.country);

        //创建中国人对象2
        Chinese lisi=new Chinese("513903","李四","China");
        System.out.println(lisi.id+","+lisi.name+","+lisi.country);

        //创建中国人对象3
        Chinese wangwu=new Chinese("513904","王五","China");
        System.out.println(wangwu.id+","+wangwu.name+","+wangwu.country);
    }
}
