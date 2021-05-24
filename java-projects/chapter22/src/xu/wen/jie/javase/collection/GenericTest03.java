package xu.wen.jie.javase.collection;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/1 08:46
 * Description:
 * 自定义泛型可以吗？可以
 *      自定义泛型的时候，<> 尖括号中的是一个标识符，随便写。
 *      java源代码中经常出现的是:
 *          <E>和<T>
 *      E是element单词首字母。
 *      T是Type单词首字母。
 */


class GenericTest03<标识符号随便写> {
    public void doSome(标识符号随便写 f){
        System.out.println(f);
    }

    public static void main(String[] args) {
        // new对象的时候指定泛型是：String类型
        GenericTest03<String> gt = new GenericTest03<>();

        // 类型不匹配
        //gt.doSome(100);

        gt.doSome("100");

        //===================================================
        GenericTest03<Integer> gTest = new GenericTest03<>();
        gTest.doSome(100);

        // 类型不匹配
        //gTest.doSome("abc");

        myIterator<String> mi = new myIterator<>();
        String s1 = mi.get();

        myIterator<Animal> mi2 = new myIterator<>();
        Animal a = mi2.get();

        //不用泛型就是Object类型。
       /* GenericTest03 gt3 = new GenericTest03();
        gt3.doSome(new Object());*/
    }
}

class myIterator<T>{
    public T get(){
        return null;
    }
}
