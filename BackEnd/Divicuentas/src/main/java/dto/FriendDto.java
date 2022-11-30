package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Value;

/**
 *
 * @author venus
 */
@Value
public class FriendDto {
    @JsonProperty
    private List<FriendTuple> friends;
}
