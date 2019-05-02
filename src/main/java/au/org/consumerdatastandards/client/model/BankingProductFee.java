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
* BankingProductFee
*/
public class BankingProductFee  {
            // Name of the fee
        @SerializedName("name")
    private String name;
            // The type of fee
        @SerializedName("feeType")
    private FeeType feeType;
            // The amount charged for the fee. One of amount, balanceRate,
    // transactionRate and accruedRate is mandatory
        @SerializedName("amount")
    private String amount;
            // A fee rate calculated based on a proportion of the balance.
    // One of amount, balanceRate, transactionRate and accruedRate
    // is mandatory
        @SerializedName("balanceRate")
    private String balanceRate;
            // A fee rate calculated based on a proportion of a
    // transaction. One of amount, balanceRate, transactionRate and
    // accruedRate is mandatory
        @SerializedName("transactionRate")
    private String transactionRate;
            // A fee rate calculated based on a proportion of the
    // calculated interest accrued on the account. One of amount,
    // balanceRate, transactionRate and accruedRate is mandatory
        @SerializedName("accruedRate")
    private String accruedRate;
            // The indicative frequency with which the fee is calculated on
    // the account. Only applies if balanceRate or accruedRate is
    // also present. Formatted according to [ISO 8601
    // Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)
        @SerializedName("accrualFrequency")
    private String accrualFrequency;
            // The currency the fee will be charged in. Assumes AUD if
    // absent
        @SerializedName("currency")
    private String currency;
            // Generic field containing additional information relevant to
    // the feeType specified. Whether mandatory or not is dependent
    // on the value of feeType
        @SerializedName("additionalValue")
    private String additionalValue;
            // Display text providing more information on the fee
        @SerializedName("additionalInfo")
    private String additionalInfo;
            // Link to a web page with more information on this fee
        @SerializedName("additionalInfoUri")
    private URI additionalInfoUri;
            // An optional list of discounts to this fee that may be
    // available
        @SerializedName("discounts")
    private List<BankingProductDiscount> discounts;

        
    @ApiModelProperty(value = "Name of the fee", required = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public BankingProductFee name(String name) {
        this.name = name;
        return this;
    }
    
        
    @ApiModelProperty(value = "The type of fee", required = true)
    public FeeType getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeType feeType) {
        this.feeType = feeType;
    }
    
    public BankingProductFee feeType(FeeType feeType) {
        this.feeType = feeType;
        return this;
    }
    
        
    @ApiModelProperty(value = "The amount charged for the fee. One of amount, balanceRate, transactionRate and accruedRate is mandatory", required = true)
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    public BankingProductFee amount(String amount) {
        this.amount = amount;
        return this;
    }
    
        
    @ApiModelProperty(value = "A fee rate calculated based on a proportion of the balance. One of amount, balanceRate, transactionRate and accruedRate is mandatory", required = false)
    public String getBalanceRate() {
        return balanceRate;
    }

    public void setBalanceRate(String balanceRate) {
        this.balanceRate = balanceRate;
    }
    
    public BankingProductFee balanceRate(String balanceRate) {
        this.balanceRate = balanceRate;
        return this;
    }
    
        
    @ApiModelProperty(value = "A fee rate calculated based on a proportion of a transaction. One of amount, balanceRate, transactionRate and accruedRate is mandatory", required = false)
    public String getTransactionRate() {
        return transactionRate;
    }

    public void setTransactionRate(String transactionRate) {
        this.transactionRate = transactionRate;
    }
    
    public BankingProductFee transactionRate(String transactionRate) {
        this.transactionRate = transactionRate;
        return this;
    }
    
        
    @ApiModelProperty(value = "A fee rate calculated based on a proportion of the calculated interest accrued on the account. One of amount, balanceRate, transactionRate and accruedRate is mandatory", required = false)
    public String getAccruedRate() {
        return accruedRate;
    }

    public void setAccruedRate(String accruedRate) {
        this.accruedRate = accruedRate;
    }
    
    public BankingProductFee accruedRate(String accruedRate) {
        this.accruedRate = accruedRate;
        return this;
    }
    
        
    @ApiModelProperty(value = "The indicative frequency with which the fee is calculated on the account. Only applies if balanceRate or accruedRate is also present. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations)", required = false)
    public String getAccrualFrequency() {
        return accrualFrequency;
    }

    public void setAccrualFrequency(String accrualFrequency) {
        this.accrualFrequency = accrualFrequency;
    }
    
    public BankingProductFee accrualFrequency(String accrualFrequency) {
        this.accrualFrequency = accrualFrequency;
        return this;
    }
    
        
    @ApiModelProperty(value = "The currency the fee will be charged in. Assumes AUD if absent", required = false)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    public BankingProductFee currency(String currency) {
        this.currency = currency;
        return this;
    }
    
        
    @ApiModelProperty(value = "Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType", required = false)
    public String getAdditionalValue() {
        return additionalValue;
    }

    public void setAdditionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
    }
    
    public BankingProductFee additionalValue(String additionalValue) {
        this.additionalValue = additionalValue;
        return this;
    }
    
        
    @ApiModelProperty(value = "Display text providing more information on the fee", required = false)
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    public BankingProductFee additionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
        
    @ApiModelProperty(value = "Link to a web page with more information on this fee", required = false)
    public URI getAdditionalInfoUri() {
        return additionalInfoUri;
    }

    public void setAdditionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
    }
    
    public BankingProductFee additionalInfoUri(URI additionalInfoUri) {
        this.additionalInfoUri = additionalInfoUri;
        return this;
    }
    
        
    @ApiModelProperty(value = "An optional list of discounts to this fee that may be available", required = false)
    public List<BankingProductDiscount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<BankingProductDiscount> discounts) {
        this.discounts = discounts;
    }
    
    public BankingProductFee discounts(List<BankingProductDiscount> discounts) {
        this.discounts = discounts;
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
        
                BankingProductFee inputModel = (BankingProductFee) o;
        if(! (name.equals(inputModel.getName()))) { return false; }
        if(! (feeType.equals(inputModel.getFeeType()))) { return false; }
        if(! (amount.equals(inputModel.getAmount()))) { return false; }
        if(! (balanceRate.equals(inputModel.getBalanceRate()))) { return false; }
        if(! (transactionRate.equals(inputModel.getTransactionRate()))) { return false; }
        if(! (accruedRate.equals(inputModel.getAccruedRate()))) { return false; }
        if(! (accrualFrequency.equals(inputModel.getAccrualFrequency()))) { return false; }
        if(! (currency.equals(inputModel.getCurrency()))) { return false; }
        if(! (additionalValue.equals(inputModel.getAdditionalValue()))) { return false; }
        if(! (additionalInfo.equals(inputModel.getAdditionalInfo()))) { return false; }
        if(! (additionalInfoUri.equals(inputModel.getAdditionalInfoUri()))) { return false; }
        if(! (discounts.equals(inputModel.getDiscounts()))) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
      return Objects.hash(discounts,discounts,discounts,discounts,discounts,discounts,discounts,discounts,discounts,discounts,discounts,discounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("class %s {\n", getClass()));        
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
                        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
                        sb.append("    balanceRate: ").append(toIndentedString(balanceRate)).append("\n");
                        sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
                        sb.append("    accruedRate: ").append(toIndentedString(accruedRate)).append("\n");
                        sb.append("    accrualFrequency: ").append(toIndentedString(accrualFrequency)).append("\n");
                        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
                        sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
                        sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
                        sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
                        sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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