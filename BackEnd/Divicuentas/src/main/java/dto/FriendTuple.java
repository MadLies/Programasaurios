
package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author venus
 */
@Getter
@AllArgsConstructor
public class FriendTuple {
    @JsonProperty
    private final String userId;
    @JsonProperty
    private final String userName;
    @JsonProperty
    private final boolean favourite;
    
}
