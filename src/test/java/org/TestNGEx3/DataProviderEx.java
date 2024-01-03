package org.TestNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class DataProviderEx {

	@Test(dataProvider = "logInCerdintials")
	public void LoginLogout(String uName, String password) {
		System.out.println("Program Starts");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("Chrome", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", "#logoutLink");
		driver.findElement(By.cssSelector("#logoutLink")).click();
//		driver.close();
		System.out.println("Program Ends");
	}

	@DataProvider
	public Object[][] logInCerdintials() {
		Object[][] ar = new Object[4][2];
		ar[0][0] = "admin";
		ar[0][1] = "manager";
		ar[1][0] = "admin123";
		ar[1][1] = "manager";
		ar[2][0] = "admin";
		ar[2][1] = "manager123";
		ar[3][0] = "admin123";
		ar[3][1] = "manager123";
		return ar;
	}

}
