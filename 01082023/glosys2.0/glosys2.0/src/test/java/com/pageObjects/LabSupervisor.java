package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabSupervisor {
	private static LabSupervisor labSupervisor;

	// Create Private Constrictor
	private LabSupervisor() {
	}

	// GetInstance
	public static LabSupervisor getInstance() {

		if (labSupervisor == null) {
			labSupervisor = new LabSupervisor();
		}
		return labSupervisor;

	}

	// Click The Lab Supervisor - chennai Option
	@FindBy(xpath = "//span[contains(text(),'Lab Supervisor ')]")
	private WebElement labSupervisorOption;

	public void clickTheLabSupervisor() {
		labSupervisorOption.click();
	}

	// Get The Lab Supervisor - chennai Option
	@FindBy(xpath = "//mat-select[@formcontrolname='rolename']")
	private WebElement getLabSeniorOption;

	public String getTheLabSupervisorOption() {
		return getLabSeniorOption.getText();
	}

	// Click The Pathalogist Worklist

	@FindBy(xpath = "//a[contains(text(),'Pathologist Worklist')]")
	private WebElement pathlogist;

	public void clickThePathlogist() {
		pathlogist.click();

	}

	// Click The Pathalogist Worklist

	@FindBy(xpath = "//a[@class='text-blue']")
	private WebElement edit;

	public void clickTheEdit() {
		edit.click();

	}

	// Click The Authorize All

	@FindBy(xpath = "//span[contains(text(),'Authorize All')]")
	private WebElement authorizeAll;

	public void clickTheAuthorizeAll() {
		authorizeAll.click();

	}

	// Click The Submit for Authorizer

	@FindBy(xpath = "// a[contains(text(),'Submit for Authorizer')]")
	private WebElement Submit;

	public void clickTheSubmit() {
		Submit.click();

	}

	// Referral Condition
	// Click The Out Source Pending

	@FindBy(xpath = "//a[contains(text(),'Outsource Pending')]")
	private WebElement outSourcePending;

	public void clickTheOutSourcePending() {
		outSourcePending.click();

	}

	@FindBy(xpath = "(//input)[4]")
	private WebElement ScanSpecimenNumber;

	public void scanTheSpecimenNumber(String serumSpecimenNumber) {
		ScanSpecimenNumber.sendKeys(serumSpecimenNumber);
	}

	// Click The Action
	@FindBy(xpath = "//mat-select[@formcontrolname='external_action']")
	private WebElement action;

	public void clickTheAction() {
		action.click();

	}

	// Click The Outsouring
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement outSourcing;

	public void clickTheOutsourcing() {
		outSourcing.click();

	}

	// Get The Action

	public String getTheAction() {
		return action.getText();
	}

	// Click The Transfor Location
	@FindBy(xpath = "//mat-select[@formcontrolname='diagnostic_id']")
	private WebElement transforLocation;

	public void clickTheTransforLocation() {
		transforLocation.click();

	}

	// Click The Core Diagnostics Center
	public void clickTheCoreDiagnosticsCenter() {
		outSourcing.click();

	}

	// Get The Transfor Location
	public String getTheTransforLocation() {
		return transforLocation.getText();
	}

	// Transfer Date
	@FindBy(xpath = "//input[@formcontrolname='diagnostic_date']")
	private WebElement transferDate;

	public void clickTheTransferDate() {
		transferDate.click();

	}

	// Click Current Date
	@FindBy(xpath = "(//div[contains(text(),'18')])")
	private WebElement date;

	public void clickTheCurrentDate() {
		date.click();

	}

	@FindBy(xpath = "(//td)[3]")
	private WebElement Spec_Number;

	public String getTheSpecimenNumberOutSourcePending() {
		return Spec_Number.getText();
	}

	@FindBy(xpath = "(//td)[5]")
	private WebElement Lab_id_OP;

	public String getTheLabIdOutSourcePending() {
		return Lab_id_OP.getText();
	}

	@FindBy(xpath = "(//td)[8]")
	private WebElement External_Specimen_Id;

	public String getTheExternalSpecimenIdOutSourcePending() {
		return External_Specimen_Id.getText();
	}

	// Get Transfer Date
	public String getTheCurrentDate() {
		return transferDate.getText();
	}

	// Click The Generate STF
	@FindBy(xpath = "//p[contains(text(),'Generate STF')]")
	private WebElement generateSTF;

	public void clickTheGenerateSTF() {
		generateSTF.click();

	}

	// Get The STF ID
	@FindBy(xpath = "(//p)[6]")
	private WebElement getSTFID;

	public String getTheSTFID() {
		return getSTFID.getText();
	}

	// Get The Generate Date
	@FindBy(xpath = "(//p)[10]")
	private WebElement datege;

	public String getTheGenerateDate() {
		return datege.getText();
	}

// Click Select Option
	@FindBy(xpath = "(//label)[2]")
	private WebElement selectAll;

	public void clickTheSelectAll() {
		selectAll.click();

	}

	// Get The External Specimen Id
	// Get The Generate Date
	@FindBy(xpath = "(//td)[3]")
	private WebElement exspId;

	public String getExternalSpecimenId() {
		return exspId.getText();
	}

	// Click The Completed
	@FindBy(xpath = "//p[contains(text(),'Completed')]")
	private WebElement completed;

	public void clickTheCompleted() {
		completed.click();
	}

	// Enter The Lab Id
	@FindBy(xpath = "//input[@data-placeholder='Enter Lab ID']")
	private WebElement lab_id;

	public void enterTheLabId(String labId) {
		lab_id.sendKeys(labId);
	}

	// Click The Search Button
	@FindBy(xpath = "(//*[contains(@class,'btn btn-primary btn-lg')])")
	private WebElement SAVE_BUTTON;

	public void clickTheSearchButton() {
		SAVE_BUTTON.click();
	}

	// Click The View Icon
	@FindBy(xpath = "//*[@data-icon='bi:eye']")
	private WebElement viewIcon;

	public void clickTheViewIcon() {
		viewIcon.click();
	}

	// Click Close
	@FindBy(xpath = "//a[contains(text(),'Close')]")
	private WebElement close;

	public void clickTheClose() {
		close.click();
	}

}
