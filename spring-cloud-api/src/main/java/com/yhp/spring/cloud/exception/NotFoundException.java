package com.yhp.spring.cloud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @desc TODO添加描述
 * 
 * @author yuhuiping
 * @version v1.0 
 * @date 2016年12月7日下午5:34:08
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7449388754197781772L;

	public NotFoundException() {
		super("查找的资源不存！");
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundException(String message) {
		super(message);
	}

}

