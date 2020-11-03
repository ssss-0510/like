package com.zhang.cloudlike.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 16:46
 * @Description:
 */

@SpringBootApplication
@MapperScan(basePackages = "com.zhang.cloudlike.provider.dao")
@EnableDiscoveryClient
public class LikeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LikeApplication.class,args);
    }
}