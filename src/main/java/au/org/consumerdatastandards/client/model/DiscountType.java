/*
* Consumer Data Standards
* Sample Data Holder to Demonstrate the Consumer Data Right APIs
*
* NOTE: This class is auto generated by the cds-codegen package
* https://github.com/ConsumerDataStandardsAustralia/cds-codegen
* Do not edit the class manually.
*/
package au.org.consumerdatastandards.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
* DiscountType
* 
* * The type of discount. See the next section for an overview
* of valid values and their meaning
* */
@JsonAdapter(DiscountType.Adapter.class)
public enum DiscountType {
        BALANCE("BALANCE"),        DEPOSITS("DEPOSITS"),        PAYMENTS("PAYMENTS"),        FEE_CAP("FEE_CAP"),        ELIGIBILITY_ONLY("ELIGIBILITY_ONLY");    
    private String value;
    
    DiscountType(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public String getValue() {
        return value;
    }

    public static DiscountType fromValue(String value) {
      for (DiscountType b : DiscountType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
    
    public static class Adapter extends TypeAdapter<DiscountType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DiscountType enumeration) throws IOException {
          jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public DiscountType read(final JsonReader jsonReader) throws IOException {
          String value = jsonReader.nextString();
          return DiscountType.fromValue(value);
        }
    }
}
