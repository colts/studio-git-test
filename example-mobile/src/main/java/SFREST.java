import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
//import javax.ws.rs.PathParam;

@Path("/opportunity")
public class SFREST {

    @POST
    @Consumes("application/xml")
    @Path("/" )
    public String getOpportunityList(String message) {
    	return message;
    }
}
