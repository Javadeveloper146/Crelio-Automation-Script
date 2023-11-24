package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MOIPOM {
	private static MOIPOM moiPom;

	// Create Private Constrictor
	private MOIPOM() {
	}

	// GetInstance
	public static MOIPOM getInstance() {

		if (moiPom == null) {
			moiPom = new MOIPOM();
		}
		return moiPom;

	}

	// Click The MOI Option
	@FindBy(xpath = "//span[contains(text(),'MOI')]")
	private WebElement NURSE_CHENNAI_OPTION;

	public void clickTheMOIRole() {
		NURSE_CHENNAI_OPTION.click();
	}

	@FindBy(xpath = "//a[contains(text(),'MOI Worklist')]")
	private WebElement moi;

	public void clickTheMOIWorkList() {
		moi.click();
	}
//	
	
	@FindBy(xpath = "//p[contains(text(),'Other Pending')]")
	private WebElement otherPending;

	public void clickTheOtherPending() {
		otherPending.click();
	}
	//
	
	@FindBy(xpath = "//p[contains(text(),'Completed')]")
	private WebElement completed;

	public void clickTheCompleted() {
		completed.click();
	}
	@FindBy(xpath = "//p[contains(text(),'Deformity Pending')]")
	private WebElement DeformityPending;

	public void clickTheDeformityPending() {
		DeformityPending.click();
	}
	@FindBy(xpath = "//p[contains(text(),'Pregnancy Pending')]")
	private WebElement PregnancyPending;

	public void clickThePregnancyPending() {
		PregnancyPending.click();
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement Yes;

	public void clickYes() {
		Yes.click();
	}
}
