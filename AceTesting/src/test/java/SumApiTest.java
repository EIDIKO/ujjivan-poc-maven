import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentTest;

public class SumApiTest extends BaseTest {

    private final String BASE_URL = "http://localhost:7800/sum_api/v1";
    private static final Logger LOGGER = LoggerFactory.getLogger(SumApiTest.class);
    @Test
    public void testSumApione() {
        // Create a test in the ExtentReports instance
        ExtentTest test = extent.createTest("testSumApione", "Testing Sum API with numbers 2 and 2");

        // Log test steps or information
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
    public void testSumApi() {
        // Create a test in the ExtentReports instance
        ExtentTest test = extent.createTest("testSumApi", "Testing Sum API with numbers 9 and 2");

        // Log test steps or information
        test.info("Sending request to Sum API with numbers 9 and 2");
        LOGGER.info("Sending request to Sum API with numbers 9 and 2");
        given()
            .contentType("application/json")
            .body("{\"number2\": 9, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/sum")
        .then()
            .statusCode(200)
            .body("sum", equalTo(11))
            .body("prime", equalTo(true));

        test.pass("API request successful");
        LOGGER.info("API request successful");
    }

    @Test
    public void testSubApi() {
        // Create a test in the ExtentReports instance
        ExtentTest test = extent.createTest("testSubApi", "Testing Sub API with numbers 2 and 2");

        // Log test steps or information
        test.info("Sending request to Sub API with numbers 2 and 2");
        LOGGER.info("Sending request to Sub API with numbers 2 and 2");
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/sub")
        .then()
            .statusCode(200)
            .body("sum", equalTo(0))
            .body("prime", equalTo(false));

        test.pass("API request successful");
        LOGGER.info("API request successful");
    }

    @Test
    public void testMulApi() {
        // Create a test in the ExtentReports instance
        ExtentTest test = extent.createTest("testMulApi", "Testing Mul API with numbers 2 and 2");

        // Log test steps or information
        test.info("Sending request to Mul API with numbers 2 and 2");
        LOGGER.info("Sending request to Mul API with numbers 2 and 2");
        given()
            .contentType("application/json")
            .body("{\"number2\": 2, \"number1\": 2}")
        .when()
            .post(BASE_URL + "/mul")
        .then()
            .statusCode(200)
            .body("sum", equalTo(4))
            .body("prime", equalTo(false));

        test.pass("API request successful");
        LOGGER.info("API request successful");
    }
}
