package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MOHPOM {
	private static MOHPOM mohPom;

	// Create Private Constrictor
	private MOHPOM() {
	}

	// GetInstance
	public static MOHPOM getInstance() {

		if (mohPom == null) {
			mohPom = new MOHPOM();
		}
		return mohPom;

	}

	// Click The MOH Option
	@FindBy(xpath = "//span[contains(text(),'MOH')]")
	private WebElement NURSE_CHENNAI_OPTION;

	public void clickTheMOHRole() {
		NURSE_CHENNAI_OPTION.click();
	}

	@FindBy(xpath = "//a[contains(text(),'MOH Worklist')]")
	private WebElement MOHWork;

	public void clickTheMOHWorkList() {
		MOHWork.click();
	}

	@FindBy(xpath = "//p[contains(text(),'Referral')]")
	private WebElement Referral;

	public void clickReferral() {
		Referral.click();
	}

	@FindBy(xpath = "//span[contains(text(),'MOI')]")
	private WebElement moi;

	public void clickMOI() {
		moi.click();
	}

	@FindBy(xpath = "//span[contains(text(),'MOH Lab')]")
	private WebElement mohLab;

	public void clickMOHLab() {
		mohLab.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Central GP')]")
	private WebElement centralGp;

	public void clickCentralGp() {
		centralGp.click();
	}

	// Auto Fit reviwer
	@FindBy(xpath = "//p[contains(text(),'Autofit Review')]")
	private WebElement autofit;

	public void clickAutoFitReviwer() {
		autofit.click();
	}

	@FindBy(xpath = "(//a[contains(text(),'Fit')])[1]")
	private WebElement fit;

	public void clickFit() {
		fit.click();
	}

	@FindBy(xpath = "(//a[contains(text(),'UnFit')])[1]")
	private WebElement UnFit;

	public void clickUnFit() {
		UnFit.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Select Reason')]")
	private WebElement Reason;

	public void clickSelectReason() {
		Reason.click();
	}

	@FindBy(xpath = "//span[contains(text(),'HIV AIDS')]")
	private WebElement HIV;

	public void clickHIVResult() {
		HIV.click();
	}

	// MOH Lab
	@FindBy(xpath = "//span[contains(text(),'MOH Lab')]")
	private WebElement NURSE_CHENNAI_OPTION1;

	public void clickTheMOH_Lab_Role() {
		NURSE_CHENNAI_OPTION1.click();
	}

	@FindBy(xpath = "//a[contains(text(),'MOH Lab Worklist')]")
	private WebElement MOH_Lab_Work;

	public void clickTheMOH_Lab_WorkList() {
		MOH_Lab_Work.click();
	}
}
