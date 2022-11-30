package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author venus
 */
public class LoginDto {

    private String id;
    private String password;

    public LoginDto() {

    }

    public LoginDto(String id, String content) {
        this.id = id;
        this.password = content;

    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return password;
    }
    
}
