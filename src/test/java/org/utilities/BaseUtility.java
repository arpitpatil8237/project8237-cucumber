package org.utilities;





import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseUtility extends Object  {
	public ArrayList<String> getStringCellValueForRow(String FileName, String sheet, int rowNo) {
		ArrayList<String> ar = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/" + FileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheet);
			Row r1 = s.getRow(rowNo);
//	int lastRow;
						int lastRow = s.getLastRowNum();
			for (int k = 1; k <= lastRow; k++) {
			for (int i = 0; i < r1.getLastCellNum(); i++) {
				Cell c1 = r1.getCell(i);
				ar.add(c1.getStringCellValue());

			}

			} 
			return ar;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public String getStringCellValueForParticularRow(String FileName, String sheet, int RowNo, int CellNo) {
		try {
			FileInputStream fis = new FileInputStream("./ExcelFile/" + FileName);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheet);
			return s.getRow(RowNo).getCell(CellNo).getStringCellValue();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void scrollByJs(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	public void scrollByPageDown(WebDriver driver, int noOfScrolls) {
		WebElement ele = driver.findElement(By.tagName("body"));
		for (int i = 0; i < noOfScrolls; i++) {
			ele.sendKeys(Keys.PAGE_DOWN);
		}
	}

	public void clickByJs(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}

	public ArrayList<String> getAttributeOfAllElement(List<WebElement> allEle) {
		// getAttribute Method inArrayList
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < allEle.size(); i++) {
			// WebElement ele2=allEle.get(i);
			// String str2=ele2.getText();
			// arr.add(str2);
			arr.add(allEle.get(i).getText());
		}
		return arr;
	}

	public ArrayList<String> getTextOfAllElements(List<WebElement> allEles) {
		//// for GetText method in ArrayList
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < allEles.size(); i++) {
			// WebElement ele=allEles.get(i);
			// String str=ele.getText();
			// ar.add(str);
			ar.add(allEles.get(i).getText());
		}
		return ar;
	}

	public void waitForTitleContains(WebDriver driver, long time, String PartialTitle) {
		// waits for Title contains
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.titleContains(PartialTitle));
	}

	public void waitForURLContains(WebDriver driver, long time, String PartialUrl) {
		// waits for URL contains
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.urlContains(PartialUrl));

	}

	public void waitForVisibilityOfEle(WebDriver driver, long time, WebElement ele) {

		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitForVisibilityOfLocatedBy(WebDriver driver, long time, By obj) {
		// explicit by locator
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOfElementLocated(obj));

	}

	public void waitForVisibilityOfLocatedBy(WebDriver driver, long time, String type, String expression) {
		// explicit by locator
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		if (type.equalsIgnoreCase("id")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(expression)));
		} else if (type.equalsIgnoreCase("cssSelector")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(expression)));
		} else if (type.equalsIgnoreCase("class")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(expression)));
		} else if (type.equalsIgnoreCase("linkText")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(expression)));
		} else if (type.equalsIgnoreCase("partialLinkText")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(expression)));
		} else if (type.equalsIgnoreCase("name")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.name(expression)));
		} else if (type.equalsIgnoreCase("xpath")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(expression)));
		} else if (type.equalsIgnoreCase("tagName")) {
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(expression)));
		} else {
			System.out.println("Invalid Locator Type");

		}

	}

	public void waitForVisibilityOfElement(WebDriver driver, long time, String type, String epression) {
		// Explicit Wait for particular WebElement
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		if (type.equalsIgnoreCase("id")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(epression))));
		} else if (type.equalsIgnoreCase("cssSelector")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(epression))));
		} else if (type.equalsIgnoreCase("class")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(epression))));
		} else if (type.equalsIgnoreCase("linkText")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(epression))));
		} else if (type.equalsIgnoreCase("partialLinkText")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(epression))));
		} else if (type.equalsIgnoreCase("name")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(epression))));
		} else if (type.equalsIgnoreCase("xpath")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(epression))));
		} else if (type.equalsIgnoreCase("tagName")) {
			wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(epression))));
		} else {
			System.out.println("Invalid Locator Type");

		}
	}

	public WebDriver StartUp(String bName, String url) {
		// opens browser,maximize,get URL,for Implicit,
		WebDriver driver = null; // upcasting
		if (bName.equalsIgnoreCase("Chrome") || bName.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			// ChromeDriver driverch =new ChromeDriver();
			// driverch.manage().window().maximize();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("start-maximized");

			driver = new ChromeDriver(options);
		} else if (bName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers/edgedriver.exe/");
			// EdgeDriver driveredge=new EdgeDriver();
			// driveredge.manage().window().maximize();
			// EdgeOptions option = new EdgeOptions();
			// option.addArguments("--disable-notifications");
			// option.addArguments("start-maximized");

			driver = new EdgeDriver();
		} else if (bName.equalsIgnoreCase("Firefox") || bName.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriverN1.exe/");
			// FirefoxDriver driverff=new FirefoxDriver();
			// FirefoxOptions option1 = new FirefoxOptions();
			// option1.addArguments("--disable-notifications");
			// option1.addArguments("start-maximized");

			driver = new FirefoxDriver();
			// driverff.manage().window().maximize();

		} else {
			System.out.println("Invalid Browser Name");
		}

		// driver.manage().window().maximize(); // to reduce code retendancy we r
		// upcastingChromeDriver into
		// WebDriver
		driver.get(url);
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //Deprecated
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;
	}
}
