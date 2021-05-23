package com.blithe;

import com.alibaba.fastjson.JSON;
import com.blithe.entity.Province;

import static com.alibaba.fastjson.JSON.toJSON;

public class TestJson {
    public static void main(String[] args)  {
        // 使用jackson 把java对象转换json格式的字符串

        Province p = new Province(1,"河北","冀","石家庄");

        // 使用fastjson 把 p 转为json数据格式的字符串
        String json = JSON.toJSONString(p);

        System.out.println("转换的json == " + json);
    }
}
