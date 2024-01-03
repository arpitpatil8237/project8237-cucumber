package org.browserOperations;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {
	public WebDriver driver=null; 
	public static void main(String[] args) throws InterruptedException {
		BaseUtility bu=new BaseUtility();
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		ChromeOptions options=new ChromeOptions();
//		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=bu.StartUp("ff", "http://www.google.com/");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.google.com/");
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);//not recommended
		driver.navigate().back();
		Thread.sleep(2000);//not recommended
		driver.navigate().forward();
		Thread.sleep(2000);//not recommended
		driver.navigate().refresh();
		
		
	
	}
}
