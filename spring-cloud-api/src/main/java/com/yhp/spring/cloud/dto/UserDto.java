package com.yhp.spring.cloud.dto;

import java.io.Serializable;

/**
 * @desc：TODO添加描述
 * 
 * @author: yuhuiping
 * @version：v1.0 
 * @date:2016年11月17日下午8:36:48
 */
public class UserDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String gender;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", gender=" + gender + ", age=" + age
				+ "]";
	}

}

