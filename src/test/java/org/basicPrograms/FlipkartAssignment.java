package org.basicPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FlipkartAssignment {

	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("ch","https://www.flipkart.com/");
		
//		bu.waitForVisibilityOfElement(driver, 30, "cssSelector", "._1_3w1N");
//		WebElement logInBtn=driver.findElement(By.cssSelector("._1_3w1N"));
		
		WebElement userName=driver.findElement(By.cssSelector("._2IX_2-.VJZDxU"));
		WebElement pwd=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement logInBtn=driver.findElement(By.cssSelector("._2KpZ6l._2HKlqd._3AWRsL"));
		logInBtn.click();
//		bu.waitForVisibilityOfElement(driver, 30, "cssSelector", "._2KpZ6l._2HKlqd._3AWRsL._1_3w1N");
		
		userName.sendKeys("8237174170");
		pwd.sendKeys("");
		logInBtn.click();
	}

}
