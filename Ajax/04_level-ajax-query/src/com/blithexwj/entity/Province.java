package com.blithexwj.entity;

/**
 * Author:  andy.xwt
 * Date:    2021/5/9 21:22
 * Description:
 */

public class Province {
   private Integer id;
   private String name;
   private String jiancheng;
   private String shenghui;

   public Province(Integer id, String name, String jiancheng, String shenghui) {
      this.id = id;
      this.name = name;
      this.jiancheng = jiancheng;
      this.shenghui = shenghui;
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

   public String getJiancheng() {
      return jiancheng;
   }

   public void setJiancheng(String jiancheng) {
      this.jiancheng = jiancheng;
   }

   public String getShenhhui() {
      return shenghui;
   }

   public void setShenhhui(String shenhhui) {
      this.shenghui = shenhhui;
   }
}
