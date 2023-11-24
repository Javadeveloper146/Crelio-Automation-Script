package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabDirector {
	private static LabDirector labDirector;

	// Create Private Constrictor
	private LabDirector() {
	}

	// GetInstance
	public static LabDirector getInstance() {

		if (labDirector == null) {
			labDirector = new LabDirector();
		}
		return labDirector;

	}

	// Role Lab Direct
	// Click The Lab Direct - chennai Option
	@FindBy(xpath = "//span[contains(text(),'Lab Director ')]")
	private WebElement CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION;

	public void clickTheLabDirect() {
		CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION.click();
	}
	 
	// Click The External Barcode Approval
	@FindBy(xpath = "//a[contains(text(),'External Barcode Approval')]")
	private WebElement externalBarcodeApproval;

	public void clickTheExternalBarcodeApproval() {
		externalBarcodeApproval.click();
	}

	// Enter The Visa Number
	@FindBy(xpath = "//input[@formcontrolname='visa_no']")
	private WebElement visaNumberIn;

	public void enterTheVisaNumber(String visaNumber) {
		visaNumberIn.sendKeys(visaNumber);
	}

	// Get The Site Name

	@FindBy(xpath = "(//td[contains(text(),' ')])[1]")
	private WebElement siteName;

	public String getTheSiteName() {
		return siteName.getText();
	}

	// Get The External Specimen Name

	@FindBy(xpath = "(//td[@role='cell'])[8]")
	private WebElement externalSpecimen;

	public String getTheExternalSpecimenNumber() {
		return externalSpecimen.getText();
	}
	
	@FindBy(xpath = "(//td[@role='cell'])[5]")
	private WebElement Specimen_Number;

	public String getTheSpecimenNumebr() {
		return Specimen_Number.getText();
	}

	// Click The Print
	@FindBy(xpath = "(//a[@class='text-blue'])[1]")
	private WebElement printButton;

	public void clickThePrintButton() {
		printButton.click();
	}

	
	
	@FindBy(xpath = "//mat-checkbox")
	private WebElement checkBox;

	public void clickTheCheckBox() {
		checkBox.click();
	}
	// Click The Status
	
	@FindBy(xpath = "//mat-select[@formcontrolname='status']")
	private WebElement status;

	public void clickTheStatus() {
		status.click();
	}

	// Click The Approved
	

	@FindBy(xpath = "//span[contains(text(),'Approved')]")
	private WebElement approved;

	public void clickTheApproved() {
		approved.click();
	}
	// Enter The Notes
	@FindBy(xpath = "//textarea")
	private WebElement notesIn;

	public void enterTheNotes(String notes) {
		notesIn.sendKeys(notes);
	}
	
	// Save Button
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement Save;

	public void clickTheSave() {
		Save.click();
	}
}
