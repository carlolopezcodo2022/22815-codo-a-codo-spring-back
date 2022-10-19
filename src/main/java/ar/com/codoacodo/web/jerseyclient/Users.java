
package ar.com.codoacodo.web.jerseyclient;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "per_page",
    "total",
    "total_pages",
    "data",
    "support"
})
@Generated("jsonschema2pojo")
public class Users {

    @JsonProperty("page")
    public Integer page;
    @JsonProperty("per_page")
    public Integer perPage;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("total_pages")
    public Integer totalPages;
    @JsonProperty("data")
    public List<Data> data = null;
    @JsonProperty("support")
    public Support support;
	@Override
	public String toString() {
		return "Users [page=" + page + ", perPage=" + perPage + ", total=" + total + ", totalPages=" + totalPages
				+ ", data=" + data + ", support=" + support + "]";
	}

}
