package Requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;




public class GetRequests {

    @Test
    void getRequest(){
        Response response =  RestAssured.get("https://mts.am");
        Assert.assertEquals(200, response.statusCode());
    }

}
