package com.zzh.DubboDemo;

import com.zzh.DubboDemo.service.DemoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class DubboConsumerApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-consumer.xml"});
		context.start();
		DemoService demoService = context.getBean("demoService", DemoService.class);// 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法
		System.out.println( hello );
	}

}
