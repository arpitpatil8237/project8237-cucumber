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

public class Ex1 {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
//		driver.get("https://demoqa.com/alerts");
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/alerts");
                        //pick up one element
//		WebElement ele = driver.findElement(By.id("alertButton"));
//		WebElement ele = driver.findElement(By.id("confirmButton"));
		WebElement ele = driver.findElement(By.id("promtButton"));
		bu.scrollByJs(driver, ele);
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(6));
		wt.until(ExpectedConditions.visibilityOf(ele));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		ele.click();
		Alert alt = driver.switchTo().alert();
		String txt = alt.getText();
		System.out.println("AlertText=" + txt);
		alt.sendKeys("ARPIT");
		alt.accept();
//		alt.dismiss();
	}

}
