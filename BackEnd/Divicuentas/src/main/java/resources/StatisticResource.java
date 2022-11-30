package resources;

import dto.ExpenseDto;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author venus
 */
@Path("/v1/statistics")
@Produces(MediaType.APPLICATION_JSON)
public class StatisticResource {
    
    @GET
    @Path("/weeklyexpense")
    public ExpenseDto expense(ExpenseDto expense){
        return new ExpenseDto(75000);
    }
}
