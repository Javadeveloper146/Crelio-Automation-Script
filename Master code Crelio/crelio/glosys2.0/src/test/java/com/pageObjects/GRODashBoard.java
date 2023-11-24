package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GRODashBoard {
	// Implement The Design Pattern
	private static GRODashBoard groDashBoard;

	// Create Private Constrictor
	private GRODashBoard() {

	}

	// GetInstance
	public static GRODashBoard getInstance() {

		if (groDashBoard == null) {
			groDashBoard = new GRODashBoard();
		}
		return groDashBoard;

	}

	// Error
	@FindBy(xpath = "//mat-error")
	private WebElement error;

	public boolean getError() {
		return error.isDisplayed();

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error[@classname='absolute-error']")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage() {
		return ERROR_MESSAGE.getText();

	}

	public boolean checkTheCounterError() {
		return ERROR_MESSAGE.isDisplayed();

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error[@aria-atomic='true']")
	private WebElement ERROR_visaNumber;

	public boolean getErrorMessageforvisa() {
		return ERROR_visaNumber.isDisplayed();

	}

	// Click the Role Selction
	@FindBy(xpath = "//mat-select[@formcontrolname='rolename']")
	private WebElement CLICK_THE_ROLE_SELECTION;

	public void clickTheRoleSelction() {
		CLICK_THE_ROLE_SELECTION.click();
	}

	// Click The GRO- Chennai Option
	@FindBy(xpath = "//span[contains(text(),'GRO ')]")
	private WebElement CLICK_THE_GRO_CHENNAI_OPTION;

	public void clickTheGROChennaiOption() {
		CLICK_THE_GRO_CHENNAI_OPTION.click();
	}

	// Get The Role Selction
	// Click the Role Selction
	@FindBy(xpath = "//mat-select[@formcontrolname='rolename']")
	private WebElement GET_THE_ROLE_SELECTION;

	public String GetTheRoleSelction() {
		return GET_THE_ROLE_SELECTION.getText();
	}

	// Click The Proceed Button
	@FindBy(xpath = "//span[contains(text(),'Proceed')]")
	private WebElement CLICK_THE_PROCEED_BUTTON;

	public void clickTheProceedButton() {
		CLICK_THE_PROCEED_BUTTON.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Islamabad Division')])")
	private WebElement State;

	public void clickTheState() {
		State.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Karachi Division ')])")
	private WebElement Karachi;

	public void clickTheKarachi() {
		Karachi.click();
	}

	// Click The Select Counter
	@FindBy(xpath = "//mat-select[@formcontrolname='counter']")
	private WebElement CLICK_THE_SELECT_COUNTER;

	public void clickTheSelectCounter() {
		CLICK_THE_SELECT_COUNTER.click();
	}
	@FindBy(xpath = "//mat-select[@formcontrolname='counter']")
	private WebElement counterStatus;

	public String getTheCounterStatus() {
	return	counterStatus.getText();
	}
	
	// Counter
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement Counter;

	public String getTheCounter() {
		return Counter.getText();
	}

	public void clickTheCounter() {
		Counter.click();
	}

	public void clickFirstDropDownOption() {
		Counter.click();
	}

	// Click The Counter "01" Option
	@FindBy(xpath = "//span[contains(text(),'Counter -  01')]")
	private WebElement CLICK_THE_COUNTER_ONE_OPTION;

	public void clickTheCounterOneOption() {
		CLICK_THE_COUNTER_ONE_OPTION.click();
	}

	// Click The Counter "02" Option
	@FindBy(xpath = "//span[contains(text(),'Counter -  02')]")
	private WebElement CLICK_THE_COUNTER_TWO_OPTION;

	public void clickTheCounterTwoOption() {
		CLICK_THE_COUNTER_TWO_OPTION.click();
	}

	// Click The Counter "03" Option
	@FindBy(xpath = "//span[contains(text(),'Counter -  03')]")
	private WebElement CLICK_THE_COUNTER_THREE_OPTION;

	public void clickTheCounterThreeOption() {
		CLICK_THE_COUNTER_THREE_OPTION.click();
	}

	// Get The Choose Select Counter details
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement GET_THE_CHOOSE_COUNTER;

	public String getTheChooseTheCounterDetails() {
		return GET_THE_CHOOSE_COUNTER.getText();
	}

	// Click The Select Button
	@FindBy(xpath = "//button[contains(text(),'Select')]")
	private WebElement CLICK_THE_SELECT_BUTTON;

	public void clickTheSelectButton() {
		CLICK_THE_SELECT_BUTTON.click();
	}

	// Get The mat Error Message
	@FindBy(xpath = "//mat-error")
	private WebElement GET_THE_MAT_ERROR_IN_VISA;

	public String getTheMatErrorInVisa() {
		return GET_THE_MAT_ERROR_IN_VISA.getText();
	}

	// Enter The Visa Application Number
	@FindBy(xpath = "//input[@placeholder='Visa Application Number *']")
	private WebElement ENTER_THE_VISA_APPLICATION_NUMBER;

	public void enterTheVisaApplicationNumber(String visaNumber) {
		ENTER_THE_VISA_APPLICATION_NUMBER.sendKeys(visaNumber);
	}

	// Click the Validate VisaNumber Button
	@FindBy(xpath = "//button[contains(text(),'Validate VN')]")
	private WebElement CLICK_THE_VALIDATE_VN_BUTTON;

	public void clickTheValidateVNButton() {
		CLICK_THE_VALIDATE_VN_BUTTON.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Regenerate Token')]")
	private WebElement RegenToken;

	public void clickTheRegenToken() {
		RegenToken.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Referral Call Log')]")
	private WebElement ReferalCallLog;

	public void clickTheReferralCallLog() {
		ReferalCallLog.click();
	}

	// Click The Finger Print Skip Button
	@FindBy(xpath = "//button[contains(text(),'Skip')]")
	private WebElement CLICK_THE_FINGERPRINT_SKIP_BUTTON;

	public void clickTheFingerPrintSkipButton() {
		CLICK_THE_FINGERPRINT_SKIP_BUTTON.click();
	}

	// Click The Call Center Referral Log
	// Call Center Referral Log
	@FindBy(xpath = "(//a)[9]")
	private WebElement callCenterReferralLog;

	public void clickTheCallCenterReferralLog() {
		callCenterReferralLog.click();
	}
	// Enter The Visa Number

	@FindBy(xpath = "//input[@formcontrolname='visa_number']")
	private WebElement visaNumber;

	public void enterTheVisaNumberInCallCenter(String visaNumberOnBased) {
		visaNumber.sendKeys(visaNumberOnBased);
	}

	// Click The Phone Icon

	@FindBy(xpath = "(//a)[10]")
	private WebElement callIcon;

	public void clickTheCallIcon() {
		callIcon.click();
	}
	// Click The Answer Opion

	@FindBy(xpath = "(//a)[12]")
	private WebElement answer;

	public void clickTheAnswerOption() {
		callIcon.click();
	}

	// Click The Preferred Language
	@FindBy(xpath = "//span[contains(text(),'Select preferred language speak')]")
	private WebElement preferredLanguage;

	public void clickThePreferredLanguage() {
		preferredLanguage.click();
	}

	// Click The Inbound
	@FindBy(xpath = "//span[contains(text(),'Inbound')]")
	private WebElement inbound;

	public void clickTheInbound() {
		inbound.click();
	}

	// Enter The Comments

	@FindBy(xpath = "//textarea[@formcontrolname='comments']")
	private WebElement commentsInCallCenter;

	public void enterTheCommentsInCallCenter(String commentsInCallCenterReferral) {
		commentsInCallCenter.sendKeys(commentsInCallCenterReferral);
	}

	// Click The Save Button
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement saveButtonInCallCenter;

	public void clickTheSaveButton() {
		saveButtonInCallCenter.click();
	}

	// Specimen Transmittal Form
	@FindBy(xpath = "//a[contains(text(),'Specimen Transmittal Form')]")
	private WebElement specimenTranForm;

	public void clickTheSpecimenTransmittalForm() {
		specimenTranForm.click();
	}

	// Click The Specimen Batch

	@FindBy(xpath = "(//td)[2]")
	private WebElement batchId;

	public void ClickTheBatchStaffId() {
		batchId.click();
	}

	@FindBy(xpath = "(//td)[2]")
	private WebElement getBatchId;

	public String getTheBatchStaffId() {
		return getBatchId.getText();
	}

	// Click Print STF

	@FindBy(xpath = "// a[contains(text(),'Print STF')]")
	private WebElement printSTF;

	public void ClickThePrintSTF() {
		printSTF.click();
	}

	// Click The Close

	@FindBy(xpath = "(//button[@class='close'])[2]")
	private WebElement close;

	public void ClickTheClose() {
		close.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'×')])[2]")
	private WebElement closeForSpecimenTran;

	public void clickTheCloseSpeTra() {
		closeForSpecimenTran.click();
	}

	@FindBy(xpath = "//a[contains(text(),'×')]")
	private WebElement PopupClose;

	public void closeThePopUp() {
		PopupClose.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Close')]")
	private WebElement downPopUpClose;

	public void closeTheDownPopUp() {
		downPopUpClose.click();
	}
}