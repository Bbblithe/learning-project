package com.blithe.dao;

import com.blithe.entity.Province;

import java.sql.*;
import java.util.ArrayList;

// 使用jdbc访问数据库
public class ProvinceDao {

    // 根据id获取名称
    public String queryProvinceNameById(Integer provinceId){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";

        String url="jdbc:mysql://localhost:3306/blithexwj";
        String userName = "root";
        String password = "2015022136";
        String name = "";

        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,userName,password);

            // 创建PreparedStatement对象
            sql = "select name from province where id = ?";
            ps = conn.prepareStatement(sql);

            // 设置参数值
            ps.setInt(1,provinceId);

            // 执行sql
            rs = ps.executeQuery();

            // 遍历rs
            /*while(rs.next()){ // 当你的rs中有多余一条记录时。
                name = rs.getString("name");
            }*/

            if (rs.next()) {
                name = rs.getString("name");
            }

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
                    if(rs != null){
                        try{
                            rs.close();
                        }catch (SQLException e){
                            e.printStackTrace();
                        }
                    }
                    if(ps != null){
                        try{
                            ps.close();
                        }catch (SQLException e){
                            e.printStackTrace();
                        }
                    }
                    if(conn != null){
                        try{
                            conn.close();
                        } catch (SQLException e){
                            e.printStackTrace();
                        }
                    }
            }
        return name;
    }

    // 根据id获取一个完整的Province对象
    public Province queryProvinceById(Integer provinceId){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";

        String url="jdbc:mysql://localhost:3306/blithexwj";
        String userName = "root";
        String password = "2015022136";

        Province province = null;

        // 加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,userName,password);

            // 创建PreparedStatement对象
            sql = "select name,jiancheng,shenghui from province where id = ?";
            ps = conn.prepareStatement(sql);

            // 设置参数值
            ps.setInt(1,provinceId);

            // 执行sql
            rs = ps.executeQuery();

            // 遍历rs
            while(rs.next()){ // 当你的rs中有多余一条记录时。
                  String provinceName = rs.getString("name");
                  String provincejiancheng = rs.getString("jiancheng");
                  String provinceshenghui = rs.getString("shenghui");
                  province = new Province(provinceId,provinceName,provincejiancheng,provinceshenghui);
            }


        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        } finally{
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(ps != null){
                try{
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return province;
    }
}
