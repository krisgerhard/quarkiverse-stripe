package io.quarkiverse.stripe.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class StripeResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/stripe")
                .then()
                .statusCode(200)
                .body(is("Hello stripe"));
    }
}
