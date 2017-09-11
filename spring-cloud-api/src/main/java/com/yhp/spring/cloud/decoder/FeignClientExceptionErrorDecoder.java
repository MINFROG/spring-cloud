package com.yhp.spring.cloud.decoder;

import java.io.IOException;
import org.springframework.context.annotation.Configuration;
import com.yhp.spring.cloud.exception.NotFoundException;

import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;

/**
 * @desc TODO添加描述
 * 
 * @author yuhuiping
 * @version v1.0 
 * @date 2016年12月7日下午5:52:49
 */
@Configuration
public class FeignClientExceptionErrorDecoder implements ErrorDecoder {
	
	private final ErrorDecoder delegate = new ErrorDecoder.Default();

	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status() > 500){
			return delegate.decode(methodKey, response);
		}
		try {
			String returnMessage = Util.toString(response.body().asReader());
			if(response.status() == 500){
				return new NotFoundException(returnMessage);
			}
			
		} catch (IOException e) {
			 throw new RuntimeException("Failed to parse response body!", e);
		}
		
		return delegate.decode(methodKey, response);
	}
}

