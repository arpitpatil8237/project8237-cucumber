package org.windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {
	// window handle using their ID's
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriverN1.exe");
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		String parentId = driver.getWindowHandle();
		System.out.println("ParentId: " + parentId);

		Set<String> winAllId = driver.getWindowHandles();
		for (String s : winAllId) { // forEachLoop
			System.out.println("winId : " + s);
		}
		Iterator<String> itr = winAllId.iterator();
		while (itr.hasNext()) {
			String id1 = itr.next();
			if (id1.equals(parentId)) { // condition is imp
				continue;
			}
			driver.switchTo().window(id1);
			//way 2 By List Of WebElement
			List<WebElement> eleList=driver.findElements(By.tagName("h1"));
			if(eleList.isEmpty()) {
				continue;
			}
			String txt=eleList.get(0).getText();
			System.out.println("NewWindow="+txt);
			break;
		}
	}
}