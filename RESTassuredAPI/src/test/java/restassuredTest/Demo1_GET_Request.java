/* 
 * This class is showing about 
 * 1. given()-set cookies ,  add authentication , add parameters , set headers info etc...
 * 2. when()-get, post , put , delete - the actual call
 * 3. then()- validation status code , extract response , extract headers cookies & response body...
 * 
 * Need to import both 
 * import static io.restassured.RestAssured.*;
 * import static org.hamcrest.Matchers.*;
 */

package restassuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Demo1_GET_Request {

	@Test
	public void getWeatherDetails() {
		
		given()																	//Has the prerequisites to the test
		
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")	//Has the action get,post,put,delete
		
		.then()																	//Has all the validations
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("City", equalTo("Hyderabad"))
			.header("Content-Type", "application/json");
	}

}
