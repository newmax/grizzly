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
	
	@Column(name = "AB_ACCOUT")
	private String account;
}
