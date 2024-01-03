package org.actionClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHoldEx {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement srcEle=driver.findElement(By.id("draggable"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", srcEle);
		WebElement desEle=driver.findElement(By.cssSelector("#simpleDropContainer div[id='droppable']"));
		act.moveToElement(srcEle).clickAndHold().moveToElement(desEle).release().build().perform();
	}
}
