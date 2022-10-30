package com.blithe.controller;

import com.blithe.vo.SchoolInfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Author:  blithe.xwj
 * Date:    2022/10/29 19:33
 * Description:
 */

@Controller
public class HelloController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.servlet.context-path}")
    private String contextPath;
    @Value("${school.name}")
    private String name;
    @Value("${site}")
    private String site;

    @Resource
    private SchoolInfo info;

    @RequestMapping("/data")
    @ResponseBody
    public String queryData() {
        return name + ",site=" + site + ", 项目的访问地址=" + contextPath + ",使用的端口=" + port;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "school = " + info.toString();
    }
}
