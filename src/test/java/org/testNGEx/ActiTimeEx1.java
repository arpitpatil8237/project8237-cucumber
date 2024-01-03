package org.testNGEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ActiTimeEx1 {
	private BaseUtility bu = new BaseUtility();
	private WebDriver driver = new ChromeDriver();

	@Test (priority=-1)
	public void verifyLoginPageUrl() {
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		bu.waitForVisibilityOfElement(driver, 10, "id", "logoutLink");
		bu.waitForURLContains(driver, 10, "submit_tt");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if (URL.equalsIgnoreCase("http://localhost:90/user/submit_tt.do")) {
			System.out.println("After LogIn This URL Expected");
		} else {
			System.out.println("URL is Changed");
		}
		driver.findElement(By.cssSelector("#logoutLink")).click();	
//		driver.quit();  //gives NoSuchSessionException

	}

	@Test
	public void verifyDashboardTitle() {
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		bu.waitForVisibilityOfElement(driver, 10, "id", "logoutLink");
		bu.waitForTitleContains(driver, 5, "Enter Time-Track");
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equalsIgnoreCase("actiTIME - Enter Time-Track")) {
			System.out.println("Dashboard Title Is Correct");
		}else {
			System.out.println("No Title");
		}
		driver.findElement(By.cssSelector("#logoutLink")).click();	
		driver.quit();
	}
}
