package org.POM_TestCases;

import java.util.Properties;

import org.POM_Pages.LogInPages2;
import org.openqa.selenium.WebDriver;
import org.propertiesFileHandling.ConfigReader;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseUtility;

public class LogInTestCases1 {

//	private ConfigReader cr = new ConfigReader();
//	private Properties prop;

//	private BaseUtility bu = new BaseUtility();
	/*
	 * @BeforeSuite public void inIt_Obj() { prop = cr.init_prop(); }
	 * 
	 * @AfterSuite public void clear() { // prop.clear();
	 * 
	 * }
	 */

	/*
	 * @BeforeMethod public void in_ItBrowser() {
	 * 
	 * // prop = cr.init_prop(); // driver = bu.StartUp(prop.getProperty("bName"),
	 * prop.getProperty("url"));
	 * 
	 * }
	 * 
	 * @AfterMethod public void tearDown() { // LogInPages2 lpg = new
	 * LogInPages2(driver); // lpg.clickOnLogOutBtn(); // driver.quit(); }
	 */
/*
	@Test(priority = 0)
	public void verifyLogInPage() {
		BaseUtility bu = new BaseUtility();
		ConfigReader cr = new ConfigReader();
		WebDriver driver = bu.StartUp(cr.getTestData("bName"), cr.getTestData("url"));
		LogInPages2 lpg = new LogInPages2(driver);
		SoftAssert sa = new SoftAssert();
		
		System.out.println("Starts To Verify");
		sa.assertTrue(lpg.isUserNameDisplayed(), "uName is NOT Displayed");
		Reporter.log("uName is Verified");
		sa.assertTrue(lpg.isPasswordFieldDisplayed(), "password is Not Verified");
		Reporter.log("password is Verified");
		sa.assertTrue(lpg.iskeepMeLogInChkBoxDisplayed(), "keepMeLogInChkBox is NOT verified");
		Reporter.log("keepMeLogInChkBox is Verified");
		sa.assertTrue(lpg.islogInBtnDisplayed(), "logInBtn is NOT Displayed");
		Reporter.log("logInBtn is Verified");
		sa.assertTrue(lpg.isloginPagesLogoDisplayed(), "loginPagesLogo is NOT Displayed");
		Reporter.log("loginPagesLogo is Verified");
		sa.assertAll();
		Reporter.log("LogIN Page verify successfully");
		System.out.println("Ends To Verify");

	}

	@Test(priority = 1)
	public void verifyLogInPageFunctionality() {
		BaseUtility bu = new BaseUtility();
		ConfigReader cr = new ConfigReader();
		WebDriver driver = bu.StartUp(cr.getTestData("bName"), cr.getTestData("url"));
		LogInPages2 lpg = new LogInPages2(driver);

		System.out.println("Starts To LogIn");
		lpg.enterUserName(cr.getTestData("uName"));
		Reporter.log("UserName Entered");
		lpg.enterPassword(cr.getTestData("pwd"));
		Reporter.log("Password Entered");
		lpg.clickOnLogInBtn();
		Reporter.log("Click On LogInBtn");
		System.out.println("Ends To LogIN");

	}*/
}
