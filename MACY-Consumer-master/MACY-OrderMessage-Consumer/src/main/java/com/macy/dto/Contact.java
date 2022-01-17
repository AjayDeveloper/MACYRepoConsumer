package com.macy.dto;

import java.io.Serializable;

public class Contact implements Serializable{

	private String custID;
	private Name name;
	private Address address;
	private String daytimePhoneNbr;
	private String homePhoneNbr;
	private String alternatePhoneNbr;
	private boolean sendSMSMessage;
	private String emailAddress;
	private int seperatorContact0;

	public Contact() {
	}

	public Contact(String custID, Name name, Address address, String daytimePhoneNbr, String homePhoneNbr,
			String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress, int seperatorContact0) {
		super();
		this.custID = custID;
		this.name = name;
		this.address = address;
		this.daytimePhoneNbr = daytimePhoneNbr;
		this.homePhoneNbr = homePhoneNbr;
		this.alternatePhoneNbr = alternatePhoneNbr;
		this.sendSMSMessage = sendSMSMessage;
		this.emailAddress = emailAddress;
		this.seperatorContact0 = seperatorContact0;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDaytimePhoneNbr() {
		return daytimePhoneNbr;
	}

	public void setDaytimePhoneNbr(String daytimePhoneNbr) {
		this.daytimePhoneNbr = daytimePhoneNbr;
	}

	public String getHomePhoneNbr() {
		return homePhoneNbr;
	}

	public void setHomePhoneNbr(String homePhoneNbr) {
		this.homePhoneNbr = homePhoneNbr;
	}

	public String getAlternatePhoneNbr() {
		return alternatePhoneNbr;
	}

	public void setAlternatePhoneNbr(String alternatePhoneNbr) {
		this.alternatePhoneNbr = alternatePhoneNbr;
	}

	public boolean isSendSMSMessage() {
		return sendSMSMessage;
	}

	public void setSendSMSMessage(boolean sendSMSMessage) {
		this.sendSMSMessage = sendSMSMessage;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getSeperatorContact0() {
		return seperatorContact0;
	}

	public void setSeperatorContact0(int seperatorContact0) {
		this.seperatorContact0 = seperatorContact0;
	}

	@Override
	public String toString() {
		return "Contact [custID=" + custID + ", name=" + name + ", address=" + address + ", daytimePhoneNbr="
				+ daytimePhoneNbr + ", homePhoneNbr=" + homePhoneNbr + ", alternatePhoneNbr=" + alternatePhoneNbr
				+ ", sendSMSMessage=" + sendSMSMessage + ", emailAddress=" + emailAddress + ", seperatorContact0="
				+ seperatorContact0 + "]";
	}

}
