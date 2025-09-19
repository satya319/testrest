package tests;
import io.restassured.*;
import io.restassured.response.Response;
import test.restassured.com.Base.BaseClass;

public class login {
	public static void main(String[] args) {
		
		String payload = "{\n" +
			    "  \"username\": \"bioxafterrelease@mailsac.com\",\n" +
			    "  \"password\": \"Hello!123\",\n" +
			    "  \"rememberme\": false\n" +
			    "}";
		BaseClass bs = new BaseClass();
	Response token =	RestAssured.
		given().baseUri(bs.baseuri)
		.header("Content-Type", "application/json")
		 .header("Accept", "application/json")
         .header("api-version", "12.0")
         .header("Machine-name", "zxy")
		.body(payload)
		.when().post(bs.loginEndpoint)
		.then().statusCode(200).extract().response();	
	
	String accesstoken=  token.jsonPath().getString("accesstoken");
	 String tokenType   = token.jsonPath().getString("tokenType");
	System.out.println("token: "+accesstoken);
	
	// ---------------------------------------------//
	String tenantId = "";
	Response user = RestAssured.given().baseUri(bs.baseuri)
	.header("Accept", "application/json")
    .header("api-version", "12.0")
    .header("Authorization", "Bearer " +accesstoken)
    .when().get(bs.currentUser)
    .then().statusCode(200).extract().response();
	System.out.println(user.jsonPath().getString(tenantId));
	}
	
	
	
}
