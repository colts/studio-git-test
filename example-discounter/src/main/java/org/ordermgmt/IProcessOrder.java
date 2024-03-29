package org.ordermgmt;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Interface for order processing.
 * 
 * @author Derek
 */
@WebService
public interface IProcessOrder {

	/**
	 * Process an order.
	 * 
	 * @param order
	 * @return
	 */
	@WebResult(name = "summary")
	OrderSummary processOrder(@WebParam(name = "order") Order order);
}