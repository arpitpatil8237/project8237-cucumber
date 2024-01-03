package org.actionClassEx;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1 {
				//doubleClick and rightClick By actions class
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement eleBtn=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(eleBtn).perform();// 
		act.moveToElement(eleBtn).doubleClick().build().perform();//
		//
		WebElement eleBtn2=driver.findElement(By.id("rightClickBtn"));
		act.scrollToElement(eleBtn2).build().perform();
		act.contextClick(eleBtn2).perform();
//		act.moveToElement(eleBtn2).contextClick().build().perform();
		//
		WebElement eleBt3=driver.findElement(By.xpath("//button[text()='Click Me']"));
//		act.scrollToElement(eleBt3).build().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", eleBt3);
		
		act.click(eleBt3).perform();
//		act.moveToElement(eleBt3).click().build().perform();
//		WebElement ele=driver.findElement(By.tagName("body"));
//		ele.sendKeys(Keys.PAGE_DOWN);
//		
	

		

		
		
		
	
		
	}

}
