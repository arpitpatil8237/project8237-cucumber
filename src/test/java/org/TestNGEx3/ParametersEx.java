package org.TestNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParametersEx {
	@Parameters({"clever","smart"})
	@Test
	public void LoginLogout(String uName, String Password) {
		System.out.println("Program Starts");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("Chrome", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(Password);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", "#logoutLink");
		driver.findElement(By.cssSelector("#logoutLink")).click();
//		driver.close();
		System.out.println("Program Ends");
	}


}
