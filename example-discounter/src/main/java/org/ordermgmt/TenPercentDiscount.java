package org.ordermgmt;

/**
 * Add a 10% discount to order.
 * 
 * @author Derek
 */
public class TenPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {
		summary.setDiscount((float) (summary.getTotalPrice() * 0.10));
		return summary;
	}
}
