package com.zzh.DubboDemo.service;

/**
 * @author zhazhahui
 * Created on 2020/6/12
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
