package com.blithe.factory;

import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/13 17:44
 * Description:
 */

// 目标类：金士顿厂家，不接受用户的单独购买。
class UsbKingFactory implements UsbSell {
   @Override
   public float sell(int amount){
      // 一个128G的u盘是 85元。
      // 后期根据amount， 可以实现不同的价格，例如10000个，单价是80，50000个75
      return 85.0f;
   }
}
