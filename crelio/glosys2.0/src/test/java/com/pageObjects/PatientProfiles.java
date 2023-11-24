package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientProfiles {

	private static PatientProfiles patientProfiles;

	private PatientProfiles() {

	}

	public static PatientProfiles getInstance() {

		if (patientProfiles == null) {
			patientProfiles = new PatientProfiles();
		}
		return patientProfiles;

	}

	// Negative Error Message
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement TITLE_ERROR;

	public String getTheTitleError() {
		return TITLE_ERROR.getText();
	}

	// Marital error
//	@FindBy(xpath = "(//mat-error)[2]")
//	private WebElement MARITAL_ERROR;
//
//	public String getTheMaritalError() {
//		return MARITAL_ERROR.getText();
//	}

	// Pregnacy error
	@FindBy(xpath = "(//mat-error)[2]")
	private WebElement PREGNACY_ERROR;

	public String getThePregnacyError() {
		return PREGNACY_ERROR.getText();
	}

//	// Country error
//	@FindBy(xpath = "(//mat-error)[3]")
//	private WebElement COUNTRY_ERROR;
//
//	public String getTheCountryError() {
//		return COUNTRY_ERROR.getText();
//	}

	// Language Speak error
	@FindBy(xpath = "(//mat-error)[3]")
	private WebElement LANG_SPEAK_ERROR;

	public String getTheLangSpeakError() {
		return LANG_SPEAK_ERROR.getText();
	}

	// Langauge Read error
	@FindBy(xpath = "(//mat-error)[4]")
	private WebElement LANG_READ_ERROR;

	public String getTheLangReadError() {
		return LANG_READ_ERROR.getText();
	}

	// Preffered Location error
	@FindBy(xpath = "(//mat-error)[5]")
	private WebElement PREFFERRED_LOCATION_ERROR;

	public String getThePrefferedLocationError() {
		return PREFFERRED_LOCATION_ERROR.getText();
	}

	// Prefferred Hospital error
	@FindBy(xpath = "(//mat-error)[6]")
	private WebElement PRE_HOSPITAL_ERROR;

	public String getThePreHospitalError() {
		return PRE_HOSPITAL_ERROR.getText();
	}

	// SMS Alert error
	@FindBy(xpath = "(//mat-error)[7]")
	private WebElement SMS_ALERT_ERROR;

	public String getTheSMSAlertError() {
		return SMS_ALERT_ERROR.getText();
	}

//	// Recuriment Agency error
//	@FindBy(xpath = "(//mat-error)[10]")
//	private WebElement RECURIMENT_AGENCY_ERROR;
//
//	public String getTheRecurimentAgencyError() {
//		return RECURIMENT_AGENCY_ERROR.getText();
//	}

	// Click The Title Box
	@FindBy(xpath = "//span[contains(text(),'Select title')]")
	private WebElement CLICK_THE_TITLE_BOX;

	public void clickTheTitleBox() {
		CLICK_THE_TITLE_BOX.click();
	}

	// Click The Title Option Mr or Mrs or Miss
	@FindBy(xpath = "//span[contains(text(),'Mrs')]")
	private WebElement CLICK_THE_TITLE_OPTION;

	public void clickTheTitleOptionMrs() {
		CLICK_THE_TITLE_OPTION.click();
	}

	// Find The Visa Gender Type
	@FindBy(xpath = "//mat-select[@formcontrolname='gender']")
	private WebElement FIND_VISA_GENDER_TYPE;

	public String getTheVisaGenderType() {
		return FIND_VISA_GENDER_TYPE.getText();
	}

	// Nationality
	@FindBy(xpath = "//mat-select[@formcontrolname='nationality']")
	private WebElement nationality;

	public void clickNationality() {
		nationality.click();
	}

	// Click The India
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement india;

	public void clickTheIndiaOption() {
		india.click();
	}

	// Click The Marital Status Box
	@FindBy(xpath = "//span[contains(text(),'Select Marital status')]")
	private WebElement CLICK_THE_MARITAL_STATUS_BOX;

	public void clickTheMaritalStatusBox() {
		CLICK_THE_MARITAL_STATUS_BOX.click();
	}

	// Click The Marital Status Option "Married"
	@FindBy(xpath = "//span[contains(text(),'Married')]")
	private WebElement CLICK_THE_MARITAL_STATUS_OPTION;

	public void clickTheMaritalStatusOption() {
		CLICK_THE_MARITAL_STATUS_OPTION.click();
	}

	// Click The Pregnant Box
	@FindBy(xpath = "//mat-select[@formcontrolname='is_pregnant']")
	private WebElement CLICK_THE_PREGNANTBOX;

	public void clickThePregnantBox() {
		CLICK_THE_PREGNANTBOX.click();
	}

	// Click The Pregnant Option "Yes"
	@FindBy(xpath = "(//mat-option[@role='option'])[1]")
	private WebElement CLICK_THE_PREGNANT_YES_OPTION;

	public void clickThePregnantYesOption() {
		CLICK_THE_PREGNANT_YES_OPTION.click();
	}

	// Click The Pregnant Option "May be"
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement CLICK_THE_PREGNANT_MAYBE_OPTION;

	public void clickThePregnantMayBeOption() {
		CLICK_THE_PREGNANT_MAYBE_OPTION.click();
	}

	// Click The Pregnant Option "No"
	@FindBy(xpath = "(//mat-option[@role='option'])[3]")
	private WebElement CLICK_THE_PREGNANT_NO_OPTION;

	public void clickThePregnantNoOption() {
		CLICK_THE_PREGNANT_NO_OPTION.click();
	}

	// Communication
	// Click The Country Box
	@FindBy(xpath = "//span[contains(text(),'Select country')]")
	private WebElement COUNTRY_BOX;

	public void clickTheCountryBox() {
		COUNTRY_BOX.click();
	}

	// Get The Country
	@FindBy(xpath = "//mat-select[@formcontrolname='countries']")
	private WebElement COUNTRY;

	public String getTheCountry() {
		return COUNTRY.getText();
	}

	// Click The Country Option "India"
	@FindBy(xpath = "//span[contains(text(),'India')]")
	private WebElement COUNTRY_OPTION;

	public void clickTheCountryOption() {
		COUNTRY_OPTION.click();
	}

	// Preferred Language to Speak DropDown
	@FindBy(xpath = "//span[contains(text(),'Select Preferred Language to Speak')]")
	private WebElement PREFERRED_LANGUAGE_TO_SPEAK_BOX;

	public void clickThePreferredLanguageToSpeakDropDown() {
		PREFERRED_LANGUAGE_TO_SPEAK_BOX.click();
	}

	// Get The Perferred Language
	@FindBy(xpath = "//mat-select[@formcontrolname='preferred_language_speak']")
	private WebElement PREFERRED_LANGUAGE;

	public String getThePerferredLanguageSpeak() {
		return PREFERRED_LANGUAGE.getText();
	}

	// Preferred Language to Speak Option
	@FindBy(xpath = "//span[contains(text(),'English')]")
	private WebElement PREFERRED_LANGUAGE_TO_SPEAK_OPTION;

	public void clickThePreferredLanguageToSpeakOption() {
		PREFERRED_LANGUAGE_TO_SPEAK_OPTION.click();
	}

	// Preferred Language To Read Dropdown
	@FindBy(xpath = "//span[contains(text(),'Select Preferred Language to Read')]")
	private WebElement PREFERRED_LANGUAGE_TO_READ_DROPDOWN;

	public void clikThePreferredLanguageToReadDropdown() {
		PREFERRED_LANGUAGE_TO_READ_DROPDOWN.click();
	}

	// Get The Perferred Read
	@FindBy(xpath = "//mat-select[@formcontrolname='preferred_language_read']")
	private WebElement languageRead;

	public String getThePerferredLanguageRead() {
		return PREFERRED_LANGUAGE.getText();
	}

	// Preferred Language To Read Dropdown Option
	@FindBy(xpath = "//span[contains(text(),'English')]")
	private WebElement PREFERRED_LANGUAGE_TO_READ_DROPDOWN_OPTION;

	public void clikThePreferredLanguageToReadDropdownOPtion() {
		PREFERRED_LANGUAGE_TO_READ_DROPDOWN_OPTION.click();

	}

	// Preferred Location for Referral Dropdown
	@FindBy(xpath = "//span[contains(text(),'Select Preferred Location')]")
	private WebElement PREFERRED_LOCATION_FOR_REFERRAL_DROPDOWN;

	public void clickThePreferredLocationForReferralDropDown() {
		PREFERRED_LOCATION_FOR_REFERRAL_DROPDOWN.click();
	}

	// Get The Perferred Location
	@FindBy(xpath = "//mat-select[@formcontrolname='preferred_location']")
	private WebElement perferredLocation;

	public String getTheperferredLocation() {
		return perferredLocation.getText();
	}

	// Preferred Location for Referral Dropdown Option
	@FindBy(xpath = "//span[contains(text(),'Chennai')]")
	private WebElement PREFERRED_LOCATION_FOR_REFERRAL_DROPDOWN_OPTION;

	public void clickThePreferredLocationForReferralDropDownOption() {
		PREFERRED_LOCATION_FOR_REFERRAL_DROPDOWN_OPTION.click();
	}

	// Preferred Hospital Dropdown
	@FindBy(xpath = "//span[contains(text(),'Select Preferred Hospital')]")
	private WebElement PREFERRED_HOSPITAL_DROPDOWN;

	public void clickThePreferredHospitalDropdown() {
		PREFERRED_HOSPITAL_DROPDOWN.click();
	}

	// Get The Perferred Hospital
	@FindBy(xpath = "//mat-select[@formcontrolname='preferred_hospital']")
	private WebElement hospital;

	public String getThehospital() {
		return hospital.getText();
	}

	// Preferred Hospital Dropdown Option
	@FindBy(xpath = "//span[contains(text(),'Appolo Hospital')]")
	private WebElement PREFERRED_HOSPITAL_DROPDOWN_OPTION;

	public void clickThePreferredHospitalDropdownOption() {
		PREFERRED_HOSPITAL_DROPDOWN_OPTION.click();
	}

	// Click SMS Alert Number Box
	@FindBy(xpath = "//input[@data-placeholder='SMS alert number']")
	private WebElement SMS_ALERT_NUMBER_TEXT_BOX;

	public void clickTheSMSAlertNumberTextBox() {
		SMS_ALERT_NUMBER_TEXT_BOX.click();
	}

	// Enter The SMS Alert Number
	@FindBy(xpath = "//input[@data-placeholder='Alternative phone number']")
	private WebElement ENTER_THE_SMS_ALERT_NUMBER;

	public void enterTheSMSAlertNumber(String smsNumber) {
		ENTER_THE_SMS_ALERT_NUMBER.sendKeys(smsNumber);
	}

	// Agency Dropdown
	@FindBy(xpath = "//span[contains(text(),'Select Agency')]")
	private WebElement AGENCY_DROP_DOWN;

	public void clickTheAgencyDropdown() {
		AGENCY_DROP_DOWN.click();
	}

	// Agency Dropdown Option "Visa Agency"
	@FindBy(xpath = "//span[contains(text(),'visa agency')]")
	private WebElement AGENCY_DROP_DOWN_OPTION;

	public void clickTheAgencyDropdownOption() {
		AGENCY_DROP_DOWN_OPTION.click();
	}

	// Job Position
	@FindBy(xpath = "//mat-select[@formcontrolname='job_position']")
	private WebElement JOB_POSITION;

	public String getTheJobPostion() {
		return JOB_POSITION.getText();
	}

	// Condition Is Job application of Driver
	// Yes Radio Button Condition
	@FindBy(id = "mat-radio-2-input")
	private WebElement JOB_APPLICATION_DRIVE_RADIO_BUTTON;

	public boolean checkTheDriverApplicantYesRadioButton() {
		return JOB_APPLICATION_DRIVE_RADIO_BUTTON.isSelected();
	}

	// Consent Abbreviation
	@FindBy(xpath = "//a[contains(text(),'Consent Abbreviation')]")
	private WebElement CONSENT_ABBREVIATION_BUTTON;

	public void clickTheConsentAbbreviation() {
		CONSENT_ABBREVIATION_BUTTON.click();
	}

	// Consent Abbreviation (Applicant signature)
	@FindBy(xpath = "//a[contains(text(),'Applicant Signature')]")
	private WebElement APPLICANT_SIGNATURE_BUTTON;

	public void clickTheApplicantSignatureButton() {
		APPLICANT_SIGNATURE_BUTTON.click();
	}

	// Click The Save And Print Button
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	private WebElement SAVE_AND_PRINT_BUTTON;

	public void clickTheSaveAndPrintButton() {
		SAVE_AND_PRINT_BUTTON.click();
	}

	// Get The Token
	@FindBy(xpath = "(//div[@aria-live='assertive'])[1]")
	private WebElement GET_TOKEN;

	public String getTheTokenDetails() {
		return GET_TOKEN.getText();
	}

	// Pop Up result
	@FindBy(xpath = "/html/body/div[2]/div/div/snack-bar-container/div/div/app-snackbar/p")
	private WebElement GET_THE_POP_RESULT;

	public String getThePopResult() {
		return GET_THE_POP_RESULT.getText();
	}

	// Place Order
	// Check The Pregnancy Care With RPR Package Status
	@FindBy(xpath = "//input[@aria-checked='true']")
	private WebElement PREGNANCY_CARE_WITH_RPR_PACKAGE_STATUS;

	public boolean checkThePregnancyCareWithRPRPackageStatus() {
		return PREGNANCY_CARE_WITH_RPR_PACKAGE_STATUS.isSelected();
	}

	// Check The Medical Visa Package RPR Status
	@FindBy(xpath = "(//input[@aria-checked='true'])[1]")
	private WebElement MEDICAL_VISA_PACKAGE_RPR;

	public boolean checkTheMedicalVisaPackageRPR() {
		return MEDICAL_VISA_PACKAGE_RPR.isSelected();
	}

	// Check The MMR AND TD Vaccination Status
	@FindBy(xpath = "(//input[@aria-checked='true'])[2]")
	private WebElement MMR_AND_TD_VACCINATION;

	public boolean checkTheMMRAndTDVaccination() {
		return MMR_AND_TD_VACCINATION.isSelected();
	}

	// Check The Chest Xray Status
	@FindBy(xpath = "(//input[@aria-checked='true'])[3]")
	private WebElement CHEST_XRAY_STATUS;

	public boolean checkTheChestXrayStatus() {
		return CHEST_XRAY_STATUS.isSelected();
	}

	// Place Order - Click The Proceed The Selection
	@FindBy(xpath = "//a[contains(text(),'Proceed with Selection')]")
	private WebElement PROCEED_WITH_SELECTION_BUTTON;

	public void clickTheProceedWithSelectionButton() {
		PROCEED_WITH_SELECTION_BUTTON.click();
	}

	// Get single Error Message
	@FindBy(xpath = "//mat-error[contains(text(),'Please Select Issue Date')]")
	private WebElement ERROR_MESSAGE1;

	public String getErrorMessage1() {
		return ERROR_MESSAGE1.getText();

	}

	// Get single Error Message
	@FindBy(xpath = "//mat-error[contains(text(),'Please Select Expiry Date')]")
	private WebElement ERROR_MESSAGE2;

	public String getErrorMessage2() {
		return ERROR_MESSAGE2.getText();

	} // Get single Error Message

	@FindBy(xpath = "//mat-error[contains(text(),'Please Enter Issued At')]")
	private WebElement ERROR_MESSAGE3;

	public String getErrorMessage3() {
		return ERROR_MESSAGE3.getText();

	}

	// Click The Issued Date Calender Icon Button
	@FindBy(xpath = "//input[@formcontrolname='issue_date']")
	private WebElement CALENDER_ICON;

	public void clickTheCalenderIcon() {
		CALENDER_ICON.click();
	}

	// Choose The Date from Issued Date
	@FindBy(xpath = "//div[contains(text(),'1')]")
	private WebElement CURRENT_DATE;

	public void clickTheCurrentDate() {
		CURRENT_DATE.click();

	}

	// Click The Expiry Date Calender Icon
	@FindBy(xpath = "//input[@formcontrolname='expiry_date']")
	private WebElement EXPIRY_DATE_BOX;

	public void clickTheExpiryDateBox() {
		EXPIRY_DATE_BOX.click();
	}

	// Click The ExpiryDate
	@FindBy(xpath = "//div[contains(text(),'30')]")

	private WebElement EXPIRY_DATE_SELECT;

	public void clickTheExpiryDateSelect() {
		EXPIRY_DATE_SELECT.click();
	}

	// Click The Issued At Details
	@FindBy(xpath = "//input[@formcontrolname='issue_at']")
	private WebElement ISSUED_AT_TEXT_BOX;

	public void clickTheIssuedAtTextBox() {
		ISSUED_AT_TEXT_BOX.click();
	}

	// Enter The Issued At Detils
	@FindBy(xpath = "//input[@formcontrolname='issue_at']")
	private WebElement ENTER_THE_ISSUED_AT_DETAILS;

	public void enterTheIssuedAtDetails(String issuedAtDetails) {
		ENTER_THE_ISSUED_AT_DETAILS.sendKeys(issuedAtDetails);
	}

	// Get Issue date
	@FindBy(xpath = "//input[@formcontrolname='issue_date']")
	private WebElement issuedDate;

	public String getissuedDate() {
		return issuedDate.getText();
	}

	// Get expiry date
	@FindBy(xpath = "//input[@formcontrolname='expiry_date']")
	private WebElement expiryDate;

	public String getexpiryDate() {
		return expiryDate.getText();
	}

	// Issue At
	@FindBy(xpath = "//input[@formcontrolname='issue_at']")
	private WebElement issueAt;

	public String getIssueAt() {
		return issueAt.getText();
	}

	// Click The Select Document Type
	@FindBy(xpath = "//span[contains(text(),'Select Document Type')]")
	private WebElement SELECT_DOCUMENT_TYPE;

	public void clickTheSelectDocumentTypeBox() {
		SELECT_DOCUMENT_TYPE.click();
	}

	// Click The "Vaccination" Option
	@FindBy(xpath = "//span[contains(text(),'Vaccination')]")
	private WebElement VACCINATION_OPTION;

	public void clickTheVaccinationOPtion() {
		VACCINATION_OPTION.click();
	}

	// Click The Document Name Text Box
	@FindBy(xpath = "(//input[@placeholder='Eg. Vaccination Certificate'])[1]")

	private WebElement VACCINATION_CERTIFICATE_TEXT_BOX;

	public void clickTheVaccinationCertificateText_Box() {
		VACCINATION_CERTIFICATE_TEXT_BOX.click();
	}

	// Enter The Vaccination Document Details
	@FindBy(xpath = "(//input[@placeholder='Eg. Vaccination Certificate'])[1]")
	private WebElement ENTER_THE_VACCINATION_DOCUMENT_DETAILS;

	public void enterTheVaccinationDocumentDetails(String vaccinationDocumentDetails) {
		ENTER_THE_VACCINATION_DOCUMENT_DETAILS.sendKeys(vaccinationDocumentDetails);
	}

	// Click The Refferral Document Name Text Box
	@FindBy(xpath = "(//input[@placeholder='Eg. Vaccination Certificate'])[2]")

	private WebElement REFFERRAL_LETTER_CERTIFICATE_TEXT_BOX;

	public void clickTheRefferralLetterCertificateText_Box() {
		REFFERRAL_LETTER_CERTIFICATE_TEXT_BOX.click();
	}

	// Enter The Refferral Letter Document Details
	@FindBy(xpath = "(//input[@placeholder='Eg. Vaccination Certificate'])[2]")
	private WebElement ENTER_THE_REFFERRAL_DOCUMENT_DETAILS;

	public void enterTheRefferralLetterDocumentDetails(String vaccinationDocumentDetails) {
		ENTER_THE_REFFERRAL_DOCUMENT_DETAILS.sendKeys(vaccinationDocumentDetails);
	}

	// Click The Only Refferral Document Name Text Box
	@FindBy(xpath = "//input[@placeholder='Eg. Vaccination Certificate']")

	private WebElement REFFERRAL_LETTER_ONLY_CERTIFICATE_TEXT_BOX;

	public void clickTheRefferralLetterOnlyCertificateText_Box() {
		REFFERRAL_LETTER_ONLY_CERTIFICATE_TEXT_BOX.click();
	}

	// Enter The Refferral Letter Document Details
	@FindBy(xpath = "//input[@placeholder='Eg. Vaccination Certificate']")
	private WebElement ENTER_THE_REFFERRAL_ONLY_DOCUMENT_DETAILS;

	public void enterTheRefferralLetterOnlyDocumentDetails(String vaccinationDocumentDetails) {
		ENTER_THE_REFFERRAL_ONLY_DOCUMENT_DETAILS.sendKeys(vaccinationDocumentDetails);
	}

	// Click The Document Upload Icon Button
	@FindBy(xpath = "//*[@data-icon='ic:outline-upload']")

	private WebElement DOCUMENT_UPLOAD_ICON_BUTTON;

	public void clickTheDocumentUploadIconButton() {
		DOCUMENT_UPLOAD_ICON_BUTTON.click();
	}

	// Click The Reffereal Letter Upload Icon Button
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[2]")

	private WebElement REFFERRAL_LETTER_UPLOAD_ICON_BUTTON;

	public void clickTheRefferralUploadIconButton() {
		REFFERRAL_LETTER_UPLOAD_ICON_BUTTON.click();
	}

	// Click The Reffereal Letter Only Upload Icon Button
	@FindBy(xpath = "//*[@data-icon='ic:outline-upload']")

	private WebElement REFFERRAL_LETTER_UPLOAD_ONLY_ICON_BUTTON;

	public void clickTheRefferralOnlyUploadIconButton() {
		REFFERRAL_LETTER_UPLOAD_ONLY_ICON_BUTTON.click();
	}

	// Add New Refferal Letter
	// Click The "Refferral" Option
	@FindBy(xpath = "//span[contains(text(),'Referral Letter')]")
	private WebElement REFFERRAL_LETTER_OPTION;

	public void clickTheRefferralLetteroption() {
		REFFERRAL_LETTER_OPTION.click();
	}

	// Click The New Add Document
	@FindBy(xpath = "//a[contains(text(),'Add Document')]")

	private WebElement ADD_DOCUMENT;

	public void clickTheAddDocument() {
		ADD_DOCUMENT.click();
	}

	// Click The Save And Next Button
	@FindBy(xpath = "//a[contains(text(),'Save and Next')]")
	private WebElement SAVE_AND_NEXT;

	public void clickTheSaveAndNextButton() {
		SAVE_AND_NEXT.click();
	}

	// Feedback Page
	// Click The FeedBack
	@FindBy(xpath = "//a[contains(text(),'Collect Feedback')]")
	private WebElement COLLECT_FEEDBACK;

	public void clickTheCollectFeedbackButton() {
		COLLECT_FEEDBACK.click();
	}

	// Click The Log Out Profile
	@FindBy(xpath = "//img[@src='assets/images/user.png']")
	private WebElement LOGOUT_PROFILE;

	public void clickTheLogOutProfile() {
		LOGOUT_PROFILE.click();
	}

	// Click The Log Out
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement LOG_OUT;

	public void clickTheLogout() {
		LOG_OUT.click();
	}

	// Are you sure want to logout?
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement CLICK_THE_YES_OPTION;

	public void clickTheYesOption() {
		CLICK_THE_YES_OPTION.click();
	}
	
	
	

}
