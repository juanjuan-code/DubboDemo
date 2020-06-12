package com.zzh.DubboDemo.service.impl;

import com.zzh.DubboDemo.service.IDemoService;

/**
 * @author zhazhahui
 * Created on 2020/6/12
 */
public class DemoServiceImpl implements IDemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
