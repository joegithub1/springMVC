package cn.text;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exception")
public class ExceptionControlle {
	//1.处理局部异常（Controller内）
	/** 内部异常和全局异常不能同时运行 内部 》 外部
	@ExceptionHandler
	public ModelAndView exceptionHandler(Exception ex){
		ModelAndView mv=new ModelAndView("error");
		mv.addObject("exception",ex);
		System.out.println("in exceptionHandler");
		return mv;
	}*/
	@RequestMapping("/error")
	public String error(){
		int r=5/0;//这里出现异常会走 exceptionHandler 
		return "hello";
	}
}
