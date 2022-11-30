package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 *
 * @author venus
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreationRequest {
    @JsonProperty
    private String number;
    @JsonProperty
    private String name;
    @JsonProperty
    private String nickname;
    @JsonProperty
    private String country;
    @JsonProperty
    private String email;
    @JsonProperty
    private String password;


    
    
    
}
