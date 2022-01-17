package com.macy.dto;

import java.io.Serializable;

public class FulFillmentOrder implements Serializable{

	private int orderID;
	private String orderTypeCode;
	private String partnerOrderID;
	private OrderStatus orderStatus;
	private String messageCreateTimeStamp;
	private String fulfillmentChannelCode;
	private int orderStatusCode;
	private String orderStatusDescription;
	private int sellZLDivisionNbr;
	private int sellZLLocationNbr;
	private Source source;
	private OrderTotals orderTotals;
	private Contact contact;

	public FulFillmentOrder() {
	}

	public FulFillmentOrder(int orderID, String orderTypeCode, String partnerOrderID, OrderStatus orderStatus,
			String messageCreateTimeStamp, String fulfillmentChannelCode, int orderStatusCode,
			String orderStatusDescription, int sellZLDivisionNbr, int sellZLLocationNbr, Source source,
			OrderTotals orderTotals, Contact contact) {
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

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public OrderTotals getOrderTotals() {
		return orderTotals;
	}

	public void setOrderTotals(OrderTotals orderTotals) {
		this.orderTotals = orderTotals;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "FulFillmentOrder [orderID=" + orderID + ", orderTypeCode=" + orderTypeCode + ", partnerOrderID="
				+ partnerOrderID + ", orderStatus=" + orderStatus + ", messageCreateTimeStamp=" + messageCreateTimeStamp
				+ ", fulfillmentChannelCode=" + fulfillmentChannelCode + ", orderStatusCode=" + orderStatusCode
				+ ", orderStatusDescription=" + orderStatusDescription + ", sellZLDivisionNbr=" + sellZLDivisionNbr
				+ ", sellZLLocationNbr=" + sellZLLocationNbr + ", source=" + source + ", orderTotals=" + orderTotals
				+ ", contact=" + contact + "]";
	}

}
