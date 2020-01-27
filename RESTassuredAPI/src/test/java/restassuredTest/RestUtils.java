package restassuredTest;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String getLastName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String getUserName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}
	
	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return (generatedString+ "gmail.com");
	}
	
	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("John" + generatedString);
	}

}
