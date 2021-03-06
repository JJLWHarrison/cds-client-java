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
* BankingProductDepositRate
*/
public class BankingProductDepositRate  {
            // The type of rate (base, bonus, etc). See the next section
    // for an overview of valid values and their meaning
        @SerializedName("depositRateType")
    private DepositRateType depositRateType;
            // The rate to be applied
        @SerializedName("rate")
    private String rate;
            // The period after which the rate is applied to the balance to
    // calculate the amount due for the period. Calculation of the
    // amount is often daily (as balances may change) but
    // accumulated until the total amount is 'applied' to the
    // account (see applicationFrequency). Formatted according to
    // [ISO 8601
    // Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
        @SerializedName("calculationFrequency")
    private String calculationFrequency;
            // The period after which the calculated amount(s) (see
    // calculationFrequency) are 'applied' (i.e. debited or
    // credited) to the account. Formatted according to [ISO 8601
    // Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
        @SerializedName("applicationFrequency")
    private String applicationFrequency;
            // Rate tiers applicable for this rate
        @SerializedName("tiers")
    private List<BankingProductRateTier> tiers;
            // Generic field containing additional information relevant to
    // the depositRateType specified. Whether mandatory or not is
    // dependent on the value of depositRateType
        @SerializedName("additionalValue")
    private String additionalValue;
            // Display text providing more information on the rate
        @SerializedName("additionalInfo")
    private String additionalInfo;
            // Link to a web page with more information on this rate
        @SerializedName("additionalInfoUri")
    private URI additionalInfoUri;

        
    @ApiModelProperty(value = "The type of rate (base, bonus, etc). See the next section for an overview of valid values and their meaning", required = true)
    public DepositRateType getDepositRateType() {
        return depositRateType;
    }

    public void setDepositRateType(DepositRateType depositRateType) {
        this.depositRateType = depositRateType;
    }
    
    public BankingProductDepositRate depositRateType(DepositRateType depositRateType) {
        this.depositRateType = depositRateType;
        return this;
    }
    
        
    @ApiModelProperty(value = "The rate to be applied", required = true)
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    
    public BankingProductDepositRate rate(String rate) {
        this.rate = rate;
        return this;
    }
    
        
    @ApiModelProperty(value = "The period after which the rate is applied to the balance to calculate the amount due for the period. Calculation of the amount is often daily (as balances may change) but accumulated until the total amount is 'applied' to the account (see applicationFrequency). Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)", required = false)
    public String getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }
    
    public BankingProductDepositRate calculationFrequency(String calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }
    
        
    @ApiModelProperty(value = "The period after which the calculated amount(s) (see calculationFrequency) are 'applied' (i.e. debited or credited) to the account. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)", required = false)
    public String getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(String applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }
    
    public BankingProductDepositRate applicationFrequency(String applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }
    
        
    @ApiModelProperty(value = "Rate tiers applicable for this rate", required = false)
    public List<BankingProductRateTier> getTiers() {
        return tiers;
    }

    public void setTiers(List<BankingProductRateTier> tiers) {
        this.tiers = tiers;
    }
    
    public BankingProductDepositRate tiers(List<BankingProductRateTier> tiers) {
        this.tiers = tiers;
        return this;
    }
    
        
    @ApiModelProperty(value = "Generic field containing additional information relevant to the depositRateType specified. Whether mandatory or not is dependent on the value of depositRateType", required = false)
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }
    
    public BankingProductDepositRate additionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
        return this;
    }
    
        
    @ApiModelProperty(value = "Display text providing more information on the rate", required = false)
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    public BankingProductDepositRate additionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
        
    @ApiModelProperty(value = "Link to a web page with more information on this rate", required = false)
    public URI getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }
    
    public BankingProductDepositRate additionalInfoUri(URI additionalInfoUri) {
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
        
                BankingProductDepositRate inputModel = (BankingProductDepositRate) o;
        if(! (depositRateType.equals(inputModel.getDepositRateType()))) { return false; }
        if(! (rate.equals(inputModel.getRate()))) { return false; }
        if(! (calculationFrequency.equals(inputModel.getCalculationFrequency()))) { return false; }
        if(! (applicationFrequency.equals(inputModel.getApplicationFrequency()))) { return false; }
        if(! (tiers.equals(inputModel.getTiers()))) { return false; }
        if(! (additionalValue.equals(inputModel.getAdditionalValue()))) { return false; }
        if(! (additionalInfo.equals(inputModel.getAdditionalInfo()))) { return false; }
        if(! (additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri,additionalInfoUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));        
                        sb.append("    depositRateType: ").append(toIndentedString(depositRateType)).append("\n");
                        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
                        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
                        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
                        sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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
