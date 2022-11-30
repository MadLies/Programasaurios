
package api;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author venus
 */
public class DivicuentasConfiguration extends Configuration{
    @NotEmpty
    private String template;

    @JsonProperty
    public String getTemplate() {
        return template;
    }
    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }
    
    
}
