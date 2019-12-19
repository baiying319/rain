package com.rao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 * @author raojing
 * @date 2019/11/20 17:33
 */
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.rao"})
@MapperScan(value = "com.rao.dao.resource")
@SpringBootApplication
public class RainResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainResourceApplication.class, args);
    }
    
}

