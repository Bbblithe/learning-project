package com.blithexwj.entity;

/**
 * Author:  andy.xwt
 * Date:    2021/5/9 21:24
 * Description:
 */

public class City {
   private Integer id;
   private String name;
   private Integer provinceId;

   public City(Integer id, String name, Integer provinceId) {
      this.id = id;
      this.name = name;
      this.provinceId = provinceId;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getProvinceId() {
      return provinceId;
   }

   public void setProvinceId(Integer provinceId) {
      this.provinceId = provinceId;
   }
}
