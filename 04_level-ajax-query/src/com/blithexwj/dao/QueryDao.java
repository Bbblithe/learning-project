package com.blithexwj.dao;

import com.blithexwj.entity.City;
import com.blithexwj.entity.Province;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:  andy.xwt
 * Date:    2021/5/9 21:26
 * Description:
 */

public class QueryDao {

   private Connection conn;
   private PreparedStatement pst;
   private ResultSet rs;
   private String url = "jdbc:mysql://localhost:3306/blithexwj";
   private String sql;
   private String username = "root";
   private String password = "2015022136";
   // 查询所有的省份信息
   public List<Province> queryProvinceList(){
      List<Province> provinces = new ArrayList<>();
      try{
         Province province = null;
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,username,password);
         sql = "select id,name,jiancheng,shenghui from province order by id";
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();

         while(rs.next()){
            province = new Province(rs.getInt("id"),rs.getString("name"),
                    rs.getString("jiancheng"),rs.getString("shenghui"));

            provinces.add(province);
         }
      } catch(Exception e){
         e.printStackTrace();
      } finally {
         if(rs != null){
            try{
               rs.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
         if(pst != null){
            try{
               pst.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
         if(conn != null){
            try{
               conn.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
      }
      return provinces;
   }
   // 查询一个省份下面所有城市
   public List<City> queryCityList(Integer provinceId){
      List<City> cities = new ArrayList<>();
      try{
         City city = null;
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(url,username,password);
         sql = "select id,name,provinceId from city where provinceid = ?";
         pst = conn.prepareStatement(sql);
         // 设置省份的参数值
         pst.setInt(1,provinceId);

         rs = pst.executeQuery();

         while(rs.next()){
            city = new City(rs.getInt(1),rs.getString(2),rs.getInt(3));
            cities.add(city);
         }
      } catch(Exception e){
         e.printStackTrace();
      } finally {
         if(rs != null){
            try{
               rs.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
         if(pst != null){
            try{
               pst.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
         if(conn != null){
            try{
               conn.close();
            } catch(SQLException e){
               e.printStackTrace();
            }
         }
      }
      return cities;
   }
}
