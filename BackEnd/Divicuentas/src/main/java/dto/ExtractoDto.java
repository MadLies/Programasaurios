package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.eventbus.AllowConcurrentEvents;
import java.util.List;
import lombok.Value;

/**
 *
 * @author venus
 */
@Value
public class ExtractoDto {   
    @JsonProperty
    private List<PeopleTuple> people;
    @JsonProperty
    private int total;
    private String type;
    
}
