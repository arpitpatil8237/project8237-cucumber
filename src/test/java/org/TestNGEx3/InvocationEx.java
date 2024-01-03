package org.TestNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class InvocationEx {

	@Test(invocationCount = 2,threadPoolSize=1)
	public void LoginLogout() throws InterruptedException {
		System.out.println("Program Starts");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("Chrome", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
//		Thread.sleep(5000);
		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", "#logoutLink");
		driver.findElement(By.cssSelector("#logoutLink")).click();
//		Thread.sleep(5000);
//		driver.close();
		System.out.println("Program Ends");
	}

}
