package com.example.demo.dto;

import java.util.Date;

public class BookstayDTO {
	private int id;
	private Date checkin;
	private Date checkout;
	private String email;
	private String nationality;
	private String promocode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	public BookstayDTO(int id, Date checkin, Date checkout, String email, String nationality, String promocode) {
		super();
		this.id = id;
		this.checkin = checkin;
		this.checkout = checkout;
		this.email = email;
		this.nationality = nationality;
		this.promocode = promocode;
	}
	public BookstayDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookstayDTO [id=" + id + ", checkin=" + checkin + ", checkout=" + checkout + ", email=" + email
				+ ", nationality=" + nationality + ", promocode=" + promocode + "]";
	}
	
	
}
