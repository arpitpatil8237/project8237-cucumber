package org.propertiesFileHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActiTimeLogInEx3 {

	public static void main(String[] args) {
		try {
			ConfigReader cr = new ConfigReader();
			BaseUtility bu = new BaseUtility();
			// Optimize code using Generic
//			String BName=prop.getProperty("bName");
//			String URL=prop.getProperty("url");
//			String Username=prop.getProperty("uName");
//			String Password=prop.getProperty("pwd");
			WebDriver driver = bu.StartUp(cr.getTestData("bName"), cr.getTestData("url"));
			driver.findElement(By.id("username")).sendKeys(cr.getTestData("uName"));
			driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(cr.getTestData("pwd"));
			driver.findElement(By.cssSelector("#loginButton>div")).click();
//			driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Exception= " + e.getCause());
		}

	}

}
