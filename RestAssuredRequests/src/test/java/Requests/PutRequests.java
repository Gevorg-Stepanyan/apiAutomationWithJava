package Requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutRequests {

    @Test
    void putRequest(){

        JSONObject body = new JSONObject();
        body.put("firstname","Gevorg");
        body.put("lastname","Stepanyan");
        body.put("totalprice",999);
        body.put("depositpaid",false);

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin","2018-01-01");
        bookingdates.put("checkout","2019-01-01");
        body.put("bookingdates",bookingdates);
        body.put("additionalneeds","breakfast");

        Response response = RestAssured.given().contentType(ContentType.JSON)
                .body(body.toString())
                .put("https://restful-booker.herokuapp.com/booking");

        Assert.assertEquals(response.statusCode(), 200);



    }
}
