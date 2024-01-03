package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class ExplicitWaitEx1 {

	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		
		WebDriver driver=bu.StartUp("ff", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//way 1
//		bu.waitForVisibilityOfElement(driver,30,"cssSelector","#logoutLink");   //explicit wait for particular WebElement
		//way 2
		bu.waitForVisibilityOfLocatedBy(driver,30,"cssSelector","#logoutLink"); //by locator
		//way 3  Showing  error need to check
//		WebElement LogoutBy=driver.findElement(By.cssSelector("#logoutLink"));
//		bu.waitForVisibilityOfLocatedBy(driver, 20,cssSelector  );
		driver.findElement(By.cssSelector("#logoutLink")).click();	
		
	}

}
 