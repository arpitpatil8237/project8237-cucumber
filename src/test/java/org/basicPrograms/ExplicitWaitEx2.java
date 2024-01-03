package org.basicPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ExplicitWaitEx2 {

	public static void main(String[] args)  {
		BaseUtility bu = new BaseUtility();

		WebDriver driver = bu.StartUp("ff", "https://demoqa.com/date-picker");
		driver.findElement(By.cssSelector("#datePickerMonthYearInput")).click();
		String monthYearValue = driver.findElement(By.xpath("//div[text()='December 2023']")).getText();
		System.out.println(monthYearValue);
		String month = monthYearValue.split(" ")[0].trim();
		String year = monthYearValue.split(" ")[1].trim();
		while ((month.equals("December")) && year.equals("2023")) {
			driver.findElement(By.xpath("//button[text()='Next Month']")).click();
			monthYearValue=driver.findElement(By.xpath("//div[text()='January 2024']")).getText();
//			bu.waitForVisibilityOfEle(driver, 3, monthYearValue);

			month = monthYearValue.split(" ")[0].trim();
			year = monthYearValue.split(" ")[1].trim();
			System.out.println(monthYearValue);


		}
		
		WebElement selectedDate=driver.findElement(By.xpath
				("//div[text()='24']"));
		selectedDate.click();
	
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));
		wt.until(ExpectedConditions.stalenessOf(selectedDate));

//		bu.waitForVisibilityOfEle(driver, 3, selectedDate);
		
		
	}

}
