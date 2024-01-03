package org.basicPrograms;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
//		Ex2 obj = new Ex2();
//		obj.StartsUp("Edge");
//		BaseUtility bu=new BaseUtility();
//		WebDriver pass=bu.StartUp("ch");
//		System.out.println("pass= "+pass);

	}

	public void StartsUp(String bName) {
		if(bName.equalsIgnoreCase("Chrome") || bName.equalsIgnoreCase("ch")) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driverch=new ChromeDriver();   //opens the browser
		}else if(bName.equalsIgnoreCase("Edge")) {
	
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		EdgeDriver driverEdge=new EdgeDriver();   //opens the browser
		}else if(bName.equalsIgnoreCase("Firefox") || bName.equalsIgnoreCase("ff")) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driverFF=new FirefoxDriver();   //opens the browser
		}
	}

}
