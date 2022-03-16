package com.example;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
public class CoffeeResourceTest {

    @Test
    public void testGetListEndpoint() {
        given().contentType(ContentType.JSON)
                .when().get("/coffee")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("size()", is(3));
    }

    @Test
    public void testGetItemEndpoint() {
        given().contentType(ContentType.JSON)
                .when().get("/coffee/latte-arabica")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .body("description", equalTo("arabica beans, full fat bio milk"));
    }
}