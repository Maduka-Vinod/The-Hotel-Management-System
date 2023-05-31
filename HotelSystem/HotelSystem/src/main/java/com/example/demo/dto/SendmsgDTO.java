package com.example.demo.dto;

public class SendmsgDTO {
	private int id;
	private String name;
	private String email;
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SendmsgDTO(int id, String name, String email, String msg) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.msg = msg;
	}
	public SendmsgDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SendmsgDTO [id=" + id + ", name=" + name + ", email=" + email + ", msg=" + msg + "]";
	}
	
	
}
