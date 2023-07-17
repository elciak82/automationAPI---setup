package requests;

import enums.Endpoints;
import enums.Params;
import helpers.BaseEndpoint;
import io.restassured.response.Response;

public class ProductsEndpoint extends BaseEndpoint {


    public Response getProductById (int productId) {

        Response response = sendGetRequest(Endpoints.GET_PRODUCT.getEndpoint() + productId + Params.OUTPUT_FORMAT_JSON.getParam());

        response.getBody().prettyPrint();

        return response;
    }


}
