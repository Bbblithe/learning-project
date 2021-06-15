package com.blithe.shangjia;

import com.blithe.factory.UsbSanFactory;
import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 11:18
 * Description:
 */

class TaoBaoSanDi implements UsbSell {
   private UsbSanFactory factory = new UsbSanFactory();

   @Override
   public float sell(int amount) {
      float price = factory.sell(amount);
      price += 25;
      return price;
   }
}
