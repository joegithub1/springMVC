package cn.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import cn.text.model.Persion;

@Controller
@RequestMapping("/mvc")
public class MvcControlle {

	// mvc/hello
	@RequestMapping("/hello")
	public String hello() {

		System.out.println("123");
		return "hello";
	}

	// mvc/persion?name=joe&age=22
	@RequestMapping("/persion")
	public String toPersion(String name, int age) {

		System.out.println("name:" + name + "，age:" + age);
		return "hello";
	}

	// 这里必须用name="test"而不是user.name="test"，因为默认情况下springMVC是不支持user.name这种传参方式的。
	// mvc/persion1?name=joe&age=22
	@RequestMapping("/persion1")
	public String toPersion(Persion p) {
		System.out.println("p.name:" + p.getName() + "，p.age:" + p.getAge());

		return "hello";
	}

	@RequestMapping("/date")
	public String toDate(Date date) {
		System.out.println(date);
		return "hello";
	}

	// 处理日期类型 convert the type "String" to type "date"
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {

		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));

	}

	@RequestMapping("/show")
	public String showPersion(Map<String, Object> map) {
		Persion p = new Persion("java", 25);
		map.put("p", p);
		return "show";
	}

	/**
	 * 八 调用ajax
	 * 
	 * @param name
	 * @param age
	 * @param pw
	 * @return
	 */
	@RequestMapping("/getPersion")
	public String getPersion(String name, String age, PrintWriter pw) {
		// System.out.println(("hello "+name+"，age:"+age));
		// 会打印html数据
		pw.write("hello " + name + "，age:" + age);
		return "test";
	}

	/**
	 * 九 跳转到hell控制器方法中
	 * 
	 * @return
	 */
	@RequestMapping("/redirect")
	public String redirect() {

		return "redirect:hello";
	}

	// 文件上传
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(HttpServletRequest sr, Map<String, String> map) {
		String msg="上传成功";
		try {
			//这种方式报错
			//MultipartHttpServletRequest mseq = (MultipartHttpServletRequest) sr;
		MultipartResolver	mr = new CommonsMultipartResolver(sr.getSession().getServletContext());
		
		MultipartHttpServletRequest mseq=mr.resolveMultipart(sr);
		MultipartFile mf = mseq.getFile("ff");
		String fileName = mf.getOriginalFilename();
		//.txt
		//System.out.println(fileName+"，|"+fileName.substring(fileName.lastIndexOf('.'))+"|");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String file = sr.getSession().getServletContext().getRealPath("/") + "upload/" + sdf.format(new Date())
				+ fileName.substring(fileName.lastIndexOf('.'));
		/**创建文件路径*/
		File url=new File(file);
		if(!url.exists()){
			url.createNewFile();
		}
		/***/
		FileOutputStream fos = new FileOutputStream(file);
		
		fos.write(mf.getBytes());
		
		fos.flush();
		fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("强转异常");
			e.printStackTrace();
			msg="上传失败";
		}
		map.put("result",msg);
		return "upload";
	}

}
