package org.assignment;

import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class ActiTimeEx3 {

	public static void main(String[] args) {
		BaseUtility bu = new BaseUtility();
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

		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/Testdata.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("CustomersList");

			for (int i = 1; i <= s.getLastRowNum(); i++) {
				Row r1 = s.getRow(0);
				for (int k = 0; k < r1.getLastCellNum(); k++) {
					driver.findElement(By.xpath("//div[text()=\"Add New\"]")).click();
					driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
					WebElement popUp = driver.findElement(By.xpath("//span[text()='Create New Customer']"));
					wt.until(ExpectedConditions.visibilityOf(popUp));
					// String allData=bu.getStringCellValueForParticularRow("Testdata.xlsx",
					// "CustomersList", i, k);
					// System.out.println(allData);
					String custName = bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", i, k);
					driver.findElement(By.id("customerLightBox_nameField")).sendKeys(custName);

					String description = bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", i, (k+1));
					driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(description);

					String project = bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", i, (k+2));
					String task = bu.getStringCellValueForParticularRow("Testdata.xlsx", "CustomersList", i, (k+3));

					WebElement checkBox1 = driver
							.findElement(By.cssSelector("#customerLightBox_importProjectsDescriptions"));
					WebElement checkBox2 = driver
							.findElement(By.cssSelector("#customerLightBox_importTasksDescriptions"));

					if (project != "Yes") {
						checkBox1.click();
					}
					if (task != "Yes") {
						checkBox2.click();
					}
					driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
					WebElement notificatonMsg = driver
							.findElement(By.xpath("//span[text()=\"Customer '" + custName + "' has been created\"]"));
					if (notificatonMsg.isDisplayed()) {
						System.out.println("Notification msg is Displayed");
					} else {
						System.out.println("No msg Displayed");
					}
				}
				System.out.println("******");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
