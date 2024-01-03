package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex3 {
	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
//		String url="http://www.google.com";
		WebDriver driver=bu.StartUp("ch","http://localhost:90/login.do");
		System.out.println("Driver= "+driver);
//		driver.get("http://www.google.com");
//		bu.StartUp("ch","http://www.google.com");
//		By useNameField=By.id("username");
//		driver.findElement(useNameField);
		WebElement useNameField= driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.cssSelector(".textField.pwdfield"));
		WebElement logInBtn=driver.findElement(By.cssSelector("#loginButton>div"));
//		WebElement logOut =driver.findElement(By.id("logoutLink"));

		useNameField.sendKeys("admin");
		pwd.sendKeys("manager");
		logInBtn.click();
//		logOut.click();
		
		
		
		
	}

}
