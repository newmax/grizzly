package com.newmax.rt.grizzly.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CT_USER_SERVICES", schema = "SIP_W")
public class UserService {

	@Id
	@Column(name = "USS_LOGNAME")	
	private String login;
	
	@Column(name = "USS_PASSWORD")
	private String password;
	
	@Column(name = "USS_SL_TYPE")
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "USS_US_USER_NAME")
	private User user;
	
	@Column(name = "USS_STATUS")
	private String status;	

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type;
	}

	public User getUser() {
		return user;
	}
	
	public String getStatus() {
		return status;
	}
}
