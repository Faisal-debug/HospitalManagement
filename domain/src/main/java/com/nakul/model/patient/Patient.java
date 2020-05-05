package com.nakul.model.patient;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	private int p_id;
	private String p_name;
	private String disease;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int p_id, String p_name, String disease) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.disease = disease;
	}
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Patient [p_id=" + p_id + ", p_name=" + p_name + ", disease=" + disease + "]";
	}
}
