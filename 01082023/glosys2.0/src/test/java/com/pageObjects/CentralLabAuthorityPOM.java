package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralLabAuthorityPOM {
	private static CentralLabAuthorityPOM centralLabAuthority;

	// Create Private Constrictor
	private CentralLabAuthorityPOM() {
	}

	// GetInstance
	public static CentralLabAuthorityPOM getInstance() {

		if (centralLabAuthority == null) {
			centralLabAuthority = new CentralLabAuthorityPOM();
		}
		return centralLabAuthority;

	}

	// Role Selection > Central Lab Authority
	@FindBy(xpath = "//span[contains(text(),'Central Lab Authority')]")
	private WebElement labAutho;

	public void clickTheCentralLabAuthority() {
		labAutho.click();
	}

	// Click CLA Result
	@FindBy(xpath = "//a[contains(text(),'CLA Result Entry')]")
	private WebElement cla;

	public void clickCLAResultEntry() {
		cla.click();
	}

	// Get The Test Name

	@FindBy(xpath = "(//td)[11]")
	private WebElement testName1;

	public String getTheGetTestName1() {
		return testName1.getText();
	}

	@FindBy(xpath = "(//td)[32]")
	private WebElement testName2;

	public String getTheGetTestName2() {
		return testName2.getText();
	}

	@FindBy(xpath = "(//td)[53]")
	private WebElement testName3;

	public String getTheGetTestName3() {
		return testName3.getText();
	}

	@FindBy(xpath = "(//td)[73]")
	private WebElement testName4;

	public String getTheGetTestName4() {
		return testName4.getText();
	}

	// Click The Upload Icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[2]")
	private WebElement upload1;

	public void clickTheUploadIcon1() {
		upload1.click();
	}

	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[3]")
	private WebElement upload2;

	public void clickTheUploadIcon2() {
		upload2.click();
	}

	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[4]")
	private WebElement upload3;

	public void clickTheUploadIcon3() {
		upload3.click();
	}

	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[5]")
	private WebElement upload4;

	public void clickTheUploadIcon4() {
		upload4.click();
	}

	// Select Qualitative Type
	@FindBy(xpath = "(//span[contains(text(),'Select qualitative type')])[1]")
	private WebElement type;

	public void clickTheSelectQualitativeType() {
		type.click();
	}

	// Positive
	@FindBy(xpath = "(//span[contains(text(),'Positive')])")
	private WebElement positive;

	public void clickThePositive() {
		positive.click();
	}
	@FindBy(xpath = "((//span[contains(text(),'Positive')]))[2]")
	private WebElement positive1;

	public void clickThePositive1() {
		positive1.click();
	}

	// Positive
	@FindBy(xpath = "(//span[contains(text(),'Negative')])")
	private WebElement negative;

	public void clickTheNegative() {
		negative.click();
	}

	// Click The Upload Icon
	@FindBy(xpath = "	(//*[@data-icon='ic:outline-file-upload'])")
	private WebElement uploadDocumentIcon;

	public void clickTheReslutUploadDocumentIcon() {
		uploadDocumentIcon.click();
	}
	

	@FindBy(xpath = "//button[contains(text(),'Upload')]")
	private WebElement uploadDocumentIcon2;

	public void clickTheReslutUploadDocumentIcon2() {
		uploadDocumentIcon2.click();
	}
	
	
	// Click The Save Icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:save-outlined'])")
	private WebElement saveIcon;

	public void clickTheSaveIcon() {
		saveIcon.click();
	}

	@FindBy(xpath = "(//button[@class='close'])[1]")
	private WebElement close;

	public void clickTheClose() {
		close.click();
	}
	
	@FindBy(xpath = "(//button[@mattooltipclass='custom-tooltip'])[2]")
	private WebElement closeFor;

	public void clickTheResultEntryClose() {
		closeFor.click();
	}
	
	

	// Completed
	@FindBy(xpath = "//p[contains(text(),'Completed')]")
	private WebElement completed;

	public void clickTheCompleted() {
		completed.click();
	}

	// Clear The Visa Number
	@FindBy(xpath = "//input[@formcontrolname='visa_no']")
	private WebElement visaNumberIn;

	public void clearTheVisaNumber() {
		visaNumberIn.clear();
	}

	// View icon
	@FindBy(xpath = "(//*[@data-icon='akar-icons:eye'])")
	private WebElement view;

	public void clickTheViewIcon() {
		view.click();
	}

	// Close the Completed

	@FindBy(xpath = "(//span[contains(text(),'×')])[3]")
	private WebElement closeTheCompletd;

	public void clickTheCloseCompletd() {
		closeTheCompletd.click();
	}
}
