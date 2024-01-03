package org.dropdownHandlingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx2 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("ch", "https://demoqa.com/select-menu");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        bu.scrollByPageDown(driver, 1);
		WebElement singleSele=driver.findElement(By.cssSelector("#oldSelectMenu"));  //1 step
//		bu.scrollByJs(driver, singleSele);
		Select sel=new Select(singleSele);   // 2 step
		List<WebElement> allOptions=sel.getOptions();
		ArrayList<String> actArr=bu.getTextOfAllElements(allOptions);
		String[] str={"Red","Blue","Green","Yellow","Purple","Black",
				"White","Voilet","Indigo","Magenta","Aqua"};
		//convert array into arrayList
		List<String>expColours=Arrays.asList(str);
		System.out.println("verifyAllColors: "+actArr.containsAll(expColours));
	
	}

}
