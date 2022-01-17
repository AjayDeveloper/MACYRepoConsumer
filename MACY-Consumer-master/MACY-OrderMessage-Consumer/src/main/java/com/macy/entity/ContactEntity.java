package com.macy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT")
public class ContactEntity {

	@Id
	@GeneratedValue
	@Column(name = "contactId")
	public int contactId;
	
	@Column(name = "custID")
	private String custID;
	
	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "nameId")
	private NameEntity name;
	
	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "addressId")
	private AddressEntity address;
	
	@Column(name = "daytimePhoneNbr")
	private String daytimePhoneNbr;
	
	@Column(name = "homePhoneNbr")
	private String homePhoneNbr;
	
	@Column(name = "alternatePhoneNbr")
	private String alternatePhoneNbr;
	
	@Column(name = "sendSMSMessage")
	private boolean sendSMSMessage;
	
	@Column(name = "emailAddress")
	private String emailAddress;
	
	@Column(name = "seperatorContact0")
	private int seperatorContact0;

	public ContactEntity() {
	}

	public ContactEntity(int contactId, String custID, NameEntity name, AddressEntity address, String daytimePhoneNbr,
			String homePhoneNbr, String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress,
			int seperatorContact0) {
		super();
		this.contactId = contactId;
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

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public NameEntity getName() {
		return name;
	}

	public void setName(NameEntity name) {
		this.name = name;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
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
		return "ContactEntity [contactId=" + contactId + ", custID=" + custID + ", name=" + name + ", address="
				+ address + ", daytimePhoneNbr=" + daytimePhoneNbr + ", homePhoneNbr=" + homePhoneNbr
				+ ", alternatePhoneNbr=" + alternatePhoneNbr + ", sendSMSMessage=" + sendSMSMessage + ", emailAddress="
				+ emailAddress + ", seperatorContact0=" + seperatorContact0 + "]";
	}
}
