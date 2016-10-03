package cn.text;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @PathVariable  绑定 URL 占位符到入参
 * @author my
 *
 */
@Controller
@RequestMapping("/rest")
public class RestControlle {
	@RequestMapping(value="/abc/1",method=RequestMethod.GET)
	public String abc(){
		
		return "hello";
	}
	@RequestMapping(value="/user/${id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") Integer id){
		System.out.println("get:"+id);
		return "hello";
	}
	@RequestMapping(value="/user/${id}",method=RequestMethod.POST)
	public String post(@PathVariable("id") Integer id){
		System.out.println("post:"+id);
		return "hello";
	}
	@RequestMapping(value="/user/${id}",method=RequestMethod.PUT)
	public String put(@PathVariable("id") Integer id){
		System.out.println("put:"+id);
		return "hello";
	}
	@RequestMapping(value="/user/${id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		System.out.println("delete:"+id);
		return "hello";
	}
}
