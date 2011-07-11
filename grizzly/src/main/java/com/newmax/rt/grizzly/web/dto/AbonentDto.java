package com.newmax.rt.grizzly.web.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.newmax.rt.grizzly.model.entity.Abonent;


public class AbonentDto {

    @NotNull(message = "Length should be bigger than 6 and less than 12")
    @Size(min = 6, max = 12)
    private String account;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
    
	public static AbonentDto getDtoFor(Abonent abonent) {
		AbonentDto dto = new AbonentDto();
		dto.setAccount(abonent.getAccount());
		
		return dto;
	}
	
	public static AbonentDto getDtoFor(String account) {
		AbonentDto dto = new AbonentDto();
		dto.setAccount(account);
		
		return dto;
	}
}
