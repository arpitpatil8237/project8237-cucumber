package org.basicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Ex1 {
	public static void main(String[] args) {
//		System.setProperty("Key", "Path of Driver");
		//Way 1 HardCoded path
//		System.setProperty("webdriver.gecko.driver", "D://Acceleration//Workspace//Aug_13_Selenium//Drivers//geckodriver.exe/");
//		FirefoxDriver driverFF=new FirefoxDriver();
		
		//Way 2  
		String path=System.getProperty("user.dir");
//		System.out.println("Path :"+path);
		System.setProperty("path", "System.getProperty(\"user.dir\")"+"\\drivers\\chromedriver.exe");
		//Way 3 
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		ChromeDriver driverch=new ChromeDriver(options);   //opens the browser
		 
//		Edge Browser
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		   //opens the browsers
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("start-maximized");
		EdgeDriver driverEdge=new EdgeDriver(option);
		//Firefox Driver
//		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
//		FirefoxDriver driverFF=new FirefoxDriver();   //opens the browser
		
		
	}
	


}
