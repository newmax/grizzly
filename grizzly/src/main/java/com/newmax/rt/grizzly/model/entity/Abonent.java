package com.newmax.rt.grizzly.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ABONENT", schema = "SIP_W")
public class Abonent extends Persistent {
	
	@Id
	@Column(name = "AB_ID")
	private long id;
	
	@Column(name = "AB_FIRM")
	private String name;
	
	@Column(name = "AB_ACCOUNT")
	private String account;

	public Serializable getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAccount() {
		return account;
	}
}
