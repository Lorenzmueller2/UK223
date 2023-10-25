package m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculate")
public class calculator {



    @Path("add/{n1}/{n2}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int calculate(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        int result = n1+n2;
        return result;
    }
}
