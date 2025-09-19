package practice;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class HttpRequest {
	int id;
	@Test(priority=1)
	public void getUser() {
		given()
		.header("x-api-key", "reqres-free-v1")
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.statusCode(200)
		
		.log().all();
	}
	@Test(priority=2, dependsOnMethods = "getUser")
	void createUser() {
		HashMap data  = new HashMap();
		data.put("name", "satyajit");
		data.put("job", "tester");
		id = given()
			.header("x-api-key", "reqres-free-v1")
			.contentType("application/json")
			.body(data)
			
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
			
//		.then()
//			.statusCode(201)
//			.log().all();
	}
	@Test(priority=3,dependsOnMethods="createUser")
	void updateUser() {
		HashMap data  = new HashMap();
		data.put("name", "Behera");
		data.put("job", "QA engineer");
		given()
			.header("x-api-key", "reqres-free-v1")
			.contentType("application/json")
			.body(data)
			
		.when()
			.put("https://reqres.in/api/users/"+id)
			
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=4,dependsOnMethods="updateUser")
	void deleteUser() {
		given()
			.header("x-api-key", "reqres-free-v1")
		.when()
			.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
	}
}
