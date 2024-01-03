package org.dropdownHandlingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx1 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "https://demoqa.com/select-menu");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		bu.scrollByPageDown(driver, 1);
		WebElement singleSele = driver.findElement(By.id("cars"));
//		bu.scrollByJs(driver, singleSele);
		Select sel = new Select(singleSele);
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		sel.selectByValue("opel");
		sel.selectByIndex(3);
		// for multiple select in Dropdown
		List<WebElement> selectOption = sel.getAllSelectedOptions();
		System.out.println("No cars Selected= " + selectOption.isEmpty());
		System.out.println("cars Selected= " + selectOption.size());
		ArrayList<String> selected = bu.getTextOfAllElements(selectOption);
		System.out.println("selected: " + selected);
//		sel.deselectByVisibleText("Volvo");
//		sel.deselectByVisibleText("Saab");
//		sel.deselectByValue("opel");
//		sel.deselectByIndex(3);
		sel.deselectAll();

	}

}
