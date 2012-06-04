package org.ordermgmt;

/**
 * Add a 30% discount to order.
 * 
 * @author Derek
 */
public class ThirtyPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {
		summary.setDiscount((float) (summary.getTotalPrice() * 0.30));
		return summary;
	}
}
