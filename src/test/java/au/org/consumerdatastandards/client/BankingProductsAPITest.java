/*
* Consumer Data Standards
* Sample Data Holder to Demonstrate the Consumer Data Right APIs
*
* NOTE: This class is auto generated by the cds-codegen package
* https://github.com/ConsumerDataStandardsAustralia/cds-codegen
* Do not edit the class manually.
*/
package au.org.consumerdatastandards.client;

import org.threeten.bp.OffsetDateTime;

import au.org.consumerdatastandards.client.ApiException;
import au.org.consumerdatastandards.client.api.BankingProductsAPI;

import au.org.consumerdatastandards.client.model.*;

import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for BankingProductsAPI
 */
@Ignore
public class BankingProductsAPITest {

    private final BankingProductsAPI api = new BankingProductsAPI();

        /**
     * Get Products
     *      * Obtain a list of products that are currently openly offered
     * to the market\n\nNote that the results returned by this end
     * point are expected to be ordered according to
     * updated-since\n\n### Conventions\nIn the product reference
     * payloads there are a number of recurring conventions that
     * are explained here, in one place.\n\n#### Arrays Of
     * Features\n\nIn the product detail payload there are a number
     * of arrays articulating generic features, constraints,
     * prices, etc. The intent of these arrays is as follows:\n\n-
     * Each element in an array has the same structure so that
     * clients can reliably interpret the payloads\n- Each element
     * as a type element that is an enumeration of the specific
     * aspect of a product being described, such as types of
     * fees.\n- Each element has a field name additionalValue. This
     * is a generic field with contents that will vary based on the
     * type of object being described. The contents of this field
     * for the ADDITIONAL_CARDS feature is the number of cards
     * allowed while the contents of this field for the MAX_LIMIT
     * constraint would be the maximum credit limit allowed for the
     * product.\n- An element in these arrays of the same type may
     * appear more than once. For instance, a product may offer two
     * separate loyalty programs that the customer can select from.
     * A fixed term mortgage may have different rates for different
     * term lengths.\n- An element in these arrays may contain an
     * additionalInfo and additionalInfoUri field. The
     * additionalInfo field is used to provide displayable text
     * clarifying the purpose of the element in some way when the
     * product is presented to a customer. The additionalInfoUri
     * provides a link to externally hosted information
     * specifically relevant to that feature of the product.\n-
     * Depending on the type of data being represented there may be
     * additional specific fields.\n\n#### URIs To More
     * Information\n\nAs the complexities and nuances of a
     * financial product can not easily be fully expressed in a
     * data structure without a high degree of complexity it is
     * necessary to provide additional reference information that a
     * potential customer can access so that they are fully
     * informed of the features and implications of the product.
     * The payloads for product reference therefore contain
     * numerous fields that are provided to allow the product
     * provider to describe the product more fully using a web page
     * hosted on their on channels.\n\nThese URIs do not need to
     * all link to different pages. If desired, they can all link
     * to a single hosted page and use difference HTML anchors to
     * focus on a specific topic such as eligibility or
     * fees.\n\n#### Linkage To Accounts\nFrom the moment that a
     * customer applies for a product and an account is created the
     * account and the product that spawned it will diverge.  Rates
     * and features of the product may change and a discount may be
     * negotiated for the account.\n\nFor this reason, while
     * productCategory is a common field between accounts and
     * products, there is no specific ID that can be used to link
     * an account to a product within the regime.\n\nSimilarly,
     * many of the fields and objects in the product payload will
     * appear in the account detail payload but the structures and
     * semantics are not identical as one refers to a product that
     * can potentially be originated and one refers to an account
     * that actual has been instantiated and created along with the
     * associated decisions inherent in that process.\n\n####
     * Dates\nIt is expected that data consumers needing this data
     * will call relatively frequently to ensure the data they have
     * is representative of the current offering from a bank.  To
     * minimise the volume and frequency of these calls the ability
     * to set a lastUpdated field with the date and time of the
     * last update to this product is included.  A call for a list
     * of products can then be filtered to only return products
     * that have been updated since the last time that data was
     * obtained using the updated-since query parameter.\n\nIn
     * addition, the concept of effective date and time has also
     * been included.  This allows for a product to be marked for
     * obsolescence, or introduction, from a certain time without
     * the need for an update to show that a product has been
     * changed.  The inclusion of these dates also removes the need
     * to represent deleted products in the payload.  Products that
     * are no long offered can be marked not effective for a few
     * weeks before they are then removed from the product set as
     * an option entirely.
     *      *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductsTest() throws ApiException {
                ParamEffective effective = null;
            String brand = null;
            Integer pageSize = null;
            String updatedSince = null;
            Integer page = null;
            ParamProductCategory productCategory = null;
        
    ResponseBankingProductList response = api.listProducts(                            effective,                    brand,                    pageSize,                    updatedSince,                    page,                    productCategory            );
        response.toString();
        // TODO: test validations
    }

        /**
     * Get Product Detail
     *      * Obtain detailed information on a single product offered
     * openly to the market
     *      *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductDetailTest() throws ApiException {
            String productId = null;
            
    ResponseBankingProductById response = api.getProductDetail(            productId                            );
        response.toString();
        // TODO: test validations
    }


}
