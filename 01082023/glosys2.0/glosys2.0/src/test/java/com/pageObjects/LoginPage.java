package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageObjects.LoginPage;

public class LoginPage {

	// Implement The Design Pattern
	private static LoginPage longinstance;

	// Create Private Constrictor
	private LoginPage() {

	}

	// GetInstance
	public static LoginPage getInstance() {

		if (longinstance == null) {
			longinstance = new LoginPage();
		}
		return longinstance;

	}

//
//	public WebElement getUSERNAME() {
//		return USERNAME;
//	}
//
//	public WebElement getPASSWORD() {
//		return PASSWORD;
//	}
//
//	public WebElement getSIGNIN_BUTTON() {
//		return SIGNIN_BUTTON;
//	}

	// Get All Error
	@FindBy(xpath = "//div[@class='login-form']")
	private WebElement GET_ALL_ERROR;

	public String getAllError() {
		return GET_ALL_ERROR.getText();
	}

	@FindBy(xpath = "//*[@formcontrolname='username']")
	private WebElement USERNAME;

	public void enterTheUserName(String uName) {
		USERNAME.sendKeys(uName);
	}

	@FindBy(xpath = "//*[@formcontrolname='password']")
	private WebElement PASSWORD;

	public void enterThePassword(String password) {
		PASSWORD.sendKeys(password);
	}

	// Click The Sign In Button
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	private WebElement SIGNIN_BUTTON;

	public void clickTheSignInButton() {
		SIGNIN_BUTTON.click();
	}

	// Username Is required Get Text
	@FindBy(xpath = "//mat-error[contains(text(),'Username is required')]")
	private WebElement USER_NAME_REQUIRED_MESSAGE;

	public String userNameRequiredErrorMessage() {
		return USER_NAME_REQUIRED_MESSAGE.getText();
	}

	// Password Is required Get Text
	@FindBy(xpath = "//mat-error[contains(text(),'Password is required')]")
	private WebElement PASSWORD_REQUIRED_MESSAGE;

	public String passwordRequiredErrorMessage() {
		return PASSWORD_REQUIRED_MESSAGE.getText();
	}

	// Get The Username And Password Incorrect Message
	@FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/simple-snack-bar\r\n")
	private WebElement USERNAME_AND_PASSWORD_INCORRECT_TEXT;

	public String getTheIncorrectUsernameAndPasswordMessage() {
		return USERNAME_AND_PASSWORD_INCORRECT_TEXT.getText();
	}

	// Clear The UserName
	public void clearTheUserName() {
		USERNAME.clear();
	}

	// Clear The Password
	public void clearThePassword() {
		PASSWORD.clear();

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage() {
		return ERROR_MESSAGE.getText();

	}

	// Popup Close
	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-button mat-button-base']")
	private WebElement popUP;

	public void clickPopUpClose() {
		popUP.click();
	}

}
