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
* Links
*/
public class Links  {
            // Fully qualified link to this API call
        @SerializedName("self")
    private URI self;

        
    @ApiModelProperty(value = "Fully qualified link to this API call", required = true)
    public URI getSelf() {
        return self;
    }

    public void setSelf(URI self) {
        this.self = self;
    }
    
    public Links self(URI self) {
        this.self = self;
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
        
                Links inputModel = (Links) o;
        if(! (self.equals(inputModel.getSelf()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));        
                        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
