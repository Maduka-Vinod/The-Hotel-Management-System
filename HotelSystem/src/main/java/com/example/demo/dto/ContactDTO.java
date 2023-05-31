package com.example.demo.dto;

public class ContactDTO {
	private int id;
	private String name;
	private String email;
	private int number;
	private String cuntry;
	private String msg;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCuntry() {
		return cuntry;
	}
	public void setCuntry(String cuntry) {
		this.cuntry = cuntry;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ContactDTO(int id, String name, String email, int number, String cuntry, String msg) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.cuntry = cuntry;
		this.msg = msg;
	}
	public ContactDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ContactDTO [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", cuntry="
				+ cuntry + ", msg=" + msg + "]";
	}
	
	
}
