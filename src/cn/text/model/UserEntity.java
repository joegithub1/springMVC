package cn.text.model;

import java.util.Date;

public class UserEntity {

	private int id;
	private String name;
	private Date birthday;
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int id, String name, Date birthday) {
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
	
}
