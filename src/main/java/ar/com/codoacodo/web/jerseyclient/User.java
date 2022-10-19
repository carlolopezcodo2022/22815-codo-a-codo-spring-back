
package ar.com.codoacodo.web.jerseyclient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data",
    "support"
})
public class User {

    @JsonProperty("data")
    public Data data;
    @JsonProperty("support")
    public Support support;
	
    @Override
	public String toString() {
		return "User [data=" + data + ", support=" + support + "]";
	}
    
}
