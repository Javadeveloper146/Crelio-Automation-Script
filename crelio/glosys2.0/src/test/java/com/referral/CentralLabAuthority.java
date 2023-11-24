package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.CountryController;
import com.pageObjects.CentralLabAuthorityPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabDirector;
import com.pageObjects.LabJunior;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class CentralLabAuthority {
	private static final Logger LOGGER = LogManager.getLogger(CentralLabAuthority.class);
	public static String testName;

	public static int totalCount;
	public static boolean secondHivComformatryStatus;

	public void centralLabAuthorityFlow() throws Throwable {
		CommonUtility.sleepControl(1000);

		centralLabLogin();

		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		CentralLabAuthorityPOM.getInstance().clickTheCentralLabAuthority();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The CLA
		CommonUtility.sleepControl(5000);
		CentralLabAuthorityPOM.getInstance().clickCLAResultEntry();
		LOGGER.info("CLA Result Entry :");
		// Pending
		CommonUtility.sleepControl(3000);
		LabDirector.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(1500);
		LabJunior.getInstance().clickTheSearchButton();
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollUp100();

		// Hiv
		// Anti Hcv
		// Beta hcg
		// Rpr
		int hiv = LabJuniorWorkList.hivReferralCount;
		int antiHcv = LabJuniorWorkList.antiHCVReferralCount;
		int hbsag = LabJuniorWorkList.hBsAgReferralCount;
		// int rpr = LabJuniorWorkList.rprReferralCount;
		int betaHcgPositive = LabJuniorWorkList.bEtaHCGPositiveReferralToCentralLabAuthority;

		HashMap<String, Integer> getTheConfirmatoryCount = new HashMap<String, Integer>();
		getTheConfirmatoryCount.put("Hiv", hiv);
		getTheConfirmatoryCount.put("Anti HCV", antiHcv);
		getTheConfirmatoryCount.put("HbsAg", hbsag);
		// getTheConfirmatoryCount.put("RPR", rpr);
		getTheConfirmatoryCount.put("Beta Hcg Positive", betaHcgPositive);
		LOGGER.info("Test Name Details : " + getTheConfirmatoryCount);
		ArrayList<Integer> li = new ArrayList<Integer>();

		li.add(hiv);
		li.add(antiHcv);
		li.add(hbsag);
		// li.add(rpr);
		li.add(betaHcgPositive);

		totalCount = 0;

		for (int number : li) {
			totalCount += number;

		}
		LOGGER.info("Test Total Count : " + totalCount);

		// Click The Upload

		uploadDocument(3);
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollUp100();

		// Completed
		LOGGER.info("Completed :");
		CommonUtility.sleepControl(2000);
		CentralLabAuthorityPOM.getInstance().clickTheCompleted();

		// CentralLabAuthorityPOM.getInstance().clearTheVisaNumber();
//		CommonUtility.sleepControl(2000);
//		LabDirector.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSearchButton();

//		CommonUtility.sleepControl(3000);
//		CentralLabAuthorityPOM.getInstance().clickTheUploadIcon();

//		CommonUtility.sleepControl(3000);
//		CentralLabAuthorityPOM.getInstance().clickTheViewIcon();
//
//		CommonUtility.sleepControl(2000);
//		CommonDefinition.windowCloseFuncitonAltF4();
//
//		CommonUtility.sleepControl(4000);
//		GRODashBoard.getInstance().clickTheCloseSpeTra();

		// Log Out
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.logOut();

	}

	public void uploadDocument(int count) throws Throwable {

		if (count == 1) {
			CommonUtility.sleepControl(4000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(2000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			// hbsagUploadDocument(testName);
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {
					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				}
			} else {
				documentUpload();
			}

		}
		if (count == 2) {

			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				}
				else {
					CommonUtility.sleepControl(500);
					documentUpload();
				}
			} 

			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				}
				else {
					CommonUtility.sleepControl(500);
					documentUpload();
				}
			} 

		}
		if (count == 3) {

			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);

			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);

			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();

					CommonUtility.sleepControl(1000);
					document2();

				} else {
					System.err.println("Get It ");
					CommonUtility.sleepControl(1000);
					documentUpload();
				}
			}

			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {
					CommonUtility.sleepControl(500);
					documentUpload();
				}
			}

			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				}
				else {
					CommonUtility.sleepControl(500);
					documentUpload();
				}
			} 
		}
		if (count == 4) {
			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {
					CommonUtility.sleepControl(1000);
					documentUpload();
				}
			}
			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {

					documentUpload();
				}
			}
			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {

					documentUpload();
				}
			}

			CommonUtility.sleepControl(2000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {

					documentUpload();
				}
			}
		}
		if (count == 5) {
			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {

					documentUpload();
				}
			}

			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				}
				else {

					documentUpload();
				}
			} 
			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {
					CommonUtility.sleepControl(1000);
					documentUpload();
				}
			}
			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();

			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {

					documentUpload();
				}
			}

			CommonUtility.sleepControl(1000);
			testName = CentralLabAuthorityPOM.getInstance().getTheGetTestName1();
			LOGGER.info("Test Name  : " + testName);
			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheUploadIcon1();
			result(testName);
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				if (testName.equals("Neutralization Hbsag and Anti HBC Total")) {

					CommonUtility.sleepControl(1000);
					CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon2();
					CommonUtility.sleepControl(1000);
					document2();
				} else {
					CommonUtility.sleepControl(1000);
					documentUpload();
				}
			}
		}
	}

	public void result(String inputTestName) throws Throwable {

		String referralTypeTrim = inputTestName;
		String tagName = referralTypeTrim.trim();

		CommonUtility.sleepControl(3000);
		CentralLabAuthorityPOM.getInstance().clickTheSelectQualitativeType();
		switch (tagName) {
		case "Western Blot for HIV":

			if (ConstantProperties.HIV_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				secondHivComformatryStatus = true;
				CommonUtility.sleepControl(2000);
				CentralLabAuthorityPOM.getInstance().clickThePositive();
				LOGGER.info(tagName + " : Result Is  Positive");
			} else if (ConstantProperties.HIV_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(2000);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info(tagName + " : Result Is  Negative");
			}

			break;

		case "Neutralisation (HbsAg)":
			if (ConstantProperties.NEUTRALISATION_HBSAG_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				secondHivComformatryStatus = true;

				CommonUtility.sleepControl(1000);
				CentralLabAuthorityPOM.getInstance().clickThePositive();
				LOGGER.info(tagName + " : Result Is  Positive");

			} else if (ConstantProperties.NEUTRALISATION_HBSAG_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(1000);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info(tagName + " : Result Is  Negative");
			}
			break;

		case "Neutralization Hbsag and Anti HBC Total":

			if (ConstantProperties.HBSAG_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickThePositive();
				LOGGER.info(tagName + " : Result Is  Positive");

			} else if (ConstantProperties.HBSAG_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info(tagName + " : Result Is  Negative");
			}

			CommonUtility.sleepControl(1000);
			CentralLabAuthorityPOM.getInstance().clickTheSelectQualitativeType();

			if (ConstantProperties.HBSAG_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickThePositive1();
				LOGGER.info("Neutralisation (HbsAg) " + " : Result Is  Positive");

			} else if (ConstantProperties.HBSAG_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info("Neutralisation (HbsAg) " + " : Result Is  Negative");
			}

			break;
		case "Anti Hbc(total)":

			if (ConstantProperties.ANTI_HCV_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				CommonUtility.sleepControl(1000);
				CentralLabAuthorityPOM.getInstance().clickThePositive();
				LOGGER.info(tagName + " : Result Is  Positive");

			} else if (ConstantProperties.ANTI_HCV_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(1000);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info(tagName + " : Result Is  Negative");
			}
			break;
		case "PCR FOR HCV":

			if (ConstantProperties.ANTI_HCV_CLA_RESULT.equals(AppConstants.HIV_POSITIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickThePositive();
				LOGGER.info(tagName + " : Result Is  Positive");

			} else if (ConstantProperties.ANTI_HCV_CLA_RESULT.equals(AppConstants.HIV_NEGATIVE)) {
				CommonUtility.sleepControl(500);
				CentralLabAuthorityPOM.getInstance().clickTheNegative();
				LOGGER.info(tagName + " : Result Is  Negative");
			}
			break;

		default:
			break;
		}

	}

	public void documentUpload() throws Throwable {
		CommonUtility.sleepControl(2000);
		CentralLabAuthorityPOM.getInstance().clickTheReslutUploadDocumentIcon();
		CommonUtility.sleepControl(1000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("File Upload Successfully");
		// Save
		CommonUtility.sleepControl(1000);
		CentralLabAuthorityPOM.getInstance().clickTheSaveIcon();

		// Close
		CommonUtility.sleepControl(3000);
		CentralLabAuthorityPOM.getInstance().clickTheResultEntryClose();

		LOGGER.info("Result saved successfully");
	}

	public static void centralLabLogin() throws Throwable {
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.CENTRAL_LAB_AUTHORITY_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.CENTRAL_LAB_AUTHORITY_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.CENTRAL_LAB_AUTHORITY_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.CENTRAL_LAB_AUTHORITY_PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();

	}

	public static void document2() throws Throwable {
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("File Upload Successfully");
		// Save
		CommonUtility.sleepControl(2000);
		CentralLabAuthorityPOM.getInstance().clickTheSaveIcon();

		// Close
		CommonUtility.sleepControl(3500);
		CentralLabAuthorityPOM.getInstance().clickTheResultEntryClose();

		LOGGER.info("Result saved successfully");
	}

}
