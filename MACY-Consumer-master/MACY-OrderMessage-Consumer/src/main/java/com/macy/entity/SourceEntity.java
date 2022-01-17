package com.macy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SOURCE")
public class SourceEntity{

	@Id
	@GeneratedValue
	public int sourceId;
	
	@Column(name = "clientID")
	private String clientID;
	
	@Column(name = "subClientID")
	private String subClientID;
	
	@Column(name = "sellingChannelCode")
	private String sellingChannelCode;
	
	@Column(name = "seperatorSource0")
	private String seperatorSource0;
	
	@Column(name = "separatorSource1")
	private String separatorSource1;

	public SourceEntity() {
	}

	public SourceEntity(int sourceId, String clientID, String subClientID, String sellingChannelCode, String seperatorSource0,
			String separatorSource1) {
		super();
		this.sourceId = sourceId;
		this.clientID = clientID;
		this.subClientID = subClientID;
		this.sellingChannelCode = sellingChannelCode;
		this.seperatorSource0 = seperatorSource0;
		this.separatorSource1 = separatorSource1;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientId) {
		this.clientID = clientId;
	}

	public String getSubClientID() {
		return subClientID;
	}

	public void setSubClientID(String subClientID) {
		this.subClientID = subClientID;
	}

	public String getSellingChannelCode() {
		return sellingChannelCode;
	}

	public void setSellingChannelCode(String sellingChannelCode) {
		this.sellingChannelCode = sellingChannelCode;
	}

	public String getSeperatorSource0() {
		return seperatorSource0;
	}

	public void setSeperatorSource0(String seperatorSource0) {
		this.seperatorSource0 = seperatorSource0;
	}

	public String getSeparatorSource1() {
		return separatorSource1;
	}

	public void setSeparatorSource1(String separatorSource1) {
		this.separatorSource1 = separatorSource1;
	}

	@Override
	public String toString() {
		return "SourceEntity [sourceId=" + sourceId + ", clientID=" + clientID + ", subClientID=" + subClientID
				+ ", sellingChannelCode=" + sellingChannelCode + ", seperatorSource0=" + seperatorSource0
				+ ", separatorSource1=" + separatorSource1 + "]";
	}

	
}
