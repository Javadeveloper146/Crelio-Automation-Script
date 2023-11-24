package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabSenior {
	private static LabSenior labSenior;

	// Create Private Constrictor
	private LabSenior() {
	}

	// GetInstance
	public static LabSenior getInstance() {

		if (labSenior == null) {
			labSenior = new LabSenior();
		}
		return labSenior;

	}

	// Click The Lab Senior - chennai Option
	@FindBy(xpath = "//span[contains(text(),'Lab Senior ')]")
	private WebElement labSeniorOption;

	public void clickTheLabSeniorChennaiOption() {
		labSeniorOption.click();
	}

	// Get The Lab Senior - chennai Option
	@FindBy(xpath = "//mat-select[@placeholder='Select Role']")
	private WebElement getLabSeniorOption;

	public String getTheLabSeniorChennaiOption() {
		return getLabSeniorOption.getText();
	}

	// Click The Result Entry Review
	@FindBy(xpath = "//a[contains(text(),'Result Entry Review')]")
	private WebElement resultEntryReview;

	public void clickTheresultEntryReview() {
		resultEntryReview.click();
	}

	// ----------------------- Status Check-------------------------------
//	HaemoglobinFirstReview
	@FindBy(xpath = "//a[@id='review1']")
	private WebElement HaemoglobinComplete1;

	public boolean checkTheHaemoglobinFirstReview() {
		 return HaemoglobinComplete1.isDisplayed();
	}

//	BloodGroupFirstReview
	@FindBy(xpath = "//a[@id='review2']")
	private WebElement BloodGroupComplete1;

	public boolean checkTheBloodGroupFirstReview() {
		return BloodGroupComplete1.isDisplayed();
	}

//	HIVFirstReview
	@FindBy(xpath = "//a[@id='review3']")
	private WebElement HIVComplete1;

	public boolean checkTheHIVFirstReview() {
		return HIVComplete1.isDisplayed();
	}

//	AntiHCVFirstReview
	@FindBy(xpath = "//a[@id='review4']")
	private WebElement AntiHCVComplete1;

	public boolean checkTheAntiHCVFirstReview() {
		return AntiHCVComplete1.isDisplayed();
	}

//	HBsAgFirstReview
	@FindBy(xpath = "//a[@id='review5']")
	private WebElement HBsAgComplete1;

	public boolean checkTheHBsAgFirstReview() {
		return HBsAgComplete1.isDisplayed();
	}

//	SGOTFirstReview
	@FindBy(xpath = "//a[@id='review8']")
	private WebElement SGOTComplete1;

	public boolean checkTheSGOTFirstReview() {
		return SGOTComplete1.isDisplayed();
	}

//	SGPTFirstReview
	@FindBy(xpath = "//a[@id='review9']")
	private WebElement SGPTComplete1;

	public boolean checkTheSGPTFirstReview() {
		return SGPTComplete1.isDisplayed();
	}

//	CreatinineFirstReview
	@FindBy(xpath = "//a[@id='review47']")
	private WebElement CreatinineComplete1;

	public boolean checkTheCreatinineFirstReview() {
		return CreatinineComplete1.isDisplayed();
	}

//	RPRFirstReview
	@FindBy(xpath = "//a[@id='review7']")
	private WebElement RPRComplete1;

	public boolean checkTheRPRFirstReview() {
		return RPRComplete1.isDisplayed();
	}

//	BEtaHCCFirstReview	
	@FindBy(xpath = "//a[@id='review6']")
	private WebElement BEtaHCComplete1;

	public boolean checkTheBEtaHCGFirstReview() {
		return BEtaHCComplete1.isDisplayed();
	}

//	GlucoseFirstReview
	@FindBy(xpath = "//a[@id='review11']")
	private WebElement GlucoseComplete1;

	public boolean checkTheGlucoseFirstReview() {
		return GlucoseComplete1.isDisplayed();
	}

//--------------------------------------------------------
//	HaemoglobinFirstReview
	@FindBy(xpath = "//a[@id='review1']")
	private WebElement HaemoglobinComplete;

	public void clickTheHaemoglobinFirstReview() {
		HaemoglobinComplete.click();
	}

//	BloodGroupFirstReview
	@FindBy(xpath = "//a[@id='review2']")
	private WebElement BloodGroupComplete;

	public void clickTheBloodGroupFirstReview() {
		BloodGroupComplete.click();
	}

//	HIVFirstReview
	@FindBy(xpath = "//a[@id='review3']")
	private WebElement HIVComplete;

	public void clickTheHIVFirstReview() {
		HIVComplete.click();
	}

//	AntiHCVFirstReview
	@FindBy(xpath = "//a[@id='review4']")
	private WebElement AntiHCVComplete;

	public void clickTheAntiHCVFirstReview() {
		AntiHCVComplete.click();
	}

//	HBsAgFirstReview
	@FindBy(xpath = "//a[@id='review5']")
	private WebElement HBsAgComplete;

	public void clickTheHBsAgFirstReview() {
		HBsAgComplete.click();
	}

//	SGOTFirstReview
	@FindBy(xpath = "//a[@id='review8']")
	private WebElement SGOTComplete;

	public void clickTheSGOTFirstReview() {
		SGOTComplete.click();
	}

//	SGPTFirstReview
	@FindBy(xpath = "//a[@id='review9']")
	private WebElement SGPTComplete;

	public void clickTheSGPTFirstReview() {
		SGPTComplete.click();
	}

//	CreatinineFirstReview
	@FindBy(xpath = "//a[@id='review47']")
	private WebElement CreatinineComplete;

	public void clickTheCreatinineFirstReview() {
		CreatinineComplete.click();
	}

//	RPRFirstReview
	@FindBy(xpath = "//a[@id='review7']")
	private WebElement RPRComplete;

	public void clickTheRPRFirstReview() {
		RPRComplete.click();
	}

//	BEtaHCCFirstReview	
	@FindBy(xpath = "//a[@id='review6']")
	private WebElement BEtaHCComplete;

	public void clickTheBEtaHCGFirstReview() {
		BEtaHCComplete.click();
	}

//	GlucoseFirstReview
	@FindBy(xpath = "//a[@id='review11']")
	private WebElement GlucoseComplete;

	public void clickTheGlucoseFirstReview() {
		GlucoseComplete.click();
	}

	// Click Submit for review
	@FindBy(xpath = "//a[contains(text(),'Submit for Review')]")
	private WebElement submitForFirstReview;

	public void clickThesubmitForReview() {
		submitForFirstReview.click();
	}
	
	
	// review
	
	
	@FindBy(xpath = "//a[@class='text-orange']")
	private WebElement review_btn;

	public void clickTheReviewButton() {
		review_btn.click();
	}
}
