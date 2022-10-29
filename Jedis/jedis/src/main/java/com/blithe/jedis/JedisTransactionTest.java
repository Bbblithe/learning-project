package com.blithe.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/28 19:39
 * Description:
 */

public class JedisTransactionTest {
  public static void main(String[] args){
    Jedis jedis = new Jedis("localhost",6379);
    Transaction tran = jedis.multi();
    tran.set("k1","v1");
    tran.set("k7","v7");
    tran.exec();
  }
}
