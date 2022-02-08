package api.tests;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.when;

public class TestAPIs {

    String apiUrl = "https://jsonplaceholder.typicode.com";
    Faker faker = new Faker();
    int randomNum = (int)Math.floor(Math.random()*(11)+1);

    @Test
    public void getUserIdAndPrintEmailAddressTest() {
        Object userID = when().
                get(apiUrl + "/users/" + randomNum).
                then().
                statusCode(200).
                extract()
                .path("id");
        System.out.println("User Id =====> " + userID);
    }

    @Test
    public void getUserAssociatedPostsTest() {
        List<Object> postIds = when().
                get(apiUrl + "/users/" + randomNum + "/posts").
                then().
                statusCode(200).
                extract()
                .path("id");

        for(Object postId : postIds) {
            Assert.assertTrue(100 > (int)postId && (int)postId >= 1);
        }
    }

    @Test
    public void createPostTest() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("title", faker.name().title());
        requestParams.put("body", faker.name().name());
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());

        Response response = request.post(apiUrl + "/users/" + randomNum + "/posts");
        Assert.assertTrue(response.statusCode() == 201);
    }
}
