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

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2_POST_Request {
	
	@BeforeClass
	public void postData() {
		
	}
	
	@Test
	public void testPost() {
		
	}

}
