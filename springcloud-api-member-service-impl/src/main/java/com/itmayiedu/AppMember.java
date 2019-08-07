package com.itmayiedu;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.itmayiedu.api.dao")
public class AppMember {

    public static void main(String[] args){
        SpringApplication.run(AppMember.class,args);

        }
}



