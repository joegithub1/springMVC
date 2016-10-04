package cn.text.model;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	
	private int id;
	@NotEmpty(message="姓名不能为空")
	private String name;
	@Past(message="日期要比当前时间早") //是一个过去日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	@Size(min=8,max=16)
	@NotEmpty(message="密码不能为空")
	private String password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public User(int id, String name, Date birthday, String password) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id="+id+",name="+name+",birthday="+birthday+"]";
	} 	
}
