package cn.text;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class MvcControlle1 {

	/**页面form表单提交
	 * form表单 name与requestParam对应
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/param")
	public String testRequestParam(@RequestParam(value="id") Integer id,
			@RequestParam(value="name") String name){
		
		System.out.println(id+"\t"+name);
		
		return "hello";
	}
}
