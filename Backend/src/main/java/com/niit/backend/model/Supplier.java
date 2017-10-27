package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component 
@Table(name = "Supplier")

public class Supplier {
	
	@Id
	@GeneratedValue
	
private int supId;
private String supname;
private int Contactno;
public int getSupId() {
	return supId;
}
public void setSupId(int supId) {
	this.supId = supId;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public int getContactno() {
	return Contactno;
}
public void setContactno(int contactno) {
	Contactno = contactno;
}

}
