package com.yhp.spring.cloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * @desc：TODO添加描述
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午9:24:47
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}

