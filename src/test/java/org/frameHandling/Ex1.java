package org.frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frameEle=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameEle);//to inner child frame
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		String txt=ele.getText();
		System.out.println("FrameText= "+txt);
//		driver.switchTo().parentFrame();//from child frame to parent frame only
		
		
	}

}
