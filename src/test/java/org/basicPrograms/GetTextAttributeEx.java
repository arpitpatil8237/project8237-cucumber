package org.basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GetTextAttributeEx {
                       //mixing of Text and Attribute
	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfElement(driver, 20, "cssSelector", "#topnav td>a>div:first-child");
		
		List<WebElement> allTabs=driver.findElements(By.cssSelector("#topnav td>a>div:first-child"));

		List<WebElement> allTabLinks = driver.findElements(By.cssSelector("#topnav td>a[class*='content']"));
		for(int i=0;i<allTabLinks.size();i++) {
			String str=allTabLinks.get(i).getAttribute("class");
			if(str.contains("selected")) {
				System.out.println("selected tab: "+allTabs.get(i).getText());
			}else {
				System.out.println("Not selected tab: "+allTabs.get(i).getText());
                 //selected tab: TIME-TRACK
				//Not selected tab: TASKS
				//Not selected tab: REPORTS
				//Not selected tab: USERS


			}
		}
	}

}
