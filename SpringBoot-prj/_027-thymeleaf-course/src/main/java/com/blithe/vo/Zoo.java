package com.blithe.vo;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/7 19:49
 * Description:
 */

public class Zoo {
   private Cat cat;
   private Dog dog;

   public Zoo(Cat cat, Dog dog) {
      this.cat = cat;
      this.dog = dog;
   }

   public Zoo() {
   }

   @Override
   public String toString() {
      return "Zoo{" +
              "cat=" + cat +
              ", dog=" + dog +
              '}';
   }

   public Cat getCat() {
      return cat;
   }

   public void setCat(Cat cat) {
      this.cat = cat;
   }

   public Dog getDog() {
      return dog;
   }

   public void setDog(Dog dog) {
      this.dog = dog;
   }
}
