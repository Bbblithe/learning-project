package 第三章_简单排序.对象排序;

/**
 * Author:  blithe.xwj
 * Date:    2021/4/30 22:27
 * Description:
 */


class Person {
   private String lastName;
   private String firstName;
   private int age;

   public Person(String lastName , String firstName , int age){
      this.lastName = lastName;
      this.firstName = firstName;
      this.age = age;
   }

   public void displayPerson(){
      System.out.println(" Last name:" + lastName + ",First Name:" + firstName + ",Age: " + age);
   }

   public String getLast(){
      return lastName;
   }
}
