/* 
 * This class is showing about POST call to create a user
 * 1. given()-set cookies ,  add authentication , add parameters , set headers info etc...
 * 2. when()-get, post , put , delete - the actual call
 * 3. then()- validation status code , extract response , extract headers cookies & response body...
 * 
 * Need to import both 
 * import static io.restassured.RestAssured.*;
 * import static org.hamcrest.Matchers.*;
 */

package restassuredTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo2_POST_Request {
	
	public static HashMap map = new HashMap();						//Creating a new Hash Map to hold the user data
	
	@BeforeClass
	public void postData() 
	{	
		map.put("FirstName", RestUtils.getFirstName());				//Populating the random FirstName
		map.put("LastName", RestUtils.getLastName());				//Populating the random LastName
		map.put("UserName", RestUtils.getUserName());				//Populating the random UserName
		map.put("Password", RestUtils.getPassword());				//Populating the random Password
		map.put("Email", RestUtils.getEmail());						//Populating the random Email
		
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";	//Creating the baseURI
		RestAssured.basePath = "/register";							//Creating the basePath
	}
	
	@Test
	public void testPost()
	{
		given()
			.contentType("application/json")						//Sending content of json
			.body(map)												//Passing the HashMap data
			
		.when()
			.post()													//Type off call post
		
		.then()
			.statusCode(201)										//Validating 201 created
			.and()
			.body("SuccessCode", equalTo("OPERATION_SUCCESS"))		//Validating SuccessCode
			.and()
			.body("Message", equalTo("Operation completed successfully"));	//Validating Message
	}
}
