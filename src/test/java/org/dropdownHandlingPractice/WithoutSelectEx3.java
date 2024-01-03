package org.dropdownHandlingPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utilities.BaseUtility;

public class WithoutSelectEx3 {

	public static void main(String[] args) {
//		ChromeDriver driverch=new ChromeDriver();
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notificatons");
//		options.addArguments("start-maximized");
//		WebDriver driver=new ChromeDriver(options);
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
//		driver.get("https://demoqa.com/select-menu");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Select...']"));
		ele.click();
//		BaseUtility bu=new BaseUtility();
		List<WebElement> eles=driver.findElements(By.xpath("//div[@tabindex='-1']"));
		ArrayList<String> allEle=bu.getAttributeOfAllElement(eles);
		System.out.println(allEle);
		
		
	}

}