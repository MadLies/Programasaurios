package resources;

import dto.CreationRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author venus
 */
@Path("/v1/register")
@Produces(MediaType.APPLICATION_JSON)
public class RegisterResource {
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add (CreationRequest creationInfo){
        System.out.println(creationInfo);
        return Response.accepted().build();
    }
}
