package cn.text;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.text.model.User;

@Controller
@RequestMapping("/user")
public class UserControlle{
	//@ModelAttribute("user") user与页面form modelAttribute="user" 一致
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("user") User u,BindingResult br){
		if(br.getErrorCount()>0){
			return "hello";
		}
		return "success";
	}
	@RequestMapping(value="/toadd")
	public String addUser(Map<String, Object> map){
		map.put("user", new User());
		return "hello";
	}
}
