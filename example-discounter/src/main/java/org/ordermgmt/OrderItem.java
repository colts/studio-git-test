package org.ordermgmt;

/**
 * An item in an order.
 * 
 * @author Derek
 */
public class OrderItem {

	/** Item number */
	private String productId;

	/** Item name */
	private String name;

	/** Item price */
	private float price;

	/** Item quantity */
	private int quantity;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}