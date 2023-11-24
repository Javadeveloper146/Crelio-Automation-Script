package com.LabIconpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabJuniorEyeOrViewIcon {
	private static LabJuniorEyeOrViewIcon juniorEyeOrViewIcon;

	// Create Private Constrictor
	private LabJuniorEyeOrViewIcon() {
	}

	// GetInstance
	public static LabJuniorEyeOrViewIcon getInstance() {

		if (juniorEyeOrViewIcon == null) {
			juniorEyeOrViewIcon = new LabJuniorEyeOrViewIcon();
		}
		return juniorEyeOrViewIcon;

	}

	
	
	// Hemoglobin
		@FindBy(xpath = "//input[@id='quantity1']")
		private WebElement Haemoglobin;

		public void enterTheHaemoglobinValue() {
			Haemoglobin.isDisplayed();
		}

		// Blood Group
		@FindBy(xpath = "//div[@id='mat-select-value-129']")
		private WebElement BloodGroup;

		public void clickTheBloodGroup() {
			BloodGroup.click();
		}

		// HIV
		@FindBy(xpath = "//div[@id='mat-select-value-131']")
		private WebElement HIV;

		public void clickTheHIV() {
			HIV.click();
		}

		// Anti HCV
		@FindBy(xpath = "//div[@id='mat-select-value-133']")
		private WebElement antiHCV;

		public void clickTheAntiHCV() {
			antiHCV.click();
		}

		// HBsAg
		@FindBy(xpath = "//div[@id='mat-select-value-135']")
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
		@FindBy(xpath = "//div[@id='mat-select-value-137']")
		private WebElement RPR;

		public void clickTheRPR() {
			RPR.click();
		}
		
		// Beta HCG
		@FindBy(xpath = "//div[@id='mat-select-value-139']")
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
}
