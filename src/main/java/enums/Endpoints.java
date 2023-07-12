package enums;

public enum Endpoints {

    GET_PRODUCT("/products/"),
    GET_PRODUCTS("/products");

    private final String endpoint;


    Endpoints(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
