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
public class ExpenseDto {
    @JsonProperty
    private int expenses;
    
}
