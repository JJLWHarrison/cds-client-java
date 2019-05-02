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
* ParamEffective
* 
* * Allows for the filtering of products based on whether the
* current time is within the period of time defined as
* effective by the effectiveFrom and effectiveTo fields.  If
* absent defaults to 'CURRENT'
* */
@JsonAdapter(ParamEffective.Adapter.class)
public enum ParamEffective {
        CURRENT("CURRENT"),        FUTURE("FUTURE"),        ALL("ALL");    
    private String value;
    
    ParamEffective(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public String getValue() {
        return value;
    }

    public static ParamEffective fromValue(String value) {
      for (ParamEffective b : ParamEffective.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
    
    public static class Adapter extends TypeAdapter<ParamEffective> {
        @Override
        public void write(final JsonWriter jsonWriter, final ParamEffective enumeration) throws IOException {
          jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public ParamEffective read(final JsonReader jsonReader) throws IOException {
          String value = jsonReader.nextString();
          return ParamEffective.fromValue(value);
        }
    }
}