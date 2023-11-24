package com.LabIconpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageObjects.GpModule;

public class LabJuniorCompletedPOM {
	private static LabJuniorCompletedPOM juniorCompletedPOM;

	// Create Private Constrictor
	private LabJuniorCompletedPOM() {
	}

	// GetInstance
	public static LabJuniorCompletedPOM getInstance() {

		if (juniorCompletedPOM == null) {
			juniorCompletedPOM = new LabJuniorCompletedPOM();
		}
		return juniorCompletedPOM;

	}

	// Hemoglobin
	@FindBy(xpath = "//a[@id='complete1']")
	private WebElement Hemoglobin;

	public void clickTheHemoglobinComplete() {
		Hemoglobin.click();
	}

	// BloodGroup
	@FindBy(xpath = "//a[@id='complete2']")
	private WebElement BloodGroup;

	public void clickTheBloodGroupComplete() {
		BloodGroup.click();
	}

	// HIV
	@FindBy(xpath = "//a[@id='complete3']")
	private WebElement HIV;

	public void clickTheHIVComplete() {
		HIV.click();
	}

	// AntiHCV
	@FindBy(xpath = "//a[@id='complete4']")
	private WebElement AntiHCV;

	public void clickTheAntiHCVComplete() {
		AntiHCV.click();
	}

	// HBsAg
	@FindBy(xpath = "//a[@id='complete5']")
	private WebElement HBsAg;

	public void clickTheHBsAgComplete() {
		HBsAg.click();
	}

	// SGOT
	@FindBy(xpath = "//a[@id='complete8']")
	private WebElement SGOT;

	public void clickTheSGOTComplete() {
		SGOT.click();
	}

	// SGPT
	@FindBy(xpath = "//a[@id='complete9']")
	private WebElement SGPT;

	public void clickTheSGPTComplete() {
		SGPT.click();
	}

	// Creatinine
	@FindBy(xpath = "//a[@id='complete47']")
	private WebElement Creatinine;

	public void clickTheCreatinineComplete() {
		Creatinine.click();
	}

	// RPR
	@FindBy(xpath = "//a[@id='complete7']")
	private WebElement RPR;

	public void clickTheRPRComplete() {
		RPR.click();
	}

	// BetaHCG
	@FindBy(xpath = "//a[@id='complete6']")
	private WebElement BetaHCG;

	public void clickTheBetaHCGComplete() {
		BetaHCG.click();
	}

	// Glucose
	@FindBy(xpath = "//a[@id='complete11']")
	private WebElement Glucose;

	public void clickTheGlucoseComplete() {
		Glucose.click();
	}

}
