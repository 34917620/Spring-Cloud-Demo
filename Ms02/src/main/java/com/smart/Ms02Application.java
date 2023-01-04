package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: 王智
 * @DATE: 2022/8/11 15:09
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Ms02Application {
    public static void main(String[] args) {
        SpringApplication.run(Ms02Application.class,args);
    }

}
