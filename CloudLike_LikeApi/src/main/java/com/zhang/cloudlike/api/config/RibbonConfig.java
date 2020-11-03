package com.zhang.cloudlike.api.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/10/30 19:58
 * @Description:
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced//启用负载均衡
    public RestTemplate createRT() {
        return new RestTemplate();
    }

    //负载均衡分发策略
    public IRule createRule(){
        //最小并发分配
        return new BestAvailableRule();
    }
}