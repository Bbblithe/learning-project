/**
 * Author:  blithe.xwj
 * Date:    2020/12/5 14:36
 * Description:
 */

//  String对象比较的时候必须使用String方法。
class Test04 {
    public static void main(String[] args){
        Student s1=new Student(2015022136,"成都工业学院");
        Student s2=new Student(2015022136,"成都工业学院");
        Student s3=new Student(2015022135,"成都工业学院");

        System.out.println(s1.equals(s2));//ture
        System.out.println(s2.equals(s3));//false
    }
}

class Student{
    //学号
    int no;//基本数据类型，比较时使用"=="

    //所在学习
    String school;//引用数据类型，比较时使用：equals方法。

    public Student(){

    }

    public Student(int no,String school){
        this.no=no;
        this.school=school;
    }
    //重写toString方法
    public String toString(){
        return "学号为"+no+"的学生在"+school+"学习";
    }
    //重写equals方法
    //需求：当一个学生的学号相等，并且学校相同时，表示同一个学生
    //思考：这个equals该怎么样重写呢？
    //equals方法的编写模式都是固定的。架子差不错。
    public boolean equals(Object obj){
        if(this==obj){
            return false;
        }
        if(obj==null||!(obj instanceof Student)){
            return false;
        }
        Student st=(Student) obj;
        return this.no==st.no&&this.school.equals(st.school);

        //字符串用"=="可以比较吗？
        //肯定不行
        //return this.no==st.no&&this.school==st.school;
    }
}