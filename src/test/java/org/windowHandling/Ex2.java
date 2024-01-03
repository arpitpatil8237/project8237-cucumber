package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseUtility;

public class Ex2 {
    //window handle using their ID's
	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
//		driver.get("https://demoqa.com/browser-windows");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/browser-windows");

		driver.findElement(By.id("windowButton")).click();
		String parentId=driver.getWindowHandle();
		System.out.println("ParentId: "+parentId);
		
		Set<String> winAllId=driver.getWindowHandles();
		for(String s:winAllId) {       //forEachLoop
		System.out.println("winId : "+s);
		}
		Iterator<String> itr=winAllId.iterator();
		String id1=itr.next();
		if(id1.equals(parentId)) {   //condition is imp
			id1=itr.next();
		}
		driver.switchTo().window(id1);
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		String txt=ele.getText();
		System.out.println("NewWindow: "+txt);
		
	}

}
