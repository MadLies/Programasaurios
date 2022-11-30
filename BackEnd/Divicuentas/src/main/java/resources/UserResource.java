package resources;

import dto.ExtractoDto;
import dto.PeopleTuple;
import java.time.Clock;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author venus
 */
@Path("/v1/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    
    @GET
    @Path("/{user}/debts")
    public ExtractoDto debts(@PathParam("user") String user){
        PeopleTuple persona = new PeopleTuple("3005701146", "Trucha", 50000);
        PeopleTuple persona1 = new PeopleTuple("3005701147", "Mano", 50000);
        PeopleTuple persona2 = new PeopleTuple("3005701148", "Pooh", 50000);
        PeopleTuple persona3 = new PeopleTuple("3005701149", "Rosita", 50000);
        List<PeopleTuple> personas = List.of(persona, persona1, persona2, persona3);
        System.out.println(user);
        return new ExtractoDto(personas, 200000);
    }
    
    @GET
    @Path("/{user}/receive")
    public ExtractoDto receive(@PathParam("user") String user){
        PeopleTuple persona = new PeopleTuple("3005701146", "Trucha", 50000);
        PeopleTuple persona1 = new PeopleTuple("3005701147", "Mano", 50000);
        PeopleTuple persona2 = new PeopleTuple("3005701148", "Pooh", 50000);
        PeopleTuple persona3 = new PeopleTuple("3005701149", "Rosita", 50000);
        List<PeopleTuple> personas = List.of(persona, persona1, persona2, persona3);
        System.out.println(user);
        return new ExtractoDto(personas, 200000);
    }
    
}
