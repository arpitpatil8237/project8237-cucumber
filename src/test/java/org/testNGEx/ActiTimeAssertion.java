package org.testNGEx;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.propertiesFileHandling.ConfigReader;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;
// Assertion Use Verify and Validation
public class ActiTimeAssertion {
	private BaseUtility bu = new BaseUtility();
	private WebDriver driver;
	private Properties prop;

	@BeforeSuite
	public void inIt() {
		ConfigReader cr = new ConfigReader();
		prop = cr.init_prop();
	}

	@AfterSuite
	public void tearDown() {
		prop.clear();

		// close FIS,FOS,DataBAse connection
	}

	@BeforeMethod

	public void beforeMethod() {
		driver = bu.StartUp(prop.getProperty("bName"), prop.getProperty("url"));
//		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriverN1.exe");
//		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("uName"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.cssSelector("#loginButton")).click();
		bu.waitForVisibilityOfElement(driver, 20, "id", "logoutLink");
	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
	}

	@Test
	public void verifyLoginPageUrl() {
		bu.waitForURLContains(driver, 10, "submit_tt");
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://localhost:90/user/submit_tt.do","Url Not Verified");	
		System.out.println("URL is verified");
		Reporter.log("Url is verified");
		/*System.out.println(URL);
		if (URL.equalsIgnoreCase("http://localhost:90/user/submit_tt.do")) {
			System.out.println("After LogIn This URL Expected");
		} else {
			System.out.println("URL is Changed");
		}*/

	}

	@Test
	public void verifyDashboardTitle() {
		bu.waitForTitleContains(driver, 5, "Enter Time-Track");
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "actiTIME - Enter Time-Track","Title Not Verified ");
		System.out.println("Title is verified");
		Reporter.log("Title is verified");
		
		/*System.out.println(Title);
		if (Title.equalsIgnoreCase("actiTIME - Enter Time-Track")) {
			System.out.println("Dashboard Title Is Correct");
		} else {
			System.out.println("No Title");
		}*/

	}

}
