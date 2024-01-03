package org.basicPrograms;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class GetTitleEx {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();

		WebDriver driver = bu.StartUp("Chrome", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		//waits for URL contains
//		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wt.until(ExpectedConditions.titleContains("Enter Time-Track"));
		bu.waitForTitleContains(driver,30,"Enter Time-Track");
		String Title = driver.getTitle();
		System.out.println(Title);
		if (Title.equals("actiTIME - Enter Time-Track")) {
			System.out.println("After LOgIn This Title Expected");
		} else {
			System.out.println("LogIN Title is changed");
		}
	}
}