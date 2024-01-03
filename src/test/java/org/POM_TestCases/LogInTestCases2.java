/*
 * package org.POM_TestCases; import org.POM_Pages.LogInPages; import
 * org.openqa.selenium.WebDriver; import
 * org.propertiesFileHandling.ConfigReader; import org.testng.Reporter; import
 * org.testng.annotations.Test; import org.testng.asserts.SoftAssert; import
 * org.utilities.BaseUtility;
 * 
 * public class LogInTestCases2 {
 * 
 * private ConfigReader cr = new ConfigReader(); private Properties prop;
 * private WebDriver driver;
 * 
 * @BeforeSuite public void in_ItBrowser() { BaseUtility bu = new BaseUtility();
 * prop = cr.init_prop(); driver = bu.StartUp(prop.getProperty("bName"),
 * prop.getProperty("url"));
 * 
 * }
 * 
 * @AfterSuite public void tearDown() { //
 * driver.findElement(By.cssSelector("#logoutLink")).click(); driver.quit(); }
 * 
 * @Test(priority = 0) public void verifyLogInPage() {
 * 
 * BaseUtility bu = new BaseUtility(); ConfigReader cr = new ConfigReader();
 * WebDriver driver = bu.StartUp(cr.getTestData("bName"),
 * cr.getTestData("url")); LogInPages lpg = new LogInPages(driver); SoftAssert
 * sa = new SoftAssert(); System.out.println("Starts To Verify");
 * sa.assertTrue(lpg.isUserNameDisplayed(), "uName is NOT Displayed");
 * Reporter.log("uName is Verified");
 * sa.assertTrue(lpg.isPasswordFieldDisplayed(), "password is Not Verified");
 * Reporter.log("password is Verified");
 * sa.assertTrue(lpg.iskeepMeLogInChkBoxDisplayed(),
 * "keepMeLogInChkBox is NOT verified");
 * Reporter.log("keepMeLogInChkBox is Verified");
 * sa.assertTrue(lpg.islogInBtnDisplayed(), "logInBtn is NOT Displayed");
 * Reporter.log("logInBtn is Verified");
 * sa.assertTrue(lpg.isloginPagesLogoDisplayed(),
 * "loginPagesLogo is NOT Displayed");
 * Reporter.log("loginPagesLogo is Verified"); sa.assertAll();
 * Reporter.log("LogIN Page verify successfully");
 * System.out.println("Ends To Verify"); }
 * 
 * @Test public void verifyLogInPageFunctionality() {
 * 
 * BaseUtility bu = new BaseUtility(); ConfigReader cr = new ConfigReader();
 * WebDriver driver = bu.StartUp(cr.getTestData("bName"),
 * cr.getTestData("url")); LogInPages lpg = new LogInPages(driver);
 * System.out.println("Starts To LogIn");
 * lpg.enterUserName(cr.getTestData("uName")); Reporter.log("UserName Entered");
 * lpg.enterPassword(cr.getTestData("pwd")); Reporter.log("Password Entered");
 * lpg.clickOnLogInBtn(); Reporter.log("Click On LogInBtn");
 * System.out.println("Ends To LogIN");
 * 
 * } }
 */