package helpers;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public abstract class BaseEndpoint  {

    Configuration getPropertyValues = new Configuration();

    private final String KEY = getPropertyValues.getPropValue("credentials");
    private final String BASE_URL = getPropertyValues.getPropValue("api.base.url");
    private final String BASE_PATH = getPropertyValues.getPropValue("api.base.path");

    private static final String AUTHORIZATION = "Authorization";
    private static final String BASIC = "Basic %s";

    public Response sendGetRequest(String endpoint){
        return given()
                .header(AUTHORIZATION, String.format(BASIC, KEY))
                .baseUri(BASE_URL)
                .basePath(BASE_PATH)
                .get(endpoint);
    }

}
