package xwj.javase.Annotation7;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/16 16:33
 * Description:
 * 自定义异常
 */


class HasNotIdPropertyException extends RuntimeException{
   public HasNotIdPropertyException(){

   }

   public HasNotIdPropertyException(String s){
      super(s);
   }
}
