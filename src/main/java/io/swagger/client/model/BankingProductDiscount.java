/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BankingProductDiscountEligibility;
import io.swagger.client.model.DiscountType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BankingProductDiscount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-10T21:28:35.196+10:00")
public class BankingProductDiscount {
  @SerializedName("accruedRate")
  private String accruedRate = null;

  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  @SerializedName("additionalInfoUri")
  private String additionalInfoUri = null;

  @SerializedName("additionalValue")
  private String additionalValue = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("balanceRate")
  private String balanceRate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("discountType")
  private DiscountType discountType = null;

  @SerializedName("eligibility")
  private List<BankingProductDiscountEligibility> eligibility = null;

  @SerializedName("feeRate")
  private String feeRate = null;

  @SerializedName("transactionRate")
  private String transactionRate = null;

  public BankingProductDiscount accruedRate(String accruedRate) {
    this.accruedRate = accruedRate;
    return this;
  }

   /**
   * A discount rate calculated based on a proportion of the calculated interest accrued on the account. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
   * @return accruedRate
  **/
  @ApiModelProperty(value = "A discount rate calculated based on a proportion of the calculated interest accrued on the account. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee")
  public String getAccruedRate() {
    return accruedRate;
  }

  public void setAccruedRate(String accruedRate) {
    this.accruedRate = accruedRate;
  }

  public BankingProductDiscount additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Display text providing more information on the discount
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Display text providing more information on the discount")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductDiscount additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

   /**
   * Link to a web page with more information on this discount
   * @return additionalInfoUri
  **/
  @ApiModelProperty(value = "Link to a web page with more information on this discount")
  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductDiscount additionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
    return this;
  }

   /**
   * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
   * @return additionalValue
  **/
  @ApiModelProperty(value = "Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType")
  public String getAdditionalValue() {
    return additionalValue;
  }

  public void setAdditionalValue(String additionalValue) {
    this.additionalValue = additionalValue;
  }

  public BankingProductDiscount amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Value of the discount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Value of the discount")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BankingProductDiscount balanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
    return this;
  }

   /**
   * A discount rate calculated based on a proportion of the balance. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
   * @return balanceRate
  **/
  @ApiModelProperty(value = "A discount rate calculated based on a proportion of the balance. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee")
  public String getBalanceRate() {
    return balanceRate;
  }

  public void setBalanceRate(String balanceRate) {
    this.balanceRate = balanceRate;
  }

  public BankingProductDiscount description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the discount
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the discount")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingProductDiscount discountType(DiscountType discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Get discountType
   * @return discountType
  **/
  @ApiModelProperty(required = true, value = "")
  public DiscountType getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountType discountType) {
    this.discountType = discountType;
  }

  public BankingProductDiscount eligibility(List<BankingProductDiscountEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  public BankingProductDiscount addEligibilityItem(BankingProductDiscountEligibility eligibilityItem) {
    if (this.eligibility == null) {
      this.eligibility = new ArrayList<BankingProductDiscountEligibility>();
    }
    this.eligibility.add(eligibilityItem);
    return this;
  }

   /**
   * Eligibility constraints that apply to this discount
   * @return eligibility
  **/
  @ApiModelProperty(value = "Eligibility constraints that apply to this discount")
  public List<BankingProductDiscountEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<BankingProductDiscountEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public BankingProductDiscount feeRate(String feeRate) {
    this.feeRate = feeRate;
    return this;
  }

   /**
   * A discount rate calculated based on a proportion of the fee to which this discount is attached. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee
   * @return feeRate
  **/
  @ApiModelProperty(value = "A discount rate calculated based on a proportion of the fee to which this discount is attached. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory. Unless noted in additionalInfo, assumes the application and calculation frequency are the same as the corresponding fee")
  public String getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(String feeRate) {
    this.feeRate = feeRate;
  }

  public BankingProductDiscount transactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
    return this;
  }

   /**
   * A discount rate calculated based on a proportion of a transaction. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory
   * @return transactionRate
  **/
  @ApiModelProperty(value = "A discount rate calculated based on a proportion of a transaction. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself. One of amount, balanceRate, transactionRate, accruedRate and feeRate is mandatory")
  public String getTransactionRate() {
    return transactionRate;
  }

  public void setTransactionRate(String transactionRate) {
    this.transactionRate = transactionRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductDiscount bankingProductDiscount = (BankingProductDiscount) o;
    return Objects.equals(this.accruedRate, bankingProductDiscount.accruedRate) &&
        Objects.equals(this.additionalInfo, bankingProductDiscount.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, bankingProductDiscount.additionalInfoUri) &&
        Objects.equals(this.additionalValue, bankingProductDiscount.additionalValue) &&
        Objects.equals(this.amount, bankingProductDiscount.amount) &&
        Objects.equals(this.balanceRate, bankingProductDiscount.balanceRate) &&
        Objects.equals(this.description, bankingProductDiscount.description) &&
        Objects.equals(this.discountType, bankingProductDiscount.discountType) &&
        Objects.equals(this.eligibility, bankingProductDiscount.eligibility) &&
        Objects.equals(this.feeRate, bankingProductDiscount.feeRate) &&
        Objects.equals(this.transactionRate, bankingProductDiscount.transactionRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accruedRate, additionalInfo, additionalInfoUri, additionalValue, amount, balanceRate, description, discountType, eligibility, feeRate, transactionRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductDiscount {\n");
    
    sb.append("    accruedRate: ").append(toIndentedString(accruedRate)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    additionalValue: ").append(toIndentedString(additionalValue)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceRate: ").append(toIndentedString(balanceRate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

