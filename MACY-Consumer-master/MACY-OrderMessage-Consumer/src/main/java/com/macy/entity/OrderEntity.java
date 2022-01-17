package com.macy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TABLE")
public class OrderEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "messageName")
	private String messageName;
	
	@Column(name = "command")
	private String command;
	
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "itemDescription")
	private String itemDescription;
	
	@Column(name = "itemLength")
	private double itemLength;
	
	@Column(name = "itemWidth")
	private double itemWidth;
	
	@Column(name = "itemHeight")
	private double itemHeight;
	
	@Column(name = "itemWeight")
	private double itemWeight;
	
	@Column(name = "imagePathname")
	private String imagePathname;
	
	@Column(name = "rfidTagged")
	private String rfidTagged;
	
	@Column(name = "storageAttribute")
	private int storageAttribute;
	
	@Column(name = "pickType")
	private String pickType;
	
	@Column(name = "upcList")
	private String upcList;
	
	public OrderEntity() {}
	public OrderEntity(int id, String messageName, String command, String itemName, String itemDescription, double itemLength,
			double itemWidth, double itemHeight, double itemWeight, String imagePathname, String rfidTagged,
			int storageAttribute, String pickType, String upcList) {
		super();
		this.id = id;
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
		return "OrderEntityy [id=" + id + ", messageName=" + messageName + ", command=" + command + ", itemName=" + itemName
				+ ", itemDescription=" + itemDescription + ", itemLength=" + itemLength + ", itemWidth=" + itemWidth
				+ ", itemHeight=" + itemHeight + ", itemWeight=" + itemWeight + ", imagePathname=" + imagePathname
				+ ", rfidTagged=" + rfidTagged + ", storageAttribute=" + storageAttribute + ", pickType=" + pickType
				+ ", upcList=" + upcList + "]";
	}
}
