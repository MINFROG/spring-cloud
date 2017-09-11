package com.yhp.spring.cloud.server;
import org.springframework.web.bind.annotation.RestController;

import com.yhp.spring.cloud.dto.UserDto;
import com.yhp.spring.cloud.exception.NotFoundException;

/**
 * @desc：TODO添加描述
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午8:41:45
 */

@RestController
public class UserServiceImpl implements UserService {

	@Override
	public UserDto getUserDto() throws NotFoundException  {
		UserDto userDto = new UserDto();
		userDto.setName("yhp");
		userDto.setGender("男");
		userDto.setAge(18);
		throw new NotFoundException("未找到对应资源!");
	}

	@Override
	public void addUserDto(UserDto userDto) {
		System.out.println("调用成功:"+userDto.toString());
		
	}

}

