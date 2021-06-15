package com.blithe.shangjia;

import com.blithe.factory.UsbKingFactory;
import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 10:06
 * Description:
 */

public class WeiShang implements UsbSell {

   // 代理的是 金士顿，定义目标厂家类
   private UsbKingFactory factory = new UsbKingFactory();
   @Override
   public float sell(int amount) {
      // 调用目标的方法
      float price = factory.sell(amount);
      // 只增加1元
      price += 1;
      return price;
   }
}
