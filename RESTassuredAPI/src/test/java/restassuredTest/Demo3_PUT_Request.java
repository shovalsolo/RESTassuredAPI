/* 
 * This class is showing about PUT call update user info
 * 1. given()-set cookies ,  add authentication , add parameters , set headers info etc...
 * 2. when()-get, post , put , delete - the actual call
 * 3. then()- validation status code , extract response , extract headers cookies & response body...
 * 
 * Need to import both 
 * import static io.restassured.RestAssured.*;
 * import static org.hamcrest.Matchers.*;
 */

package restassuredTest;
import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo3_PUT_Request {
	
	public static HashMap map = new HashMap();							//Creating a new Hash Map to hold the user data
	
	String empName = RestUtils.empName();								//Will hold the empName from the function
	String empSalary = RestUtils.empSal();								//Will hold the empSalary from the function
	String empAge = RestUtils.empAge();									//Will hold the empAge from the function
	int emp_id=24;														//Will hold the emp_id we are going to change
	
	
	@BeforeClass
	public void putData() {
		map.put("employee_name" , empName);
		map.put("employee_salary" , empSalary);
		map.put("employee_age" , empAge);
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";	//Creating the baseURI
		RestAssured.basePath = "/update/" + emp_id;						//Creating the basePath and concatenating the emp_id
	}
	
	@Test
	public void testPut()
	{
		given()
			.contentType("application/json")							//Sending content of json
			.body(map)													//Passing the HashMap data
		
		.when()
			.put()														//Type of call PUT
		
		.then()
			.statusCode(200)											//Validating 200 OK
			.log().all();												//Will print all the changes
	}
}
