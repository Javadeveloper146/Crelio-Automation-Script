package com.modules;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.modulesPOM.CentralUploadPom;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class StemzGpRejectApprovalCentralResultUpload {
	private static final Logger LOGGER = LogManager.getLogger(StemzGpRejectApprovalCentralResultUpload.class);

	public static int rejectTotalCount;
	public static int specilityRejectTotalCount;
	public static int additionalLabRejectTotalCount;
	public static int conformatoryLabRejectTotalCount;
	public static String testName1;
	public static String testName2;
	public static String testName3;
	public static String testName4;
	public static String testName5;
	public static String testName6;
	public static String testName7;

	public void stemzGpApprovalRejectAndGroRef() throws Throwable {

		boolean generalMedicineStatus = ReferralDocumentApprovalController.generalMedicineStatus;
		boolean betaHcgNegativeGynacologyStatus = ReferralDocumentApprovalController.gynacologyStatus;
		boolean cardilogyStatus = ReferralDocumentApprovalController.cardilogyStatus;
		boolean ophthalmologistStatus = ReferralDocumentApprovalController.ophthalmologistStatus;
		boolean bpStatus = ReferralDocumentApprovalController.bpStatus;
		boolean orthopedicStatus = ReferralDocumentApprovalController.orthopedicStatus;

		boolean sgotStatus = ReferralDocumentApprovalController.sgotStatus;
		boolean sgptStatus = ReferralDocumentApprovalController.sgptStatus;
		boolean glucosehbsgcStatus = ReferralDocumentApprovalController.glucosehbsgcStatus;
		boolean creatinineStatus = ReferralDocumentApprovalController.creatinineStatus;

//		boolean hbsagStatus = ReferralDocumentApprovalController.hbsagStatus;
//		boolean hivStatus = ReferralDocumentApprovalController.hivStatus;
//		boolean antiHcvStatus = ReferralDocumentApprovalController.antiHcvStatus;
//		boolean rprStatus = ReferralDocumentApprovalController.rprStatus;

		HashMap<String, Boolean> getTheValue = new HashMap<String, Boolean>();
		getTheValue.put("General Medicine ", generalMedicineStatus);
		getTheValue.put(" Beta Hcg Negative Gynacology  ", betaHcgNegativeGynacologyStatus);
		getTheValue.put("Cardilogy  ", cardilogyStatus);
		getTheValue.put("Ophthalomologist  ", ophthalmologistStatus);
		getTheValue.put("BP  ", bpStatus);
		getTheValue.put("Orthopedic   ", orthopedicStatus);

		LOGGER.info("Specility Test Name " + getTheValue);
		HashMap<String, Boolean> getTheValue1 = new HashMap<String, Boolean>();
		getTheValue1.put("SGOT  ", sgotStatus);
		getTheValue1.put("SGPT  ", sgptStatus);
		getTheValue1.put("Glucose  ", glucosehbsgcStatus);
		getTheValue1.put("Creatinine  ", creatinineStatus);

		LOGGER.info("Additional Lab  Test Name " + getTheValue1);

//		HashMap<String, Boolean> getTheValue2 = new HashMap<String, Boolean>();
//		getTheValue2.put("HbsAg  ", hbsagStatus);
//		getTheValue2.put("HIV  ", hivStatus);
//		getTheValue2.put("Anti Hcv  ", antiHcvStatus);
//		getTheValue2.put("RPR  ", rprStatus);
//
//		LOGGER.info("Confirmatory Lab  Test Name " + getTheValue2);

		// Get The Value
		int generalMedicineCount = ReferralDocumentApprovalController.generalMedicineCount;
		int betaHcgNegativeGynacologyCount = ReferralDocumentApprovalController.gynacologyCount;
		int cardilogyCount = ReferralDocumentApprovalController.cardilogyCount;
		int ophthalmologistCount = ReferralDocumentApprovalController.ophthalmologistCount;
		int bpCount = ReferralDocumentApprovalController.bpCount;
		int orthopedicCount = ReferralDocumentApprovalController.orthopedicCount;

		int sgotCount = ReferralDocumentApprovalController.sgotCount;
		int sgptCount = ReferralDocumentApprovalController.sgptCount;
		int glucosehbsgcCount = ReferralDocumentApprovalController.glucosehbsgcCount;
		int creatinineCount = ReferralDocumentApprovalController.creatinineCount;
//

//		int hbsagCount = ReferralDocumentApprovalController.hbsagCount;
//		int hivCount = ReferralDocumentApprovalController.hivCount;
//		int antiHcvCount = ReferralDocumentApprovalController.antiHcvCount;
//		int rprCount = ReferralDocumentApprovalController.rprCount;

		HashMap<String, Integer> getTheValueCount = new HashMap<String, Integer>();
		getTheValueCount.put("General Medicine ", generalMedicineCount);
		getTheValueCount.put("Gynacology  ", betaHcgNegativeGynacologyCount);
		getTheValueCount.put("Cardilogy  ", cardilogyCount);
		getTheValueCount.put("Ophthalomologist  ", ophthalmologistCount);
		getTheValueCount.put("BP  ", bpCount);
		getTheValueCount.put("Orthopedic   ", orthopedicCount);

		LOGGER.info("Specility  Reject Test Nmae: " + getTheValueCount);

		ArrayList<Integer> li = new ArrayList<Integer>();

		li.add(generalMedicineCount);
		li.add(betaHcgNegativeGynacologyCount);
		li.add(cardilogyCount);
		li.add(ophthalmologistCount);
		li.add(bpCount);
		li.add(orthopedicCount);

		specilityRejectTotalCount = 0;

		for (int number : li) {
			specilityRejectTotalCount += number;

		}

		LOGGER.info("Specility  Reject Count Value: " + specilityRejectTotalCount);

		HashMap<String, Integer> getTheValueCount1 = new HashMap<String, Integer>();
		getTheValueCount1.put("SGOT  ", sgotCount);
		getTheValueCount1.put("SGPT  ", sgptCount);
		getTheValueCount1.put("Glucose  ", glucosehbsgcCount);
		getTheValueCount1.put("Creatinine  ", creatinineCount);
		LOGGER.info(" Additional Reject Test Count : " + getTheValueCount1);

		ArrayList<Integer> li1 = new ArrayList<Integer>();
		li1.add(sgotCount);
		li1.add(sgptCount);
		li1.add(glucosehbsgcCount);
		li1.add(creatinineCount);

		additionalLabRejectTotalCount = 0;

		for (int number : li1) {
			additionalLabRejectTotalCount += number;

		}
		LOGGER.info(" Additional Reject Test Value : " + additionalLabRejectTotalCount);

//		HashMap<String, Integer> getTheValueCount2 = new HashMap<String, Integer>();
//		getTheValueCount2.put("HbsAg  ", hbsagCount);
//		getTheValueCount2.put("HIV  ", hivCount);
//		getTheValueCount2.put("Anti Hcv  ", antiHcvCount);
//		getTheValueCount2.put("RPR  ", rprCount);
//
//		LOGGER.info("Conformatory Reject Test Value: " + getTheValueCount2);
//
//		ArrayList<Integer> li2 = new ArrayList<Integer>();
//		li2.add(hbsagCount);
//		li2.add(hivCount);
//		li2.add(antiHcvCount);
//		li2.add(rprCount);
//
//		conformatoryLabRejectTotalCount = 0;
//
//		for (int number : li) {
//			conformatoryLabRejectTotalCount += number;
//
//		}
//		LOGGER.info("Conformatory Reject Test Value: " + conformatoryLabRejectTotalCount);

		// Central Result Upload
		CommonDefinition commonDefinition = new CommonDefinition();
//		CredentialsController controller = new CredentialsController();
//		controller.credentialsController(ConstantProperties.STATE);

		LoginPage.getInstance().clickTheSignInButton();
		CommonUtility.waitFor2Sec();
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		CentralUploadPom.getInstance().clickCentralUpload();
		CommonUtility.sleepControl(1000);
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		// Click The country
		if (ConstantProperties.COUNTRY.equals("Manila")) {
			CommonDefinition.countryPhilippines();
		} else if (ConstantProperties.COUNTRY.equals("India")) {
			CommonDefinition.countryIndia();
		}
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheProceedButton();

		CommonUtility.sleepControl(4000);
		CentralUploadPom.getInstance().clickCentralResultUpload();

		// Reupload
		CommonUtility.sleepControl(4000);
		CentralUploadPom.getInstance().clickReupload();

		// Enter The Visa Number
		CommonUtility.sleepControl(2000);
		CentralUploadPom.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(2000);
		CentralUploadPom.getInstance().clickSearchButton();

		if (generalMedicineStatus == false && betaHcgNegativeGynacologyStatus == false && cardilogyStatus == false
				&& ophthalmologistStatus == false && bpStatus == false && orthopedicStatus == false) {

			LOGGER.info("Reject Status is : False");

		} else {
			if (specilityRejectTotalCount == 1) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

			} else if (specilityRejectTotalCount == 2) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

			} else if (specilityRejectTotalCount == 3) {

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 3 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);
			} else if (specilityRejectTotalCount == 4) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 3 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 4 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);
			}

			else if (specilityRejectTotalCount == 5) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 3 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 4 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 5 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);
			}
		}

		// Additional
		if (sgotStatus == false && sgptStatus == false && glucosehbsgcStatus == false && creatinineStatus == false) {

		} else {

			CommonUtility.sleepControl(2000);
			CentralUploadPom.getInstance().clickAdditional();

			CommonUtility.sleepControl(4000);
			CentralUploadPom.getInstance().clickReupload();

			// Enter The Visa Number
			CommonUtility.sleepControl(2000);
			CentralUploadPom.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

			CommonUtility.sleepControl(2000);
			CentralUploadPom.getInstance().clickSearchButton();

			if (additionalLabRejectTotalCount == 1) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

			} else if (additionalLabRejectTotalCount == 2) {
				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

			} else if (additionalLabRejectTotalCount == 3) {

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 1 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 2 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

				// Test Name
				CommonUtility.sleepControl(2000);
				testName1 = CentralUploadPom.getInstance().getTestName1();
				LOGGER.info("Test name 3 : " + testName1);
				// Upload Icon
				CentralUploadPom.getInstance().clickUploadIcon1();

				uploadDocument(testName1);

			}
		}

		commonDefinition.logOut();
	}

	public void uploadDocument(String testName) throws Throwable {

		CommonUtility.sleepControl(2000);
		CentralUploadPom.getInstance().enterTheDocumentName(testName);

		CommonUtility.sleepControl(1000);
		CentralUploadPom.getInstance().enterComments(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(1000);
		CentralUploadPom.getInstance().clickDocumentUploadIcon();

		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		CommonUtility.sleepControl(2000);
		CentralUploadPom.getInstance().clickSave();
		LOGGER.info("Speciality document uploaded successfully");

	}

}
