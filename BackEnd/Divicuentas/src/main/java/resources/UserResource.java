package resources;

import dto.BillRequest;
import dto.ExtractoDto;
import dto.FriendDto;
import dto.FriendTuple;
import dto.PeopleTuple;
import dto.UpdateRequest;
import java.time.Clock;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
        return new ExtractoDto(personas, 200000, "Deben");
    }
    
    @GET
    @Path("/{user}/receive")
    public ExtractoDto receive(@PathParam("user") String user){
        PeopleTuple persona = new PeopleTuple("3005701146", "Trucha", 50000);
        PeopleTuple persona1 = new PeopleTuple("3005701147", "Mano", 50000);
        PeopleTuple persona2 = new PeopleTuple("3005701148", "Pooh", 50000);
        PeopleTuple persona3 = new PeopleTuple("3005701149", "Wilchitos", 50000);
        List<PeopleTuple> personas = List.of(persona, persona1, persona2, persona3);
        System.out.println(user);
        return new ExtractoDto(personas, 200000, "Cobrar");
    }
    
    @GET
    @Path("/{user}/friends")
    public FriendDto friend(@PathParam("user") String user){
        FriendTuple amigo = new FriendTuple("3005701146", "Trucha", false );
        FriendTuple amigo1 = new FriendTuple("3005701146", "Mano", true );
        FriendTuple amigo2 = new FriendTuple("3005701146", "Pooh", false );
        FriendTuple amigo3 = new FriendTuple("3005701146", "Rosita", false );
        List<FriendTuple> amigos = List.of(amigo, amigo1, amigo2, amigo3);
        return new FriendDto(amigos);
    }  
    
    @PUT
    @Path("/{user}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(UpdateRequest update){
        
        return Response.accepted().build();
    }
    
    @POST
    @Path("/{user}/newbill")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response bill(BillRequest bill){
        return Response.accepted().build();
    }
}
