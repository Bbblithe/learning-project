package com.blithe.factory;

import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/14 11:15
 * Description:
 */

public class UsbSanFactory implements UsbSell {
   @Override
   public float sell(int amount) {
      System.out.println("闪迪 目标类中的方法调用，UsbSanFactory 中的sell ");
      // 一个128G的u盘是 85元
      // 后期更具amount ，可以实现不同的价格，例如100000个，单价是80，500000个单价是75
      return 85.0f;
   }
}
