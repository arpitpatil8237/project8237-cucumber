package org.fileUploadPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassEx {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement scroll = driver.findElement(By.tagName("body"));
		scroll.sendKeys(Keys.PAGE_DOWN);
		Actions act = new Actions(driver);
		
		// Way 3)By Using Robot Class
		
		WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		act.click(uploadBtn).perform();
		String fileName=(System.getProperty("user.dir")+"\\FileUploads\\SampleFile.txt");
		StringSelection ss=new StringSelection(fileName);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r=new Robot();//Exception throws
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}