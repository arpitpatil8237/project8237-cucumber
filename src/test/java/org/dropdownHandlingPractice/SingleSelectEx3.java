package org.dropdownHandlingPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx3 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "https://demoqa.com/select-menu");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		bu.scrollByPageDown(driver, 1);
		WebElement singleSle = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleSle);
		WebElement ele = sel.getFirstSelectedOption();
		String selectedEle = ele.getText();
		System.out.println("Selected color: " + selectedEle);

//		sel.selectByVisibleText("White");
		sel.selectByValue("9");
//		sel.selectByIndex(5);
		System.out.println("selected color= "+sel.getFirstSelectedOption().getText());
		
	}

}
