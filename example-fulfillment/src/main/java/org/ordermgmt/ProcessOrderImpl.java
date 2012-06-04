package org.ordermgmt;

import javax.jws.WebService;

/**
 * Web service implementation.
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
	public Order processOrder(Order order) {
		return order;
	}
}