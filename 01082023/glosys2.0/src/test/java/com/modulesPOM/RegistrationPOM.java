package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPOM {
	private static RegistrationPOM registrationPOM;

	// Create Private Constrictor
	private RegistrationPOM() {
	}

	// GetInstance
	public static RegistrationPOM getInstance() {

		if (registrationPOM == null) {
			registrationPOM = new RegistrationPOM();
		}
		return registrationPOM;
	}

	@FindBy(xpath = "//input[@value='Login and close previous session']")
	private WebElement Login_Close;

	public void clickLogin_Close() {
		Login_Close.click();
	}

	public boolean getTheLoginStatus() {
		return Login_Close.isDisplayed();
	}

	@FindBy(xpath = "//a[contains(text(),'Admin')]")
	private WebElement Admin;

	public void clickAdmin() {
		Admin.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Registration')]")
	private WebElement Registration;

	public void clickRegistration() {
		Registration.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Patient Type')]")
	private WebElement PatientType;

	public void clickPatientType() {
		PatientType.click();
	}

	@FindBy(xpath = "(//span)[35]")
	private WebElement PatientID;

	public String getPatient_id() {
		return PatientID.getText();
	}

	@FindBy(xpath = "//div[contains(text(),'DIRECT')]")
	private WebElement Direct;

	public void clickDirect() {
		Direct.click();
	}

//	@FindBy(xpath = "//div[contains(text(),'Designation')]")
//	private WebElement Designation;
//
//	public void clickDesignation() {
//		Designation.click();
//	}
	@FindBy(xpath = "//input[@name='gender-radio-group-Male']")
	private WebElement Male;

	public void clickMale() {
		Male.click();
	}

	@FindBy(xpath = "//input[@name='gender-radio-group-Female']")
	private WebElement Female;

	public void clickFemale() {
		Female.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Enter Patient Name')]")
	private WebElement EnterThePatientName;

	public void clickPatientName() {
		EnterThePatientName.click();
	}

	public void enterThePatientName(String patientName) {
		EnterThePatientName.sendKeys(patientName);
	}

	@FindBy(xpath = "//div[contains(text(),'Organisation')]")
	private WebElement Organisation;

	public void clickOrganisation() {
		Organisation.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Organisation')]")
	private WebElement DirectStatus;

	public boolean getTheDirectStatus() {
		return DirectStatus.isDisplayed();
	}

	@FindBy(xpath = "(//div[contains(text(),'DIRECT')])[2]")
	private WebElement Direct2;

	public void clickDirect2() {
		Direct2.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Referral')]")
	private WebElement Referral;

	public void clickReferral() {
		Referral.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'SELF')])")
	private WebElement Self;

	public void clickSelf() {
		Self.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Register And Bill')]")
	private WebElement RegisterBill;

	public void clickRegisterBill() {
		RegisterBill.click();
	}

	@FindBy(xpath = "(// div[contains(text(),'Search & Select List')])[1]")
	private WebElement Search;

	public void clickSearch_SelectList() {
		Search.click();
	}

	public void enterTestname(String testName) {
		Search.sendKeys(testName);
	}

	@FindBy(xpath = "//div[contains(text(),'Testosterone Free')]")
	private WebElement TestosteroneFree_Test;

	public void clickTestosteroneFree_Test() {
		TestosteroneFree_Test.click();
	}

	@FindBy(xpath = "//*[@class='bi bi-plus-circle']")
	private WebElement Add_Symbol;

	public void clickTestAdd_Symbol() {
		Add_Symbol.click();
	}

	@FindBy(xpath = "//div[@class='text-right col-md-4']")
	private WebElement Amount;

	public String getAmount() {
		return Amount.getText();
	}

	@FindBy(xpath = "//input[@id='bill-advance']")
	private WebElement PayTheAmount;

	public void clickPayTheAmount() {
		PayTheAmount.click();
	}

	public void enterPayTheAmount(String amount) {
		PayTheAmount.sendKeys(amount);
	}

	@FindBy(xpath = "//button[contains(text(),'Cash')]")
	private WebElement Cash;

	public void clickCash() {
		Cash.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Confirm and Bill')]")
	private WebElement ConfirmAndBill;

	public void clickConfirm_And_Bill() {
		ConfirmAndBill.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Collect and Print')]")
	private WebElement Collect_print;

	public void clickCollect_Print_Sample() {
		Collect_print.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Receive and Print')]")
	private WebElement Receive_Print;

	public void clickReceive_Print() {
		Receive_Print.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Print Receipt')]")
	private WebElement Print_Receipt;

	public void clickPrint_Receipt() {
		Print_Receipt.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Upload File')]")
	private WebElement Upload;

	public void clickUpload_File() {
		Upload.click();
	}

	@FindBy(xpath = "//*[@data-icon='chevron-left']")
	private WebElement Close;

	public void clickClose() {
		Close.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Billing History')]")
	private WebElement BillHistory;

	public void clicBillHistory() {
		BillHistory.click();
	}

	@FindBy(xpath = "//button[@class='shadow-none bg-transparent border-none btn btn-secondary']")
	private WebElement ThreeDotOption;

	public void clicThreeDotOption() {
		ThreeDotOption.click();
	}

	@FindBy(xpath = "(//button[@class='border-bottom-0 dropdown-item'])[77]")
	private WebElement CompleteAndPrintBill;

	public void clickCompleteAndPrintBill() {
		CompleteAndPrintBill.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Registration')])[1]")
	private WebElement Registration2;

	public void clickRegistration2() {
		Registration2.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Accession')]")
	private WebElement Accession;

	public void clickAccession() {
		Accession.click();
	}

	@FindBy(xpath = "//input[@aria-label='Press Space to toggle row selection (unchecked)']")
	private WebElement Check_Box;

	public void clickCheck_Box() {
		Check_Box.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Collect and Print')]")
	private WebElement Collect_Print;

	public void clickCollect_Print() {
		Collect_Print.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Pending Collection')]")
	private WebElement PendingCollection;

	public void clickPendingCollection() {
		PendingCollection.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Pending Accession')]")
	private WebElement Pendingccession;

	public void clickPending_Accession() {
		Pendingccession.click();
	}

	@FindBy(xpath = "//button[@id='receive-btn']")
	private WebElement Receive;

	public void clickReceive() {
		Receive.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Operation')]")
	private WebElement Operation;

	public void clickOperation() {
		Operation.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Operation')])[2]")
	private WebElement Operation2;

	public void clickOperation2() {
		Operation2.click();
	}

	@FindBy(xpath = "//div[@class='data-card-additional-row pl-5']")
	private WebElement TestName;

	public void clickTestName() {
		TestName.click();
	}

	public String getTestName() {
		return TestName.getText();
	}

	@FindBy(xpath = "//div[contains(text(),'DIRECT')]")
	private WebElement Table1;

	public void clickTable1() {
		Table1.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Incomplete')]")
	private WebElement Table2;

	public void clickTable2() {
		Table2.click();
	}

	@FindBy(xpath = "//input[@placeholder='Enter Passkey']")
	private WebElement EnterPasskey;

	public void enterPasskey(String passkey) {
		EnterPasskey.sendKeys(passkey);
	}

	@FindBy(xpath = "//button[contains(text(),'Save And Sign')]")
	private WebElement SaveAndSign;

	public void clickSaveAndSign() {
		SaveAndSign.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Select by Patient Id / Patient Name / Accession Number / Bill Id / Order Id / National ID')]")
	private WebElement enterThePatientId;

	public void clickThePatientId() {
		enterThePatientId.click();

	}

	public void enterThePatientId(String patientId) {
		enterThePatientId.sendKeys(patientId);
	}

	@FindBy(xpath = "//button[contains(text(),'Review')]")
	private WebElement Review;

	public void clickReview() {
		Review.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Submit')])[3]")
	private WebElement Submit;

	public void clickSubmit() {
		Submit.click();
	}

	@FindBy(xpath = "//div[contains(text(),'Select...')]")
	private WebElement Select;

	public void clickSelect() {
		Select.click();
	}
	
	@FindBy(xpath = "//button[contains(text(),'With Letterhead')]")
	private WebElement With_LetterHead;

	public void clickWith_LetterHead() {
		With_LetterHead.click();
	}
}
