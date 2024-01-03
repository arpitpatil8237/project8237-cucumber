package org.fileUploadPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysEx {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
	driver.get("https://demoqa.com/automation-practice-form");
	WebElement scroll=driver.findElement(By.tagName("body"));
	scroll.sendKeys(Keys.PAGE_DOWN);
	// Way 1) sendKeys
	WebElement uploadBtn=driver.findElement(By.id("uploadPicture"));
	//No need to use click. directly sendKeys perform by Selenium
	uploadBtn.sendKeys(System.getProperty("user.dir")+"\\FileUploads\\SampleFile.txt");
	
	}

}
