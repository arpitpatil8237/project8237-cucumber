package org.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeEx1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		WebElement logIn = driver.findElement(By.cssSelector("#loginButton"));
		logIn.click();
		WebElement selectedOpt = driver.findElement(By.cssSelector(".content.tasks"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOf(selectedOpt));
		selectedOpt.click();
//		WebElement ele=driver.findElement(By.xpath("//div[text()='Add New']"));
		driver.findElement(By.xpath("//div[text()=\"Add New\"]")).click();
	//	wt.until(ExpectedConditions.visibilityOf(ele));
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		WebElement popUp=driver.findElement(By.xpath("//span[text()='Create New Customer']"));
		wt.until(ExpectedConditions.visibilityOf(popUp));
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer2");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Customer1's Description");
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		WebElement confirmMsg=driver.findElement(By.className("innerHtml"));
		System.out.println(confirmMsg.isDisplayed());
		String txt=confirmMsg.getText();
		System.out.println("msg: "+txt);
	}

}
