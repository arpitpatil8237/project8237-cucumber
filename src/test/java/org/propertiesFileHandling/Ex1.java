package org.propertiesFileHandling;

import java.io.FileInputStream;
import java.util.Properties;

public class Ex1 {
	//4line codeS
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("./ConfigurationFiles/Config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String BName=prop.getProperty("bName");
			System.out.println("BName: "+BName);
			String url=prop.getProperty("url");
			System.out.println("url: "+url);
			String UName=prop.getProperty("uName");
			System.out.println("UName: "+UName);
			String PWD=prop.getProperty("pwd");
			System.out.println("PWD: "+PWD);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	

}

}