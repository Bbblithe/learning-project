package 第四章_栈和队列.栈;

import java.util.ArrayList;

/**
 * Author:  blithe.xwj
 * Date:    2021/10/17 18:54
 * Description:
 */


class StackArrayList {

   private ArrayList<String> list;

   public StackArrayList(int max){
      list = new ArrayList<>(max);
   }

   public void push(String element ){
      list.add(element);
   }

   public String pop(){
      String a = "";
      if(!list.isEmpty()){
         a = list.get(list.size()-1);
         list.remove(a);
      }
      return a;
   }

   public int getLength(){
      return list.size();
   }
}

