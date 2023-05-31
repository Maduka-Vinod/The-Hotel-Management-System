package com.example.demo.dto;

import java.util.Date;

public class ResevationDTO {
	private int id;
	private String name;
	private String email;
	private String number;
	private String arival;
	private String depature;
	private String adults;
	private String childs;


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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArival() {
		return arival;
	}

	public void setArival(String arival) {
		this.arival = arival;
	}

	public String getDepature() {
		return depature;
	}

	public void setDepature(String depature) {
		this.depature = depature;
	}

	public String getAdults() {
		return adults;
	}

	public void setAdults(String adults) {
		this.adults = adults;
	}

	public String getChilds() {
		return childs;
	}

	public void setChilds(String childs) {
		this.childs = childs;
	}

	public Resevation(int id, String name, String email, String number, String arival, String depature, String adults,
					  String childs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.arival = arival;
		this.depature = depature;
		this.adults = adults;
		this.childs = childs;
	}
	public Resevation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Resevation [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", arival="
				+ arival + ", depature=" + depature + ", adults=" + adults + ", childs=" + childs + "]";
	}

}
