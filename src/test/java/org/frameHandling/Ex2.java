package org.frameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

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
		//
		driver.switchTo().defaultContent();//to root HTML
		WebElement frameEle2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameEle2);
		WebElement ele2=driver.findElement(By.id("sampleHeading"));
		String txt2=ele2.getText();
		System.out.println("FrameText= "+txt2);
		
//		driver.switchTo().parentFrame();//to parent Frame
		
	}

}
