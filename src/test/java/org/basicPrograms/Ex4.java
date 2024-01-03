package org.basicPrograms;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utilities.BaseUtility;

public class Ex4 {

	public static void main(String[] args) {
//		Ex4 obj= new Ex4();
//		obj.Practice1();
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("Chrome","http://localhost:90/login.do");
		WebElement bName=driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.cssSelector(".textField.pwdfield"));
		WebElement logInBtn=driver.findElement(By.cssSelector("#loginButton>div"));

		bName.sendKeys("admin");
		pwd.sendKeys("manager");
		logInBtn.click();
		WebElement enterTimeTrack=driver.findElement(By.cssSelector(".secondLevelNavigationItem.selected"));
		System.out.println("Enter TimeTrack Selected= "+enterTimeTrack.isSelected());
//		WebElement logOutBtn=driver.findElement(By.cssSelector("#logoutLink"));
//		logOutBtn.click();
	 
	}
	public void Practice1() {
//		driver.manage().window().maximize();
	ChromeOptions options=new ChromeOptions();
    options.addArguments("--disable-notifications");
    options.addArguments("start-maximized");
	ChromeDriver driver=new ChromeDriver(options);
    driver.get("https://www.google.com");
	}

}
