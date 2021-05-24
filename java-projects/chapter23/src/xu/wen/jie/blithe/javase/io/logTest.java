package xu.wen.jie.blithe.javase.io;

/**
 * Author:  blithe.xwj
 * Date:    2021/1/5 20:13
 * Description: 
 */


   class logTest {
   public static void main(String[] args) {
      // 测试工具类是否好用
      logger.log("调用了System类的gc()方法，建议启动垃圾回收");
      logger.log("调用了UserService的doSome()方法");
      logger.log("用户尝试进行登陆，验证失败");
      logger.log("我非常喜欢这个记录日志的工具哦！");
   }
}
