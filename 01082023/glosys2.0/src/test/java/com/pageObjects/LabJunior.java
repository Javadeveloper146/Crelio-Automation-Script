package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabJunior {
	private static LabJunior labJunior;

	// Create Private Constrictor
	private LabJunior() {
	}

	// GetInstance
	public static LabJunior getInstance() {

		if (labJunior == null) {
			labJunior = new LabJunior();
		}
		return labJunior;

	}

	// Click The Lab Junior - chennai Option
	@FindBy(xpath = "//span[contains(text(),'Lab Junior ')]")
	private WebElement CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION;

	public void clickTheLabJuniorChennaiOption() {
		CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION.click();
	}

	// Get The Lab Junior - chennai Option
	@FindBy(xpath = "")
	private WebElement get_THE_LAB_JUNIOR_CHENNAI_OPTION;

	public String getTheLabJuniorChennaiOption() {
		return get_THE_LAB_JUNIOR_CHENNAI_OPTION.getText();
	}

	// Click The Specimen Inscan
	@FindBy(xpath = "//a[contains(text(),'Specimen Inscan')]")
	private WebElement specimenInscan;

	public void clickTheSpecimenInscan() {
		specimenInscan.click();
	}

	// Enter Or Scan The Specimen Number
	@FindBy(xpath = "(//input)[5]")
	private WebElement ScanSpecimenNumber;

	public void scanTheSpecimenNumber(String plasmaAndSerumAndWholeBloodSpecNumber) {
		ScanSpecimenNumber.sendKeys(plasmaAndSerumAndWholeBloodSpecNumber);
	}

	// Click The Scan Button

	@FindBy(xpath = "(//*[@data-icon='ri:barcode-box-line'])[1]")
	private WebElement ScanButton;

	public void clickTheScanButton0() {
		ScanButton.click();
	}

	// Click The Save Button
	@FindBy(xpath = "(//*[contains(@class,'btn btn-primary btn-lg')])[2]")
	private WebElement SAVE_BUTTON;

	public void clickTheSaveButton() {
		SAVE_BUTTON.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[3]")
	private WebElement Save_Button3;

	public void clickTheSaveButton3() {
		Save_Button3.click();
	}
	// Enter The Specimen Number

	@FindBy(xpath = "//input[@formcontrolname='specimen_no']")
	private WebElement anyspecimenNumber;

	public void enterTheSpecimenNumber(String specimenNumber) {
		anyspecimenNumber.sendKeys(specimenNumber);
	}
	public void clearTheSpecimenNumber() {
		anyspecimenNumber.clear();
	}
	public void clearTheSpecimen() {
		anyspecimenNumber.clear();
	}

	@FindBy(xpath = "(//button[contains(text(),'Clear')])")
	private WebElement ClearBtn;
	public void clearTheClearBtn() {
		ClearBtn.click();
	}
	
	// Get lab Id
	@FindBy(xpath = "(//td)[3]")
	private WebElement getLabId;

	public String getTheGetLabId() {
		return getLabId.getText();
	}
	
	@FindBy(xpath = "(//td)[2]")
	private WebElement getLabId1;

	public String getTheGetLabId1() {
		return getLabId1.getText();
	}

	@FindBy(xpath = "(//td)[3]")
	private WebElement getLabId2;

	public String getTheComformatoryGetLabId() {
		return getLabId2.getText();
	}

	// Click The Lab Work List
	@FindBy(xpath = "//*[@data-icon='ci:list-check']")
	private WebElement labWorkList;

	public void clickTheLabWorkist() {
		labWorkList.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Positive')]")
	private WebElement Positive_Result;

	public void clickThePositiveResult() {
		Positive_Result.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Negative')]")
	private WebElement Negative_Result;

	public void clickTheNegativeResult() {
		Negative_Result.click();
	}

	// Enter The Lab Id
	@FindBy(xpath = "//input[@formcontrolname='lab_generation_id']")
	private WebElement enterTheLabId;

	public void enterTheLabId(String labId) {
		enterTheLabId.sendKeys(labId);

	}

	// Click The Edit Option
	@FindBy(xpath = "//*[@data-icon='cil:pencil']")
	private WebElement edit;

	public void clickTheEditButton() {
		edit.click();
	}

	// Click The Search Button
	@FindBy(xpath = "(//button[contains(text(),'Search')])")
	private WebElement search;

	public void clickTheSearchButton() {
		search.click();
	}
	
	

	// Reject
	@FindBy(xpath = "//p[contains(text(),'Reject')]")
	private WebElement Reject;

	public void clickTheReject() {
		Reject.click();
	}

	// Retake

	@FindBy(xpath = "//*[@data-icon='clarity:flask-line']")
	private WebElement Retake;

	public void clickTheRetake() {
		Retake.click();
	}

	// Select Reason
	@FindBy(xpath = "(//mat-select[@formcontrolname='reason'])[2]")
	private WebElement SelcteReason;

	public void clickSelectReason() {
		SelcteReason.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[3]")
	private WebElement Save_Btn;

	public void clickSaveBtnReject() {
		Save_Btn.click();
	}
	// Reject Work List

	@FindBy(xpath = "//*[@data-icon='uil:file-times-alt']")
	private WebElement RejectWorkList;

	public void clickRejectWorkList() {
		RejectWorkList.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])")
	private WebElement Save_Retake;

	public void clickRetakeSave() {
		Save_Retake.click();
	}

	@FindBy(xpath = "(//mat-select[@formcontrolname='retake_reason'])")
	private WebElement RejectWorkListRetakeReason;

	public void clickRejectWorkListRetakeReason() {
		RejectWorkListRetakeReason.click();
	}

	// Click The Clear Button
	@FindBy(xpath = "(//button[contains(text(),'Clear')])[1]")
	private WebElement clear;

	public void clickTheClearButton() {
		clear.click();
	}
	// Enter The Result

	// Hemoglobin
	@FindBy(xpath = "//input[@id='quantity1']")
	private WebElement Haemoglobin;

	public void enterTheHaemoglobinValue(String haemoglobin) {
		Haemoglobin.sendKeys(haemoglobin);
	}

	// Blood Group
	@FindBy(xpath = "//mat-select[@id='quality2']")
	private WebElement BloodGroup;

	public void clickTheBloodGroup() {
		BloodGroup.click();
	}

	// Click NegativeOption
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement NegativeOption;

	public void clickTheNegativeOption() {
		NegativeOption.click();
	}

	// Click Positive Option
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement positiveOption;

	public void clickThePositiveOption() {
		positiveOption.click();
	}

	// Click Indeterminate Option
	@FindBy(xpath = "(//mat-option[@role='option'])[3]")
	private WebElement indeterminateOption;

	public void clickTheIndeterminateOption() {
		indeterminateOption.click();
	}

	// Click The Non Reactive Option
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement NonReactive;

	public void clickTheNonReactive() {
		NonReactive.click();
	}

	// HIV
	@FindBy(xpath = "//mat-select[@id='quality3']")
	private WebElement HIV;

	public void clickTheHIV() {
		HIV.click();
	}

	// Anti HCV
	@FindBy(xpath = "//mat-select[@id='quality4']")
	private WebElement antiHCV;

	public void clickTheAntiHCV() {
		antiHCV.click();
	}

	// HBsAg
	@FindBy(xpath = "//mat-select[@id='quality5']")
	private WebElement hbsAg;

	public void clickTheHBsAg() {
		hbsAg.click();
	}

	// SGOT
	@FindBy(xpath = "//input[@id='quantity8']")
	private WebElement sgot;

	public void enterTheSGOTValue(String sgotValue) {
		sgot.sendKeys(sgotValue);
	}

	// SGPT
	@FindBy(xpath = "//input[@id='quantity9']")
	private WebElement sgpt;

	public void enterTheSGPTValue(String sgptValue) {
		sgpt.sendKeys(sgptValue);
	}

	// Creatinine
	@FindBy(xpath = "//input[@id='quantity47']")
	private WebElement creatinine;

	public void enterTheCreatinine(String creatinineValue) {
		creatinine.sendKeys(creatinineValue);
	}

	// RPR
	@FindBy(xpath = "//mat-select[@id='quality7']")
	private WebElement RPR;

	public void clickTheRPR() {
		RPR.click();
	}

	// Beta HCG
	@FindBy(xpath = "//mat-select[@id='quality6']")
	private WebElement betaHCG;

	public void clickTheBetaHCG() {
		betaHCG.click();
	}

	// Glucose
	@FindBy(xpath = "//input[@id='quantity11']")
	private WebElement glucose;

	public void enterTheGlucose(String glucoseValue) {
		glucose.sendKeys(glucoseValue);
	}

//-------------------Retest----------------

	// Haemoglobin Retest
	@FindBy(xpath = "(//*[@data-icon='ep:refresh-left'])[1]")
	private WebElement haemoglobinRetest;

	public void clickTheHaemoglobinRetest() {
		haemoglobinRetest.click();
	}

	// HIv
	@FindBy(xpath = "(//*[@data-icon='ep:refresh-left'])[3]")
	private WebElement hivRetest;

	public void clickTheHIVRetest() {
		hivRetest.click();
	}

// -------------Save Option -------

	// Haemoglobin Retest
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[1]")
	private WebElement haemoglobinSave;

	public void clickTheHaemoglobinSave() {
		haemoglobinSave.click();
	}

	// Haemoglobin Retest
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[3]")
	private WebElement hivSave;

	public void clickTheHIVSave() {
		hivSave.click();
	}

// ----View --------------
	// Haemoglobin view
	@FindBy(xpath = "(//*[@data-icon='bi:eye'])[1]")
	private WebElement haemoglobinView;

	public void clickTheHaemoglobinView() {
		haemoglobinView.click();
	}

	// ------- ViewedSave----------
	// Haemoglobin view
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])[13]")
	private WebElement haemoglobinViewedSave;

	public void clickTheHaemoglobinViewedSave() {
		haemoglobinViewedSave.click();
	}

	// -------------------- Retake-----------------
	// Click The Retake
	// Haemoglobin
	@FindBy(xpath = "(//*[@data-icon='clarity:flask-line'])[1]")
	private WebElement haemoglobinRetake;

	public void clickTheHaemoglobinRetake() {
		haemoglobinRetake.click();
	}

	// HIV Retake
	@FindBy(xpath = "(//*[@data-icon='clarity:flask-line'])[3]")
	private WebElement hivRetake;

	public void clickTheHivRetake() {
		hivRetake.click();
	}

	// Reason
	@FindBy(xpath = "(//*[@formcontrolname='retake_reason'])")
	private WebElement reason;

	public void clickTheReason() {
		reason.click();
	}
	// Save

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement save;

	public void clickTheSave() {
		save.click();
	}

	// Click The Submit for first review
	@FindBy(xpath = "//a[contains(text(),'Submit for First Review')]")
	private WebElement submitForFirstReview;

	public void clickThesubmitForFirstReview() {
		submitForFirstReview.click();
	}

	// Referral Condition
	// Click The External Pending
	@FindBy(xpath = "(//mat-option[@role='option'])[4]")
	private WebElement exterPending;

	public void clickTheExternalPending() {
		exterPending.click();
	}

	// Click The Map Barcode
	@FindBy(xpath = "//a[contains(text(),'Map Barcode')]")
	private WebElement mapBarcode;

	public void clickTheMapBarcode() {
		mapBarcode.click();
	}

	// Enter the Scan Specimen Number
	@FindBy(xpath = "(//input)[6]")
	private WebElement scanSpecimenNumber;

	public void enterTheMapBarcodeScanSpecimenNumberInRetest(String retestScanSpecimenNumber) {
		scanSpecimenNumber.sendKeys(retestScanSpecimenNumber);
	}

	// Click The Map Barcode Save Button

	@FindBy(xpath = "(//button[@type='submit'])[4]")
	private WebElement mapBarcodeSave;

	public void clickTheMapBarcodeSave() {
		mapBarcodeSave.click();
	}

	@FindBy(xpath = "// span[contains(text(),'select qualitative type')]")
	private WebElement HBsAg;

	public void clickTheHbsagInternalResult() {
		HBsAg.click();
	}

	@FindBy(xpath = "//input[@id='quantity55']")
	private WebElement Titer;

	public void enterTheTiterValue(String titerValue) {
		Titer.sendKeys(titerValue);
	}
	
	@FindBy(xpath = "//span[contains(text(),'select qualitative type')]")
	private WebElement selectQualitativeType;

	public void clickTheSelectQualitativeType() {
		selectQualitativeType.click();
	}
	@FindBy(xpath = "//a[@id='complete53']")
	private WebElement HBsAgConfirmation;

	public void clickTheHbsAgConformation() {
		HBsAgConfirmation.click();
	}

	@FindBy(xpath = "//a[@id='complete55']")
	private WebElement TiterValue;

	public void clickTheTiterCompleted() {
		TiterValue.click();
	}

	@FindBy(xpath = "//a[@id='complete56']")
	private WebElement TPHA;

	public void clickTheTPHACompleted() {
		TPHA.click();
	}
	
	
	@FindBy(xpath = "//*[@data-icon='akar-icons:circle-check']")
	private WebElement completedButton;

	public void clickTheCompletedButton() {
		completedButton.click();
	}
	@FindBy(xpath = "//*[@data-icon='uil:file-times-alt']")
	private WebElement Reject_Worklist;

	public void clickTheRejectWorklist() {
		Reject_Worklist.click();
	}
	
	
}
