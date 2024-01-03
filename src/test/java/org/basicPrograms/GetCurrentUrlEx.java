package org.basicPrograms;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class GetCurrentUrlEx {

	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("ch","http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		      //waits for URL contains
//		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wt.until(ExpectedConditions.urlContains("http://localhost:90/user/submit_tt.do"));
		bu.waitForURLContains(driver,30,"90/user/submit_tt.do");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("http://localhost:90/user/submit_tt.do")) {
			System.out.println("Expected LogIn Url");
		}else {
			System.out.println("LogInUrl is Changed");
		}
		
	}

}
