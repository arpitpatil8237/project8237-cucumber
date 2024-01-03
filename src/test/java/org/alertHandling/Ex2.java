package org.alertHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class Ex2 {
	// timerAlertButtoN
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
//		driver.get("https://demoqa.com/alerts");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/alerts");
		WebElement ele = driver.findElement(By.id("alertButton"));
		bu.scrollByJs(driver, ele);
		ele.click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());

		Alert alt = driver.switchTo().alert();
		String str = alt.getText();
		System.out.println("alertButton=" + str);
		alt.accept();
//		alt.dismiss();

	}

}
