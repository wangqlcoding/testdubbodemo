package com.ai.testdubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: wangql
 * @Date: 2019/4/17 23:00
 * @Description:
 */
@RestController
@RequestMapping("/data")
public class TestController {

    @Autowired
    private TestService service;

    //zhushi-716

    @ResponseBody
    @RequestMapping("/getData")
    public String getData(String name) {
        String data = service.getData(name);
        return data;
    }
}