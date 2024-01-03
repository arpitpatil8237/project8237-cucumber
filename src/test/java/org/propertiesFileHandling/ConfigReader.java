package org.propertiesFileHandling;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static void main(String[] args) {
		System.out.println("Program Starts");

		System.out.println("Program Ends");
	}
	public String getTestData(String KEY) {
		try {
			FileInputStream fis=new FileInputStream("./ConfigurationFiles/Config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			return prop.getProperty(KEY);

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}
	public Properties init_prop() {
		try {
			FileInputStream fis=new FileInputStream("./ConfigurationFiles/Config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			return prop;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}

}
