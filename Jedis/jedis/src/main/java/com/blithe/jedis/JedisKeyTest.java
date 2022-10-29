package com.blithe.jedis;

import redis.clients.jedis.Jedis;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/28 19:27
 * Description:
 */

public class JedisKeyTest {
  public static void main(String[] args) {
    // 连接redis,配置文件直接作为参数传入
    Jedis jedis = new Jedis("localhost",6379);
    // 使用jedis对象操作redis服务
    for(String key : jedis.keys("*")){
      System.out.println(key);
    }
    System.out.println(jedis.exists("count"));
    System.out.println(jedis.lrange("count",0,-1));
  }
}
