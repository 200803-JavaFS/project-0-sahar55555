package com.revature.models;

public class Account {
	private int userid;
	private int accountid;
	private String accType;
	private double balance;
	
	
	public Account() {
		super();
	}
	
	
	public Account(int userid, int accountid, String accType, double balance) {
		super();
		this.userid = userid;
		this.accountid = accountid;
		this.accType = accType;
		this.balance = balance;
	}


	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public int getAccountid() {
		return accountid;
	}


	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
	
}
