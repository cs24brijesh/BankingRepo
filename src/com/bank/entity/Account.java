package com.bank.entity;

public class Account {

	private long id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String emailId;
	private String dob;
	private String panCard;
	private long AadhaarNumber;
	private String postalAddress;
	private long accountNumber;
	private long mobileNumber;
	
	

	public Account() {
		super();
	}

	public Account(String firstName, String lastName, String userName, String password, String emailId, String dob,
			String panCard, long aadhaarNumber, String postalAddress, long accountNumber, long mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.dob = dob;
		this.panCard = panCard;
		this.AadhaarNumber = aadhaarNumber;
		this.postalAddress = postalAddress;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
	}

	public Account(long id, String firstName, String lastName, String userName, String password, String emailId,
			String dob, String panCard, long aadhaarNumber, String postalAddress, long accountNumber, long mobileNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.dob = dob;
		this.panCard = panCard;
		this.AadhaarNumber = aadhaarNumber;
		this.postalAddress = postalAddress;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public long getAadhaarNumber() {
		return AadhaarNumber;
	}

	public void setAadhaarNumber(long aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", emailId=" + emailId + ", dob=" + dob + ", panCard=" + panCard
				+ ", AadhaarNumber=" + AadhaarNumber + ", postalAddress=" + postalAddress + ", accountNumber="
				+ accountNumber + ", mobileNumber=" + mobileNumber + "]";
	}

}
