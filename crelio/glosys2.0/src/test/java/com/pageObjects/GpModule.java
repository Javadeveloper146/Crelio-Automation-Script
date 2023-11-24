package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GpModule {
	private static GpModule gpModule;

	// Create Private Constrictor
	private GpModule() {
	}

	// GetInstance
	public static GpModule getInstance() {

		if (gpModule == null) {
			gpModule = new GpModule();
		}
		return gpModule;

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage() {
		return ERROR_MESSAGE.getText();

	}

	// Selection

	// Click The Select Counter
	@FindBy(xpath = "(//span[contains(text(),'Select Counter')])[2]")
	private WebElement SELECT_COUNTER;

	public void clickTheSelectCounter() {
		SELECT_COUNTER.click();
	}

	// Click The Stemz Gp Option
	@FindBy(xpath = "//span[contains(text(),'STEMZ GP ')]")
	private WebElement NURSE_CHENNAI_OPTION;

	public void clickTheStemzGpChennai() {
		NURSE_CHENNAI_OPTION.click();
	}

	@FindBy(xpath = "(//div[@class='container-fluid'])[2]")
	private WebElement token;

	public String getTheToken() {
		return token.getText();
	}

	public void clickTheToken() {
		token.click();
	}

	//

	@FindBy(xpath = "//span[@title='Close']")
	private WebElement closePopup;

	public void clickThemsgPopUP() {
		closePopup.click();
	}

	// Pop up
	@FindBy(xpath = "(//span[contains(text(),'×')])[6]")
	private WebElement PopClose;

	public boolean getThePopClose() {
		return PopClose.isDisplayed();
	}

	@FindBy(xpath = "(//span[contains(text(),'×')])[6]")
	private WebElement PopClose1;

	public void clicThePopClose() {
		PopClose1.click();
	}

	// Gp Consulation Process
	// Click The Consulation Option
	@FindBy(xpath = "//h4[contains(text(),'Consultation')]")
	private WebElement CONSULTATION;

	public void clicTheConsulationOption() {
		CONSULTATION.click();
	}

	// Click The Normal Radio Button
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[1]")

	private WebElement COLOR_VISION_NORMAL_RADIO_BUTTON;

	public void clickTheColorVisionNormalRadioButton() {
		COLOR_VISION_NORMAL_RADIO_BUTTON.click();
	}

	// Click The Poor Radio Button
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")

	private WebElement poorOptionGp;

	public void clickTheColorVisionPoorRadioButtonInGpModule() {
		poorOptionGp.click();
	}

	// Click The Preset
	// Present OPtion is Normal And Medical History is "No"
	@FindBy(xpath = "//mat-select[@formcontrolname='preset']")
	private WebElement CLICK_THE_PRESET;

	public void clickTheSelectPreset() {
		CLICK_THE_PRESET.click();
	}

	// Get The Perset

	public String getTheSelectPreset() {
		return CLICK_THE_PRESET.getText();
	}

	// Choose The Normal Option
	@FindBy(xpath = "//mat-option[@value='Normal']")
	private WebElement NORMAL_OPTION;

	public void chooseTheNormalOption() {
		NORMAL_OPTION.click();
	}

	// Choose The Normal Option
	@FindBy(xpath = "//mat-option[@value='Abnormal']")
	private WebElement ABNORMAL_OPTION;

	public void chooseTheAbNormalOption() {
		ABNORMAL_OPTION.click();
	}

	// Enter The Systolic Pressure Value
	@FindBy(xpath = "//input[@placeholder='Systolic']")
	private WebElement ENTER_THE_SYSTOLIC_PRESSURE_VALUE;

	public void enterTheSystolicPressureValue(String systolicPressureValue) {
		ENTER_THE_SYSTOLIC_PRESSURE_VALUE.sendKeys(systolicPressureValue);
	}

	// Click The Diastolic Pressure
	@FindBy(xpath = "//input[@placeholder='Diastolic']")
	private WebElement ENTER_THE_DIASTOLIC_PRESSURE_VALUE;

	public void enterTheDiastolicPressureValue(String diastolicPressureValue) {
		ENTER_THE_DIASTOLIC_PRESSURE_VALUE.sendKeys(diastolicPressureValue);
	}

	// Click The Pervious Illness "No" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[6]")
	private WebElement PREVIOUS_ILLNESS_NO;

	public void clickThePerviousIllnessNoOption() {
		PREVIOUS_ILLNESS_NO.click();
	}

	// Click The Did you have your meals in last 10 hours "No" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[8]")
	private WebElement YOUR_MEALS_IN_LAST_10_HOURS_NO;

	public void clickTheYourMealsInLast10LoursNoOPtion() {
		YOUR_MEALS_IN_LAST_10_HOURS_NO.click();
	}

	// Enter The Comments
	@FindBy(xpath = "//textarea[@data-placeholder='Enter comments']")
	private WebElement ENTER_THE_COMMENTS;

	public void enterTheComment(String comments) {
		ENTER_THE_COMMENTS.sendKeys(comments);

	}

	// Click The Psychiatric or Neurological Disorder "No" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[10]")
	private WebElement PSY_NEURO_DISORDER;

	public void clickThePsychiatricOrNeurologicalDisorderNoOption() {
		PSY_NEURO_DISORDER.click();
	}

	// Click The Save Button
	@FindBy(xpath = "//button[@id='save_id']")
	private WebElement SAVE_BUTTON;

	public void clickTheSaveButton() {
		SAVE_BUTTON.click();
	}

	// Negative Script
	// Gp Consulation Process
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement ILLNEES_ERROR;

	public String getTheIllnessError() {
		return ILLNEES_ERROR.getText();
	}

	@FindBy(xpath = "(//mat-error)[2]")
	private WebElement YOUR_MEALS_IN_LAST_10_HOURS;

	public String getTheYourMealsInLast10LoursError() {
		return YOUR_MEALS_IN_LAST_10_HOURS.getText();
	}

	@FindBy(xpath = "(//mat-error)[3]")
	private WebElement PSY_NEURO_DISORDER_ERROR;

	public String getThePsyNeuroDisorderError() {
		return PSY_NEURO_DISORDER_ERROR.getText();
	}

	@FindBy(xpath = "(//mat-error)[4]")
	private WebElement THE_COMMENTS;

	public String getTheCommentsError() {
		return THE_COMMENTS.getText();
	}

	// --------------------------------------------------------------------------------------------
	// Present Option Is Normal And Medical History Is Yes
	// Click The Pervious Illness "No" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[5]")
	private WebElement PREVIOUS_ILLNESS_YES;

	public void clickThePerviousIllnessYesOption() {
		PREVIOUS_ILLNESS_YES.click();
	}

	// Enter The Pervious Illness Details
	@FindBy(xpath = "//input[@placeholder='Previous Illness']")
	private WebElement PREVIOUS_ILLNESS;

	public void enterThePerviousIllnessDetails(String perviosIllness) {
		PREVIOUS_ILLNESS.sendKeys(perviosIllness);
	}

	// Click The Did you have your meals in last 10 hours "Yes" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[7]")
	private WebElement YOUR_MEALS_IN_LAST_10_HOURS_YES;

	public void clickTheYourMealsInLast10LoursYesOPtion() {
		YOUR_MEALS_IN_LAST_10_HOURS_YES.click();
	}

	// Click The Psychiatric or Neurological Disorder "Yes" OPtion
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[9]")
	private WebElement PSY_NEURO_DISORDER_YES;

	public void clickThePsychiatricOrNeurologicalDisorderYESOption() {
		PSY_NEURO_DISORDER_YES.click();
	}

	// Enter The Psychiatric or Neurological Disorder
	@FindBy(xpath = "//input[@placeholder='Psychiatric or Neurological Disorder']")
	private WebElement PSYCHIATRCI_OR_NEUROLOGICAL;

	public void enterThePsychiatrciOrNeurological(String PsychiatrciOrNeurological) {
		PSYCHIATRCI_OR_NEUROLOGICAL.sendKeys(PsychiatrciOrNeurological);
	}

	// Click The Confirm to save Button
	@FindBy(xpath = "(//span[contains(text(),'Yes')])[6]")
	private WebElement YES_BUTTON;

	public void clickTheYesButton() {
		YES_BUTTON.click();
	}

	// Check The referral Row Enable or Disable
	@FindBy(xpath = "(//th)[1]")
	private WebElement referralCreateRow;

	public String chechTheReferralCreateorNot() {
		return referralCreateRow.getText();
	}

	// Click The Go To Feedback
	@FindBy(xpath = "//a[contains(text(),'Go To Feedback')]")
	private WebElement GO_TO_FEEDBACK;

	public void clickTheGoToFeedbackButton() {
		GO_TO_FEEDBACK.click();
	}

	// Click The Referral View Icon
	@FindBy(xpath = "(//a[@class='edit-icon text-primary'])[1]")
	private WebElement REFERRAL_ICON;

	public void clickTheReferralIcon() {
		REFERRAL_ICON.click();
	}

	// Get The Cardiology text
	@FindBy(xpath = "(//td[contains(text(),'Cardiology')])[1]")
	private WebElement CARDIOLOGY_PERVIOUS_REFERRAL_TEXT;

	public String getTheCardiologyPerviousReferralText() {
		return CARDIOLOGY_PERVIOUS_REFERRAL_TEXT.getText();
	}

	// Get The Referrals Created
	@FindBy(xpath = "(//td[contains(text(),'Cardiology')])[2]")
	private WebElement ReferralsCreated;

	public String getTheReferralsCreatedText() {
		return ReferralsCreated.getText();
	}

	// Click The Print Receipt
	@FindBy(xpath = "//a[@routerlink='/gro/gro-referral-call/print-receipt']")
	private WebElement PrintReceipt;

	public void clickThePrintReceipt() {
		PrintReceipt.click();
	}

	// Click The Done Button
	@FindBy(xpath = "//a[contains(text(),'Done')]")
	private WebElement DoneButton;

	public void clickTheDoneButton() {
		DoneButton.click();
	}

	// Click The Collect Feedback
	@FindBy(xpath = "//a[contains(text(),'Collect Feedback')]")
	private WebElement CollectFeedbackButton;

	public void clickTheCollectFeedbackButton() {
		CollectFeedbackButton.click();
	}

	// ___________________________________________________________________________________________________________________________________________________________________
	// Referral Create flow
	// Physician Worklist
	@FindBy(xpath = "(//h3)[2]")
	private WebElement PhysicianWorklist;

	public void clickThePhysicianWorklist() {
		PhysicianWorklist.click();
	}

	// Enter The Visa Number
	@FindBy(xpath = "(//input)[1]")
	private WebElement enterThevisaNumber;

	public void enterTheVisaNumber(String visaNumber) {
		enterThevisaNumber.sendKeys(visaNumber);

	}

	// Click Edit Button

	@FindBy(xpath = "//*[@data-icon='clarity:edit-line']")
	private WebElement ediButton;

	public void clickTheEditButton() {
		ediButton.click();
	}

	// Click The View Icon

	@FindBy(xpath = "(//a[@title='View Documents'])")
	private WebElement viewButton;

	public void clickTheViewButton() {
		viewButton.click();
	}

	// Physician Worklist
	@FindBy(xpath = "//a[contains(text(),'Physician Worklist')]")
	private WebElement physicianWork;

	public void clickThePhysianWorkForAfterRef() {
		physicianWork.click();
	}

	// Enter The visa Number

	@FindBy(xpath = "//input[@data-placeholder='Enter visa number']")
	private WebElement enterThevisaNumberInRererralToBeReported;

	public void enterTheVisaNumberInRererralToBeReported(String visaNumber) {
		enterThevisaNumberInRererralToBeReported.sendKeys(visaNumber);

	}

	@FindBy(xpath = "(//a[@type='submit'])[1]")
	private WebElement search;

	public void clickTheSearchButton() {
		search.click();
	}

	@FindBy(xpath = "//*[@data-icon='clarity:edit-line']")
	private WebElement edit;

	public void clickTheEdit() {
		edit.click();
	}

	@FindBy(xpath = "//input[@data-placeholder='Comments']")
	private WebElement enterTheCommentsForAmbiguity;

	public void enterTheCommentsForAmbiguity(String comments) {
		enterTheCommentsForAmbiguity.sendKeys(comments);

	}

	// click the check Box
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	public void clickTheCheckBox() {
		checkBox.click();
	}

	// Save for Ref
	@FindBy(xpath = "(//button[@type='submit'])")
	private WebElement saveforre;

	public void clickTheSaveForRef() {
		saveforre.click();
	}

	@FindBy(xpath = "//*[@data-icon='charm:tick']")
	private WebElement accept;

	public void clickTheAcceptIcon() {
		accept.click();
	}

	// Click The Save
	@FindBy(xpath = "//a[@title='Save']")
	private WebElement save;

	public void clickTheSaveReferralDocument() {
		save.click();
	}

	// Click The Close Referral
	@FindBy(xpath = "//a[contains(text(),'Close referral')]")
	private WebElement closeReferral;

	public void clickTheCloseReferral() {
		closeReferral.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yes;

	public void clickTheYesOptionInReferralDocument() {
		yes.click();
	}

	// Certificate

	// Physician Worklist
	@FindBy(xpath = "//p[contains(text(),'Referral to be Reported')]")
	private WebElement refferalToBeReport;

	public void clickTheRefferalToBeReport() {
		refferalToBeReport.click();
	}

	// Approval
	// Accept
//-------------Referral Document --------------
	// One
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[1]")
	private WebElement accept1;

	public void clickTheFirstAcceptIcon() {
		accept1.click();
	}

	public boolean getTheFirstAcceptIconStatus() {
		return accept1.isDisplayed();
	}

	// Two
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[2]")
	private WebElement accept2;

	public void clickTheSecondAcceptIcon() {
		accept2.click();
	}

	public boolean getTheSecondAcceptIconStatus() {
		return accept2.isDisplayed();
	}

	// Three
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[3]")
	private WebElement accept3;

	public void clickTheThreeAcceptIcon() {
		accept3.click();
	}

	public boolean getTheThreeAcceptIconStatus() {
		return accept3.isDisplayed();
	}

	// Four
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[4]")
	private WebElement accept4;

	public void clickTheFourAcceptIcon() {
		accept4.click();
	}

	public boolean getTheFourAcceptIconStatus() {
		return accept4.isDisplayed();
	}

	// Five
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[5]")
	private WebElement accept5;

	public void clickTheFiveAcceptIcon() {
		accept5.click();
	}

	public boolean getTheFiveAcceptIconStatus() {
		return accept5.isDisplayed();
	}

	// Six
	@FindBy(xpath = "(//*[@data-icon='charm:tick'])[6]")
	private WebElement accept6;

	public void clickTheSixAcceptIcon() {
		accept6.click();
	}

	public boolean getTheSixAcceptIconStatus() {
		return accept6.isDisplayed();
	}

	// -----Save -------------
	// One
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[1]")
	private WebElement save1;

	public void clickTheSaveOne() {
		save1.click();
	}

	// Two
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[2]")
	private WebElement save2;

	public void clickTheSaveTwo() {
		save2.click();

	}

	// Three
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[3]")
	private WebElement save3;

	public void clickTheSaveThree() {
		save3.click();

	}

	// Four
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[4]")
	private WebElement save4;

	public void clickTheSaveFour() {
		save4.click();

	}

	// Five
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[5]")
	private WebElement save5;

	public void clickTheSaveFive() {
		save5.click();

	}

	// Six
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[6]")
	private WebElement save6;

	public void clickTheSaveSix() {
		save6.click();

	}

	// ------- Cerficate---------------

	// Click The Certificate

	@FindBy(xpath = "//*[@routerlink='/gp/gp-consulation-process/certificate']")
	private WebElement certificate;

	public void clickTheCertificate() {
		certificate.click();

	}
	// Enter The Comments

	@FindBy(xpath = "//textarea[@placeholder='Enter Notes']")
	private WebElement enterTheComments;

	public void enterTheCommentsForCertificate(String comments) {
		enterTheComments.sendKeys(comments);

	}

	// Click The Assigned to
	@FindBy(xpath = "//span[contains(text(),'Assigned To')]")
	private WebElement assignTo;

	public void clickTheAssignedTo() {
		assignTo.click();

	}

	@FindBy(xpath = "//span[contains(text(),'STEMZ GP')]")
	private WebElement assignToStemzGp;

	public void clickTheAssignedToStemzGp() {
		assignToStemzGp.click();

	}

	@FindBy(xpath = "(//span[contains(text(),'MOH')])[1]")
	private WebElement assignToMoh;

	public void clickTheAssignedToMOH() {
		assignToMoh.click();

	}

	// Click The Save
	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement saveForCer;

	public void clickTheSaveCertificate() {
		saveForCer.click();

	}

	@FindBy(xpath = "//*[@data-target='#color-vision-modal']")
	private WebElement ColorVisionRecheck;

	public void clickColorVisionRecheck() {
		ColorVisionRecheck.click();
	}

	// Normal
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[23]")
	private WebElement recheckColorvisionNormal;

	public void clickRecheckColorvisionNormal() {
		recheckColorvisionNormal.click();
	}

	@FindBy(xpath = "(//mat-select[@formcontrolname='color_plate'])[2]")
	private WebElement ColorPlates;

	public void clickColorPlates() {
		ColorPlates.click();
	}
	// Bp recheck

	@FindBy(xpath = "//*[@data-target='#bp-modal']")
	private WebElement BPRecheck;

	public void clickBPRecheck() {
		BPRecheck.click();
	}

	// Systolic

	@FindBy(xpath = "(//input[@formcontrolname='bp_systolic'])[2]")
	private WebElement recheckSystolic;

	public void enterTheRecheckSysyolicValue(String systolicValue) {
		recheckSystolic.sendKeys(systolicValue);

	}

	// Systolic

	@FindBy(xpath = "(//input[@formcontrolname='bp_diastolic'])[2]")
	private WebElement recheckDiastolic;

	public void enterTheRecheckDiastolic(String diastolic) {
		recheckDiastolic.sendKeys(diastolic);

	}

}