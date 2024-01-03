package org.practiceSelf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;

public class Ex1 {
public static void main(String[] args) {
<<<<<<< HEAD
//Removed
=======
//Changes Remove
>>>>>>> A
	BaseUtility bu=new BaseUtility();
	WebDriver driver;
//	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");

//	driver.get("https://www.saucedemo.com/");
	driver=bu.StartUp("Firefox", "https://www.saucedemo.com/");
	driver.findElement(By.cssSelector("#user-name"));
	driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("#password"));
	driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	bu.waitForTitleContains(driver, 10, "Swag");
	String title=driver.getTitle();
//	System.out.println(title);
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(title, "Swag Labs", title);
	sa.assertAll();
//	Assert.assertEquals(title, "Swag Labs");

}
}
