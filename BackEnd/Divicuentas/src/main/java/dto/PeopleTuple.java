package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author venus
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PeopleTuple {
    @JsonProperty
    private String userId;
    @JsonProperty
    private String userName;
    @JsonProperty
    private int amount;
    
}
