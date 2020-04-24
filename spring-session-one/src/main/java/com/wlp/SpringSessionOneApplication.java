package com.wlp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*

    此项目是学习分布式session一致性解决方案之一

    使用SpringSession+Redis 实现

 */


//one
@SpringBootApplication
public class SpringSessionOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSessionOneApplication.class,args);
    }
}
