package com.zzh.DubboDemo;

import com.zzh.DubboDemo.service.IDemoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboDemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/consumer.xml"});
		context.start();
		IDemoService demoService = (IDemoService)context.getBean("IDemoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法
		System.out.println( hello );
	}

}
