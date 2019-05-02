/*
* Consumer Data Standards
* Sample Data Holder to Demonstrate the Consumer Data Right APIs
*
* NOTE: This class is auto generated by the cds-codegen package
* https://github.com/ConsumerDataStandardsAustralia/cds-codegen
* Do not edit the class manually.
*/
package au.org.consumerdatastandards.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
import java.net.URI;
import java.lang.reflect.Field;
import java.util.List;
import java.math.BigDecimal;

/**
* PaginatedResponse
*/
public class PaginatedResponse  {
            // The links attribute contains a Links object with links to
    // related API end points. This will include links to support
    // pagination.
        @SerializedName("links")
    private LinksPaginated links;
            // The meta object is used to provide additional information
    // such as second factor authorisation data, traffic
    // management, pagination counts or other purposes that are
    // complementary to the workings of the API.
        @SerializedName("meta")
    private MetaPaginated meta;

        
    @ApiModelProperty(value = "The links attribute contains a Links object with links to related API end points. This will include links to support pagination.", required = true)
    public LinksPaginated getLinks() {
        return links;
    }

    public void setLinks(LinksPaginated links) {
        this.links = links;
    }
    
    public PaginatedResponse links(LinksPaginated links) {
        this.links = links;
        return this;
    }
    
        
    @ApiModelProperty(value = "The meta object is used to provide additional information such as second factor authorisation data, traffic management, pagination counts or other purposes that are complementary to the workings of the API.", required = true)
    public MetaPaginated getMeta() {
        return meta;
    }

    public void setMeta(MetaPaginated meta) {
        this.meta = meta;
    }
    
    public PaginatedResponse meta(MetaPaginated meta) {
        this.meta = meta;
        return this;
    }
    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
                PaginatedResponse inputModel = (PaginatedResponse) o;
        if(! (links.equals(inputModel.getLinks()))) { return false; }
        if(! (meta.equals(inputModel.getMeta()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(meta,meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));        
                        sb.append("    links: ").append(toIndentedString(links)).append("\n");
                        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
                sb.append("}");
        return sb.toString();
    }
    
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
        return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
