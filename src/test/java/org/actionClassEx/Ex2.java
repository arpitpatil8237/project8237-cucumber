package org.actionClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2 {
				//click and sendKeys By actions
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/webtables");
		WebElement ele=driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div[6]//span[@title='Edit']/*"));
		Actions act=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
//		act.scrollToElement(ele).perform();
//		ele.click();
		act.moveToElement(ele).click().build().perform();
		WebElement fName=driver.findElement(By.id("firstName"));
		act.moveToElement(fName).click().build().perform();
//		fName.click();
//		fName.clear();  //to clear field
//		act.click(fName).perform();
		fName.sendKeys(Keys.chord(Keys.CONTROL,"a"));//to clear field also
		fName.sendKeys(Keys.BACK_SPACE);
//		fName.sendKeys("ARPIT");
		act.sendKeys(fName, "ARPIT").perform();

		
		
		
	
		
	}

}
