package com.linghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration//作用：开启自动配置
@RestController
public class Application {
    public static void main(String[] args) {
        /*
        * SpringApplication是spring的应用类 作用是用来启动springboot应用的
        * 参数1：传入入口类 类对象  参数2：main函数的参数
        * */

        SpringApplication.run(Application.class,args);
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello springboot");
        return "Hello springboot";
    }
}
