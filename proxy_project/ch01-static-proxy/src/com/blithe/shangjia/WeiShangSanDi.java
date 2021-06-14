package com.blithe.shangjia;

import com.blithe.factory.UsbSanFactory;
import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 11:19
 * Description:
 */

class WeiShangSanDi implements UsbSell {
   // 代理的是闪迪，定义目标厂家类
   private UsbSanFactory factory = new UsbSanFactory();

   @Override
   public float sell(int amount) {
      float price = factory.sell(amount);
      price += 1;
      return price;
   }
}
