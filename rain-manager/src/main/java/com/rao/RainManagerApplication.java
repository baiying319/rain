package com.rao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 * @author raojing
 * @date 2019/11/20 17:29
 */
@EnableFeignClients(basePackages = {"com.rao"})
@SpringBootApplication
public class RainManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainManagerApplication.class, args);
    }
    
}
