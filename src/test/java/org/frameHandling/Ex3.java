package org.frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frameEle=driver.findElement(By.id("frame1"));
//		driver.switchTo().frame(frameEle);//to inner child frame
		//instead of this we use explicit wait with switch code
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		String txt=ele.getText();
		System.out.println("FrameText= "+txt);
		
		
		
	}

}
