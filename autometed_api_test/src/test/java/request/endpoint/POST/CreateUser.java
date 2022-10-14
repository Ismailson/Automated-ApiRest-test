package request.endpoint.POST;

import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.Setter;

import io.restassured.http.ContentType;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

@Getter @Setter
public class CreateUser {
    private String responseBody;
    private int statusCode;

    public void requestCreateUser(){
        useRelaxedHTTPSValidation();
        enableLoggingOfRequestAndResponseIfValidationFails();
        RequestSpecification requestSpecification = new RequestSpecBuilder()
            .setBaseUri("https://petstore3.swagger.io")
            .setBasePath("/api/v3/user")
            .addHeader("accept","application/json")
            .addHeader("Content-Type","application/json")
            .build();

        RequestSpecification request = given(requestSpecification)
                .body("{\n" +
                        "    \"id\": 20,\n" +
                        "    \"username\": \"isCosta\",\n" +
                        "    \"firstName\": \"Carlos\",\n" +
                        "    \"lastName\": \"Palmer\",\n" +
                        "    \"email\": \"teste@teste.com\",\n" +
                        "    \"password\": \"123456\",\n" +
                        "    \"phone\": \"34343434545454545\",\n" +
                        "    \"userStatus\": 2\n" +
                        "}").log().all();
        ValidatableResponse response = request.when().post().then().log().all();
        setResponseBody(response.extract().body().asPrettyString());
        setStatusCode(response.extract().statusCode());
    }

    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();
        createUser.requestCreateUser();
        int statusCod = createUser.getStatusCode();
        Assert.assertEquals(200, statusCod);
        System.out.println("StatusCode"+statusCod);
    }
}
