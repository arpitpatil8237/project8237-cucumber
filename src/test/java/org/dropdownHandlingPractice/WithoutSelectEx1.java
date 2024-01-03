package org.dropdownHandlingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utilities.BaseUtility;

public class WithoutSelectEx1 {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("start-maximized");
//		ChromeDriver driver=new ChromeDriver(options);
//		driver.get("https://demoqa.com/select-menu");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#withOptGroup .css-1wa3eu0-placeholder")).click();
		driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
		WebElement ele=driver.findElement(By.tagName("body"));
		ele.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//div[text()='Select Title']")).click();
    	driver.findElement(By.xpath("//div[text()='Prof.']")).click();
    	
    	driver.findElement(By.id("oldSelectMenu"));//consist of SELECT tag(Options)
		WebElement DD=driver.findElement(By.xpath("//option[@value='red']"));
		boolean ch=DD.isSelected();      //it is done using SELECT class only 
		System.out.println("Selected= "+ch);//so it is not usable
		
		
		
		
	}

}
