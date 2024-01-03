package org.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeEx2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		 driver.findElement(By.cssSelector("#loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement selectedOpt = driver.findElement(By.cssSelector(".content.tasks"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOf(selectedOpt));
		selectedOpt.click();
		driver.findElement(By.xpath("//div[text()=\"Add New\"]")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		WebElement popUp=driver.findElement(By.xpath("//span[text()='Create New Customer']"));
		wt.until(ExpectedConditions.visibilityOf(popUp));
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Customer3");
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Customer3's Description");
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		
		String custName="Customer3";
		// Hardcoded  runtime Xpath
//		WebElement notificatonMsg=driver.findElement(By.xpath("//span[text()=\"Customer 'Customer3' has been created\"]"));
		//Expert RunTime Xpath
		WebElement notificatonMsg=driver.findElement(By.xpath("//span[text()=\"Customer '" + custName +"' has been created\"]"));
//		WebElement notificatonMsg=driver.findElement(By.xpath("//span[text()=\"Customer'"+ custName +"'has been created\"]"));
			if(notificatonMsg.isDisplayed()) {
				System.out.println("Notification msg is Displayed");
		}else {
			System.out.println("No msg Displayed");
		}
		
	}

}
