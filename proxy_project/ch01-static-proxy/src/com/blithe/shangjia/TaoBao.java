package com.blithe.shangjia;

import com.blithe.service.UsbSell;

/**
 * Author:  blithe.xwj
 * Date:    2021/6/13 17:49
 * Description:
 */
// taobao是一个商家，代理金士顿u盘的销售。
class TaoBao implements UsbSell {

   @Override
   // 实现销售u盘的功能
   public float sell(int amount){
      return 0;
   }
}
