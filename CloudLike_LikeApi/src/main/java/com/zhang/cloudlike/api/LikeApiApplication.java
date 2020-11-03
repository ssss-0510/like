package com.zhang.cloudlike.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 19:44
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
@RibbonClients
public class LikeApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LikeApiApplication.class,args);
    }
}