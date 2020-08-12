package com.revature.models;

public class User {
	private String usernm;
	private long userid;
	private int userSSN;
	private String firstName;
	private String lastName;
	private String userType;
	private int bdate;
	
	public User() {
		super();
	}

	public User(String usernm, long userid, int userSSN, String firstName, String lastName, String userType,
			int bdate) {
		super();
		this.usernm = usernm;
		this.userid = userid;
		this.userSSN = userSSN;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.bdate = bdate;
	}

	public String getUsernm() {
		return usernm;
	}

	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public int getUserSSN() {
		return userSSN;
	}

	public void setUserSSN(int userSSN) {
		this.userSSN = userSSN;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getBdate() {
		return bdate;
	}

	public void setBdate(int bdate) {
		this.bdate = bdate;
	}
	
}

