package org.basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GetTextEx {

	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("ch", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfElement(driver, 20, "cssSelector", "#topnav td>a>div:first-child");
		                     //for single webelement TEXT
//		WebElement tab=driver.findElement(By.cssSelector("#topnav td>a>div:first-child"));
//		   // tab.getText();
//		System.out.println("tab: "+tab.getText());//TIME-TRACK
		                     //for multiple web element TEXT
		List<WebElement> allTabs=driver.findElements(By.cssSelector("td[class^='navItem navCell relative']"));
		bu.getTextOfAllElements(allTabs);                //byCalling generic Method
		for(int i=0;i<allTabs.size();i++) {
			//WebElement ele = allTabs.get(i);
			//System.out.println(ele.getText());
			System.out.println("text: "+allTabs.get(i).getText());
			//TIME-TRACK
		    //TASKS
			//REPORTS
			//USERS

		}    //#topnav td>a>div:first-child
		     //OR
			//td[class^='navItem navCell relative']
		
		
	}

}
