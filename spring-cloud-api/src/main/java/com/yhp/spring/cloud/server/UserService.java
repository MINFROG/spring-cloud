package com.yhp.spring.cloud.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yhp.spring.cloud.dto.ItemDto;
import com.yhp.spring.cloud.dto.UserDto;
import com.yhp.spring.cloud.exception.NotFoundException;

/**
 * @desc：TODO添加描述
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午8:35:28
 */
@FeignClient(value="spring-cloud-service")
public interface UserService {
	
	@RequestMapping(value="spring/getuser",method=RequestMethod.GET)
	public UserDto getUserDto() throws NotFoundException;
	
	@RequestMapping(value="spring/adduser",method=RequestMethod.POST)
	public void addUserDto(UserDto userDto);

}

