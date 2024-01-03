package org.POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPages2 {
	/*
	@FindBy(id = "username")
	private WebElement userNameField;
	@FindBy(css = ".textField.pwdfield")
	private WebElement passwordField;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepMeLogInChkBox;
	@FindBy(id = "loginButton")
	private WebElement logInBtn;
	@FindBy(css = "#logoContainer img")
	private List<WebElement> loginPagesLogo;
	@FindBy(css = "#logoutLink")
	private WebElement logOutBtn;

	public LogInPages2(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public Boolean isUserNameDisplayed() {
		Boolean flag = userNameField.isDisplayed();
		return flag;
	}

	public Boolean isPasswordFieldDisplayed() {
		return passwordField.isDisplayed();
	}

	public Boolean iskeepMeLogInChkBoxDisplayed() {
		return keepMeLogInChkBox.isDisplayed();
	}

	public Boolean islogInBtnDisplayed() {
		return logInBtn.isDisplayed();
	}

	public Boolean isloginPagesLogoDisplayed() {
		for (int i = 0; i < loginPagesLogo.size(); i++) {
			if (!loginPagesLogo.get(i).isDisplayed()) {
				return false;
			}
		}
		return true;

	}

	public void enterUserName(String uName) {
		userNameField.sendKeys(uName);
	}

	public void enterPassword(String pwd) {
		passwordField.sendKeys(pwd);
	}

	public void clickOnLogInBtn() {
		logInBtn.click();
	}

	public void clickOnLogOutBtn() {
		logOutBtn.click();
	}*/
}
