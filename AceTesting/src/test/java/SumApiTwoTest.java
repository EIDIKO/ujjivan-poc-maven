
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// other imports ...

import com.aventstack.extentreports.ExtentTest;

public class SumApiTwoTest extends BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SumApiTwoTest.class);
    private final String BASE_URL = "http://localhost:7800/sum_api/v1";

    @Test
    public void testSumApione() {
    	
    	ExtentTest test = extent.createTest("testSumApione", "Testing Sum API with numbers 2 and 2");
        
        // rest of your test code ...
        test.info("Sending request to Sum API with numbers 2 and 2");
        LOGGER.info("Sending request to Sum API with numbers 2 and 2");
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/sum")
        .then()
            .statusCode(200)
            .body("sum", equalTo(4))
            .body("prime", equalTo(false));

        test.pass("API request successful");
        LOGGER.info("API request successful");
    }
	
	
	@Test
    public void testSumApitwo() {
    	
    	ExtentTest test = extent.createTest("testSumApione", "Testing Sum API with numbers 2 and 2");
        test.info("Sending request to Sum API with numbers 2 and 2");
        LOGGER.info("Sending request to Sum API with numbers 2 and 2");
        given()
            .contentType("application/json")
            .body("{\"number2\": 3, \"number1\": 3}")
        .when()
            .post(BASE_URL + "/sum")
        .then()
            .statusCode(200)
            .body("sum", equalTo(6))
            .body("prime", equalTo(false));

        test.pass("API request successful");
        LOGGER.info("API request successful");
    }

    @Test
    public void testSumApi() {
        LOGGER.info("Starting testSumApi");
        // rest of your test code ...
    }

    // other test methods ...
}
