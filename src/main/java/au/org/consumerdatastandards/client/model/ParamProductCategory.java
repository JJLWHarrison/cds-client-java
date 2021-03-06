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
* ParamProductCategory
* 
* * Used to filter results on the productCategory field
* applicable to accounts. Any one of the valid values for this
* field can be supplied. If absent then all accounts returned.
* */
@JsonAdapter(ParamProductCategory.Adapter.class)
public enum ParamProductCategory {
        TRANS_AND_SAVINGS_ACCOUNTS("TRANS_AND_SAVINGS_ACCOUNTS"),        TERM_DEPOSITS("TERM_DEPOSITS"),        TRAVEL_CARDS("TRAVEL_CARDS"),        REGULATED_TRUST_ACCOUNTS("REGULATED_TRUST_ACCOUNTS"),        RESIDENTIAL_MORTGAGES("RESIDENTIAL_MORTGAGES"),        CRED_AND_CHRG_CARDS("CRED_AND_CHRG_CARDS"),        PERS_LOANS("PERS_LOANS"),        MARGIN_LOANS("MARGIN_LOANS"),        LEASES("LEASES"),        TRADE_FINANCE("TRADE_FINANCE");    
    private String value;
    
    ParamProductCategory(String value) {
      this.value = value;
    }
    
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public String getValue() {
        return value;
    }

    public static ParamProductCategory fromValue(String value) {
      for (ParamProductCategory b : ParamProductCategory.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
    
    public static class Adapter extends TypeAdapter<ParamProductCategory> {
        @Override
        public void write(final JsonWriter jsonWriter, final ParamProductCategory enumeration) throws IOException {
          jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public ParamProductCategory read(final JsonReader jsonReader) throws IOException {
          String value = jsonReader.nextString();
          return ParamProductCategory.fromValue(value);
        }
    }
}
