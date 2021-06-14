package com.blithe;

import com.blithe.shangjia.WeiShang;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 09:48
 * Description:
 */

class ShopMan {
   public static void main(String[] args){
      // 创建代理的商家taobao对象
//      TaoBao taoBao = new TaoBao();
      // 通过代理类，实现了购买u盘，增加了优惠卷，红包等等
//      float price  = taoBao.sell(1);
//      System.out.println("通过淘宝的商家，购买u盘单价：" + price);

      WeiShang weiShang = new WeiShang();
      float price = weiShang.sell(1);
      System.out.println("通过微商购买的价格：" + price);
   }
}
