package resources;

import Querys.Admin;
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
        //Admin create = new Admin();
        /*create.GenerarUusario(Double.parseDouble(creationInfo.getNumber()), 
                creationInfo.getName(), 
                creationInfo.getNickname(), 
                creationInfo.getCountry(), 
                "COP", 
                creationInfo.getEmail(),
                creationInfo.getPassword());*/
        //create.GenerarUusario(300570114, "Kevin", "kev", "Peru", "COP", "kevin@gmail.com", "uwu");
        return Response.accepted().build();
    }
}
