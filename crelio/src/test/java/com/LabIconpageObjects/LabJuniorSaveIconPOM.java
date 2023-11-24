package com.LabIconpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageObjects.GpModule;

public class LabJuniorSaveIconPOM {
	private static LabJuniorSaveIconPOM juniorSaveIconPOM;

	// Create Private Constrictor
	private LabJuniorSaveIconPOM() {
	}

	// GetInstance
	public static LabJuniorSaveIconPOM getInstance() {

		if (juniorSaveIconPOM == null) {
			juniorSaveIconPOM = new LabJuniorSaveIconPOM();
		}
		return juniorSaveIconPOM;

	}
	// Hemoglobin
		@FindBy(xpath = "//a[@id='save1']")
		private WebElement Hemoglobin;

		public void clickTheHemoglobinSave() {
			Hemoglobin.click();
		}

		// BloodGroup
		@FindBy(xpath = "//a[@id='save2']")
		private WebElement BloodGroup;

		public void clickTheBloodGroupSave() {
			BloodGroup.click();
		}

		// HIV
		@FindBy(xpath = "//a[@id='save3']")
		private WebElement HIV;

		public void clickTheHIVSave() {
			HIV.click();
		}

		// AntiHCV
		@FindBy(xpath = "//a[@id='save4']")
		private WebElement AntiHCV;

		public void clickTheAntiHCVSave() {
			AntiHCV.click();
		}

		// HBsAg
		@FindBy(xpath = "//a[@id='save5']")
		private WebElement HBsAg;

		public void clickTheHBsAgSave() {
			HBsAg.click();
		}

		// SGOT
		@FindBy(xpath = "//a[@id='save8']")
		private WebElement SGOT;

		public void clickTheSGOTSave() {
			SGOT.click();
		}

		// SGPT
		@FindBy(xpath = "//a[@id='save9']")
		private WebElement SGPT;

		public void clickTheSGPTSave() {
			SGPT.click();
		}

		// Creatinine
		@FindBy(xpath = "//a[@id='save47']")
		private WebElement Creatinine;

		public void clickTheCreatinineSave() {
			Creatinine.click();
		}

		// RPR
		@FindBy(xpath = "//a[@id='save7']")
		private WebElement RPR;

		public void clickTheRPRSave() {
			RPR.click();
		}

		// BetaHCG
		@FindBy(xpath = "//a[@id='save6']")
		private WebElement BetaHCG;

		public void clickTheBetaHCGSave() {
			BetaHCG.click();
		}

		// Glucose
		@FindBy(xpath = "//a[@id='save11']")
		private WebElement Glucose;

		public void clickTheGlucoseSave() {
			Glucose.click();
		}

}
