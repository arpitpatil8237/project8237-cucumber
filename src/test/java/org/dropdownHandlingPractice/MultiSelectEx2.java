package org.dropdownHandlingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx2 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "https://demoqa.com/select-menu");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		bu.scrollByPageDown(driver, 1);
		WebElement singleSele = driver.findElement(By.id("cars"));
//		bu.scrollByJs(driver, singleSele);
		// for multiple select in Dropdown
		Select sel = new Select(singleSele);
//		sel.selectByVisibleText("Volvo");
//		sel.selectByVisibleText("Saab");
//		sel.selectByValue("opel");
//		sel.selectByIndex(3);
		int allCars=sel.getOptions().size();
		for(int i=0;i<=allCars;i++) {    //error in condition need to check
			sel.selectByIndex(i);
		}
		List<WebElement> selectOption = sel.getAllSelectedOptions();
		System.out.println("No cars Selected= " + selectOption.isEmpty());
		System.out.println("cars Selected= " + selectOption.size());
		ArrayList<String> selected = bu.getTextOfAllElements(selectOption);
		System.out.println("selected: " + selected);
		sel.deselectAll();

	}

}
