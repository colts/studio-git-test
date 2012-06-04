package org.ordermgmt;

/**
 * Add a 20% discount to order.
 * 
 * @author Derek
 */
public class TwentyPercentDiscount {

	/**
	 * Calculate the discount.
	 * 
	 * @param summary
	 * @return
	 */
	public OrderSummary calculateDiscount(OrderSummary summary) {
		summary.setDiscount((float) (summary.getTotalPrice() * 0.20));
		return summary;
	}
}
