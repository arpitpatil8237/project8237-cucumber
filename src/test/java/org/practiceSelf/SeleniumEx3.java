package org.practiceSelf;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class SeleniumEx3 {
	public static void main(String[] args)  {
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("ff", "https://www.makemytrip.com/");
//		WebElement alertEle=driver.findElement(By.cssSelector("#second-img"));
//		bu.waitForVisibilityOfEle(driver, 5, alertEle);

//		WebElement alertEle2=driver.findElement(By.xpath("//div[@class=\"wrapper\"]//a[@class='close']"));
//		bu.waitForVisibilityOfEle(driver, 3, alertEle2);
//		alertEle2.click();
//		WebElement ele=driver.findElement(By.xpath("//label[@for='fromCity']"));
		WebElement ele=driver.findElement(By.xpath("//label[@for='toCity']"));

		bu.waitForVisibilityOfEle(driver, 10, ele);
		ele.click();
        List<WebElement> options = driver.findElements(By.xpath("//li[starts-with(@id,'react-autowhatever-1')]"));
        System.out.println(options.isEmpty());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String attriValue=option.getAttribute("data-suggestion-index");
           System.out.println(options.isEmpty());
            System.out.println(attriValue);

        }
		
	}
}
