package org.dropdownHandlingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class WithoutSelectEx2 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		WebElement ele=driver.findElement(By.tagName("body"));
//		ele.sendKeys(Keys.PAGE_DOWN);
		bu.scrollByPageDown(driver, 1);
		WebElement sel = driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[3]"));
//		bu.scrollByJs(driver, sel);     //scroll at particular web element thats why sel
		sel.click();
		driver.findElement(By.cssSelector(".css-26l3qy-menu>div>div:first-child")).click();       //green
		driver.findElement(By.cssSelector(".css-26l3qy-menu>div>div:nth-child(2)")).click();     //blue
//		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", ".css-26l3qy-menu>div>div:nth-child(2)");
//		driver.findElement(By.cssSelector(".css-26l3qy-menu>div>div:nth-child(3)")).click();     //black
//		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", ".css-26l3qy-menu>div>div:nth-child(3)");
		driver.findElement(By.cssSelector(".css-26l3qy-menu>div>div:last-child")).click(); // red
//		bu.waitForVisibilityOfLocatedBy(driver, 5, "cssSelector", ".css-26l3qy-menu>div>div:nth-child(4)");
		//Error found prints Black instead blue
	}

}
