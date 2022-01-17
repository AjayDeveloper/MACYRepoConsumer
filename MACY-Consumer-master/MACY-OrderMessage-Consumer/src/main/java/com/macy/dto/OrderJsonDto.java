package com.macy.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Consumer Order Model")
public class OrderJsonDto implements Serializable{
	
	@ApiModelProperty("Id of Order")
	private int id;
	@ApiModelProperty("Message Name of Order")
	private String messageName;
	@ApiModelProperty("Command of Order")
	private String command;
	@ApiModelProperty("Name of Order")
	private String itemName;
	@ApiModelProperty("Description of Order")
	private String itemDescription;
	@ApiModelProperty("Length of Order")
	private double itemLength;
	@ApiModelProperty("Width of Order")
	private double itemWidth;
	@ApiModelProperty("Height of Order")
	private double itemHeight;
	@ApiModelProperty("Weight of Order")
	private double itemWeight;
	@ApiModelProperty("Image Path of Order")
	private String imagePathname;
	private String rfidTagged;
	@ApiModelProperty("Storage Attribute of Order")
	private int storageAttribute;
	@ApiModelProperty("Pick Type of Order")
	private String pickType;
	@ApiModelProperty("UPC of Order")
	private String upcList;
	
	public OrderJsonDto() {}
	public OrderJsonDto(int orderId, String messageName, String command, String itemName, String itemDescription, double itemLength,
			double itemWidth, double itemHeight, double itemWeight, String imagePathname, String rfidTagged,
			int storageAttribute, String pickType, String upcList) {
		super();
		this.id = orderId;
		this.messageName = messageName;
		this.command = command;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemLength = itemLength;
		this.itemWidth = itemWidth;
		this.itemHeight = itemHeight;
		this.itemWeight = itemWeight;
		this.imagePathname = imagePathname;
		this.rfidTagged = rfidTagged;
		this.storageAttribute = storageAttribute;
		this.pickType = pickType;
		this.upcList = upcList;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public double getItemLength() {
		return itemLength;
	}
	public void setItemLength(double itemLength) {
		this.itemLength = itemLength;
	}
	public double getItemWidth() {
		return itemWidth;
	}
	public void setItemWidth(double itemWidth) {
		this.itemWidth = itemWidth;
	}
	public double getItemHeight() {
		return itemHeight;
	}
	public void setItemHeight(double itemHeight) {
		this.itemHeight = itemHeight;
	}
	public double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getImagePathname() {
		return imagePathname;
	}
	public void setImagePathname(String imagePathname) {
		this.imagePathname = imagePathname;
	}
	public String getRfidTagged() {
		return rfidTagged;
	}
	public void setRfidTagged(String rfidTagged) {
		this.rfidTagged = rfidTagged;
	}
	public int getStorageAttribute() {
		return storageAttribute;
	}
	public void setStorageAttribute(int storageAttribute) {
		this.storageAttribute = storageAttribute;
	}
	public String getPickType() {
		return pickType;
	}
	public void setPickType(String pickType) {
		this.pickType = pickType;
	}
	public String getUpcList() {
		return upcList;
	}
	public void setUpcList(String upcList) {
		this.upcList = upcList;
	}
	@Override
	public String toString() {
		return "OrderDto [id=" + id + ", messageName=" + messageName + ", command=" + command + ", itemName=" + itemName
				+ ", itemDescription=" + itemDescription + ", itemLength=" + itemLength + ", itemWidth=" + itemWidth
				+ ", itemHeight=" + itemHeight + ", itemWeight=" + itemWeight + ", imagePathname=" + imagePathname
				+ ", rfidTagged=" + rfidTagged + ", storageAttribute=" + storageAttribute + ", pickType=" + pickType
				+ ", upcList=" + upcList + "]";
	}
}
