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
* BankingProductEligibility
*/
public class BankingProductEligibility  {
            // The type of eligibility criteria described.  See the next
    // section for an overview of valid values and their meaning
        @SerializedName("eligibilityType")
    private EligibilityType eligibilityType;
            // Generic field containing additional information relevant to
    // the eligibilityType specified.  Whether mandatory or not is
    // dependent on the value of eligibilityType
        @SerializedName("additionalValue")
    private String additionalValue;
            // Display text providing more information on the eligibility
    // criteria. Mandatory if the eligibilityType field is set to
    // OTHER
        @SerializedName("additionalInfo")
    private String additionalInfo;
            // Link to a web page with more information on this eligibility
    // criteria
        @SerializedName("additionalInfoUri")
    private URI additionalInfoUri;

        
    @ApiModelProperty(value = "The type of eligibility criteria described.  See the next section for an overview of valid values and their meaning", required = true)
    public EligibilityType getEligibilityType() {
        return eligibilityType;
    }

    public void setEligibilityType(EligibilityType eligibilityType) {
        this.eligibilityType = eligibilityType;
    }
    
    public BankingProductEligibility eligibilityType(EligibilityType eligibilityType) {
        this.eligibilityType = eligibilityType;
        return this;
    }
    
        
    @ApiModelProperty(value = "Generic field containing additional information relevant to the eligibilityType specified.  Whether mandatory or not is dependent on the value of eligibilityType", required = false)
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }
    
    public BankingProductEligibility additionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
        return this;
    }
    
        
    @ApiModelProperty(value = "Display text providing more information on the eligibility criteria. Mandatory if the eligibilityType field is set to OTHER", required = false)
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    public BankingProductEligibility additionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
        
    @ApiModelProperty(value = "Link to a web page with more information on this eligibility criteria", required = false)
    public URI getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }
    
    public BankingProductEligibility additionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
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
        
                BankingProductEligibility inputModel = (BankingProductEligibility) o;
        if(! (eligibilityType.equals(inputModel.getEligibilityType()))) { return false; }
        if(! (additionalValue.equals(inputModel.getAdditionalValue()))) { return false; }
        if(! (additionalInfo.equals(inputModel.getAdditionalInfo()))) { return false; }
        if(! (additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));        
                        sb.append("    eligibilityType: ").append(toIndentedString(eligibilityType)).append("\n");
                        sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
                        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
                        sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
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