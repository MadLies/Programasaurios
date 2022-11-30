
package resources;

import com.codahale.metrics.annotation.Timed;
import dto.LoginDto;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 *
 * @author venus
 */

@Path("/v1/login")
@Produces(MediaType.APPLICATION_JSON)
@NoArgsConstructor
public class LoginResource {
    
    @GET
    @Timed
    public LoginDto login(){ 
        return new LoginDto("3004113699", "estoesunaprueba");
    }
    
}
