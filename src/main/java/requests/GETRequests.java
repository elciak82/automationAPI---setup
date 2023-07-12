package requests;

import enums.Endpoints;
import enums.Params;
import helpers.ServiceHelper;
import io.restassured.response.Response;

public class GETRequests {

    private final ServiceHelper serviceHelper = new ServiceHelper();

    public Response getProductById (int productId) {

        Response response = serviceHelper.sendGetRequest(Endpoints.GET_PRODUCT.getEndpoint() + productId + Params.OUTPUT_FORMAT_JSON.getParam());

        response.getBody().prettyPrint();

        return response;
    }


}
