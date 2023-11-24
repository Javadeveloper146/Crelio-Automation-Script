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

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[2]")
	private WebElement PatientType;

	public void clickPatientType() {
		PatientType.click();
	}
	
	@FindBy(xpath = "//*[contains(text(),'Direct (D)')]")
	private WebElement Direct22;

	public void clickDirect22() {
		Direct22.click();
	}
	@FindBy(xpath = "(//b)[7]")
	private WebElement PatientID;

	public String getPatient_id() {
		return PatientID.getText();
	}

	@FindBy(xpath = "//div[contains(text(),'DIRECT')]")
	private WebElement Direct;

	public void clickDirect() {
		Direct.click();
	}

	// Edit Bill----------------------------------------------------

	@FindBy(xpath = "//i[@class='fa fa-calendar']")
	private WebElement dayPicker;

	public void clickDatePicker() {
		dayPicker.click();
	}

	@FindBy(xpath = "//li[@data-range-key='Last 30 Days']")
	private WebElement selectDate;

	public void clickSelectDateBasesOn() {
		selectDate.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Apply')])")
	private WebElement Apply;

	public void clickApply() {
		Apply.click();
	}

	@FindBy(xpath = "//i[@class='fa fa-filter']")
	private WebElement Filter;

	public void clickFilter() {
		Filter.click();
	}

	@FindBy(xpath = "(//span[@class='ag-icon ag-icon-menu'])[2]")
	private WebElement Menu;

	public void clickMenu() {
		Menu.click();
	}

	@FindBy(xpath = "//input[@placeholder='Search Patient...']")
	private WebElement UpdatedPatient;

	public void clearTheUpdatedPatient() {
		UpdatedPatient.clear();
	}

	@FindBy(xpath = "//input[@placeholder='Bill Id']")
	private WebElement BillClear;

	public void clearTheBillClear() {
		BillClear.clear();
	}

	public void enterTheBill(String bill) {
		BillClear.sendKeys(bill);
	}

	public void enterThePatientNameUpdate(String patientNamUpdate) {
		UpdatedPatient.sendKeys(patientNamUpdate);
	}

	@FindBy(xpath = "//span[@class='fa fa-ellipsis-v hover-me-darkGray']")
	private WebElement ThreeDot;

	public void clickThreeDot() {
		ThreeDot.click();
	}

	@FindBy(xpath = "(//span[@class='fa fa-ellipsis-v hover-me-darkGray'])[2]")
	private WebElement ThreeDot2;

	public void clickThreeDot2() {
		ThreeDot2.click();
	}

	@FindBy(xpath = "(//*[contains(text(),'Edit ')])")
	private WebElement EditBill;

	public void clickEditBill() {
		EditBill.click();
	}

	@FindBy(xpath = "	(//*[contains(text(),'Edit ')])[2]")
	private WebElement EditBill2;

	public void clickEditBill2() {
		EditBill2.click();
	}

	@FindBy(xpath = "(// button[contains(text(),'Got It')])")
	private WebElement GotIt;

	public void clickGotIt() {
		GotIt.click();
	}

	@FindBy(xpath = "//p[@class='pl-10']")
	private WebElement Bill;

	public String getTheBillID() {
		return Bill.getText();
	}

	@FindBy(xpath = "(//p[@class='text-truncate'])[2]")
	private WebElement OrganizationInBill;

	public String getTheOrganizationInBill() {
		return OrganizationInBill.getText();
	}

	@FindBy(xpath = "(//p[@class='text-truncate'])[4]")
	private WebElement OrganizationInBill1;

	public String getTheOrganizationInBill1() {
		return OrganizationInBill1.getText();
	}

	@FindBy(xpath = "(//div[@class='d-flex pos-relative'])[1]")
	private WebElement Name;

	public String getTheName() {
		return Name.getText();
	}

	@FindBy(xpath = "(//div[@class='d-flex pos-relative'])[2]")
	private WebElement Name1;

	public String getTheName1() {
		return Name1.getText();
	}

	@FindBy(xpath = "//input[@placeholder='Search Organization']")
	private WebElement Organization;

	public void clearTheOrganization() {
		Organization.clear();
	}

	public String getTheOrganization() {
		return Organization.getText();
	}

	public void enterTheOrganization(String OrganizationName) {
		Organization.sendKeys(OrganizationName);
	}

	@FindBy(xpath = "//div[@class='tt-dataset-1']")
	private WebElement Option1;

	public void clickTheOption1() {
		Option1.click();
	}

	@FindBy(xpath = "//input[@id='billAdvance']")
	private WebElement BillAdvance;

	public void clickTheBillAdvance() {
		BillAdvance.click();
	}

	@FindBy(xpath = "//a[@id='addAnother']")
	private WebElement Add;

	public void clickTheAdd() {
		Add.click();
	}

	@FindBy(xpath = "(//button[@onclick='removePaymentDiv(1);'])[2]")
	private WebElement Remove;

	public void clickTheRemove() {
		Remove.click();
	}

	@FindBy(xpath = "//button[@id='savebillSetting']")
	private WebElement SubmitForPayment;

	public void clickTheSubmitForPayment() {
		SubmitForPayment.click();
	}

	@FindBy(xpath = "//input[@value='Update']")
	private WebElement Update;

	public void clickTheUpdate() {
		Update.click();
	}

	@FindBy(xpath = "//button[@id='confirmedBillUpdate']")
	private WebElement YesImSure;

	public void clickTheYesImSure() {
		YesImSure.click();
	}

	@FindBy(xpath = "//a[@id='linkUpdateOrgPriceList']")
	private WebElement UpdatePriceList;

	public void clickTheUpdatePriceList() {
		UpdatePriceList.click();
	}

	@FindBy(xpath = "//button[@onclick='testOrgPriceListUpdate();']")
	private WebElement UpdateAmount;

	public void clickTheUpdateAmount() {
		UpdateAmount.click();
	}

	// -------------------------------------------------------------------
	@FindBy(xpath = "(// div[contains(text(),'Day')])")
	private WebElement day;

	public void clickDay() {
		day.click();
	}

	@FindBy(xpath = "(// button[contains(text(),'Click here to reload')])")
	private WebElement reload;

	public void clickReload() {
		reload.click();
	}

//	@FindBy(xpath = "//div[contains(text(),'Designation')]")
//	private WebElement Designation;
//
//	public void clickDesignation() {
//		Designation.click();
//	}

	@FindBy(xpath = "//input[@placeholder='Enter Patient ID (MRN)']")
	private WebElement patientId;

	public void enterThePatientIdOptional(String patientId21) {
		patientId.sendKeys(patientId21);
	}

	@FindBy(xpath = "(//input[@class='form-check-input'])[1]")
	private WebElement Male;

	public void clickMale() {
		Male.click();
	}
	
	
	@FindBy(xpath = "//div[contains(text(),'day')]")
	private WebElement ClickDay;

	public void clickTheDay() {
		ClickDay.click();
	}
	public void enterTheDay(String day) {
		ClickDay.sendKeys(day);
	}
	@FindBy(xpath = "(//input[@class='form-check-input'])[2]")
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

	@FindBy(xpath = "(//button[contains(text(),'Register')])[1]")
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

	@FindBy(xpath = "//button[contains(text(),'Add test')]")
	private WebElement TestosteroneFree_Test;

	public void clickTestosteroneFree_Test() {
		TestosteroneFree_Test.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Add test')]")
	private WebElement Add_Symbol;

	public void clickTestAdd_Symbol() {
		Add_Symbol.click();
	}

	@FindBy(xpath = "//div[@id='payable-amount']")
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
	
	@FindBy(xpath = "//span[@class='lab-bill-id']")
	private WebElement BillID;

	public String getBillID() {
		return BillID.getText();
	}
	
	@FindBy(xpath = "//*[@class='cursor-pointer']")
	private WebElement Close;

	public void clickClose() {
		Close.click();
	}

	@FindBy(xpath = "(//a [@href='/bill-settlement/'])[1]")
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
