package api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author venus
 */
public class Saying {

    private String id;
    private String password;

    public Saying() {

    }

    public Saying(String id, String content) {
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
