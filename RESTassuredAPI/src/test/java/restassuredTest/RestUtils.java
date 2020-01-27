package restassuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName() {								//Will create a random string + FirstName
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String getLastName() {								//Will create a random string + LastName
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Kenedy" + generatedString);
	}
	
	public static String getUserName() {								//Will create a random string + UserName
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String getEmail() {									//Will create a random string + Email
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (generatedString+ "gmail.com");
	}
	
	public static String getPassword() {								//Will create a random string + Password
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String empName() {									//Will create a random string + empName
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String empSal() {									//Will create a random empSal
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (generatedString);
	}
	
	public static String empAge() {									//Will create a random empAge
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (generatedString);
	}


}
