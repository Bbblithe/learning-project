package com.blithe.xwj.util;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;

import java.sql.*;
import java.util.Iterator;
import java.util.Map;

public class JdbcUtil {

    private JdbcUtil(){
    }
    static final String URL = "jdbc:mysql://localhost:3306/blithexwj";
    static final String USERNAME = "root";
    static final String PASSWORD = "2015022136";
    static PreparedStatement ps = null;
    static Connection con = null;

    // ----------------通过全局作用域对象得到Connection----------------Start
    public static Connection getCon(HttpServletRequest request){
        // 1.通过请求对象获得全局作用域对象
        ServletContext application = request.getServletContext();

        // 2.从全局作用域对象得到map
        Map map = (Map) application.getAttribute("key");

        // 3.从map得到一个处于空闲状态的Connection
        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            con = (Connection) it.next();
            boolean flag = (boolean) map.get(con);
            if(flag){
                map.put(con,false);
                break;
            }
        }
        return con;
    }

    public static PreparedStatement createStatement(String sql,HttpServletRequest request){
        try{
            ps = getCon(request).prepareStatement(sql);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ps;
    }
    // ----------------通过全局作用域对象得到Connection------------------End

    // 将jar包中driver实现类在静态代码块中加载到JVM中
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    // 封装连接通道创建细节
    public static Connection getCon(){
        try{
            con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    public static PreparedStatement createStatement(String sql){
        try{
            ps = getCon().prepareStatement(sql);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return ps;
    }

    public static void close(HttpServletRequest request){
        if(ps != null){
            try{
                ps.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        ServletContext application = request.getServletContext();
        Map map = (Map) application.getAttribute("key");
        map.put(con,true); // 将con的使用状态改为true可用状态
    }

    // ps与con销毁细节 insert,update,delete
    public static void close(){
        if(ps != null){
            try{
                ps.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(con != null){
            try{
                con.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    // 如果使用的是查询命令则相比Update语句多了一个查询结果集，select ps,con,rs
    // 这里使用了方法的重载
    public static void close(ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

        if(ps != null){
            try{
                ps.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

        if(con != null){
            try{
                con.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs,HttpServletRequest request){
        if(rs != null){
            try{
                rs.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }

        if(ps != null){
            try{
                ps.close();
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
        ServletContext application = request.getServletContext();
        Map map = (Map) application.getAttribute("key");
        map.put(con,true);

    }
}
