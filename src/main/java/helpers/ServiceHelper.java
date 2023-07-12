package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ServiceHelper {

    Configuration getPropertyValues = new Configuration();

    private final String KEY = getPropertyValues.getPropValue("credentials");
    private final String BASE_URI = getPropertyValues.getPropValue("api.base.uri");
    private final String BASE_PATH = getPropertyValues.getPropValue("api.base.path");


    private final SampleRest SAMPLE_REST = new SampleRest();

    public Response sendGetRequest(String endpoint){
        SAMPLE_REST.response = given()
                .header("Authorization", "Basic "+ KEY)
                .baseUri(BASE_URI)
                .basePath(BASE_PATH)
                .get(endpoint);

        return SAMPLE_REST.response;
    }

    class SampleRest {
        public Response response;
    }
}
