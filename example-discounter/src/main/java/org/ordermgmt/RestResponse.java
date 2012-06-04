package org.ordermgmt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/echo")
public class RestResponse {

	@GET
	@Produces("text/plain")
	@Path("/{input}")
	public String echo(@PathParam("input") String input) {
		return input;
	}
}
