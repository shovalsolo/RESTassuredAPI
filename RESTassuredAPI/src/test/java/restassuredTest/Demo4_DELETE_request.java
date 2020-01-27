/* 
 * This class is showing about Delete request
 * 1. given()-set cookies ,  add authentication , add parameters , set headers info etc...
 * 2. when()-get, post , put , delete - the actual call
 * 3. then()- validation status code , extract response , extract headers cookies & response body...
 * 
 * Need to import both 
 * import static io.restassured.RestAssured.*;
 * import static org.hamcrest.Matchers.*;
 */

package restassuredTest;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo4_DELETE_request {
	
	int emp_id=23;	
	
	@BeforeClass
	public void putData() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";	//Creating the baseURI
		RestAssured.basePath = "/delete/" + emp_id;						//Creating the basePath and concatenating the emp_id
	}
	

	@Test
	public void testDelete() {
	
	Response response = 
		
	given()
	
	.when()
		.delete()														//Type of call PUT
	
	.then()
		.statusCode(200)												//Validating 200 OK
		.statusLine("HTTP/1.1 200 OK")									
		.log().all()													//Will print all the changes
		.extract().response();											//Will send the response to the paramater response
	
	String jsonAsString = response.asString();							//Saving 
	Assert.assertEquals(jsonAsString, contains("successfully! deleted Records"));	//Will verify the deleted Record
	}
}
