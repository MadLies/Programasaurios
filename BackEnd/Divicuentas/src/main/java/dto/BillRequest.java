package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
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
public class BillRequest {
    @JsonProperty
    private String name;
    @JsonProperty
    private String date;
    @JsonProperty
    private int total;
    @JsonProperty
    private String divisa;
    @JsonProperty
    private List<PeopleTuple> people;
}
