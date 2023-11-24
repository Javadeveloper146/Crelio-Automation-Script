package com.LabIconpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageObjects.GpModule;

public class LabJuniorRetestPOM {
	private static LabJuniorRetestPOM juniorRetestPOM;

	// Create Private Constrictor
	private LabJuniorRetestPOM() {
	}

	// GetInstance
	public static LabJuniorRetestPOM getInstance() {

		if (juniorRetestPOM == null) {
			juniorRetestPOM = new LabJuniorRetestPOM();
		}
		return juniorRetestPOM;

	}

	// Hemoglobin
	@FindBy(xpath = "//a[@id='retest1']")
	private WebElement Hemoglobin;

	public void clickTheHemoglobinRetest() {
		Hemoglobin.click();
	}
	// BloodGroup
	@FindBy(xpath = "//a[@id='retest2']")
	private WebElement BloodGroup;

	public void clickTheBloodGroupRetest() {
		BloodGroup.click();
	}

	// HIV
	@FindBy(xpath = "//a[@id='retest3']")
	private WebElement HIV;

	public void clickTheHIVRetest() {
		HIV.click();
	}
	// AntiHCV
	@FindBy(xpath = "//a[@id='retest4']")
	private WebElement AntiHCV;

	public void clickTheAntiHCVRetest() {
		AntiHCV.click();
	}
	// HBsAg
	@FindBy(xpath = "//a[@id='retest5']")
	private WebElement HBsAg;

	public void clickTheHBsAgRetest() {
		HBsAg.click();
	}
	// SGOT
	@FindBy(xpath = "//a[@id='retest8']")
	private WebElement SGOT;

	public void clickTheSGOTRetest() {
		SGOT.click();
	}
	// SGPT
	@FindBy(xpath = "//a[@id='retest9']")
	private WebElement SGPT;

	public void clickTheSGPTRetest() {
		SGPT.click();
	}
	// Creatinine
	@FindBy(xpath = "//a[@id='retest47']")
	private WebElement Creatinine;

	public void clickTheCreatinineRetest() {
		Creatinine.click();
	}
	// RPR
	@FindBy(xpath = "//a[@id='retest7']")
	private WebElement RPR;

	public void clickTheRPRRetest() {
		RPR.click();
	}
	//  BetaHCG
	@FindBy(xpath = "//a[@id='retest6']")
	private WebElement BetaHCG;

	public void clickTheBetaHCGRetest() {
		BetaHCG.click();
	}
	// Glucose
	@FindBy(xpath = "//a[@id='retest11']")
	private WebElement Glucose;

	public void clickTheGlucoseRetest() {
		Glucose.click();
	}
}
