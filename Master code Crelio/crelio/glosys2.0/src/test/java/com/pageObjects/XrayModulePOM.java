package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XrayModulePOM {
	private static XrayModulePOM xrayModulePOM;

	private XrayModulePOM() {

	}

	public static XrayModulePOM getInstance() {
		if (xrayModulePOM == null) {
			xrayModulePOM = new XrayModulePOM();
		}

		return xrayModulePOM;

	}

	// Click The Xray - chennai Option
	@FindBy(xpath = "(//mat-option)[4]")
	private WebElement labSupervisorOption;

	public void clickTheXray() {
		labSupervisorOption.click();
	}

	// Get The Xray - chennai Option
	@FindBy(xpath = "//mat-select[@formcontrolname='rolename']")
	private WebElement getLabSeniorOption;

	public String getTheXray() {
		return getLabSeniorOption.getText();
	}

	// Click The MOH Fit

	@FindBy(xpath = "(//a[contains(text(),'MOH Fit')])[1]")
	private WebElement MOHFit;

	public void clickTheMOHFit() {
		MOHFit.click();
	}

	// Click The Qc Reject

	@FindBy(xpath = "(//a[contains(text(),'QC Reject')])")
	private WebElement qcReject;

	public void clickTheQcReject() {
		qcReject.click();
	}

	@FindBy(xpath = "(//a[contains(text(),'QC Accept')])")
	private WebElement qcAccept;

	public void clickQcAccept() {
		qcAccept.click();
	}
	// Notes

	@FindBy(xpath = "//input[@formcontrolname='notes']")
	private WebElement oneComment;

	public void enterTheNotes(String notes) {
		oneComment.sendKeys(notes);
	}

	// Click The Validate Button

	@FindBy(xpath = "//button[contains(text(),'Validate')]")
	private WebElement validate;

	public void clickTheValidateButton() {
		validate.click();
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Close')]")
	private WebElement close;

	public void closeTheDownPopUp() {
		close.click();
	}
	
	// Click The save Button


	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement save;

	public void clickTheSaveButton() {
		save.click();
	}

	// Moh Fit Ref
	@FindBy(xpath = "(//a[contains(text(),'MOH Fit')])[2]")
	private WebElement MOHFitRef;

	public void clickTheMOHFitRef() {
		MOHFitRef.click();
	}

	// result
	@FindBy(xpath = "(//p)[12]")
	private WebElement result;

	public String getTheResult() {
		return result.getText();
	}

	// Level
	@FindBy(xpath = "(//p)[13]")
	private WebElement level;

	public String getTheLevel() {
		return level.getText();
	}

	// Review Date
	@FindBy(xpath = "(//p)[14]")
	private WebElement reviewData;

	public String getTheReviewDae() {
		return reviewData.getText();
	}

	// Referral
	@FindBy(xpath = "(//p)[15]")
	private WebElement referral;

	public String getTheReferral() {
		return referral.getText();
	}

}
