package org.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ActiTimeEx4 {

	public static void main(String[] args) throws InterruptedException {
		BaseUtility bu=new BaseUtility();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriverN1.exe");
		driver.get("http://localhost:90/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		WebElement logIn = driver.findElement(By.cssSelector("#loginButton"));
		logIn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement selectedOpt = driver.findElement(By.cssSelector(".content.tasks"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOf(selectedOpt));
		selectedOpt.click();
		driver.findElement(By.xpath("//div[text()=\"Add New\"]")).click();
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		WebElement popUp=driver.findElement(By.xpath("//span[text()='Create New Customer']"));
		wt.until(ExpectedConditions.visibilityOf(popUp));
		String project=bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", 2, 2);//Yes
		String task=bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", 2, 3);//No
		WebElement checkBox1=driver.findElement(By.cssSelector("#customerLightBox_importProjectsDescriptions"));
		WebElement checkBox2=driver.findElement(By.cssSelector("#customerLightBox_importTasksDescriptions"));
		if(project!="Yes") {
			checkBox1.click();
		} 
		if(task!="Yes") {
			checkBox2.click();
		}

}
//		public class PrintFibonacci {

		/*	public static void printFibonacciSequence(int count) {
				int a = 0;
				int b = 1;
				int c = 1;

				for (int i = 1; i <= count; i++) {
					System.out.print(a + ", ");

		            a = b;
					b = c;
					c = a + b;
				}
			}

			public static void main(String[] args) {
		    	printFibonacciSequence(10);
			}

		}*/
 /*
public void Employee(int id, int age)  
{  
    this(age);  
    this.id = id;  
}  
public void Employee(int id, int age, String name, String address)  
{  
    this(id, age);  
    this.name = name;   
    this.address = address;   
}
}  
public static void main (String args[])  
{  
	ActiTimeEx4 emp = new ActiTimeEx4(105, 22, "Vikas", "Delhi");  
System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);  
emp.Employee(0, 0, null, null);
}  

}*/
//	}
}
