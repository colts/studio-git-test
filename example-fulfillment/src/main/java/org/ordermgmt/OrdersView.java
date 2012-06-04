package org.ordermgmt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

@Path("/orders")
public class OrdersView {

	@GET
	@Produces("text/html")
	@Path("/{manufacturer}")
	public String viewOrders(@PathParam("manufacturer") String manufacturer) {
		File root = new File("c:/ftproot/output");
		File manFolder = new File(root, manufacturer.toLowerCase());
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><h1>Orders for " + manufacturer + "</h1>");
		buffer.append("<table>");
		buffer.append("<tr bgcolor='cccccc'><th>Item</th><th>Product Id</th>");
		buffer.append("<th>Quantity</th><th>Price</th>");
		if (manFolder.exists()) {
			File[] orders = manFolder.listFiles();
			for (File order : orders) {
				OrderItem item = loadItem(order);
				buffer.append("<tr>");
				buffer.append("<td>" + item.getName() + "</td>");
				buffer.append("<td>" + item.getProductId() + "</td>");
				buffer.append("<td>" + item.getQuantity() + "</td><td>"
						+ item.getPrice() + "</td>");
				buffer.append("</tr>");
			}
		}
		buffer.append("</table></html>");
		return buffer.toString();
	}

	/**
	 * Load an order item from file.
	 * 
	 * @param orderFile
	 * @return
	 */
	protected OrderItem loadItem(File orderFile) {
		try {
			JAXBContext context = JAXBContext.newInstance(OrderItem.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (OrderItem) unmarshaller.unmarshal(new FileInputStream(
					orderFile));
		} catch (JAXBException e) {
			return null;
		} catch (FileNotFoundException e) {
			return null;
		}
	}
}
