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
* FeeType
* 
* * The type of fee
* */
@JsonAdapter(FeeType.Adapter.class)
public enum FeeType {
        PERIODIC("PERIODIC"),        TRANSACTION("TRANSACTION"),        WITHDRAWAL("WITHDRAWAL"),        DEPOSIT("DEPOSIT"),        PAYMENT("PAYMENT"),        PURCHASE("PURCHASE"),        EVENT("EVENT"),        UPFRONT("UPFRONT"),        EXIT("EXIT");    
    private String value;
    
    FeeType(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public String getValue() {
        return value;
    }

    public static FeeType fromValue(String value) {
      for (FeeType b : FeeType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
    
    public static class Adapter extends TypeAdapter<FeeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final FeeType enumeration) throws IOException {
          jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public FeeType read(final JsonReader jsonReader) throws IOException {
          String value = jsonReader.nextString();
          return FeeType.fromValue(value);
        }
    }
}
