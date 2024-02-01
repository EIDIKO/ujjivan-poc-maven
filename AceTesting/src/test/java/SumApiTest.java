import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import com.aventstack.extentreports.ExtentTest;
import org.junit.Test;

public class SumApiTest extends BaseTest {

    private final String BASE_URL = "http://localhost:7800/sum_api/v1";

    @Test
    public void testSumApi() {
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL+ "/sum")
        .then()
            .statusCode(200)
            .body("sum", equalTo(4))
            .body("prime", equalTo(false));
        
        ExtentTest test = extent.createTest("SampleTest", "This is a sample Extent Report test");

        // Log test steps or information
        test.pass("Step 1: This is a pass step");
        test.fail("Step 2: This is a fail step");
    }
    
    @Test
    public void testSubApi() {
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/sub")
        .then()
            .statusCode(200)
            .body("sum", equalTo(0))
            .body("prime", equalTo(false));
        
        ExtentTest test = extent.createTest("SampleTest", "This is a sample Extent Report test");

        // Log test steps or information
        test.pass("Step 1: This is a pass step");
        test.fail("Step 2: This is a fail step");
    }
    
    
    @Test
    public void testMulApi() {
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/mul")
        .then()
            .statusCode(200)
            .body("sum", equalTo(4))
            .body("prime", equalTo(false));
        ExtentTest test = extent.createTest("SampleTest", "This is a sample Extent Report test");

        // Log test steps or information
        test.pass("Step 1: This is a pass step");
        test.fail("Step 2: This is a fail step");
    }
    
    
}
