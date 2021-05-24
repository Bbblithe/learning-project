package 练习;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/25 16:48
 * Description:
 */


public class HomeWork {
    public static void main(String[] args){
        //创建各种乐器对象
        //二胡对象

        Erhu r=new Erhu();
        //钢琴对象
        Piano p=new Piano();
        //小提起对象
        Violin v=new Violin();

        //乐手对象
        Musician guoMengXing=new Musician();
        guoMengXing.setName("郭孟鑫");

        //play开始
        guoMengXing.play(r);
        guoMengXing.play(p);
        guoMengXing.play(v);


    }
}

//乐手类
/*
第一种写法
class Musician{
    //实例变量
    Instrument i;

    //实例变量
    public Musician(){
    }

    //有参变量
    public Musician(Instrument i){
        this.i=i;
    }

    //play()方法
    public void play(){
        i.makeSound();
    }
}

 */

//第二种写法
class Musician{
    //乐手的名字
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(Instrument i){
        i.makeSound();
    }
}

//父类
class Instrument{
    //乐器发声
    public void makeSound(){

    }
}

//子类
class Erhu extends Instrument{
    public void makeSound(){
        System.out.println("二胡的声音格格哥哥哥哥哥哥哥");
    }
}

//子类
class Piano extends Instrument{
    public void makeSound(){
        System.out.println("Piano的声音当当当当当当当当当");
    }
}

//子类
class Violin extends Instrument{
    public void makeSound(){
        System.out.println("violin的声音零零零玲玲玲玲令");
    }
}

