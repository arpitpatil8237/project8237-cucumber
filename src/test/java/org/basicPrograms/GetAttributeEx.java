package org.basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GetAttributeEx {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfElement(driver, 20, "cssSelector", "#topnav td>a>div:first-child");
		
		                      // for single webelement TEXT
		
//		WebElement tab = driver.findElement(By.cssSelector("#topnav td>a"));
//		String value = tab.getAttribute("class");
//		System.out.println("value= " + value);
		//content selected tt
		
		                     // for multiple web element TEXT

		List<WebElement> allTabLinks = driver.findElements(By.cssSelector("#topnav td>a[class*='content']"));
		bu.getAttributeOfAllElement(allTabLinks);
		
//		for (int i = 0; i < allTabLinks.size(); i++) {
//			System.out.println("attri.= " + allTabLinks.get(i).getAttribute("class"));
			//content selected tt
			//content tasks
			// content reports
	        //content users

//		}

	}
}
