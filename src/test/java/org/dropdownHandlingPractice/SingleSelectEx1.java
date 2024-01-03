package org.dropdownHandlingPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx1 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
		WebDriver driver = bu.StartUp("firefox", "https://demoqa.com/select-menu");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        bu.scrollByPageDown(driver, 1);
		WebElement singleSele=driver.findElement(By.cssSelector("#oldSelectMenu"));  //1 step
//		bu.scrollByJs(driver, singleSele);
		Select sel=new Select(singleSele);   // 2 step
		WebElement selectedEle=sel.getFirstSelectedOption();
		String selectedColour=selectedEle.getText();  //if want in string format get text data
		System.out.println("default selectedColour: "+selectedColour);
		
		List<WebElement> allOptions=sel.getOptions();
//		ArrayList<String> ar=bu.getTextOfAllElements(allOptions);
		ArrayList<String> ar=new ArrayList<String> ();
//		allOptions.
//		System.out.println("allCount: "+ar.size());
	}

}
