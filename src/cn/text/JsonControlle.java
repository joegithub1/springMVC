package cn.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.text.model.UserEntity;

@Controller
@RequestMapping("/json")
public class JsonControlle {

	/**
@ResponseBody

该注解用于将Controller的方法返回的对象，
通过适当的HttpMessageConverter转换为指定格式后，
写入到Response对象的body数据区
	 * @return
	 * @throws ParseException
	 */
	@ResponseBody
	@RequestMapping("/gUser")
	public UserEntity getUser(String name) throws ParseException{
		UserEntity u=new UserEntity();
		u.setId(1);
		u.setName(name);
		u.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1999-01-01"));
		
		
		return u;
	}
}
