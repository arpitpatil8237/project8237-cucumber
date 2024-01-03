package org.actionClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class TooltipEx {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
//		driver.get("https://demoqa.com/tool-tips");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/tool-tips");

		WebElement btn=driver.findElement(By.id("toolTipButton"));
		Actions act=new Actions(driver);
		act.moveToElement(btn).perform();
		Thread.sleep(2000);
		//
		System.out.println(driver.getPageSource());
		
		//
		String toolTip=driver.findElement(By.cssSelector(".tooltip-inner")).getText();
		System.out.println("Tooltip Text: "+toolTip);
	}

}