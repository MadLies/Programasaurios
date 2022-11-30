
package resources;

import Querys.Admin;
import com.codahale.metrics.annotation.Timed;
import dto.LoginDto;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import modelo.Usuario;

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
    @Path("/{user}")
    public LoginDto login(@PathParam("user") String user){ 
        /*Admin login = new Admin();
        double number = Double.parseDouble(user);
        Usuario usuario = login.FindUsuario(number);
        return new LoginDto(Double.toString(usuario.getId()), usuario.getContrasena());*/
        return new LoginDto("3002050291", "rawr");
    }
    
}
