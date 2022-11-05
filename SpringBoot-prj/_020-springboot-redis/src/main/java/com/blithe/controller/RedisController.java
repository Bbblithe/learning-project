package com.blithe.controller;

import com.blithe.vo.Student;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/31 10:15
 * Description:
 */

@RestController
public class RedisController {

    /*
        注入redisTemplate

        RedisTemplate范型
        RedisTemplate<String,String>
        RedisTemplate<Object,Object>

        注意：RedisTemplate对象的名称 redisTemplate
     */
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    // 添加数据到redis
    @PostMapping("/redis/addString")
    public String add2Redis(String name, String value) {
        // 操作Redis中String类型数据，先获取ValueOperation对象
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 添加数据到redis
        valueOperations.set(name, value);
        return "向redis添加String类型的数据";
    }

    // 从redis获取数据

    @GetMapping("/redis/getK")
    public String getData(String key) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object value = valueOperations.get(key);
        return key + " = " + value;
    }

    @PostMapping("/redis/{k}/{v}")
    public String addStringKV(@PathVariable String k, @PathVariable String v) {
        // 使用StringRedisTemplate
        stringRedisTemplate.opsForValue().set(k,v);
        return "使用StringRedisTemplate对象";
    }

    @GetMapping("/redis/getK/{k}")
    public String getStringValue(@PathVariable String k){
        return k + " : " + stringRedisTemplate.opsForValue().get(k);
    }

    /**
     *  设置 RedisTemplate 序列化的机制
     *  可以设置key的序列化，可以设置value的序列化，也可同时设置
      */
    @PostMapping("/redis/addstr")
      public String addString(String k,String v){
          // 使用RedisTemplate
          // 设置 key 使用String的序列化
          redisTemplate.setKeySerializer(new StringRedisSerializer());

          // 设置value的序列化
          redisTemplate.setValueSerializer(new StringRedisSerializer());
          redisTemplate.opsForValue().set(k,v);
          return "定义RedisTemplate对象的key，value的序列化";
      }

    /**
     * 使用json序列化，将java对象转换成json存储
     */

    @PostMapping("/redis/addjson")
    public String addJson(){
        Student student = new Student();
        student.setName("blithe");
        student.setAge(19);
        student.setId(1001);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 把值作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        redisTemplate.opsForValue().set("mystudent",student);

        return "json序列化";
    }

    @PostMapping("/redis/getjson")
    public String getJson(){

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 把值作为json序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        Object obj = redisTemplate.opsForValue().get("mystudent");

        return "json反序列化 = " + obj;
    }
}
