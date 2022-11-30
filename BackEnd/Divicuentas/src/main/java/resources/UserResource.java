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
        PeopleTuple persona = new PeopleTuple("3005701146", "Manuel", 5000);
        PeopleTuple persona1 = new PeopleTuple("3005701147", "Venus", 2000);
        PeopleTuple persona2 = new PeopleTuple("3005701148", "Sergio", 30000);
        PeopleTuple persona3 = new PeopleTuple("3005701149", "Brayan", 12000);
        List<PeopleTuple> personas = List.of(persona, persona1, persona2, persona3);
        System.out.println(user);
        return new ExtractoDto(personas, 49000, "Deben");
    }
    
    @GET
    @Path("/{user}/receive")
    public ExtractoDto receive(@PathParam("user") String user){
        PeopleTuple persona = new PeopleTuple("3005701156", "Sebastian", 500);
        PeopleTuple persona1 = new PeopleTuple("3005701157", "David", 5200);
        PeopleTuple persona2 = new PeopleTuple("3005701158", "Esteban", 70000);
        PeopleTuple persona3 = new PeopleTuple("3005701159", "Cristhian", 100000);
        List<PeopleTuple> personas = List.of(persona, persona1, persona2, persona3);
        System.out.println(user);
        return new ExtractoDto(personas, 175700, "Cobrar");
    }
    
    @GET
    @Path("/{user}/friends")
    public FriendDto friend(@PathParam("user") String user){
        FriendTuple amigo = new FriendTuple("3005701147", "Venus", true );
        FriendTuple amigo1 = new FriendTuple("3005701146", "Manuel", true );
        FriendTuple amigo2 = new FriendTuple("3005701246", "Grasa", false );
        FriendTuple amigo3 = new FriendTuple("3005704146", "Molina", false );
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
