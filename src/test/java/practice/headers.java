package practice;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class headers {
	@Test
	void getheaders() {
		Response res  = given()
		.when()
		.get("https://google.com/");
		Headers myheader = res.headers();
		for(Header h:myheader) {
			System.out.println(h.getName()+"  "+h.getValue());
		}
	}
}
