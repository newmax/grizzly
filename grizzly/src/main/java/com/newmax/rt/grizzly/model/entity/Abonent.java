package com.newmax.rt.grizzly.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIP_W.ABONENT")
public class Abonent {
	
	@Id
	@Column(name = "AB_ID")
	private long id;
	
	@Column(name = "AB_FIRM")
	private String name;
	
	@Column(name = "AB_ACCOUNT")
	private String account;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
