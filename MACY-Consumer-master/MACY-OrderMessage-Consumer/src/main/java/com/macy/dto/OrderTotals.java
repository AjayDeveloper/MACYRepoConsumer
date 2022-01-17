package com.macy.dto;

import java.io.Serializable;

public class OrderTotals implements Serializable{

	private double totalPurchaseAmount;
	private double seperatorOrderTotals0;

	public OrderTotals() {
	}

	public OrderTotals(double totalPurchaseAmount, double seperatorOrderTotals0) {
		super();
		this.totalPurchaseAmount = totalPurchaseAmount;
		this.seperatorOrderTotals0 = seperatorOrderTotals0;
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

	@Override
	public String toString() {
		return "OrderTotals [totalPurchaseAmount=" + totalPurchaseAmount + ", seperatorOrderTotals0="
				+ seperatorOrderTotals0 + "]";
	}

}
