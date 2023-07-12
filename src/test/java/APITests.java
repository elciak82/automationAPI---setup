import org.testng.annotations.Test;
import requests.GETRequests;

public class APITests {

    private final GETRequests getRequests = new GETRequests();

    @Test
    public void APITestGET(){

        int productId = 1;
        getRequests.getProductById(productId);

    }
}
