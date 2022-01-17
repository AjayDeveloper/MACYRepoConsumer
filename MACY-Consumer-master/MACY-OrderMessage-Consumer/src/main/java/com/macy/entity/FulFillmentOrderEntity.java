package com.macy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.macy.dto.OrderStatus;

@Entity
@Table(name = "FULFILLMENT_ORDER")
public class FulFillmentOrderEntity {

	@Id
	@Column(name = "orderID")
	private int orderID;

	@Column(name = "orderTypeCode")
	private String orderTypeCode;

	@Column(name = "partnerOrderID")
	private String partnerOrderID;

	@Enumerated(EnumType.STRING)
	@Column(name = "orderStatus")
	private OrderStatus orderStatus;

	@Column(name = "messageCreateTimeStamp")
	private String messageCreateTimeStamp;

	@Column(name = "fulfillmentChannelCode")
	private String fulfillmentChannelCode;

	@Column(name = "orderStatusCode")
	private int orderStatusCode;

	@Column(name = "orderStatusDescription")
	private String orderStatusDescription;

	@Column(name = "sellZLDivisionNbr")
	private int sellZLDivisionNbr;

	@Column(name = "sellZLLocationNbr")
	private int sellZLLocationNbr;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "sourceId")
	private SourceEntity source;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "totalId")
	private OrderTotalsEntity orderTotals;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinColumn(name = "contactId")
	private ContactEntity contact;

	public FulFillmentOrderEntity() {
	}

	public FulFillmentOrderEntity(int orderID, String orderTypeCode, String partnerOrderID, OrderStatus orderStatus,
			String messageCreateTimeStamp, String fulfillmentChannelCode, int orderStatusCode,
			String orderStatusDescription, int sellZLDivisionNbr, int sellZLLocationNbr, SourceEntity source,
			OrderTotalsEntity orderTotals, ContactEntity contact) {
		super();
		this.orderID = orderID;
		this.orderTypeCode = orderTypeCode;
		this.partnerOrderID = partnerOrderID;
		this.orderStatus = orderStatus;
		this.messageCreateTimeStamp = messageCreateTimeStamp;
		this.fulfillmentChannelCode = fulfillmentChannelCode;
		this.orderStatusCode = orderStatusCode;
		this.orderStatusDescription = orderStatusDescription;
		this.sellZLDivisionNbr = sellZLDivisionNbr;
		this.sellZLLocationNbr = sellZLLocationNbr;
		this.source = source;
		this.orderTotals = orderTotals;
		this.contact = contact;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderTypeCode() {
		return orderTypeCode;
	}

	public void setOrderTypeCode(String orderTypeCode) {
		this.orderTypeCode = orderTypeCode;
	}

	public String getPartnerOrderID() {
		return partnerOrderID;
	}

	public void setPartnerOrderID(String partnerOrderID) {
		this.partnerOrderID = partnerOrderID;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getMessageCreateTimeStamp() {
		return messageCreateTimeStamp;
	}

	public void setMessageCreateTimeStamp(String messageCreateTimeStamp) {
		this.messageCreateTimeStamp = messageCreateTimeStamp;
	}

	public String getFulfillmentChannelCode() {
		return fulfillmentChannelCode;
	}

	public void setFulfillmentChannelCode(String fulfillmentChannelCode) {
		this.fulfillmentChannelCode = fulfillmentChannelCode;
	}

	public int getOrderStatusCode() {
		return orderStatusCode;
	}

	public void setOrderStatusCode(int orderStatusCode) {
		this.orderStatusCode = orderStatusCode;
	}

	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}

	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}

	public int getSellZLDivisionNbr() {
		return sellZLDivisionNbr;
	}

	public void setSellZLDivisionNbr(int sellZLDivisionNbr) {
		this.sellZLDivisionNbr = sellZLDivisionNbr;
	}

	public int getSellZLLocationNbr() {
		return sellZLLocationNbr;
	}

	public void setSellZLLocationNbr(int sellZLLocationNbr) {
		this.sellZLLocationNbr = sellZLLocationNbr;
	}

	public SourceEntity getSource() {
		return source;
	}

	public void setSource(SourceEntity source) {
		this.source = source;
	}

	public OrderTotalsEntity getOrderTotals() {
		return orderTotals;
	}

	public void setOrderTotals(OrderTotalsEntity orderTotals) {
		this.orderTotals = orderTotals;
	}

	public ContactEntity getContact() {
		return contact;
	}

	public void setContact(ContactEntity contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "FulFillmentOrderEntity [orderID=" + orderID + ", orderTypeCode=" + orderTypeCode + ", partnerOrderID="
				+ partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp=" + messageCreateTimeStamp
				+ ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode=" + orderStatusCode
				+ ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr=" + sellZLDivisionNbr
				+ ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source + ", orderTotals=" + orderTotals
				+ ", contact=" + contact + "]";
	}

}
