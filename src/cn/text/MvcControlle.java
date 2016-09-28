package cn.text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.text.model.Persion;

@Controller
@RequestMapping("/mvc")
public class MvcControlle {

	//mvc/hello
	@RequestMapping("/hello")
	public String hello(){
		
		System.out.println("123");
		return "hello";
	}
	//mvc/persion?name=joe&age=22
	@RequestMapping("/persion")
	public String toPersion(String name,int age){
		
		System.out.println("name:"+name+"，age:"+age);
		return "hello";
	}
	//这里必须用name="test"而不是user.name="test"，因为默认情况下springMVC是不支持user.name这种传参方式的。
	//mvc/persion1?name=joe&age=22
	@RequestMapping("/persion1")
	public String toPersion(Persion p){
		System.out.println("p.name:"+p.getName()+"，p.age:"+p.getAge());
		
		return "hello";
	}
	@RequestMapping("/date")
	public String toDate(Date date){
		System.out.println(date);
		return "hello";
	}
	//处理日期类型 convert the type "String" to type "date"
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		
		
	}
	@RequestMapping("/show")
	public String showPersion(Map<String, Object> map){
		Persion p=new Persion("java", 25);
		map.put("p", p);
		return "show";
	}
	
}
