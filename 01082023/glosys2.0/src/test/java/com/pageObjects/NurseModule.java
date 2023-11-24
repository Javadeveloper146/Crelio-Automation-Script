package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NurseModule {

	private static NurseModule nurseModule;

	private NurseModule() {

	}

	public static NurseModule getInstance() {
		if (nurseModule == null) {
			nurseModule = new NurseModule();
		}

		return nurseModule;

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage() {
		return ERROR_MESSAGE.getText();

	}

	// Click The Nusre-Chennai Option
	@FindBy(xpath = "//span[contains(text(),'Nurse ')]")
	private WebElement CLICK_THE_NURSE_CHENNAI_OPTION;

	public void clickTheNurseChennaiOption() {
		CLICK_THE_NURSE_CHENNAI_OPTION.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Select Country')]")
	private WebElement country;

	public void clickTheCountry() {
		country.click();
	}

	// India
	@FindBy(xpath = "//span[contains(text(),'India ')]")
	private WebElement india;

	public void clickTheIndia() {
		india.click();
	}

	// Philippines
	@FindBy(xpath = "//span[contains(text(),'Philippines ')]")
	private WebElement Philippines;

	public void clickThePhilippines() {
		Philippines.click();
	}

// Srilanka
	@FindBy(xpath = "//span[contains(text(),'Srilanka ')]")
	private WebElement Srilanka;

	public void clickTheSrilanka() {
		Srilanka.click();
	}

	// Srilanka
	@FindBy(xpath = "(//span[contains(text(),'Pakistan ')])")
	private WebElement Pakistan;

	public void clickThePakistan() {
		Pakistan.click();
	}
	@FindBy(xpath = "(//span[contains(text(),'Bangladesh ')])")
	private WebElement Bangaladesh;

	public void clickTheBangaladesh() {
		Bangaladesh.click();
	}
	// Srilanka
	@FindBy(xpath = "(//span[contains(text(),'Islamabad Division')])")
	private WebElement Karachi;

	public void clickTheKarachi() {
		Karachi.click();
	}

	// Click The Select Counter
	@FindBy(xpath = "//mat-select[@formcontrolname='counter']")
	private WebElement SELECT_COUNTER;

	public void clickTheSelectCounter() {
		SELECT_COUNTER.click();
	}

	// Click The Male Nurse Room Counter 2
	@FindBy(xpath = "//span[contains(text(),'Male Nurse Room counter 2')]")
	private WebElement CLICK_THE_MALE_NURSE_ROOM_COUNTER;

	public void clickTheMaleNurseRoomCounter() {
		CLICK_THE_MALE_NURSE_ROOM_COUNTER.click();
	}

	// Click The Counter Option "Counter 3"
	@FindBy(xpath = "//span[contains(text(),'Counter -  03')]")
	private WebElement CLICK_COUNTER_OPTION_3;

	public void clickTheCounterOption3() {
		CLICK_COUNTER_OPTION_3.click();
	}

	// Click The Counter Option "Counter 4"
	@FindBy(xpath = "//span[contains(text(),'Counter -  04')]")
	private WebElement CLICK_COUNTER_OPTION_4;

	public void clickTheCounterOption4() {
		CLICK_COUNTER_OPTION_4.click();
	}

	// Click The Select Button

	@FindBy(xpath = "//button[contains(text(),'Select')]")
	private WebElement SELECT_BUTTON;

	public void clickTheSelect_Button() {
		SELECT_BUTTON.click();
	}

	// Click The Next Button
	@FindBy(xpath = "//a[contains(text(),'Next')]")
	private WebElement NEXT_BUTTON;

	public void clickTheNextButton() {
		NEXT_BUTTON.click();
	}

	@FindBy(xpath = "//input[@formcontrolname='tokenNo']")
	private WebElement token;

	public String getTheToken() {
		return token.getText();
	}

	public void clickTheTokenTextBox() {
		token.click();
	}

	@FindBy(xpath = "(//div[@class='search-icon'])")
	private WebElement pa;

	public String particularValue() {
		return pa.getText();
	}

	@FindBy(xpath = "(//div[@class='container-fluid'])[2]")
	private WebElement all;

	public String getAllText() {
		return all.getText();
	}

	// Click The Skip Button
	@FindBy(xpath = "//a[contains(text(),' Skip')]")
	private WebElement Skip_BUTTON;

	public void clickThSkipButton() {
		Skip_BUTTON.click();
	}

	// Reason
	@FindBy(xpath = "(//span[contains(text(),'Select Reason')])[2]")
	private WebElement reason;

	public void clickTheReason() {
		reason.click();
	}

	// Incase Token get the message "Please call the next token"
	@FindBy(xpath = "//mat-error[@class='mat-error ng-star-inserted']")
	private WebElement PLEASE_CALL_THE_NEXT_TOKEN_RECALL;

	public String getThePleaseCallTheNextTokenRecall() {
		return PLEASE_CALL_THE_NEXT_TOKEN_RECALL.getText();
	}

	// Incase Any counter Issue it will take

	// Click The Recall Option Button
	@FindBy(xpath = "//a[contains(text(),' Recall')]")
	private WebElement RECALL_OPTION_BUTTON;

	public void clickTheRecallOptionButton() {
		RECALL_OPTION_BUTTON.click();
	}

	// Click The Recall Token Text Box
	@FindBy(xpath = "//input[@placeholder='Enter visa number']")
	private WebElement RECALL_TOKEN_TEXT_BOX;

	public void clickTheRecallTokenTextBox() {
		RECALL_TOKEN_TEXT_BOX.click();
	}

	// Enter The Visa Number
	@FindBy(xpath = "//input[@placeholder='Enter visa number']")
	private WebElement ENTER_THE_VISA_NUMBER_IN_RECALL_TOKEN;

	public void enterTheVisaNumberInRecallToken(String visaNumbeRecallToken) {
		ENTER_THE_VISA_NUMBER_IN_RECALL_TOKEN.sendKeys(visaNumbeRecallToken);
	}

	// Click The Recall Token Selction Button
	@FindBy(xpath = "//button[contains(text(),'Recall')]")
	private WebElement RECALL_TOKEN_BUTTON;

	public void clickTheRecallTokenButton() {
		RECALL_TOKEN_BUTTON.click();
	}

	// Click The Arrived Button
	@FindBy(xpath = "//a[contains(text(),'Arrived')]")
	private WebElement ARRIVED_BUTTON;

	public void clickTheArrivedButton() {
		ARRIVED_BUTTON.click();
	}

	// Click The Verify Token Button
	@FindBy(xpath = "//button[contains(text(),'Verify Token')]")
	private WebElement VERIFY_TOKEN;

	public void clickTheVerifyTokenButton() {
		VERIFY_TOKEN.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Skip')])[2]")
	private WebElement skip;

	public void clickTheSkipTheToken() {
		skip.click();
	}
	// Record Vitals
	// Body Mass Index

	// Click The Height Box
	@FindBy(xpath = "//input[@formcontrolname='height']")
	private WebElement HEIGHT_BOX;

	public void clickTheHeightBox() {
		HEIGHT_BOX.click();
	}

	// Get The Height Error message
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement GET_HEIGHT_ERROR;

	public String getTheHeightError() {
		return GET_HEIGHT_ERROR.getText();
	}

	// Get The Vision R
	@FindBy(xpath = "//mat-select[@formcontrolname='vision_r']")
	private WebElement visionR;

	public String getTheNormalVisionR() {
		return visionR.getText();
	}

	// Get The Vision L
	@FindBy(xpath = "//mat-select[@formcontrolname='vision_l']")
	private WebElement visionL;

	public String getTheNormalVisionL() {
		return visionL.getText();
	}

	// Get The Weight Error message
	@FindBy(xpath = "(//mat-error)[2]")
	private WebElement GET_WEIGHT_ERROR;

	public String getTheWeightError() {
		return GET_WEIGHT_ERROR.getText();
	}

	// Get The Right Vision Error message
	@FindBy(xpath = "(//mat-error)[3]")
	private WebElement GET_RIGHT_VISION_ERROR;

	public String getTheRigthVisionError() {
		return GET_RIGHT_VISION_ERROR.getText();
	}

	// Get The Left Vision Error message
	@FindBy(xpath = "(//mat-error)[4]")
	private WebElement GET_LEFT_VISION_ERROR;

	public String getTheLeftVisionError() {
		return GET_LEFT_VISION_ERROR.getText();
	}

	// Get The Systolic Pressure Error message
	@FindBy(xpath = "(//mat-error)[5]")
	private WebElement GET_SYSTOLIC_PRESSURE_ERROR;

	public String getTheSystolicPressureError() {
		return GET_SYSTOLIC_PRESSURE_ERROR.getText();
	}

	// Get The Temperature
	@FindBy(xpath = "//input[@formcontrolname='temperature']")
	private WebElement Temperature;

	public void enterTheTemperatureValue(String tempValue) {
		Temperature.sendKeys(tempValue);
	}

	// Get The Diatolic Pressure Error message
	@FindBy(xpath = "(//mat-error)[6]")
	private WebElement GET_DIATOLIC_PRESSURE_ERROR;

	public String getTheDiatolicPressureError() {
		return GET_DIATOLIC_PRESSURE_ERROR.getText();
	}

	// Enter The Height Value
	@FindBy(xpath = "//input[@placeholder='Enter Height']")
	private WebElement HEIGHT_ENTER_THE_VALUE;

	public void enterTheHeightValue(String heightValue) {
		HEIGHT_ENTER_THE_VALUE.sendKeys(heightValue);
	}

	// Click The Weight Box
	@FindBy(xpath = "//input[@placeholder='Enter Weight']")
	private WebElement WEIGHT_BOX;

	public void clickTheWeightBox() {
		WEIGHT_BOX.click();
	}

	// Enter The Weight value
	@FindBy(xpath = "//input[@placeholder='Enter Weight']")
	private WebElement WEIGHT_VALUE_ENTER;

	public void enterTheWeightValue(String weightValue) {
		WEIGHT_VALUE_ENTER.sendKeys(weightValue);
	}

	// Vision Module
	// Click The Vision (R) Box
	@FindBy(xpath = "//span[contains(text(),'Right Vision')]")
	private WebElement CLICK_THE_VISION_R_BOX;

	public void clickTheVision_R_Box() {
		CLICK_THE_VISION_R_BOX.click();
	}
	@FindBy(xpath = "(//span[contains(text(),'Right Vision')])[1]")
	private WebElement CLICK_Recheck_THE_VISION_R_BOX;

	public void clickThe_Rechcek_Vision_R_Box() {
		CLICK_Recheck_THE_VISION_R_BOX.click();
	}
	// Choose The Vision R Option (6/36)
	@FindBy(xpath = "(//mat-option[@role='option'])[6]")
	private WebElement CHOOSE_THE_VISION_R_OPTION;

	public void clickTheVisionAbnoraml_R_Option() {
		CHOOSE_THE_VISION_R_OPTION.click();

	}

	// Click Vision (L) Box
	@FindBy(xpath = "//span[contains(text(),'Left Vision')]")
	private WebElement CLICK_THE_VISION_L_BOX;

	public void clickTheVision_L_Box() {
		CLICK_THE_VISION_L_BOX.click();
	}
	@FindBy(xpath = "(//span[contains(text(),'Left Vision')])[1]")
	private WebElement CLICK_THE_RE_VISION_L_BOX;

	public void clickThe_Recheck_Vision_L_Box() {
		CLICK_THE_RE_VISION_L_BOX.click();
	}
	// Choose The Vision L Option (6/36)
	@FindBy(xpath = "(//mat-option[@role='option'])[6]")
	private WebElement CHOOSE_THE_VISION_L_OPTION;

	public void clickTheVisionAbnormal_L_Option() {
		CHOOSE_THE_VISION_L_OPTION.click();

	}

	// Incase Driver Applicate "Mantory in the field"
	@FindBy(xpath = "//b[@class='star ng-star-inserted']")
	private WebElement COLOR_VISION;

	public boolean getTheColorVisionMandatoryVisibleCondition() {
		return COLOR_VISION.isDisplayed();
	}

	// Color Vision
	// Click The Normal Radio Button
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[1]")

	private WebElement COLOR_VISION_NORMAL_RADIO_BUTTON;

	public void clickTheColorVisionNormalRadioButton() {
		COLOR_VISION_NORMAL_RADIO_BUTTON.click();
	}

	// Click The Poor Radio Button
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")

	private WebElement poorOption;

	public void clickTheColorVisionPoorRadioButton() {
		poorOption.click();
	}

	// Click The Color Plate
	@FindBy(xpath = "//mat-select[@formcontrolname='color_plate']")

	private WebElement COLOR_PLATE;

	public void clickTheColorPlateBox() {
		COLOR_PLATE.click();
	}

	// Others Module
	// Blood Pressure
	// Click The Systolic Pressure
	@FindBy(xpath = "//input[@placeholder='Systolic Pressure']")
	private WebElement CLICK_THE_SYSTOLIC_PRESSURE_BOX;

	public void clickTheSystolicPressure() {
		CLICK_THE_SYSTOLIC_PRESSURE_BOX.click();
	}

	// Enter The Systolic Pressure Value
	@FindBy(xpath = "//input[@placeholder='Systolic Pressure']")
	private WebElement ENTER_THE_SYSTOLIC_PRESSURE_VALUE;

	public void enterTheSystolicPressureValue(String systolicPressureValue) {
		ENTER_THE_SYSTOLIC_PRESSURE_VALUE.sendKeys(systolicPressureValue);
	}

	// Click The Diastolic Pressure
	@FindBy(xpath = "//input[@placeholder='Diastolic Pressure']")
	private WebElement CLICK_THE_DIASTOLIC_PRESSURE;

	public void clickTheDiastolicPressure() {
		CLICK_THE_DIASTOLIC_PRESSURE.click();
	}

	// Enter The Diastolic Pressure Value
	@FindBy(xpath = "//input[@placeholder='Diastolic Pressure']")
	private WebElement ENTER_THE_DIASTOLIC_PRESSURE_VALUE;

	public void enterTheDiastolicPressureValue(String diastolicPressureValue) {
		ENTER_THE_DIASTOLIC_PRESSURE_VALUE.sendKeys(diastolicPressureValue);
	}

	// Click The Save Button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SAVE_BUTTON;

	public void clickTheSaveButton() {
		SAVE_BUTTON.click();
	}

	// Click The Close
	@FindBy(xpath = "//span[contains(text(),'Close')]")
	private WebElement CLOSE_BUTTON;

	public void clickTheCloseButton() {
		CLOSE_BUTTON.click();
	}

	// Speciman Genaration
	// Click The Select All Option
	@FindBy(xpath = "(//span)[22]")
	private WebElement SELECT_ALL_OPTION;

	public void clickTheSpecimanGenarationSelectAllOption() {
		SELECT_ALL_OPTION.click();
	}

	// Click The Speciman Genaration button
	@FindBy(xpath = "//a[contains(text(),'Generate')]")
	private WebElement SPECIMAN_GENARATION;

	public void clickTheSpecimanGenarationButton() {
		SPECIMAN_GENARATION.click();
	}

	// Speciman Collection
	// Click The Select All Box
	@FindBy(xpath = "(//label[@class='mat-checkbox-layout'])[1]")
	private WebElement SPECIMAN_COLLECTION_ALL_SELECT_OPTION;

	public void clickTheSpecimanCollectionAllSelectOption() {
		SPECIMAN_COLLECTION_ALL_SELECT_OPTION.click();
	}

	// Click The Collected Button
	@FindBy(xpath = "//a[contains(text(),'Collected')]")
	private WebElement COLLECTED_BUTTON;

	public void clickTheCollectedButton() {
		COLLECTED_BUTTON.click();
	}

	@FindBy(xpath = "(//mat-checkbox)[1]")
	private WebElement Check_Box;

	public void clickTheCheckBox() {
		Check_Box.click();
	}

	// Get The Vaccine Error message
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement GET_VACCINE_ERROR;

	public String getTheVaccineError() {
		return GET_VACCINE_ERROR.getText();
	}

	// Get The Vaccine Error message1
	@FindBy(xpath = "(//mat-error)[3]")
	private WebElement GET_VACCINE1_ERROR;

	public String getTheVaccine1Error() {
		return GET_VACCINE1_ERROR.getText();
	}

	// Get The Batch enter Error message
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement GET_BATCH_ERROR;

	public String getTheBatchError() {
		return GET_BATCH_ERROR.getText();
	}

	// Get The Batch enter Error message 1
	@FindBy(xpath = "(//mat-error)[2]")
	private WebElement GET_BATCH1_ERROR;

	public String getTheBatch1Error() {
		return GET_BATCH1_ERROR.getText();
	}

	// Check one Case
	// Incase Upload the Vaccination Certicate Show in Generate Voucher Option
	// else Select The Yes Option Enter The Batch Number

	// Document Option "Enable" Or "Disable"
	@FindBy(xpath = "//*[@class='label2']")
	private WebElement DOCUMENT_VISIBLE_OR_NONVISIBLE_CONDITION;

	public String checkTheDocumentConditionVisibleOrNonVisible() {
		return DOCUMENT_VISIBLE_OR_NONVISIBLE_CONDITION.getText();
	}

	// CLick The Genetare Voucher Button
	@FindBy(xpath = "//button[contains(text(),'Generate Voucher')]")
	private WebElement GENERATE_VOUCHER_BUTTON;

	public void clickTheGenerateVoucherButton() {
		GENERATE_VOUCHER_BUTTON.click();
	}

	// Vaccination
	// TD Vaccine "No"
	// Click The "No" Radio Button in "TD Vaccine"
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[2]")
	private WebElement TD_VACCINE_NO_RADIO_BUTTON;

	public void clickTheTDVaccineNoRadioButton() {
		TD_VACCINE_NO_RADIO_BUTTON.click();
	}

	// Click the TD And MMR Select Reason
	@FindBy(xpath = "(//span[contains(text(),'Select reason')])[1]")
	private WebElement _VACCINE_SELECT_REASON;

	public void clickTheVaccineSelectReason() {
		_VACCINE_SELECT_REASON.click();
	}

// H/O fever in past 1 week? 

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[2]")
	private WebElement No1;

	public void clickButtonNo1() {
		No1.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[4]")
	private WebElement No2;

	public void clickButtonNo2() {
		No2.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[6]")
	private WebElement No3;

	public void clickButtonNo3() {
		No3.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[8]")
	private WebElement No4;

	public void clickButtonNo4() {
		No4.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[10]")
	private WebElement No5;

	public void clickButtonNo5() {
		No5.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[12]")
	private WebElement No6;

	public void clickButtonNo6() {
		No6.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[14]")
	private WebElement No7;

	public void clickButtonNo7() {
		No7.click();
	}

	@FindBy(xpath = "(//span[@class = 'mat-radio-inner-circle'])[16]")
	private WebElement No8;

	public void clickButtonNo8() {
		No8.click();
	}

	// MMR Vaccine "No"
	// Click The "No" Radio Button in "MMR Vaccine"
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[4]")
	private WebElement MMR_VACCINE_NO_RADIO_BUTTON;

	public void clickTheMMRVaccineNoRadioButton() {
		MMR_VACCINE_NO_RADIO_BUTTON.click();
	}

	// Vaccination
	// TD Vaccine "Yes"
	// Click The "Yes" Radio Button in "TD Vaccine"
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[1]")
	private WebElement TD_VACCINE_YES_RADIO_BUTTON;

	public void clickTheTDVaccineYesRadioButton() {
		TD_VACCINE_YES_RADIO_BUTTON.click();
	}

	// Click The TD Vaccine Box
	@FindBy(xpath = "(//input[@formcontrolname='batch_number'])[1]")
	private WebElement TD_VACCINE_TEXT_BOX;

	public void clickTheTDVaccineTextBox() {
		TD_VACCINE_TEXT_BOX.click();
	}

	// Enter The TD Vaccine Batch Number
	@FindBy(xpath = "(//input[@formcontrolname='batch_number'])[1]")
	private WebElement TD_VACCINE_DETAILS;

	public void enterTheTDVaccineDetails(String TDVaccine) {
		TD_VACCINE_DETAILS.sendKeys(TDVaccine);
	}

	// MMR Vaccine "Yes"
	// Click The "Yes" Radio Button in "MMR Vaccine"
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[3]")
	private WebElement MMR_VACCINE_YES_RADIO_BUTTON;

	public void clickTheMMRVaccineYesRadioButton() {
		MMR_VACCINE_YES_RADIO_BUTTON.click();
	}

	// Click The MMR Vaccine Box
	@FindBy(xpath = "(//input[@formcontrolname='batch_number'])[2]")
	private WebElement MMR_VACCINE_TEXT_BOX;

	public void clickTheMMRVaccineTextBox() {
		MMR_VACCINE_TEXT_BOX.click();
	}

	// Enter The MMR Vaccine Batch Number
	@FindBy(xpath = "(//input[@formcontrolname='batch_number'])[2]")
	private WebElement MMR_VACCINE_DETAILS;

	public void enterTheMMRVaccineDetails(String TDVaccine) {
		MMR_VACCINE_DETAILS.sendKeys(TDVaccine);
	}

	// Click The Save Button
	@FindBy(xpath = "//a[contains(text(),'Save')]")
	private WebElement VACCINE_SAVE_BUTTON;

	public void clickTheVaccineSaveButton() {
		VACCINE_SAVE_BUTTON.click();
	}

	// Do you want to save this vaccine information

	@FindBy(xpath = "(//span[contains(text(),'Yes')])[3]")
	private WebElement YES_OPTION;

	public void clickTheVaccineInformationYesOption() {
		YES_OPTION.click();
	}

	// Feedback
	// Click The Feedback Button
	// Click The Save Button
	@FindBy(xpath = "//a[contains(text(),'Collect Feedback')]")
	private WebElement NURSE_MODULE_COLLECT_FEEDBACK_BUTTON;

	public void clickTheNurseModuleColletFeedbackButton() {
		NURSE_MODULE_COLLECT_FEEDBACK_BUTTON.click();

	}

	@FindBy(xpath = "//*[@class='iconify iconify--fa']")
	private WebElement VisionDetails;

	public void clickVisionDetails() {
		VisionDetails.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	private WebElement RecheckSavaButton;

	public void clickRecheckSavaButton() {
		RecheckSavaButton.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement savebutton2;

	public void clickSaveButton2() {
		savebutton2.click();
	}

}
