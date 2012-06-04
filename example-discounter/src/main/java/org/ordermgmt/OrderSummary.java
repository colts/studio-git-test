package org.ordermgmt;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * A summary of the contents of an order.
 * 
 * @author Derek
 */
@XmlRootElement
public class OrderSummary {

	/** Unique order id */
	private String orderId;

	/** Count of the number of ordered items */
	private int itemCount;

	/** Total price of all items */
	private float totalPrice;

	/** Average price of items */
	private float averagePrice;

	/** Discount for order size */
	private float discount;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(float averagePrice) {
		this.averagePrice = averagePrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
}