package org.fileUploadPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItEx3 {
                       
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement scroll = driver.findElement(By.tagName("body"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		Actions act = new Actions(driver);
		
		// Way 3)By Using Generic Switch
		
		WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		act.click(uploadBtn).perform();
//		 Thread.sleep(2000); //client will allow at this time to use
		try {
			Thread.sleep(2000);
			String file =(System.getProperty("user.dir")+"\\FileUploads\\SampleFile.txt");
			Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\FileUploads\\UploadGeneric.exe"+" "+file);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable To Upload File!!!");
		}

	}

}
