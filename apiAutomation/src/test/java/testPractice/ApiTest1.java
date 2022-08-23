package testPractice;

import io.restassured.*;

import static io.restassured.RestAssured.*;

public class ApiTest1 {

    public static String baseuri ="https://api.trello.com";

    public static void main(String args[]) {
    RestAssured.baseURI = baseuri;

    given().param("key", "2c356f7f69df69528b073cff6d320f21")
            .param("token", "fc3688706d812b9dbc70f55f0cbce0e7d16d43417cb44d6f328604f7085158d9")
            .when().get("/1/boards/UojysmEP")
            .then().assertThat().statusCode(200);

        System.out.println("done");

    }

}
