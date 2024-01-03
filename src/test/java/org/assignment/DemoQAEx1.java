package org.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

public class DemoQAEx1 {

	public static void main(String[] args)  {
	BaseUtility bu=new BaseUtility();
	WebDriver driver=new ChromeDriver();
	bu.StartUp("ch", "https://demoqa.com/automation-practice-form");
//	bu.scrollByPageDown(driver, 1);
	WebElement ele=driver.findElement(By.tagName("body"));
	ele.sendKeys(Keys.PAGE_DOWN);
	driver.findElement(By.cssSelector("#firstName")).sendKeys("Tejas");
	driver.findElement(By.id("lastName")).sendKeys("Patil");
	driver.findElement(By.id("userEmail")).sendKeys("tp@gmail.com");
	driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	driver.findElement(By.xpath("//div[contains(@class,'value-container')]")).sendKeys("Exercise");
	
	
	}
}
 