package com.yhp.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @desc：服务提供者
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午8:50:36
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerApplication.class).web(true).run(args);
	}

}

