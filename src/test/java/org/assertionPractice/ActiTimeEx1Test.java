package org.assertionPractice;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.propertiesFileHandling.ConfigReader;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ActiTimeEx1Test {
	BaseUtility bu = new BaseUtility();
	WebDriver driver = new ChromeDriver();
	Properties prop = new Properties();

	@BeforeSuite
	public void inItBrowser() {
		ConfigReader cr = new ConfigReader();
		prop = cr.init_prop();
	}

	@AfterSuite
	public void tearDown() {
		prop.clear();
		driver.quit();
		// clear all Objects
	}

	@BeforeMethod
	public void logIn() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("#username")).sendKeys(prop.getProperty("uName"));
		Reporter.log("Username Enterd Successfully");
		WebElement ele = driver.findElement(By.cssSelector(".textField.pwdfield"));
		ele.sendKeys(prop.getProperty("pwd"));
		Reporter.log("Password Enterd Successfully");
		driver.findElement(By.cssSelector("#loginButton")).click();
	/*	//WebElement ele =null;;
		for (int k = 0; k <= 2; k++) {
			try {
				ele = driver.findElement(By.cssSelector(".textField.pwdfield"));
				String str=ele.getAttribute("class");
				System.out.println(str);
				break;

			} catch (Exception e) {
				continue;
			}
		}*/
		Reporter.log("Click On LogIn Button");
		bu.waitForVisibilityOfLocatedBy(driver, 20, "id", "logoutLink");

	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Click On LogOut Button");
//		driver.close();
//		driver.quit();
	}

	@Test
	public void verifyDAshBoardUrl() {
		System.out.println("Starts");
		bu.waitForURLContains(driver, 10, "submit_tt");
		Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:90/user/submit_tt.do", "URL is NOT as Expected");
		Reporter.log("DashBoard Url is Matched");
		System.out.println("Ends");
	}

	@Test
	public void verifyDAshBoardTitle() {
		System.out.println("Starts");
		bu.waitForTitleContains(driver, 10, "Enter Time-Track");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Title is Not as Expected");
		Reporter.log("DAshBoard Title is Matched");
		System.out.println("Ends");
	}

}
