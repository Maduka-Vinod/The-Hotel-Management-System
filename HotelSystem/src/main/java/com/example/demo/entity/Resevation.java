package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Resevation")
public class Resevation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private int number;
	private Date arival;
	private Date depature;
	private int adults;
	private int childs;
	
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
	public Date getArival() {
		return arival;
	}
	public void setArival(Date arival) {
		this.arival = arival;
	}
	public Date getDepature() {
		return depature;
	}
	public void setDepature(Date depature) {
		this.depature = depature;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChilds() {
		return childs;
	}
	public void setChilds(int childs) {
		this.childs = childs;
	}
	public Resevation(int id, String name, String email, int number, Date arival, Date depature, int adults,
			int childs) {
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
