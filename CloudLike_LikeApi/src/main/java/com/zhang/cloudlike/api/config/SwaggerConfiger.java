package com.zhang.cloudlike.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: CloudLike
 * @Author: 张尚斌
 * @Time: 2020/11/1 22:02
 * @Description:
 */
@Configuration //标记这是一个配置
@EnableSwagger2
public class SwaggerConfiger {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("片场项目的在线接口文档").//设置标题
                contact(new Contact("Java2004","http://baidu.com","java2004@163.com"))
                .version("0.1").description("这是一个在线接口文档，可以直接查看接口的信息并且可以实现接口的测试")
                .build();
    }
    //构建Swagger 对象
    @Bean //使用Spring IOC创建实例
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).//指定生成那种类型的文档
                apiInfo(createAI())//文档信息
                .select().apis(RequestHandlerSelectors.basePackage("com.zhang.cloudlike.api.controller")).//扫描接口所在的包
                build();
    }
}