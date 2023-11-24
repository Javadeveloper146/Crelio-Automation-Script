package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NurseSampleOutgoingPageObject {

	private static NurseSampleOutgoingPageObject nurseSampleOutgoing;

	private NurseSampleOutgoingPageObject() {

	}

	public static NurseSampleOutgoingPageObject getInstance() {
		if (nurseSampleOutgoing == null) {
			nurseSampleOutgoing = new NurseSampleOutgoingPageObject();
		}

		return nurseSampleOutgoing;

	}

	// Click The Sample Outgoing
	@FindBy(xpath = "(//a[contains(text(),'Sample outgoing')])")
	private WebElement sampleOutgoing;

	public void clickTheSampleOutgoing() {
		sampleOutgoing.click();
	}

	// Click The Status
	@FindBy(xpath = "//mat-select[@formcontrolname='status']")
	private WebElement status;

	public void clickTheStatus() {
		status.click();
	}

	// Click The Collected Option
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement Collecetd;

	public void clickTheCollectedOption() {
		Collecetd.click();
	}

	// Click The Search Option

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement search;

	public void clickTheSearchButton() {
		search.click();
	}

	// Click The Item Per Page

	@FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
	private WebElement itemPerPage;

	public void clickTheItemPerPage() {
		itemPerPage.click();
	}

	// Click The Item Per Page is 50 Option

	@FindBy(xpath = "(//mat-option[@role='option'])[4]")
	private WebElement itemPerPageSelect50;

	public void clickTheItemPerPageSelect50() {
		itemPerPageSelect50.click();
	}

	// Get The Specimen Number
	@FindBy(xpath = "//tbody")
	private WebElement AllSpecimenNumber;

	public String getTheAllSpecimenNumber() {
		return AllSpecimenNumber.getText();
	}
	// Get The Plasma Specimen Number

	@FindBy(xpath = "(//td)[13]")
	private WebElement plasmaSpecimenNumber;

	public String getThePlasmaNumber() {
		return plasmaSpecimenNumber.getText();
	}
	// Get The Serum Specimen Number

	@FindBy(xpath = "(//td)[25]")
	private WebElement SerumSpecimenNumber;

	public String getTheSerumSpecimenNumber() {
		return SerumSpecimenNumber.getText();
	}
	// Get The Whole Blood Specimen Number

	@FindBy(xpath = "(//td)[51]")
	private WebElement WholeBloodSpecimenNumber;

	public String getTheWholeBloodSpecimenNumber() {
		return WholeBloodSpecimenNumber.getText();
	}

	

	// Enter Or Scan The Specimen Number
	@FindBy(xpath = "(//input[@formcontrolname='specimen_no'])[2]")
	private WebElement ScanSpecimenNumber;

	public void scanTheSpecimenNumber(String plasmaAndSerumAndWholeBloodSpecNumber) {
		ScanSpecimenNumber.sendKeys(plasmaAndSerumAndWholeBloodSpecNumber);
	}
	
	@FindBy(xpath = "(//div[@class='col-md-3'])[2]")
	private WebElement orderId;

	public String getTheOrderId() {
		return orderId.getText();
	}

	// Click The Scan Button

	@FindBy(xpath = "//*[@data-icon='ri:barcode-box-line']")
	private WebElement ScanButton;

	public void clickTheScanButton() {
		ScanButton.click();
	}

	// Click The Lab tech Name
	@FindBy(xpath = "//mat-select[@formcontrolname='lab_technician']")
	private WebElement LabTechName;

	public void ClickTheLabTechName() {
		LabTechName.click();
	}

	// Click The Lab Technician Glossys
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement LabTechnicianGlossys;

	public void clickTheLabTechnicianGlossys() {
		LabTechnicianGlossys.click();
	}


	// Click The GRO Name
	@FindBy(xpath = "//mat-select[@formcontrolname='gro']")
	private WebElement GROName;

	public void clickTheGROName() {
		GROName.click();
	}
	// Click The GRO Glossys

	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement GROGlossys;

	public void clickTheGROGlossys() {
		GROGlossys.click();
	}

	

	// Click The Collected Button
	@FindBy(xpath = "//button[contains(text(),'Outgoing')]")
	private WebElement COLLECTED_BUTTON;

	public void clickTheCollectedButton() {
		COLLECTED_BUTTON.click();
	}
}