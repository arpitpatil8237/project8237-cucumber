package basicMethods.org;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class BasicMethod {

	public static void main(String[] args) {
		BaseUtility bu=new BaseUtility();
		WebDriver driver=bu.StartUp("Ch", "https://demoqa.com/radio-button");
		// 1) isDisplayed Method
		WebElement label=driver.findElement(By.className("mb-3"));
		System.out.println("Is Displayed= "+label.isDisplayed());
		System.out.println("Text= "+label.getText());
		
		//2) isEnabled Method
		WebElement rdoBtn=driver.findElement(By.id("yesRadio"));
		System.out.println("RadioBtn= "+rdoBtn.isEnabled());
		WebElement rdoBtn2=driver.findElement(By.id("impressiveRadio"));
		System.out.println("RadioBtn= "+rdoBtn2.isEnabled());
		WebElement rdoBtn3=driver.findElement(By.id("noRadio"));
		System.out.println("RadioBtn= "+rdoBtn3.isEnabled());
		
        //3) isSelected Method
		WebElement rdoBtn1=driver.findElement(By.id("yesRadio"));
		//rdoBtn1.click();   if it is sometime not click then go for JavascriptExecutor(Interface)
		bu.clickByJs(driver,rdoBtn1);         // Call By Generic
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()",rdoBtn1);
		System.out.println("RadioBtn= "+rdoBtn1.isSelected());
	
		
		
	}

}
