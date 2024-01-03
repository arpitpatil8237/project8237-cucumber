package org.propertiesFileHandling;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActiTimeLogInEx2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("./ConfigurationFiles/Config.properties");
			Properties prop=new Properties();
			prop.load(fis);
			String BName=prop.getProperty("bName");
			String URL=prop.getProperty("url");
			String Username=prop.getProperty("uName");
			String Password=prop.getProperty("pwd");
			
			BaseUtility bu=new BaseUtility();
			WebDriver driver=bu.StartUp(BName,URL);
			driver.findElement(By.id("username")).sendKeys(Username);
			driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(Password);
			driver.findElement(By.cssSelector("#loginButton>div")).click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception= "+e.getCause());
		}
		
		
		
		
		
	}

}
