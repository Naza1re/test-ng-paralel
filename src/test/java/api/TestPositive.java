package api;

import api.dto.RegisterRequest;
import api.dto.RegisterResponse;
import lombok.val;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestPositive {

    private final static String url = "https://reqres.in/";


    @Test
    public void testReqresGetting() {
        System.out.println( "THREADDDDDDDDDDDDDDDDDDDDDDDDD"+Thread.currentThread().getName());
        RegisterRequest request = RegisterRequest.builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        RegisterResponse response = RegisterResponse.builder()
                .id(4)
                .token("QpwL5tke4Pnpja7X4")
                .build();

        val actual = given()
                .contentType("application/json")
                .body(request)
                .when()
                .post(url + "api/register")
                .then()
                .log().all()
                .extract().response().as(RegisterResponse.class);

        Assert.assertEquals(actual, response);

    }


    @Test
    public void testReqresGetting2() {
        System.out.println( "THREADDDDDDDDDDDDDDDDDDDDDDDDD"+Thread.currentThread().getName());
        RegisterRequest request = RegisterRequest.builder()
                .email("eve.holt@reqres.in")
                .password("pistol")
                .build();
        RegisterResponse response = RegisterResponse.builder()
                .id(4)
                .token("QpwL5tke4Pnpja7X4")
                .build();

        val actual = given()
                .contentType("application/json")
                .body(request)
                .when()
                .post(url + "api/register")
                .then()
                .log().all()
                .extract().response().as(RegisterResponse.class);

        Assert.assertEquals(actual, response);

    }
}
