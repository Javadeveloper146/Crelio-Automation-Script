package com.modules;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.labJuniorFlow.LabJuniorWorkList;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.PatientProfiles;
import com.referral.PrintReceipt;
import com.referralAndCertificatePom.ReferralDocumentPOM;
import com.referralHandler.AutoReferralHandler;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;
import com.tokenVerify.GROReferralTokenVerify;

import io.cucumber.java.lu.a;

public class StemzGPCertificatePage {

	public static int count1;
	public static int count2;
	public static int count3;
	public static int count4;
	public static int count5;
	public static int count6;
	public static int count7;
	public static int count8;
	public static int count9;
	public static int count10;
	public static int count11;
	boolean status;
	public static String documentType1;
	public static String documentType2;
	public static String documentType3;
	public static String documentType4;
	public static String documentType5;
	public static String documentType6;
	public static String documentType7;
	public static String documentType8;
	public static String documentType9;
	public static String documentType10;
	public static String documentType11;
	public static int saveButttonCount;

	public static boolean SaveButtonStatus_1;
	public static boolean SaveButtonStatus_2;
	public static boolean SaveButtonStatus_3;
	public static boolean SaveButtonStatus_4;
	public static boolean SaveButtonStatus_5;
	public static boolean SaveButtonStatus_6;
	public static boolean SaveButtonStatus_7;
	public static boolean SaveButtonStatus_8;
	public static boolean SaveButtonStatus_9;
	public static boolean SaveButtonStatus_10;
	public static boolean SaveButtonStatus_11;

	public static int nurseAndStemzReferralCount;

	public static int labComformatoryReferralCount;

	public static int labAdditionalTestReferralCount;

	public static int referralCount;
	public static int totalCountValue;
	public static int value;
	public static int documentTypeValue;
	public static String approvalStatus = ReferralDocumentApprovalController.approvalStatus;
	public static int reducedCount;
	private static final Logger LOGGER = LogManager.getLogger(StemzGPCertificatePage.class);
	ReferralDocumentApprovalController approvalController = new ReferralDocumentApprovalController();

	public void referralCertificatePage() throws Throwable {
		CommonDefinition commonDefinition3 = new CommonDefinition();
		int bmi = NurseModuleStepDefinition.bmiReferralCount;
		int vision = NurseModuleStepDefinition.visionReferralCount;
		int colorVision = NurseModuleStepDefinition.colorVisionReferralCount;
		int bp = NurseModuleStepDefinition.bpReferralCount;
		int cardiology = GpModuleStepDefinition.cardilogyReferralCount;
		int deformatory = GpModuleStepDefinition.deformatoryReferralCount;
		int pulmonology = GpModuleStepDefinition.respitoryRefCount;
		int dermatology = GpModuleStepDefinition.skinRefCount;
		int ear = GpModuleStepDefinition.earRefCount;
		int phychiatry = GpModuleStepDefinition.PsychiatryRefCount;
		int betaHcg = LabJuniorWorkList.bEtaHCGReferralCount;
		boolean sgptAndSgotAndCreatinineAndGlucoseStatusCheck = LabJuniorWorkList.triggerControllerStatus;

		boolean bmiReferralStatusCheckForNurse = NurseModuleStepDefinition.bmiReferralStatus;

		HashMap<String, Integer> getTheValue1 = new HashMap<String, Integer>();
		getTheValue1.put("BMI : ", bmi);
		getTheValue1.put("Vision : ", vision);
		getTheValue1.put("Color Vision : ", colorVision);
		getTheValue1.put("Bp: ", bp);
		getTheValue1.put("Cardiology : ", cardiology);
		getTheValue1.put("Deformatory : ", deformatory);
		getTheValue1.put("Pulmonology : ", pulmonology);
		getTheValue1.put("Dermatology : ", dermatology);
		getTheValue1.put("Ear : ", ear);
		getTheValue1.put("Phychiatry : ", phychiatry);

		getTheValue1.put("BetaHcg : ", betaHcg);

		LOGGER.info("Nurse And Stemz Gp Referral : " + getTheValue1);

		ArrayList<Integer> li = new ArrayList<Integer>();

		li.add(bmi);
		li.add(vision);
		li.add(colorVision);
		li.add(bp);
		li.add(cardiology);
		li.add(deformatory);
		li.add(betaHcg);
		li.add(pulmonology);
		li.add(dermatology);
		li.add(ear);
		li.add(phychiatry);

		nurseAndStemzReferralCount = 0;

		for (int number : li) {
			nurseAndStemzReferralCount += number;

		}

		if (sgptAndSgotAndCreatinineAndGlucoseStatusCheck == true) {
			LOGGER.info("Additional Lab Test Enable Add The Value To BMI");
			nurseAndStemzReferralCount++;
		}
		if (sgptAndSgotAndCreatinineAndGlucoseStatusCheck == true && bmiReferralStatusCheckForNurse == true) {
			LOGGER.info("Additional Lab Test Reduced The Value To BMI");
			int reducedValue = -1;
			int totalValue = nurseAndStemzReferralCount;
			nurseAndStemzReferralCount = (totalValue - reducedValue);
		}
		LOGGER.info("Nurse And Stemz Gp Referral Count : " + nurseAndStemzReferralCount);

		// Comformatory
		int hiv = LabJuniorWorkList.hivReferralCount;
		int antiHcv = LabJuniorWorkList.antiHCVReferralCount;
		int hbsAg = LabJuniorWorkList.hBsAgReferralCount;
		int betaHcgPositive = LabJuniorWorkList.bEtaHCGReferralCount;
		int rpr = LabJuniorWorkList.rprReferralCount;

		HashMap<String, Integer> getTheValue2 = new HashMap<String, Integer>();
		getTheValue2.put("HIV : ", hiv);
		getTheValue2.put("AntiHCV : ", antiHcv);
		getTheValue2.put("HBSAG : ", hbsAg);
		getTheValue2.put("Beta HCG : ", betaHcgPositive);
		// getTheValue2.put("RPR : ", rpr);

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(hiv);
		list.add(antiHcv);
		list.add(hbsAg);
		list.add(betaHcgPositive);

		labComformatoryReferralCount = 0;

		for (int number : list) {
			labComformatoryReferralCount += number;

		}
		LOGGER.info("Lab Comformatory Referral : " + getTheValue2);
		LOGGER.info("Lab Comformatory Referral Count : " + labComformatoryReferralCount);

		// Additional
		int sgot = LabJuniorWorkList.sgotReferralCountForCertificatePage;
		int sgpt = LabJuniorWorkList.sgptReferralCountForCertificatePage;
		int creatinine = LabJuniorWorkList.creatinineReferralCountForCertificatePage;
		int glucoseTotal = LabJuniorWorkList.glucoseReferralCountForCertificatePage;
		int hamoglobin = LabJuniorWorkList.hemoglobinReferralCountForCertificatePage;

		HashMap<String, Integer> getTheValue3 = new HashMap<String, Integer>();
		getTheValue3.put("SGOT : ", sgot); // 1
		getTheValue3.put("SGPT : ", sgpt);
		getTheValue3.put("Creatinine : ", creatinine);
		getTheValue3.put("Glucose : ", glucoseTotal);

		getTheValue3.put("Hamoglobin : ", hamoglobin);

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(sgot);
		list1.add(sgpt);
		list1.add(creatinine);
		list1.add(glucoseTotal);
		list1.add(hamoglobin);

		labAdditionalTestReferralCount = 0;

		for (int number : list1) {
			labAdditionalTestReferralCount += number;

		}

		LOGGER.info(" Lab Additional Referral Details : " + getTheValue3);
		LOGGER.info("Lab Additional Referral Count : " + labAdditionalTestReferralCount);

		LOGGER.info("Nurse And Stemz Gp Referral Count : " + nurseAndStemzReferralCount
				+ "Lab Comformatory Referral Count :" + labComformatoryReferralCount
				+ "Lab Additional Referral Count : " + labAdditionalTestReferralCount);

		boolean bmiReferralStatus = NurseModuleStepDefinition.bmiReferralStatus;
		boolean visionReferralStatus = NurseModuleStepDefinition.visionReferralStatus;
		boolean colorVisionReferralStatus = NurseModuleStepDefinition.colorVisionReferralStatus;
		boolean bpReferrallStatus = NurseModuleStepDefinition.bpReferralStatus;
		boolean cardiologyReferralStatus = GpModuleStepDefinition.cardiologyReferralStatus;
		boolean deformityReferralStaus = GpModuleStepDefinition.deformityReferralStatus;
		boolean betaHCGReferralStatus = LabJuniorWorkList.betaHCGReferralStatus;

		HashMap<String, Boolean> getTheValue = new HashMap<String, Boolean>();
		getTheValue.put("BMI : ", bmiReferralStatus);
		getTheValue.put("Vision : ", visionReferralStatus);
		getTheValue.put("Color Vision : ", colorVisionReferralStatus);
		getTheValue.put("BP : ", bpReferrallStatus);
		getTheValue.put("Cardilogy : ", cardiologyReferralStatus);
		getTheValue.put("Deformatory : ", deformityReferralStaus);
		getTheValue.put("Beta HCG", betaHCGReferralStatus);
//		getTheValue.put("Glucose : ", glucoseCount);
		LOGGER.info("Referrals : " + getTheValue);

		// GP Login

		// Credential
		CredentialsController controller = new CredentialsController();
		controller.gpCredentialsController(ConstantProperties.STATE);

		LoginPage.getInstance().clickTheSignInButton();

		GpModuleStepDefinition gpModule = new GpModuleStepDefinition();
		gpModule.select_the_role_selection_stemz_gp();

		gpModule.select_the_counter_for_gp_selection();

		if (NurseModuleStepDefinition.colorVisionReferralStatus == false
				&& NurseModuleStepDefinition.bmiReferralStatus == false
				&& NurseModuleStepDefinition.bpReferralStatus == false
				&& NurseModuleStepDefinition.visionReferralStatus == false) {

		} else {

			GROReferralTokenVerify groReferralTokenVerify1 = new GROReferralTokenVerify();
			groReferralTokenVerify1.groReferralTokenVerify();

			CommonUtility.sleepControl(1500);
			GRODashBoard.getInstance().clickTheFingerPrintSkipButton();

			// Color Vision Recheck
			// Bp recheck
			GpModuleStepDefinition definition = new GpModuleStepDefinition();
			definition.recheckVisionRecheckAndBpRevisitForGp();

			CommonUtility.sleepControl(3000);
			PatientProfiles.getInstance().clickTheCollectFeedbackPage();
			CommonUtility.sleepControl(3000);
			PatientProfiles.getInstance().clickTheCollectFeedbackButton();
			LOGGER.info("Nurse Module Feedback collected successfully");
			CommonUtility.sleepControl(3000);
		}

		// Click The Physician Worklist
		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickThePhysianWorkForAfterRef();
		LOGGER.info("Physician Worklist : ");

		// Click The Referral To be Report
		CommonUtility.sleepControl(6000);
		GpModule.getInstance().clickTheRefferalToBeReport();
		LOGGER.info("Referral to be Reported");

		// Enter The Visa
		CommonUtility.sleepControl(2000);
		GpModule.getInstance().enterTheVisaNumberInRererralToBeReported(ConstantProperties.VISA_NUMBER);

		// Search
		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheSearchButton();

		// Ambiguity

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_25)) {
			// Enter The Comment
			CommonUtility.sleepControl(2000);
			GpModule.getInstance().enterTheCommentsForAmbiguity(AppConstants.COMMON_COMMENTS);

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheCheckBox();

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();

		}

		// Click The Edit
		CommonUtility.sleepControl(2000);
		GpModule.getInstance().clickTheEditButton();

		// Click The Accept

		LOGGER.info(" Total Nurse Referral Count :");
		LOGGER.info("Referral Document : ");

		// Checck The Additional Test

		// Comformatory Test

		// General Medicine
		LOGGER.info("Referral Lab General medicine  : " + LabJuniorWorkList.genernalMedicineCountForCertificatePage);
		// referralCount = (nurseAndStemzReferralCount);

//		if(true) {
//			
//		}

		// LOGGER.info("Total Referral Count :" + referralCount);
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		boolean nurseSpeciality = NurseModuleStepDefinition.speclityStatus;
		boolean labSpeciality = LabJuniorWorkList.speclityStatus;
		boolean gpSpeciality = GpModuleStepDefinition.gpSpecility;
		try {
			CommonUtility.sleepControl(3000);
			SaveButtonStatus_1 = ReferralDocumentPOM.getInstance().saveButtonStatus1();
			SaveButtonStatus_2 = ReferralDocumentPOM.getInstance().saveButtonStatus2();
			SaveButtonStatus_3 = ReferralDocumentPOM.getInstance().saveButtonStatus3();
			SaveButtonStatus_4 = ReferralDocumentPOM.getInstance().saveButtonStatus4();
			SaveButtonStatus_5 = ReferralDocumentPOM.getInstance().saveButtonStatus5();
			SaveButtonStatus_6 = ReferralDocumentPOM.getInstance().saveButtonStatus6();
			SaveButtonStatus_7 = ReferralDocumentPOM.getInstance().saveButtonStatus7();
			SaveButtonStatus_8 = ReferralDocumentPOM.getInstance().saveButtonStatus8();
			SaveButtonStatus_9 = ReferralDocumentPOM.getInstance().saveButtonStatus9();
			SaveButtonStatus_10 = ReferralDocumentPOM.getInstance().saveButtonStatus10();
			SaveButtonStatus_11 = ReferralDocumentPOM.getInstance().saveButtonStatus11();
		} catch (Exception e) {
			System.out.println("");
		}

		if (SaveButtonStatus_1 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_2 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_3 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_4 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_5 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_6 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_7 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_8 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_9 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_10 == true) {
			referralCount++;
		}
		if (SaveButtonStatus_11 == true) {
			referralCount++;
		}
		LOGGER.info("Total Referral Count :" + referralCount);
		nurseSpeciality = true;
		if (nurseSpeciality == false && labSpeciality == false && gpSpeciality == false) {
			LOGGER.info("Nurse No Referral And Lab Beta HCG No Referral");
		} else {

			if (referralCount == 1) {
				LOGGER.info("Speciality : ");
				CommonUtility.sleepControl(1500);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}

			} else if (referralCount == 2) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);

				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;// 1
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 2
				value = 2;
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);

						saveButtonControl(totalCountValue);

						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
			}

			else if (referralCount == 3) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
				LOGGER.info("Approval Status : " + approvalStatus);
				LOGGER.info("Auto Upload Status : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 2
				value = 2;
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3
				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
				// 4
			} else if (referralCount == 4) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				value = 2;

				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 3
				CommonUtility.sleepControl(1000);
				CommonUtility.scrollDown100();
				value = 3;
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();
				System.err.println("3 : " + documentType3);

				LOGGER.info("Document Type 3 : " + documentType3);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					LOGGER.info("Approval : " + approvalStatus);

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					LOGGER.info("Approval : " + approvalStatus);

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

				}

				// 5
			} else if (referralCount == 5) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3
				CommonUtility.sleepControl(1000);
				CommonUtility.scrollDown100();
				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);

				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5

				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					System.err.println("Referral Document Status");
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Approval Document Status");
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

				}
			} else if (referralCount == 6) {

				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2

				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
		
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}
				// 6
				
				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

				}

				// 7
			} else if (referralCount == 7) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2

				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
			;
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}

				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {
						reducedCount++;
					}
				}
				value = 7;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType7 = ReferralDocumentPOM.getInstance().getDocumentType7();
				LOGGER.info("Document Type : " + documentType7);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType7);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count7 = 7;
						totalCountValue = (count7 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
			} else if (referralCount == 8) {
				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
				LOGGER.info("Approval Status : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
			
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}
				// 6
				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {
						reducedCount++;
					}
				}
				CommonUtility.sleepControl(2000);
				value = 7;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType7 = ReferralDocumentPOM.getInstance().getDocumentType7();
				LOGGER.info("Document Type : " + documentType7);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType7);

				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count7 = 7;
						totalCountValue = (count7 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}

				value = 8;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType8 = ReferralDocumentPOM.getInstance().getDocumentType8();
				LOGGER.info("Document Type : " + documentType8);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType8);
				LOGGER.info("Approval : " + approvalStatus);
				System.err
						.println("Referral type staus : " + ReferralDocumentApprovalController.referralTypeNotApproved);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count8 = 8;
						totalCountValue = (count8 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
			} else if (referralCount == 9) {

				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}
				// 6
				CommonUtility.sleepControl(2000);
				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {
						reducedCount++;
					}
				}
				CommonUtility.sleepControl(2000);
				value = 7;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType7 = ReferralDocumentPOM.getInstance().getDocumentType7();
				LOGGER.info("Document Type : " + documentType7);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType7);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count7 = 7;
						totalCountValue = (count7 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}
				value = 8;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType8 = ReferralDocumentPOM.getInstance().getDocumentType8();
				LOGGER.info("Document Type : " + documentType8);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType8);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count8 = 8;
						totalCountValue = (count8 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}

				value = 9;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType9 = ReferralDocumentPOM.getInstance().getDocumentType9();
				LOGGER.info("Document Type : " + documentType9);
				CommonUtility.sleepControl(1000);
				approvalController.referralApprovalStatusControl(documentType9);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count9 = 9;
						totalCountValue = (count9 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

				}
			} else if (referralCount == 10) {

				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}
				// 6
				CommonUtility.sleepControl(2000);
				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {
						reducedCount++;
					}
				}
				CommonUtility.sleepControl(2000);
				value = 7;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType7 = ReferralDocumentPOM.getInstance().getDocumentType7();
				LOGGER.info("Document Type : " + documentType7);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType7);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count7 = 7;
						totalCountValue = (count7 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}
				value = 8;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType8 = ReferralDocumentPOM.getInstance().getDocumentType8();
				LOGGER.info("Document Type : " + documentType8);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType8);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count8 = 8;
						totalCountValue = (count8 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}

				value = 9;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType9 = ReferralDocumentPOM.getInstance().getDocumentType9();
				LOGGER.info("Document Type : " + documentType9);
				CommonUtility.sleepControl(1000);
				approvalController.referralApprovalStatusControl(documentType9);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count9 = 9;
						totalCountValue = (count9 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {

						reducedCount++;
					}
				}

				value = 10;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType10 = ReferralDocumentPOM.getInstance().getDocumentType10();

				LOGGER.info("Document Type : " + documentType10);
				CommonUtility.sleepControl(2000);
				approvalController.referralApprovalStatusControl(documentType10);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count10 = 10;
						totalCountValue = (count10 - reducedCount);
						System.out.println("Total Count Value 10: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
			} else if (referralCount == 11) {
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count1 = 1;
						totalCountValue = count1;
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 2
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();
				value = 2;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();

				LOGGER.info("Document Type 2: " + documentType2);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {

					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.err.println("Condition Accepted");
						count2 = 2;
						totalCountValue = (count2 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++; // 2
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				// 3

				value = 3;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(000);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();

				LOGGER.info("Document Type 3 : " + documentType3);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						System.out.println("Condition Accepted");
						count3 = 3;
						totalCountValue = (count3 - reducedCount);
						System.out.println("Total Count Value : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}

				value = 4;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);

				LOGGER.info("Document Type 4 : " + documentType4);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count4 = 4;
						totalCountValue = (count4 - reducedCount);
						System.out.println("Total Count Value 4 : " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
						System.err.println("Reduced Count : " + reducedCount);
					}
				}
				// 5

				value = 5;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();

				LOGGER.info("Document Type 5 : " + documentType5);
				CommonUtility.sleepControl(2000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count5 = 5;
						totalCountValue = (count5 - reducedCount);
						System.out.println("Total Count Value 5: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(3000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");

					} else {
						reducedCount++;
						System.out.println("Reduced Count : " + reducedCount);
					}
				}
				// 6
				CommonUtility.sleepControl(2000);
				value = 6;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType6 = ReferralDocumentPOM.getInstance().getDocumentType6();
				LOGGER.info("Document Type 6 : " + documentType6);
				CommonUtility.sleepControl(3000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType6);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count6 = 6;
						totalCountValue = (count6 - reducedCount);
						System.out.println("Total Count Value 6: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {
						reducedCount++;
					}
				}
				CommonUtility.sleepControl(2000);
				value = 7;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType7 = ReferralDocumentPOM.getInstance().getDocumentType7();
				LOGGER.info("Document Type : " + documentType7);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType7);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count7 = 7;
						totalCountValue = (count7 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}

				value = 8;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType8 = ReferralDocumentPOM.getInstance().getDocumentType8();
				LOGGER.info("Document Type : " + documentType8);
				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType8);
				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count8 = 8;
						totalCountValue = (count8 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {
						reducedCount++;
					}
				}

				value = 9;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);

				documentType9 = ReferralDocumentPOM.getInstance().getDocumentType9();
				LOGGER.info("Document Type : " + documentType9);
				CommonUtility.sleepControl(1000);
				approvalController.referralApprovalStatusControl(documentType9);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count9 = 9;
						totalCountValue = (count9 - reducedCount);
						System.out.println("Total Count Value 7: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}

					else {

						reducedCount++;
					}
				}

				value = 10;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(2000);
				documentType10 = ReferralDocumentPOM.getInstance().getDocumentType10();

				LOGGER.info("Document Type : " + documentType10);
				CommonUtility.sleepControl(1000);
				approvalController.referralApprovalStatusControl(documentType10);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count10 = 10;
						totalCountValue = (count10 - reducedCount);
						System.out.println("Total Count Value 10: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					} else {

						reducedCount++;
					}
				}
				value = 11;
				documentTypeValue = (value - reducedCount);
				CommonUtility.sleepControl(1000);
				documentType11 = ReferralDocumentPOM.getInstance().getDocumentType11();

				LOGGER.info("Document Type : " + documentType11);
				CommonUtility.sleepControl(1000);
				approvalController.referralApprovalStatusControl(documentType11);

				LOGGER.info("Approval : " + approvalStatus);
				if (ReferralDocumentApprovalController.referralTypeNotApproved == AppConstants.YES) {
					if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
						count11 = 11;
						totalCountValue = (count11 - reducedCount);
						System.out.println("Total Count Value 11: " + totalCountValue);
						saveButtonControl(totalCountValue);
						LOGGER.info("Approval status updated successfully");
						CommonUtility.sleepControl(2000);
						GpModule.getInstance().clickTheCloseReferral();
						LOGGER.info("Close Referral Sucessfully");
						CommonUtility.sleepControl(1000);
						GpModule.getInstance().clickTheYesOptionInReferralDocument();
						LOGGER.info("Referral Closed  Sucessfully");
					}
				}
			}
		}

		boolean addtionalLabTest = LabJuniorWorkList.additionalLabTest;
		if (addtionalLabTest == true) {
			LOGGER.info("Additional Lab Test : ");
			AdditionalLabTest additionalLabTest = new AdditionalLabTest();
			additionalLabTest.addtionalLabTestProcess(labAdditionalTestReferralCount);

		}

		boolean conformatoryStatus = LabJuniorWorkList.labConfirmatory;
		if (conformatoryStatus == true) {
			LOGGER.info("Lab Confirmatory : ");
			ComformatoryLabTest conformatoryLabTest = new ComformatoryLabTest();
			conformatoryLabTest.conformatoryLabTestProcess(labComformatoryReferralCount);
		}
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollUp1000();
		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheCertificate();

		CommonUtility.sleepControl(2000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheAssignedTo();

		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickFirstDropDownOption();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheSaveCertificate();
		
		LOGGER.info("Assigned to Central GP successfully!");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_18)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_19)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}

	public void saveButtonControl(int count) throws Throwable {

		switch (count) {
		case 1:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave1();

			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_32)) {
				CommonDefinition commonDefinition = new CommonDefinition();
				commonDefinition.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_36)) {
				CommonDefinition commonDefinition1 = new CommonDefinition();
				commonDefinition1.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}

			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_40)) {
				CommonDefinition commonDefinition1 = new CommonDefinition();
				commonDefinition1.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_45)) {
				CommonDefinition commonDefinition2 = new CommonDefinition();
				commonDefinition2.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}

			break;
		case 2:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave2();
			break;

		case 3:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave3();
			break;

		case 4:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave4();
			break;

		case 5:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave5();
			break;
		case 6:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave6();
			break;
		case 7:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave7();
			break;

		case 8:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave8();
			break;
		case 9:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave9();
			break;
		case 10:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave10();
			break;
		case 11:
			CommonUtility.sleepControl(500);
			ReferralDocumentPOM.getInstance().clickTheSave11();
			break;

		default:
			break;
		}

	}

}