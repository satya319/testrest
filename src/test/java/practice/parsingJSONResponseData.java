package practice;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class parsingJSONResponseData {
	@Test
	void parseJsonresponse() {
		Response res =  given()
		 .when()	
		 	.get("https://dummy.restapiexample.com/api/v1/employees");
//		 .then()
		 JSONObject jo = new JSONObject(res.getBody().asString());
		 
//		 for(int i=0;i < jo.getJSONArray("data").length();i++) {
//			String empName= jo.getJSONArray("data")
//					.getJSONObject(i)
//					.get("employee_name")
//					.toString();
//			System.out.println(empName);
//		 }
		 //searcch for titel of the book in json
		 boolean status = false;
		 for(int i=0;i < jo.getJSONArray("data").length();i++) {
				String empName= jo.getJSONArray("data")
						.getJSONObject(i)
						.get("employee_name")
						.toString();
				if(empName.equals("Gloria Little")) {
					status = true;
					break;
				}
				System.out.println(empName);
			 }
		 Assert.assertEquals(status, true);
		 
		 //validate total salary
		 double totalsalary = 0;
		 for(int i=0;i < jo.getJSONArray("data").length();i++) {
				String empsal= jo.getJSONArray("data")
						.getJSONObject(i)
						.get("employee_salary")
						.toString();
				totalsalary = totalsalary + Double.parseDouble(empsal);
				
			 }
		 System.out.println(totalsalary);
		 Assert.assertEquals(6644770.0, totalsalary);
	}
}
