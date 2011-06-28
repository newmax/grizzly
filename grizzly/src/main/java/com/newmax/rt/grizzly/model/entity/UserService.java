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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
