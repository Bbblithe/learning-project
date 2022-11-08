package com.blithe.controller;

import com.blithe.model.SysUser;
import com.blithe.vo.Cat;
import com.blithe.vo.Dog;
import com.blithe.vo.Zoo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Author:  blithe.xwj
 * Date:    2022/11/5 20:22
 * Description:
 */

@Controller
@RequestMapping("/tpl")
public class ThymeleafController {

    // 第一个标准变量表达式
    @GetMapping("/expression1")
    public String expression1(Model model) {
        model.addAttribute("site", "www.baidu.com");
        model.addAttribute("myUser", new SysUser(1001, "李四", "man", 29));
        return "expression1";
    }

    @GetMapping("/expression2")
    public String expression2(Model model) {
        model.addAttribute("site", "www.baidu.com");
        model.addAttribute("myUser", new SysUser(1001, "李四", "man", 29));
        return "expression2";
    }

    // 链接表达式
    @GetMapping("/link")
    public String Link(Model model) {
        model.addAttribute("userId", 1002);
        return "link";
    }

    // 测试链接表达式的地址
    @GetMapping("/queryAccount")
    @ResponseBody
    public String queryAccount(Integer id) {
        return "queryAccount,参数id = " + id;
    }

    // 有两个参数的地址
    @GetMapping("/queryUser")
    @ResponseBody
    public String queryUser(String name, Integer age) {
        return "querryUser,有两个参数 name = " + name + ", age = " + age;
    }

    // 使用的是模版的属性
    @GetMapping("/property")
    public String useProperty(Model model) {
        model.addAttribute("methodAttr", "post");
        model.addAttribute("id", "20150");
        model.addAttribute("paramName", "name");
        model.addAttribute("userValue", "blithe");
        model.addAttribute("textcolor", "color:blue");
        return "html-property";
    }

    @GetMapping("/eachList")
    public String eachList(Model model) {
        List<SysUser> users = new ArrayList<>();
        users.add(new SysUser(1001, "zhangsan", "men", 20));
        users.add(new SysUser(1002, "lisi", "women", 12));
        users.add(new SysUser(1003, "wangwu", "women", 32));
        users.add(new SysUser(1004, "blithe", "men", 19));
        users.add(new SysUser(1005, "andy", "men", 29));
        model.addAttribute("userList", users);
        return "eachList";
    }

    @GetMapping("/eachArray")
    public String eachArray(Model model) {
        SysUser userArray[] = new SysUser[3];
        userArray[0] = new SysUser(1001, "马超", "男", 30);
        userArray[1] = new SysUser(1002, "黄忠", "男", 26);
        userArray[2] = new SysUser(1001, "赵云", "男", 22);
        model.addAttribute("userArray", userArray);
        return "eachArray";
    }

    @GetMapping("/eachMap")
    public String eachMap(Model model) {
        Map<String, SysUser> map = new HashMap<>();
        map.put("user1", new SysUser(12001, "马超", "男", 30));
        map.put("user2", new SysUser(12002, "黄忠", "男", 26));
        map.put("user3", new SysUser(12001, "赵云", "男", 22));
        model.addAttribute("map", map);
        return "eachMap";
    }

    // ifunless
    @GetMapping("/ifunless")
    public String ifUnless(Model model) {
        model.addAttribute("sex", "men");
        model.addAttribute("isLogin", true);
        model.addAttribute("age", 20);
        model.addAttribute("name", "");
        model.addAttribute("isOld", null);
        return "ifunless";
    }

    @GetMapping("/switch")
    public String doSwitch(Model model) {
        model.addAttribute("sex", "man");
        return "switch";
    }

    // 内联 text
    @GetMapping("/inline")
    public String inLine(Model model) {
        model.addAttribute("sex", "man");
        model.addAttribute("age", 20);
        model.addAttribute("name", "blithe");
        model.addAttribute("user", new SysUser(1472, "andy", "男", 29));

        return "inline";
    }

    // 字面量
    @GetMapping("/text")
    public String text(Model model) {
        model.addAttribute("sex", "man");
        model.addAttribute("age", 20);
        model.addAttribute("name", "blithe");
        model.addAttribute("city", "成都");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", new SysUser(1472, "andy", "男", 29));

        return "text";
    }

    // 字符串的连接
    @GetMapping("/strJoin")
    public String strJoin(Model model) {
        model.addAttribute("sex", "man");
        model.addAttribute("age", 20);
        model.addAttribute("name", "andy");
        model.addAttribute("city", "天津");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", new SysUser(1472, "andy", "男", 29));

        return "strJoin";
    }

    // 运算符的使用
    @GetMapping("/symbol")
    public String symbol(Model model) {
        model.addAttribute("sex", "man");
        model.addAttribute("age", 20);
        model.addAttribute("name", "andy");
        model.addAttribute("city", "天津");
        model.addAttribute("isLogin", true);
        model.addAttribute("user", null);

        return "symbol";
    }

    // 模版内置对象
    @GetMapping("/baseObject")
    public String baseObject(Model model, HttpServletRequest request, HttpSession session) {
        model.addAttribute("myname", "blithe");
        request.setAttribute("requestData", "request作用域中的数据");
        request.getSession().setAttribute("sessionData", "session作用域中的数据");
        // 直接使用session存放
        session.setAttribute("loginName", "andy");

        return "baseObject";
    }

    // 内置的工具类对象
    @GetMapping("/utilObject")
    public String utilObject(Model model){
        model.addAttribute("mydate",new Date());
        model.addAttribute("mynum",26.695);
        model.addAttribute("mystr","blithe");
        List<String> list = Arrays.asList("a","b","c");
        model.addAttribute("mylist",list);

        Zoo zoo = new Zoo(new Cat("二哈"),new Dog("歌姬"));
        model.addAttribute("zoo",zoo);
        return "utilObject";
    }

    // 自定义模版
    @GetMapping("/customtpl")
    public String cutomeTemplate(Model model){
        return "customtpl";
    }
}
