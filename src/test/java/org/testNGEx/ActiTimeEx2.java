package org.testNGEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ActiTimeEx2 {
	private BaseUtility bu = new BaseUtility();
	private WebDriver driver = new ChromeDriver();

	@BeforeMethod

	public void beforeMethod() {
		//		bu.StartUp("ch", "http://localhost:90/login.do");
		System.setProperty("webdriver.chrome.driver", "/Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		bu.waitForVisibilityOfElement(driver, 20, "id", "logoutLink");
	}

	@AfterMethod
	public void afterMethod() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("logoutLink")).click();
		// ele.click();
		// bu.waitForVisibilityOfEle(driver, 20, ele);
		//		driver.quit();//gives Exception

		//		 Thread.sleep(5);
	}

	@Test
	public void verifyLoginPageUrl() {
		bu.waitForURLContains(driver, 10, "submit_tt");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		if (URL.equalsIgnoreCase("http://localhost:90/user/submit_tt.do")) {
			System.out.println("After LogIn This URL Expected");
		} else {
			System.out.println("URL is Changed");
		}

	}

	@Test
	public void verifyDashboardTitle() {
		bu.waitForTitleContains(driver, 5, "Enter Time-Track");
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.equalsIgnoreCase("actiTIME - Enter Time-Track")) {
			System.out.println("Dashboard Title Is Correct");
		} else {
			System.out.println("No Title");
		}

	}

}
