package com.qa.domain;

public class AccountEntity {

	private long id;

	private String accNumber;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	@Override
	public String toString() {
		return "AccountEntity [id=" + id + ", accNumber=" + accNumber + "]";
	}

}
