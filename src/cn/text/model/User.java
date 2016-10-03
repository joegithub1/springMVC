package cn.text.model;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	
	private int id;
	@NotEmpty
	private String name;
	@Past //是一个过去日期
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id="+id+",name="+name+",birthday="+birthday+"]";
	} 	
}
