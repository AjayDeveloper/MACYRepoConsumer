package com.macy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TOTALS")
public class OrderTotalsEntity{

	@Id
	@GeneratedValue
	@Column(name = "totalId")
	public int totalId;
	
	@Column(name = "totalPurchaseAmount")
	private double totalPurchaseAmount;
	
	@Column(name = "seperatorOrderTotals0")
	private double seperatorOrderTotals0;

	public OrderTotalsEntity() {
	}

	public OrderTotalsEntity(int totalId, double totalPurchaseAmount, double seperatorOrderTotals0) {
		super();
		this.totalId = totalId;
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}

	public int getTotalId() {
		return totalId;
	}

	public void setTotalId(int totalId) {
		this.totalId = totalId;
	}

	public double getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}

	public void setTotalPurchaseAmount(double totalPurchaseAmount) {
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

	public double getSeperatorOrderTotals0() {
		return seperatorOrderTotals0;
	}

	public void setSeperatorOrderTotals0(double seperatorOrderTotals0) {
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
	}

}
