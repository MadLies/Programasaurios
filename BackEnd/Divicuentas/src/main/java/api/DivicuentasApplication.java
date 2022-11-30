package api;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.LoginResource;
import resources.RegisterResource;
import resources.StatisticResource;
import resources.UserResource;
//import com.example.helloworld.health.TemplateHealthCheck;

/**
 *
 * @author venus
 */
public class DivicuentasApplication extends Application<DivicuentasConfiguration>{

    public static void main(String[] args) throws Exception {
        new DivicuentasApplication().run(args);
    }
    
    @Override
    public String getName(){
        return "Programasaurios";
    }
    
    @Override 
    public void initialize(Bootstrap<DivicuentasConfiguration> bootstrap){
        
    }
    
    @Override
    public void run(DivicuentasConfiguration configuration,
                Environment environment){
        final LoginResource login = new LoginResource();
        final UserResource debts = new UserResource();
        final RegisterResource register = new RegisterResource();
        final StatisticResource statistic = new StatisticResource();
        environment.jersey().register(login);
        environment.jersey().register(debts);
        environment.jersey().register(register);
        environment.jersey().register(statistic);
    }
}
