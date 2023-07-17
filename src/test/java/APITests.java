import org.testng.annotations.Test;
import requests.ProductsEndpoint;

public class APITests {

    private final ProductsEndpoint getRequests = new ProductsEndpoint();

    @Test
    public void APITestGET(){

        int productId = 1;
        getRequests.getProductById(productId);

    }
}
