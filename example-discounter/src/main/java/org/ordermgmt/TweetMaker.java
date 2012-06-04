package org.ordermgmt;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Creates a Twitter message from an order summary.
 * 
 * @author Derek
 */
public class TweetMaker {

	/**
	 * Create a tweet from the order summary.
	 * 
	 * @param summary
	 * @return
	 */
	public String createTweet(OrderSummary summary) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Order #: " + summary.getOrderId());
		SimpleDateFormat formatter = new SimpleDateFormat(
				"yyyy.MM.dd HH:mm:ss z");
		String date = formatter.format(new Date());
		buffer.append(" Date: " + date);
		buffer.append(" Order total: " + summary.getTotalPrice());
		return buffer.toString();
	}
}