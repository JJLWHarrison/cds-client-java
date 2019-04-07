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
import io.swagger.client.model.BankingEnumProductCategory;
import io.swagger.client.model.BankingProduct;
import io.swagger.client.model.BankingProductAdditionalInformation;
import io.swagger.client.model.BankingProductBundle;
import io.swagger.client.model.BankingProductConstraint;
import io.swagger.client.model.BankingProductDepositRate;
import io.swagger.client.model.BankingProductEligibility;
import io.swagger.client.model.BankingProductFeature;
import io.swagger.client.model.BankingProductFee;
import io.swagger.client.model.BankingProductLendingRate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * BankingProductDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-04-07T13:49:51.196+10:00")
public class BankingProductDetail {
  @SerializedName("additionalInformation")
  private BankingProductAdditionalInformation additionalInformation = null;

  @SerializedName("applicationUri")
  private String applicationUri = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("brandName")
  private String brandName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("effectiveFrom")
  private OffsetDateTime effectiveFrom = null;

  @SerializedName("effectiveTo")
  private OffsetDateTime effectiveTo = null;

  @SerializedName("isTailored")
  private Boolean isTailored = null;

  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("productCategory")
  private BankingEnumProductCategory productCategory = null;

  @SerializedName("productId")
  private String productId = null;

  @SerializedName("bundles")
  private List<BankingProductBundle> bundles = null;

  @SerializedName("constraints")
  private List<BankingProductConstraint> constraints = null;

  @SerializedName("depositRates")
  private List<BankingProductDepositRate> depositRates = null;

  @SerializedName("eligibility")
  private List<BankingProductEligibility> eligibility = null;

  @SerializedName("features")
  private List<BankingProductFeature> features = null;

  @SerializedName("fees")
  private List<BankingProductFee> fees = null;

  @SerializedName("lendingRates")
  private List<BankingProductLendingRate> lendingRates = null;

  public BankingProductDetail additionalInformation(BankingProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "")
  public BankingProductAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(BankingProductAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public BankingProductDetail applicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
    return this;
  }

   /**
   * A link to the an application web page where this product can be applied for.
   * @return applicationUri
  **/
  @ApiModelProperty(value = "A link to the an application web page where this product can be applied for.")
  public String getApplicationUri() {
    return applicationUri;
  }

  public void setApplicationUri(String applicationUri) {
    this.applicationUri = applicationUri;
  }

  public BankingProductDetail brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public BankingProductDetail brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

   /**
   * An optional display name of the brand
   * @return brandName
  **/
  @ApiModelProperty(value = "An optional display name of the brand")
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public BankingProductDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the product
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description of the product")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingProductDetail effectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
    return this;
  }

   /**
   * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
   * @return effectiveFrom
  **/
  @ApiModelProperty(value = "The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate")
  public OffsetDateTime getEffectiveFrom() {
    return effectiveFrom;
  }

  public void setEffectiveFrom(OffsetDateTime effectiveFrom) {
    this.effectiveFrom = effectiveFrom;
  }

  public BankingProductDetail effectiveTo(OffsetDateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
    return this;
  }

   /**
   * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
   * @return effectiveTo
  **/
  @ApiModelProperty(value = "The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products")
  public OffsetDateTime getEffectiveTo() {
    return effectiveTo;
  }

  public void setEffectiveTo(OffsetDateTime effectiveTo) {
    this.effectiveTo = effectiveTo;
  }

  public BankingProductDetail isTailored(Boolean isTailored) {
    this.isTailored = isTailored;
    return this;
  }

   /**
   * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
   * @return isTailored
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable")
  public Boolean isIsTailored() {
    return isTailored;
  }

  public void setIsTailored(Boolean isTailored) {
    this.isTailored = isTailored;
  }

  public BankingProductDetail lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public BankingProductDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the product
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The display name of the product")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductDetail productCategory(BankingEnumProductCategory productCategory) {
    this.productCategory = productCategory;
    return this;
  }

   /**
   * Get productCategory
   * @return productCategory
  **/
  @ApiModelProperty(required = true, value = "")
  public BankingEnumProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(BankingEnumProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  public BankingProductDetail productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public BankingProductDetail bundles(List<BankingProductBundle> bundles) {
    this.bundles = bundles;
    return this;
  }

  public BankingProductDetail addBundlesItem(BankingProductBundle bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<BankingProductBundle>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

   /**
   * Get bundles
   * @return bundles
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductBundle> getBundles() {
    return bundles;
  }

  public void setBundles(List<BankingProductBundle> bundles) {
    this.bundles = bundles;
  }

  public BankingProductDetail constraints(List<BankingProductConstraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public BankingProductDetail addConstraintsItem(BankingProductConstraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<BankingProductConstraint>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductConstraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<BankingProductConstraint> constraints) {
    this.constraints = constraints;
  }

  public BankingProductDetail depositRates(List<BankingProductDepositRate> depositRates) {
    this.depositRates = depositRates;
    return this;
  }

  public BankingProductDetail addDepositRatesItem(BankingProductDepositRate depositRatesItem) {
    if (this.depositRates == null) {
      this.depositRates = new ArrayList<BankingProductDepositRate>();
    }
    this.depositRates.add(depositRatesItem);
    return this;
  }

   /**
   * Get depositRates
   * @return depositRates
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductDepositRate> getDepositRates() {
    return depositRates;
  }

  public void setDepositRates(List<BankingProductDepositRate> depositRates) {
    this.depositRates = depositRates;
  }

  public BankingProductDetail eligibility(List<BankingProductEligibility> eligibility) {
    this.eligibility = eligibility;
    return this;
  }

  public BankingProductDetail addEligibilityItem(BankingProductEligibility eligibilityItem) {
    if (this.eligibility == null) {
      this.eligibility = new ArrayList<BankingProductEligibility>();
    }
    this.eligibility.add(eligibilityItem);
    return this;
  }

   /**
   * Get eligibility
   * @return eligibility
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductEligibility> getEligibility() {
    return eligibility;
  }

  public void setEligibility(List<BankingProductEligibility> eligibility) {
    this.eligibility = eligibility;
  }

  public BankingProductDetail features(List<BankingProductFeature> features) {
    this.features = features;
    return this;
  }

  public BankingProductDetail addFeaturesItem(BankingProductFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<BankingProductFeature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<BankingProductFeature> features) {
    this.features = features;
  }

  public BankingProductDetail fees(List<BankingProductFee> fees) {
    this.fees = fees;
    return this;
  }

  public BankingProductDetail addFeesItem(BankingProductFee feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<BankingProductFee>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductFee> getFees() {
    return fees;
  }

  public void setFees(List<BankingProductFee> fees) {
    this.fees = fees;
  }

  public BankingProductDetail lendingRates(List<BankingProductLendingRate> lendingRates) {
    this.lendingRates = lendingRates;
    return this;
  }

  public BankingProductDetail addLendingRatesItem(BankingProductLendingRate lendingRatesItem) {
    if (this.lendingRates == null) {
      this.lendingRates = new ArrayList<BankingProductLendingRate>();
    }
    this.lendingRates.add(lendingRatesItem);
    return this;
  }

   /**
   * Get lendingRates
   * @return lendingRates
  **/
  @ApiModelProperty(value = "")
  public List<BankingProductLendingRate> getLendingRates() {
    return lendingRates;
  }

  public void setLendingRates(List<BankingProductLendingRate> lendingRates) {
    this.lendingRates = lendingRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductDetail bankingProductDetail = (BankingProductDetail) o;
    return Objects.equals(this.additionalInformation, bankingProductDetail.additionalInformation) &&
        Objects.equals(this.applicationUri, bankingProductDetail.applicationUri) &&
        Objects.equals(this.brand, bankingProductDetail.brand) &&
        Objects.equals(this.brandName, bankingProductDetail.brandName) &&
        Objects.equals(this.description, bankingProductDetail.description) &&
        Objects.equals(this.effectiveFrom, bankingProductDetail.effectiveFrom) &&
        Objects.equals(this.effectiveTo, bankingProductDetail.effectiveTo) &&
        Objects.equals(this.isTailored, bankingProductDetail.isTailored) &&
        Objects.equals(this.lastUpdated, bankingProductDetail.lastUpdated) &&
        Objects.equals(this.name, bankingProductDetail.name) &&
        Objects.equals(this.productCategory, bankingProductDetail.productCategory) &&
        Objects.equals(this.productId, bankingProductDetail.productId) &&
        Objects.equals(this.bundles, bankingProductDetail.bundles) &&
        Objects.equals(this.constraints, bankingProductDetail.constraints) &&
        Objects.equals(this.depositRates, bankingProductDetail.depositRates) &&
        Objects.equals(this.eligibility, bankingProductDetail.eligibility) &&
        Objects.equals(this.features, bankingProductDetail.features) &&
        Objects.equals(this.fees, bankingProductDetail.fees) &&
        Objects.equals(this.lendingRates, bankingProductDetail.lendingRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, applicationUri, brand, brandName, description, effectiveFrom, effectiveTo, isTailored, lastUpdated, name, productCategory, productId, bundles, constraints, depositRates, eligibility, features, fees, lendingRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductDetail {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    applicationUri: ").append(toIndentedString(applicationUri)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveFrom: ").append(toIndentedString(effectiveFrom)).append("\n");
    sb.append("    effectiveTo: ").append(toIndentedString(effectiveTo)).append("\n");
    sb.append("    isTailored: ").append(toIndentedString(isTailored)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    depositRates: ").append(toIndentedString(depositRates)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    lendingRates: ").append(toIndentedString(lendingRates)).append("\n");
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
