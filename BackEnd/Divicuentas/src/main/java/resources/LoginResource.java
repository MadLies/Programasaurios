
package resources;

import com.codahale.metrics.annotation.Timed;
import api.Saying;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author venus
 */

@Path("/v1/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {
    private final String number;
    private final String password;
    
    public LoginResource(){
        this.number = "3004113699";
        this.password = "estoesunaprueba";
    }
    
    @GET
    @Timed
    public Saying sayGoodbye(){ 
        return new Saying(number, password);
    }
    
}
