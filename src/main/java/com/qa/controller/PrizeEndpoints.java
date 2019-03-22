package com.qa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.domain.AccountEntity;
import com.qa.prizes.service.Prizes;

@RestController
public class PrizeEndpoints {
	
	private Prizes service;

	public PrizeEndpoints(Prizes service) {
		this.service = service;
	}

	@PostMapping("/")
	public int prizesEndPoint(@RequestBody AccountEntity account) {
		return service.prizes(account.getAccNumber());
	}
}
