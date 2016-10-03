package cn.text;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局（Controlle）处理异常
 * @author my
 *
 */
@ControllerAdvice
public class AdviceControlle {

	@ExceptionHandler
	public ModelAndView execptionHandler(Exception ex){
		ModelAndView mv=new ModelAndView("error");	
		mv.addObject("exception",ex);
		
		System.out.println("in AdviceControlle");
		return mv;
	}
}
