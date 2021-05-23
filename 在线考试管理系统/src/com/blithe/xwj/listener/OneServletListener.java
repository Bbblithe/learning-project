package com.blithe.xwj.listener;

import com.blithe.xwj.util.JdbcUtil;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OneServletListener implements ServletContextListener {
    /*
    在Tomcat启动是，预先创建20个Connection，在UserDao.add方法执行时
    将实现创建好的connection交给add方法
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map map = new HashMap();
        for(int i = 1 ; i <= 20 ; i ++){
            Connection con = JdbcUtil.getCon();
            System.out.println("在Http服务器启动时，创建Connection " + con );
            map.put(con,true); // true表示这个通道处于空闲状态，false通道正在被使用
        }
        // 为了在Http服务器运行期间，一直都可以使用这个20个Connection，将Connection保存到全局作用域对象中
        ServletContext application = sce.getServletContext();
        application.setAttribute("key",map);
    }// map被销毁

    // 在Http服务器关闭时刻，将全局作用域对象20个Connection销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        Map map = (Map)application.getAttribute("key");
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            Connection con = (Connection) it.next();
            if(con != null){
                System.out.println("兄弟们,我" + con + "先行一步，20年后老子还是一条好汉");
                JdbcUtil.close();
            }
        }
    }
}
