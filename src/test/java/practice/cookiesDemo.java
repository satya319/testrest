package practice;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class cookiesDemo {
	@Test
	void testCookies() {
		given()
		.when()
			.get("https://google.com/")
		.then()
		.log().all();
	}
	
	@Test
	void getCookiesInfo() {
	Response res=	given()
		.when()
			.get("https://google.com/");
//		String cookie_val = res.getCookie("AEC");
//		System.out.println("Value of cookie is: "+ cookie_val);
		Map<String, String> cookie = res.getCookies();
		for(String k: cookie.keySet()) {
			String valueofcookie = res.getCookie(k);
			System.out.println(k+" "+valueofcookie);
		}
		
	}
}
