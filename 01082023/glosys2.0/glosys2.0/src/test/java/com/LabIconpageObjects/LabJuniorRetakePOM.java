package com.LabIconpageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pageObjects.GpModule;

public class LabJuniorRetakePOM {

	private static LabJuniorRetakePOM juniorRetakePOM;

	// Create Private Constrictor
	private LabJuniorRetakePOM() {
	}

	// GetInstance
	public static LabJuniorRetakePOM getInstance() {

		if (juniorRetakePOM == null) {
			juniorRetakePOM = new LabJuniorRetakePOM();
		}
		return juniorRetakePOM;

	}

	// Hemoglobin
	@FindBy(xpath = "//a[@id='retake1']")
	private WebElement Hemoglobin;

	public void clickTheHemoglobinRetake() {
		Hemoglobin.click();
	}

	// BloodGroup
	@FindBy(xpath = "//a[@id='retake2']")
	private WebElement BloodGroup;

	public void clickTheBloodGroupRetake() {
		BloodGroup.click();
	}

	// HIV
	@FindBy(xpath = "//a[@id='retake3']")
	private WebElement HIV;

	public void clickTheHIVRetake() {
		HIV.click();
	}

	// AntiHCV
	@FindBy(xpath = "//a[@id='retake4']")
	private WebElement AntiHCV;

	public void clickTheAntiHCVRetake() {
		AntiHCV.click();
	}

	// HBsAg
	@FindBy(xpath = "//a[@id='retake5']")
	private WebElement HBsAg;

	public void clickTheHBsAgRetake() {
		HBsAg.click();
	}

	// SGOT
	@FindBy(xpath = "//a[@id='retake8']")
	private WebElement SGOT;

	public void clickTheSGOTRetake() {
		SGOT.click();
	}

	// SGPT
	@FindBy(xpath = "//a[@id='retake9']")
	private WebElement SGPT;

	public void clickTheSGPTRetake() {
		SGPT.click();
	}

	// Creatinine
	@FindBy(xpath = "//a[@id='retake47']")
	private WebElement Creatinine;

	public void clickTheCreatinineRetake() {
		Creatinine.click();
	}

	// RPR
	@FindBy(xpath = "//a[@id='retake7']")
	private WebElement RPR;

	public void clickTheRPRRetake() {
		RPR.click();
	}

	// BetaHCG
	@FindBy(xpath = "//a[@id='retake6']")
	private WebElement BetaHCG;

	public void clickTheBetaHCGRetake() {
		BetaHCG.click();
	}

	// Glucose
	@FindBy(xpath = "//a[@id='retake11']")
	private WebElement Glucose;

	public void clickTheGlucoseRetake() {
		Glucose.click();
	}

}
