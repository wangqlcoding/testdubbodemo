package com.ai.testdubbo.impl;

import com.ai.testdubbo.TestService;
import org.springframework.stereotype.Service;

/**
 * @Auther: wangql
 * @Date: 2019/4/17 23:42
 * @Description:
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
    @Override
    public String getData(String name) {
        return "你传递进来的name是" + name;
    }
}