package com.yhp.spring.cloud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yhp.spring.cloud.dto.UserDto;
import com.yhp.spring.cloud.exception.NotFoundException;
import com.yhp.spring.cloud.server.UserService;

/**
 * @desc：TODO添加描述
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午9:13:59
 */
@RestController
@RequestMapping("/spring")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/getuser",method=RequestMethod.GET)
	public UserDto getUserDto(){
		try {
			return userService.getUserDto();
		} catch (NotFoundException e) {
			System.out.println("出现异常啦！！！！！");
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public void addUserDto(){
//		ItemDto itemDto = new ItemDto();
//		itemDto.setItemId(1l);
//		itemDto.setItemName("番茄土豆");
//		itemDto.equals(10.0);
		UserDto userDto = new UserDto();
		userDto.setAge(18);
		userDto.setGender("male");
		userDto.setName("yhp");
		userService.addUserDto(userDto);
	}
}

