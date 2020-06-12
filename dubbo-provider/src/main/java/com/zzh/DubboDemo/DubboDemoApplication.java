package com.zzh.DubboDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DubboDemoApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		context.start();
		System.in.read();
	}

}
