package com.newmax.rt.grizzly.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SIP_W.CT_USER_SERVICES")
public class UserService {

	@Id
	@Column(name = "USS_LOGNAME")	
	private String login;
	
	@Column(name = "USS_PASSWORD")
	private String password;
	
	@Column(name = "USS_SL_TYPE")
	private String type;
	
	@Column(name = "USS_US_USER_NAME")
	private String username;
}
