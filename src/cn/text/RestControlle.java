package cn.text;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
* @ClassName: RestControlle 
* @Description:  绑定 URL 占位符到入参
* @author  huangjian
* @date 2016年10月6日 上午9:09:29 
*user/{id} 千万别写成 user/${id}
 */
@Controller
@RequestMapping("/rest")
public class RestControlle {
	@RequestMapping(value="/abc/{id}",method=RequestMethod.GET)
	public String abc(@PathVariable("id") Integer id){
		System.out.println("abc"+id);
		return "test";
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") Integer id){
		System.out.println("get:"+id);
		return "test";
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.POST)
	public String post(@PathVariable("id") Integer id){
		System.out.println("post:"+id);
		return "test";
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.PUT)
	public String put(@PathVariable("id") Integer id){
		System.out.println("put:"+id);
		return "test";
	}
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		System.out.println("delete:"+id);
		return "test";
	}
}
