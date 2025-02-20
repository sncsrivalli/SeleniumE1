package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// Step 1: Convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		// Step 2: Create an instance of Properties class
		Properties property = new Properties();
		
		// Step 3: Load all key & value pairs from fis to property
		property.load(fis);
		
		// Step 4: Retrieve data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("username"));

	}

}
