package com.qa.prizes.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Prizes {

	@Scope("prototype")
	public static int prizes(String account) {
		if (account.length() == 7) {
			if (account.substring(0, 1).equals("a")) {
				return 0;
			} else if (account.substring(0, 1).equals("b")) {
				return 50;
			}
			if (account.substring(0, 1).equals("c")) {
				return 100;
			}
		} else if (account.length() == 9) {
			if (account.substring(0, 1).equals("a")) {
				return 0;
			} else if (account.substring(0, 1).equals("b")) {
				return 500;
			}
			if (account.substring(0, 1).equals("c")) {
				return 1000;
			}
		} else if (account.length() == 11) {
			if (account.substring(0, 1).equals("a")) {
				return 0;
			} else if (account.substring(0, 1).equals("b")) {
				return 5000;
			}
			if (account.substring(0, 1).equals("c")) {
				return 10000;
			}
		}
		return 0;
	}

}
