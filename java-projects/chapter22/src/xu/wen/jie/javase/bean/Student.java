package xu.wen.jie.javase.bean;

import java.util.Objects;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/2 09:30
 * Description:
 */


class Student {
    private String name;

    public Student(){

    }

    public Student(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // hashCode

    // equals（如果学生名字一样表示同一个学生）
    /*public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Student))return false;
        if(obj == this)return true;
        return ((Student) obj).name.equals(this.name);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
