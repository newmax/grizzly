package com.newmax.rt.grizzly.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CT_USERS", schema = "SIP_W")
public class User extends Persistent {
	
	@Id
	@Column(name = "US_USER_NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "US_AB_ID")
	private Abonent abonent;
	
	@OneToMany(mappedBy = "user")
	private List<UserService> services = new ArrayList<UserService>();	
	
	public String getName() {
		return name;
	}
	
	public Abonent getAbonentId() {
		return abonent;
	}
	
    public List<UserService> getServices() {
        return services;
    }
}
