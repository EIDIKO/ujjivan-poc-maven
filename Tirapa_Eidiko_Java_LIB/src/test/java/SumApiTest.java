/*
 * package test.java;
 * 
 * import org.junit.Test; import static io.restassured.RestAssured.given; import
 * static org.hamcrest.Matchers.*;
 * 
 * public class SumApiTest {
 * 
 * private final String BASE_URL = "http://localhost:7800/sum_api/v1/sum";
 * 
 * @Test public void testSumApi() { given() .contentType("application/json")
 * .body("{\"number2\": 2, \"number1\": 2}") .when() .post(BASE_URL) .then()
 * .statusCode(200) .body("sum", equalTo(4)) .body("prime", equalTo(false)); } }
 */