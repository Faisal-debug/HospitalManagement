package com.nakul.model.doctor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	private int d_id;
	private String d_name;
	private String specialist;
	
	public Doctor(int d_id, String d_name, String specialist) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.specialist = specialist;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", d_name=" + d_name + ", specialist=" + specialist + "]";
	}
}
