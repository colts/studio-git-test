package org.ordermgmt;

import javax.jws.WebService;

/**
 * Implementation for order processing.
 * 
 * @author Derek
 */
@WebService(endpointInterface = "org.ordermgmt.IProcessOrder", serviceName = "ProcessOrder")
public class ProcessOrderImpl implements IProcessOrder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ordermgmt.IProcessOrder#processOrder(org.ordermgmt.Order)
	 */
	public OrderSummary processOrder(Order order) {
		int itemCount = 0;
		float totalPrice = 0.0f;
		for (OrderItem item : order.getItems()) {
			for (int x = 0; x < item.getQuantity(); x++) {
				itemCount++;
				totalPrice += item.getPrice();
			}
		}
		float averagePrice = totalPrice / ((float) itemCount);

		OrderSummary summary = new OrderSummary();
		summary.setOrderId(order.getOrderId());
		summary.setItemCount(itemCount);
		summary.setTotalPrice(totalPrice);
		summary.setAveragePrice(averagePrice);
		return summary;
	}
}