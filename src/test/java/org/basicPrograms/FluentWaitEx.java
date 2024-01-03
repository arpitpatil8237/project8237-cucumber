package org.basicPrograms;

import java.time.Duration;
//import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class FluentWaitEx {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver);
		wt.withTimeout(Duration.ofSeconds(20));
		wt.pollingEvery(Duration.ofMillis(100));
		wt.ignoring(Exception.class);
		// Way 1

//		wt.until(new Function<WebDriver, WebElement>() {

//			@Override
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.cssSelector("#logoutLink"));
//			}

//		});

		// Way 2 (ShowingError)
		WebDriverWait wt2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#logoutLink")));

		driver.findElement(By.cssSelector("#logoutLink")).click();
	}

}
