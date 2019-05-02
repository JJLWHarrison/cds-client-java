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
* ConstraintType
* 
* * The type of constraint described.  See the next section for
* an overview of valid values and their meaning
* */
@JsonAdapter(ConstraintType.Adapter.class)
public enum ConstraintType {
        MIN_BALANCE("MIN_BALANCE"),        MAX_BALANCE("MAX_BALANCE"),        OPENING_BALANCE("OPENING_BALANCE"),        MAX_LIMIT("MAX_LIMIT"),        MIN_LIMIT("MIN_LIMIT");    
    private String value;
    
    ConstraintType(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public String getValue() {
        return value;
    }

    public static ConstraintType fromValue(String value) {
      for (ConstraintType b : ConstraintType.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
    
    public static class Adapter extends TypeAdapter<ConstraintType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ConstraintType enumeration) throws IOException {
          jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public ConstraintType read(final JsonReader jsonReader) throws IOException {
          String value = jsonReader.nextString();
          return ConstraintType.fromValue(value);
        }
    }
}