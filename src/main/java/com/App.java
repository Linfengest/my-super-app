package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //让spring boot自动给程序进行必要的配置（什么必要的配置？）
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
        System.out.println("服务器启动成功:   " + System.currentTimeMillis() );
    }

}
