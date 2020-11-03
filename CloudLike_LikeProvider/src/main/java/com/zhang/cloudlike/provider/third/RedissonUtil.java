//package com.zhang.cloudlike.provider.third;
//
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//
///**
// * @ProjectName: CloudLike
// * @Author: 张尚斌
// * @Time: 2020/11/2 14:38
// * @Description:
// */
//public class RedissonUtil {
//    private static RedissonClient client;
//    static {
//        //配置
//        Config config = new Config();
//        config.setThreads(1000);
//
//        //config.useSingleServer();//单机
//        //config.useClusterServers();//集群
//        //config.useSentinelServers();//哨兵
//        config.useSingleServer().setAddress("redis://39.105.189.141:6380").setPassword("qfjava");
//        client = Redisson.create(config);
//    }
//
//    //新增
//
//}