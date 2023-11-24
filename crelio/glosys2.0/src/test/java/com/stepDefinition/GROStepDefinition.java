package com.stepDefinition;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.modules.ApplicationStatusCheck;
import com.modules.CredentialsController;
import com.negativeScenarios.NegativeScenario;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LoginPage;
import com.pageObjects.PatientProfiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GROStepDefinition {

	private static final Logger LOGGER = LogManager.getLogger(GROStepDefinition.class);
	CommonUtility commonUtility = new CommonUtility();

	public static long millisecondsForGro;
	public static String gender;
	public static String JobPosition;
	public static Boolean counterPushCondition;
	public static Boolean counterError;
	public static String getTheTokenDetails;
	public static String counterStatus;
	public static String tokenForFemaleInPregnacyYes;
	public static String tokenforFemaleNoPregnacy;
	public static String tokenForMale;

	public static Boolean genderStatus;
	public static String tokenLastTwoNumberForPregnacyYesAndMayBe;
	public static String tokenLastTwoNumberForPregnacyNo;
	public static String tokenLastTwoNumberForMale;

	public static String groTokenLastTwoNumberFinal;
	public static long groTotalSeconds;
	public static Long GROstart;
	public static Long secs;
	public static Long GROend;
	public static int count;

	@Given("enter the url")
	public void enter_the_url() throws Throwable {

		LOGGER.info(ConstantProperties.OPTOMETRIST_APPROVAL);
		LOGGER.info("Glosys Automation Script 2.0 Run In :  " + ConstantProperties.BROWSER + " Browser");

		DriverManager.getDriver().get(ConstantProperties.APPURL);

		boolean checkTheValue = ConstantProperties.APPLICATION_STATUS_CHECK_ENTER_YOUR_VISA_NUMBER.isBlank();

		if (checkTheValue == false) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.moiLogin();

			applicationStatusCheck.moiLoginAndRoleSelectionLocationBased(ConstantProperties.COUNTRY);
			applicationStatusCheck.onlyDircetVisaNumberVisaStatusCheckResult();
			// CommonDefinition.windowCloseFuncitonAltF4();
			// CommonUtility.enterFunction();

		}
	}

	@When("enter the valid userId login")
	public void enter_the_valid_userId_login() throws Throwable {
		// Login User Name And Password

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			NegativeScenario negativeScenario = new NegativeScenario();
			negativeScenario.loginNegativeScenario();
		}

		// Enter The Correct Username And Password
		CredentialsController controller = new CredentialsController();
		startTime();
		controller.groCredentialsController(ConstantProperties.STATE);

//		if (ConstantProperties.USERNAME.equals(AppConstants.USER_NAME)
//				&& ConstantProperties.PASSWORD.equals(AppConstants.PASSSWORD)) {
//
//			CommonUtility.sleepControl(700);
//			LoginPage.getInstance().clickTheSignInButton();
//
//		} else {
//			LOGGER.error("Username & Password Incorrect");
//		}
		CommonUtility.sleepControl(700);
		LoginPage.getInstance().clickTheSignInButton();
		endTime();
		LOGGER.info("Country" + ": " + ConstantProperties.COUNTRY);
		LOGGER.info("State" + ": " + ConstantProperties.STATE);
	}

	@When("select the role selection")
	public void select_the_role_selection() throws Throwable {

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			CommonUtility.sleepControl(2000);
			GRODashBoard.getInstance().clickTheProceedButton();
			CommonUtility.sleepControl(3000);
			LOGGER.error(GRODashBoard.getInstance().getErrorMessage());
		} else

		if (ConstantProperties.COUNTRY.equals("Defalut")) {
			CommonUtility.implicitWait(20);
			GRODashBoard.getInstance().clickTheRoleSelction();
			CommonUtility.sleepControl(500);
			GRODashBoard.getInstance().clickTheGROChennaiOption();

			LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
			// Click The country

			switch (ConstantProperties.COUNTRY) {
			case "India":
				CommonDefinition.countryIndia();
				break;
			case "Philippines":
				CommonDefinition.countryPhilippines();
				break;

			case "Srilanka":
				CommonDefinition.srilankaCountry();
				break;

			case "Pakistan":
				CommonDefinition.pakistan_Country();
				break;
			default:

				break;
			}

			CommonUtility.sleepControl(500);
			GRODashBoard.getInstance().clickTheProceedButton();
		}
	}

	@When("select the counter	selection")
	public void select_the_counter_selection() throws Throwable {
		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			CommonUtility.sleepControl(3000);
			startTime();
			GRODashBoard.getInstance().clickTheSelectButton();

			LOGGER.error(GRODashBoard.getInstance().getErrorMessage());
			CommonUtility.sleepControl(2000);
		} else

			CommonDefinition.counterAutoRefreshAndHandle();
	}

	@When("enter the valid Visa Application Number")
	public void enter_the_valid_visa_application_number() throws Throwable {

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			CommonUtility.sleepControl(1000);

			// Click Save Button
			GRODashBoard.getInstance().clickTheValidateVNButton();

			// Get The mat Error Message
			CommonUtility.sleepControl(4000);
			LOGGER.error(GRODashBoard.getInstance().getTheMatErrorInVisa());
		} else

			CommonUtility.sleepControl(1000);
		startTime();
		GRODashBoard.getInstance().enterTheVisaApplicationNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheValidateVNButton();

		LOGGER.info("Visa Number" + ": " + ConstantProperties.VISA_NUMBER);

//		CommonUtility.sleepControl(700);
//		GRODashBoard.getInstance().clickTheRegenToken();

		// System.err.println("Counter " + count);

	}

	@When("Verify the Biometric FingerPrint")
	public void verify_the_biometric_finger_print() throws Throwable {

		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();
		endTime();
		LOGGER.info("Biometric skip request sent successfully");

	}

	@When("enter The Patient profile details")
	public void enter_the_patient_profile_details() throws Throwable {

		// Get The Visa Gender Type
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(6000);
		} else {
			CommonUtility.sleepControl(3500);
		}
		gender = PatientProfiles.getInstance().getTheVisaGenderType();
//		if(gender.equals("Select Gender")) {
//			
//			do {
//				CommonUtility.sleepControl(1000);
//				gender = PatientProfiles.getInstance().getTheVisaGenderType();
//				if(gender.equals("Select Gender")) {
//					 genderStatus = false;
//				}else {
//					genderStatus = true;	
//				}
//			} while (genderStatus==true);
//		}

		LOGGER.info("Patient Profile Page");
		LOGGER.info("Personal Details" + ": ");
		LOGGER.info("Visa Gender Type" + ": " + gender);
		// Patient Profile
		// Directly click The Save And Print Button
		// Click The Save And Print Button
		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			if (gender.equals(AppConstants.FEMALE_GENDER)) {
				CommonDefinition commonDefinition = new CommonDefinition();
				startTime();
				commonDefinition.visaGenderTypeFemale();
			}
			if (gender.equals(AppConstants.MALE_GENDER)) {
				CommonDefinition commonDefinition = new CommonDefinition();
				startTime();
				commonDefinition.visaGenderTypeMale();
			}
		}
//		CommonUtility.sleepControl(1000);
//		GRODashBoard.getInstance().closeThePopUp();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(500);
		}
		CommonUtility.scrollDown100();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(500);
		}
		PatientProfiles.getInstance().clickTheTitleBox();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(200);
		}
		PatientProfiles.getInstance().clickTheTitleOptionMrs();
		// Only Possitive Scenario
		if (AppConstants.NEGATIVE_SCENARIO_NO.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
		}

		switch (gender) {
		case AppConstants.FEMALE_GENDER:

			// Pregnant
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			PatientProfiles.getInstance().clickThePregnantBox();
			if (AppConstants.PREGNANT_YES.equals(ConstantProperties.PREGNANT_STATUS)) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(200);
				}
				PatientProfiles.getInstance().clickThePregnantYesOption();
				LOGGER.info("Applicant Believes Pregnant?" + ": " + ConstantProperties.PREGNANT_STATUS);

			}
			if (AppConstants.PREGNANT_MAYBE.equals(ConstantProperties.PREGNANT_STATUS)) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(200);
				}
				PatientProfiles.getInstance().clickThePregnantMayBeOption();
				LOGGER.info("Applicant Believes Pregnant?" + ": " + ConstantProperties.PREGNANT_STATUS);
			}
			if (AppConstants.PREGNANT_NO.equals(ConstantProperties.PREGNANT_STATUS)) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(200);
				}
				PatientProfiles.getInstance().clickThePregnantNoOption();
				LOGGER.info("Applicant Believes Pregnant?" + ": " + ConstantProperties.PREGNANT_STATUS);
			}
			break;
		case AppConstants.MALE_GENDER:
			LOGGER.info("Visa Gender Type is" + ": " + gender);
		default:
			break;
		}

		LOGGER.info("Successfully enter the Personal information details");

	}

	@When("enter The Communication details")
	public void enter_the_communication_details() throws Throwable {
		LOGGER.info("Communcation Details" + ": ");

		// Communication
		// Get The Country
		LOGGER.info("Country" + ": " + PatientProfiles.getInstance().getTheCountry());

		// Preferred Language to Speak
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}

		PatientProfiles.getInstance().clickThePreferredLanguageToSpeakDropDown();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(300);
		}

		GRODashBoard.getInstance().clickFirstDropDownOption();
		LOGGER.info(
				"Preferred Language to Speak" + ": " + PatientProfiles.getInstance().getThePerferredLanguageSpeak());

		// Preferred Language To Read
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}

		PatientProfiles.getInstance().clikThePreferredLanguageToReadDropdown();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}

		GRODashBoard.getInstance().clickFirstDropDownOption();
		LOGGER.info("Preferred Language to Read" + ": " + PatientProfiles.getInstance().getThePerferredLanguageRead());

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}

		// Preferred Location for Referral
		PatientProfiles.getInstance().clickThePreferredLocationForReferralDropDown();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}
		GRODashBoard.getInstance().clickFirstDropDownOption();

		// PatientProfiles.getInstance().clickThePreferredLocationForReferralDropDownOption();
		LOGGER.info("Preferred Location for Referral" + ": " + PatientProfiles.getInstance().getTheperferredLocation());

		// Preferred Hospital
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(600);
		}

		PatientProfiles.getInstance().clickThePreferredHospitalDropdown();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(300);
		}

		GRODashBoard.getInstance().clickFirstDropDownOption();

		LOGGER.info("Preferred Hospital" + ": " + PatientProfiles.getInstance().getThehospital());
		LOGGER.info("Successfully enter The Communication Details");
	}

	@When("enter The  Encounter details")
	public void enter_the_encounter_details() throws Throwable {
		LOGGER.info("Encounter Details" + ": ");
		// SMS Alert Number
		CommonUtility.sleepControl(700);
		CommonUtility.scrollDown100();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}
		PatientProfiles.getInstance().enterTheSMSAlertNumber(AppConstants.SMS_ALERT_NUMBER);
		LOGGER.info("SMS Alert Number" + ": " + AppConstants.SMS_ALERT_NUMBER);

	}

	@When("get The Job Position")
	public void get_the_job_position() throws Throwable {
		JobPosition = PatientProfiles.getInstance().getTheJobPostion();
		LOGGER.info("Job Position : " + JobPosition);

	}

	@When("get The Is Job applicable of Driving")
	public void get_the_is_job_applicable_of_driving() throws Throwable {

		// Condition Is Job application of Driver
		// Yes Radio Button Condition
		boolean conditionOfRadioButton = PatientProfiles.getInstance().checkTheDriverApplicantYesRadioButton();
		LOGGER.info("Is Job applicable of Driving" + ": " + conditionOfRadioButton);
		LOGGER.info("Successfully enter The Encounter details");
	}

	@When("enter The All details after click The Consent Abbreviation")
	public void enter_the_all_details_after_click_the_consent_abbreviation() throws Throwable {

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(1500);
		}

		// PatientProfiles.getInstance().clickTheConsentAbbreviation();
		WebElement element = DriverManager.getDriver()
				.findElement(By.xpath("//a[contains(text(),'Consent Abbreviation')]"));
		Actions actions = new Actions(DriverManager.getDriver());
		actions.moveToElement(element).click().build().perform();

		// Click The Applicant Signature
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(7000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		// PatientProfiles.getInstance().clickTheApplicantSignatureButton();
		WebElement element1 = DriverManager.getDriver()
				.findElement(By.xpath("//a[contains(text(),'Applicant Signature')]"));
		Actions actions1 = new Actions(DriverManager.getDriver());
		actions1.moveToElement(element1).click().build().perform();

		// Click The Popup Close
		// LoginPage.getInstance().clickPopUpClose();
		// Click The Save And Print Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		
		
	//	PatientProfiles.getInstance().clickTheSaveAndPrintButton();
		WebElement element2 = DriverManager.getDriver()
				.findElement(By.xpath("//a[contains(text(),'Save')]"));
		Actions actions2 = new Actions(DriverManager.getDriver());
		actions2.moveToElement(element2).click().build().perform();


		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		CommonDefinition.windowHandling();

		endTime();
		// Close The APPLICANT CONSENT AND DECLARATION FORM

		LOGGER.info("Applicant Consent And Declaration From");
		LOGGER.info("Applicant Details Created Successflly");

//		Set<String> handles = DriverManager.getDriver().getWindowHandles();
//		List<String> list = new ArrayList<>(handles);
//		DriverManager.getDriver().switchTo().window(list.get(1));
//		DriverManager.getDriver().close();
//		DriverManager.getDriver().switchTo().window(list.get(0));

	}

	@Then("next page is Place Order")
	public void next_page_is_place_order() throws Throwable {
		LOGGER.info("Place Order Page");

	}

	@Then("Click The proceed With Selection")
	public void click_the_proceed_with_selection() throws Throwable {

		// Get Token Details

		// Token no (NNXD008) generated successfully -- Female Pre - No And Male Only
		// Allowed In Xray
		// Token no (NND002) generated successfully --Female Pre - Yes Maybe
		CommonUtility.sleepControl(800);
		getTheTokenDetails = PatientProfiles.getInstance().getTheTokenDetails();
		LOGGER.info("Token Genarated " + ": " + getTheTokenDetails);
		switch (gender) {
		case AppConstants.FEMALE_GENDER:
			if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {
				String token = getTheTokenDetails;
				String token1 = getTheTokenDetails;
				tokenForFemaleInPregnacyYes = token.substring(13, 20);
				// System.err.println("Xray Page Allowed");
				LOGGER.info("Visa Gender Type: " + gender + " - Pregnant - " + ConstantProperties.PREGNANT_STATUS
						+ " Xray Page Allowed");

				LOGGER.info("Token : " + tokenForFemaleInPregnacyYes);
				tokenLastTwoNumberForPregnacyNo = token1.substring(18, 20);
				// System.err.println(tokenLastTwoNumberForPregnacyNo);
				groTokenLastTwoNumberFinal = tokenLastTwoNumberForPregnacyNo;

			} else {
				String token = getTheTokenDetails;
				String token1 = getTheTokenDetails;
				tokenforFemaleNoPregnacy = token.substring(13, 19);
				// System.err.println(tokenforFemaleNoPregnacy);
				LOGGER.info("Visa Gender Type: " + gender + " - Pregnant - " + ConstantProperties.PREGNANT_STATUS
						+ "Xray Page Not Allowed");
				LOGGER.info("Token : " + tokenforFemaleNoPregnacy);

				tokenLastTwoNumberForPregnacyYesAndMayBe = token1.substring(17, 19);
				// System.err.println(tokenLastTwoNumberForPregnacyYesAndMayBe);
				groTokenLastTwoNumberFinal = tokenLastTwoNumberForPregnacyYesAndMayBe;
			}
			break;

		case AppConstants.MALE_GENDER:
			String token = getTheTokenDetails;
			String token1 = getTheTokenDetails;
			tokenForMale = token.substring(13, 20);
			// System.err.println("Xray Page Allowed");
			LOGGER.info("Visa Gender Type: " + gender + " - " + "Xray Page Allowed");
			LOGGER.info("Token : " + tokenForMale);
			// System.err.println("Xray Page Allowed");
			tokenLastTwoNumberForMale = token1.substring(18, 20);
			// System.err.println(tokenLastTwoNumberForMale);
			groTokenLastTwoNumberFinal = tokenLastTwoNumberForMale;
			break;

		default:
			System.err.println("Token Issues Please Checked");
			break;
		}

		// Place Order
		// Check The Pregnancy Care With RPR Package Status
		// Screen Short

//		if (gender.equals(AppConstants.FEMALE_GENDER)) {
//
//			// Yes
//			if (AppConstants.PREGNANT_YES.equals(ConstantProperties.PREGNANT_STATUS)) {
//				CommonUtility.sleepControl(1000);
//				LOGGER.info("Visa Gender Type" + ": " + gender + " - " + "Applicant Believes Pregnant" + ": "
//						+ ConstantProperties.PREGNANT_STATUS);
//				CommonDefinition commonDefinition = new CommonDefinition();
//				commonDefinition.pregnantOptionYes();
//
//			}
		// May be
//			if (AppConstants.PREGNANT_MAYBE.equals(ConstantProperties.PREGNANT_STATUS)) {
//				CommonUtility.sleepControl(1000);
//				LOGGER.info("Visa Gender Type" + ": " + gender + " - " + "Applicant Believes Pregnant" + ": "
//						+ ConstantProperties.PREGNANT_STATUS);
//				CommonDefinition commonDefinition = new CommonDefinition();
//				commonDefinition.pregnantOptionMaybe();
////
//			}
//
//			// No
//			if (AppConstants.PREGNANT_NO.equals(ConstantProperties.PREGNANT_STATUS)) {
//				CommonUtility.sleepControl(1000);
//				LOGGER.info("Visa Gender Type" + ": " + gender + " - " + "Applicant Believes Pregnant" + ": "
//						+ ConstantProperties.PREGNANT_STATUS);
//				CommonDefinition commonDefinition = new CommonDefinition();
//				commonDefinition.pregnantOptionNo();
//			}
//		}
//
//		if (gender.equals(AppConstants.MALE_GENDER)) {
//			CommonUtility.sleepControl(1000);
//			LOGGER.info("Visa Gender Type" + ": " + gender);
//			CommonDefinition commonDefinition = new CommonDefinition();
//			commonDefinition.maleApplicant();
//		}

		// Click The Proceed with Selection Button

//		CommonUtility.sleepControl(1500);
//		PatientProfiles.getInstance().clickTheProceedWithSelectionButton();
		LOGGER.info("Generate Service Recipt");

		// Close The Sevice Receipt Page
//		CommonUtility.sleepControl(1000);
//		CommonDefinition.windowCloseFuncitonAltF4();

	}

	@Then("Capture Identity page enter the details")
	public void capture_identity_page_enter_the_details() throws Throwable {
		LOGGER.info("Capture Identify Page:");

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			CommonUtility.sleepControl(3000);
			PatientProfiles.getInstance().clickTheSaveAndNextButton();
			LOGGER.error(PatientProfiles.getInstance().getErrorMessage1());
			LOGGER.error(PatientProfiles.getInstance().getErrorMessage2());
			LOGGER.error(PatientProfiles.getInstance().getErrorMessage3());
		} else

//		// Issued Date
//		PatientProfiles.getInstance().clickTheCalenderIcon();
//		PatientProfiles.getInstance().clickTheCurrentDate();
//		LOGGER.info("Issued Date" + ":" + "01-11-2022");
//
//		// Expiry Date
//		PatientProfiles.getInstance().clickTheExpiryDateBox();
//		CommonUtility.sleepControl(1000);
//		PatientProfiles.getInstance().clickTheExpiryDateSelect();
//		LOGGER.info("Expiry Date" + ":" + "31-11-2022");
//
//		// Issued At
//		PatientProfiles.getInstance().clickTheIssuedAtTextBox();
//		PatientProfiles.getInstance().enterTheIssuedAtDetails(AppConstants.ISSUED_AT);
//		LOGGER.info("Issue At" + ":" + AppConstants.ISSUED_AT);

			// ---- Upload Vaccination Upload Document
			// Vaccination Document
			LOGGER.info("Vaccination Document Status Condition is" + ": "
					+ ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS);
		LOGGER.info(
				"Referral Document Status Condition is" + ": " + ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS);
		if (AppConstants.VACCINATION_DOCUMENT_STATUS_YES
				.equals(ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS)) {
			CommonUtility.sleepControl(1000);

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.gro_module_capture_identify_page_vaccination_document_upload_function();
		}

		// Refferral Letter Document Upload
		// Ref "Yes" - Ref "Yes"

		if (AppConstants.REFERRAL_DOCUMENT_STATUS_YES.equals(ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS)) {

			// Vac "Yes" Vac "Yes" in case "No" Not Excute
			if (AppConstants.VACCINATION_DOCUMENT_STATUS_YES
					.equals(ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS)) {
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown400();

				// Click The Add Document Option
				CommonUtility.sleepControl(2000);
				PatientProfiles.getInstance().clickTheAddDocument();

				// Click The Select Document Type
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance().clickTheSelectDocumentTypeBox();
				CommonUtility.sleepControl(2000);
				PatientProfiles.getInstance().clickTheRefferralLetteroption();

				// Click The Document Name Text Box
				CommonUtility.sleepControl(2000);
				PatientProfiles.getInstance().clickTheRefferralLetterCertificateText_Box();

				// Enter The Vaccination Document Details
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance()
						.enterTheRefferralLetterDocumentDetails(AppConstants.VACCINATION_DOCUMENT_TEXT);

				// Click The Refferral Document Upload Icon Button
				CommonUtility.sleepControl(3000);
				PatientProfiles.getInstance().clickTheRefferralUploadIconButton();

				// Upload Document Condition
				String vaccinationDocumentPathLocation = AppConstants.VACCINATION_DOCUMENT_PATH;
				StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				CommonDefinition commonDefinition = new CommonDefinition();
				commonDefinition.uploadDocumentRobotFunction();

			}
		}
		// Ref "Yes" - Ref "Yes"
		if (AppConstants.REFERRAL_DOCUMENT_STATUS_YES.equals(ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS)) {

			// Vac "No" Vac "No" in case "Yes" Not Excute
			if (AppConstants.VACCINATION_DOCUMENT_STATUS_NO
					.equals(ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS)) {
				// Click The Select Document Type
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance().clickTheSelectDocumentTypeBox();
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance().clickTheRefferralLetteroption();

				// Click The Document Name Text Box
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance().clickTheRefferralLetterOnlyCertificateText_Box();

				// Enter The Vaccination Document Details
				CommonUtility.sleepControl(1000);
				PatientProfiles.getInstance()
						.enterTheRefferralLetterOnlyDocumentDetails(AppConstants.REFERRAL_DOCUMENT_TEXT);

				// Click The Refferral Document Upload Icon Button
				CommonUtility.sleepControl(3000);
				PatientProfiles.getInstance().clickTheRefferralOnlyUploadIconButton();

				// Upload Document Condition
				String vaccinationDocumentPathLocation = AppConstants.REFERRAL_LETTER_DOCUMENT_PATH;
				StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

				CommonDefinition commonDefinition = new CommonDefinition();
				commonDefinition.uploadDocumentRobotFunction();

				LOGGER.info("Referral Document Upload Successfully");

			}
		}

		// Click The Save And Next Button
		LOGGER.info("Start Time  = " + GROstart);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(1500);
		}
		startTime();
		CommonDefinition.windowHandling();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3500);
		} else {
			CommonUtility.sleepControl(1800);
		}

		PatientProfiles.getInstance().clickTheSaveAndNextButton();
		endTime();
		LOGGER.info("Applicant identity details updated successfully");
	}

	@Then("gro feedback page")
	public void gro_feedback_page() throws Throwable {

		LOGGER.info("Start Time  = " + GROstart);
		CommonUtility.sleepControl(500);
		startTime();
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("GRO Module Feedback Collected");

		CommonUtility.sleepControl(3000);

	}

	@Then("Logout in GRO Module")
	public void logout_in_GRO_Moudle() throws Throwable {
		// LogOut
		endTime();
		CommonDefinition commonDefinition = new CommonDefinition();
		LOGGER.info("Start Time  = " + GROstart);

		commonDefinition.logOut();

		if (ConstantProperties.APPLICATION_STATUS.equals(AppConstants.YES)) {
			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		GROend = System.currentTimeMillis();
		millisecondsForGro = (GROend - GROstart);
		LOGGER.info("GRO Runing Time : ");
		groRunTime(millisecondsForGro);
		LOGGER.info("Milli Sec Time : " + millisecondsForGro);
	}

	public void groRunTime(long milliseconds) {

		double totalTime = (milliseconds / 1000) / 60;
		double totalTimeforSec = (milliseconds / 1000);
		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		groTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info("Total Time in  Seconds = " + groTotalSeconds + " " + "seconds");

	}

	public static void startTime() {
		GROstart = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + GROstart);
	}

	public static void endTime() {
		GROend = System.currentTimeMillis();
		LOGGER.info("End  Runing Time : " + GROend);
		millisecondsForGro = (GROend - GROstart);
		LOGGER.info("Milli Sec Time : " + millisecondsForGro);
		secs = (millisecondsForGro / 60);
		LOGGER.info("Secs Sec Time : " + secs);
		LOGGER.info("GRO Runing Time : ");

	}

}
