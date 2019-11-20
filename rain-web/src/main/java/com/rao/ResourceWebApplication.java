package com.rao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.rao.dao")
@SpringBootApplication
public class ResourceWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceWebApplication.class, args);
	}
}
