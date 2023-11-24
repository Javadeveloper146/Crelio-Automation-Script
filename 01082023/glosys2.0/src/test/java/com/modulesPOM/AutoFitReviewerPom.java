package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutoFitReviewerPom {
	private static AutoFitReviewerPom autoFitReviewerPom;

	// Create Private Constrictor
	private AutoFitReviewerPom() {
	}

	// GetInstance
	public static AutoFitReviewerPom getInstance() {

		if (autoFitReviewerPom == null) {
			autoFitReviewerPom = new AutoFitReviewerPom();
		}
		return autoFitReviewerPom;

	}

	// Click Autofit Worklist
	@FindBy(xpath = "//a[contains(text(),'Autofit Worklist')]")
	private WebElement autofit;

	public void clickAutofitWorklist() {
		autofit.click();
	}

	// Role Selection
	@FindBy(xpath = "//span[contains(text(),'Autofit Reviewer')]")
	private WebElement roleSelectionAutofit;

	public void clickAutofitRoleSelection() {
		roleSelectionAutofit.click();
	}

	// Click Review In Progress

	// Download
	@FindBy(xpath = "//*[@data-icon='file-icons:microsoft-excel']")
	private WebElement download;

	public void clickDownload() {
		download.click();
	}

	@FindBy(xpath = "//p[contains(text(),'Review in Progress')]")
	private WebElement reviwerInProgress;

	public void clickReviwerInProgress() {
		reviwerInProgress.click();
	}

	// Save
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	private WebElement save;

	public void clickSave() {
		save.click();
	}

	@FindBy(xpath = "//p[contains(text(),'Reviewed')]")
	private WebElement reviwed;

	public void clickReviwed() {
		reviwed.click();
	}

	// Authorized
	@FindBy(xpath = "//p[contains(text(),'Authorized')]")
	private WebElement authrized;

	public void clickAuthorized() {
		authrized.click();
	}

}
