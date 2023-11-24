package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apiguardian.api.API;
import org.checkerframework.checker.units.qual.degrees;

import com.LabIconpageObjects.LabJuniorCompletedPOM;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.constantProperties.LabConstants;
import com.driverManager.DriverManager;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.ApplicationStatusCheck;
import com.modules.CenterManagerFlow;
import com.modules.CountryController;
import com.modules.CredentialsController;
import com.modules.GROModules;
import com.modules.StemzGPCertificatePage;
import com.pageObjects.CenterManager;
import com.pageObjects.CentralLabAuthorityPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LabDirector;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSenior;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.pageObjects.PatientProfiles;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROReferralStepDefinition;
import com.stepDefinition.GROStepDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.LabJuniorStepDefinition;
import com.stepDefinition.LabSeniorStepDefinition;
import com.stepDefinition.LabSupervisorStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;
import com.tokenVerify.GROReferralTokenVerify;

import io.cucumber.java.en.Given;

public class LabConfirmatory {
	private static final Logger LOGGERSUPERVISOR = LogManager.getLogger(LabSupervisorStepDefinition.class);

	private static final Logger LOGGER = LogManager.getLogger(LabConfirmatory.class);
	private static final Logger LOGGER_LAB = LogManager.getLogger(LabJuniorStepDefinition.class);
	public static String serumSpecimenNumber;

	public static String india_Location_Serum_Specimen_External;
	public static String philippines_Location_Serum_Specimen_External;
	public static String philippines_Location_Serum_Specimen_Internal;
	public static String serumSpecimenNumberInternal;
	public static String serumSpecimenNumberExternal;
	public static String externalSpecimenNumberID;
	public static boolean statusCondition;
	public static String internalLabId;
	public static String externalLabId;
	LabJuniorStepDefinition labJuniorStepDefinition;

	CommonDefinition commonDefinition = new CommonDefinition();
	LabJuniorStepDefinition juniorStepDefinition;
	LabSupervisorStepDefinition labSupervisor;

	public void hivPositiveRef() throws Throwable {

		// Login Nurse

		NurseModuleStepDefinition definition = new NurseModuleStepDefinition();
		definition.enter_the_user_name_and_password_in_nurse_login();
		definition.select_the_role_selection_nurse();
		definition.select_the_counter_selection_nurse();

		GROReferralTokenVerify groReferralTokenVerify = new GROReferralTokenVerify();
		groReferralTokenVerify.groReferralTokenVerify();
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();

		LOGGER.info(" Specimen Generation : ");

		specimenGenerationBaseOnLocation(ConstantProperties.COUNTRY);

		LOGGER.info("Speciman Genarated Successfully");

		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheSpecimanGenarationButton();

		CommonUtility.sleepControl(7000);
		NurseModule.getInstance().clickTheSpecimanCollectionAllSelectOption();

		// Get The Specimen Number
		LOGGER.info("Specimen Collection : ");

		// Base on The country Specimen Collection
		specimenCollectionBaseOnLocation(ConstantProperties.COUNTRY);

		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickTheCollectedButton();
		LOGGER.info("Speciman Collected Successfully");

		// Click The Nurse Module Collect Feedback
		CommonUtility.sleepControl(5000);
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Feedback Collected");
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_43)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		// Sample Out Going
		// click The Sample Outgoing

		CommonUtility.sleepControl(5000);
		NurseSampleOutgoingPageObject.getInstance().clickTheSampleOutgoing();
		LOGGER.info("Sample Outgoing : ");

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown50();

		// Location Base Sample Outgoing
		location_Base_Outgoing_Sample(ConstantProperties.COUNTRY);

		// Tech And Gro Information
		NurseModuleStepDefinition definition2 = new NurseModuleStepDefinition();
		definition2.lab_technician_and_gro_info_and_collected();
		// Log Out
		commonDefinition.logOut();

		// Login Junior

		LabJuniorStepDefinition definition3 = new LabJuniorStepDefinition();
		definition3.enter_the_user_name_and_password_in_lab_junior_login();

		// Scan The Specimen Number
		LOGGER_LAB.info("Specimen Inscan Process : dfdf");
		// Click Specimen Inscan
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSpecimenInscan();

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown400();

		// Scan The Specimen Number

		juniorLabInscanSpceimenBaseOnLocation(ConstantProperties.COUNTRY);

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3500);
		LabJunior.getInstance().clickTheSaveButton();
		LOGGER_LAB.info("Specimen inscan details saved successfully");

		commonDefinition.logOut();

		LOGGER.info("Central Lab Authority :");
		CentralLabAuthority.centralLabLogin();

		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		CentralLabAuthorityPOM.getInstance().clickTheCentralLabAuthority();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The External Barcode Approval
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheExternalBarcodeApproval();
		LOGGER.info("External Barcode Approval:");

		// Enter The Visa Number
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		// Click The Search Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		// Get The Site Name
		CommonUtility.sleepControl(1000);
		LOGGER.info("Site Name" + ": " + LabDirector.getInstance().getTheSiteName());

		// Specimen Number
		CommonUtility.sleepControl(500);
		serumSpecimenNumberExternal = LabDirector.getInstance().getTheSpecimenNumebr();
		LOGGER.info("Specimen Number" + ": " + serumSpecimenNumberExternal);

		// Get The External Specimen Name
		CommonUtility.sleepControl(1000);
		externalSpecimenNumberID = (LabDirector.getInstance().getTheExternalSpecimenNumber());
		LOGGER.info("External Specimen Name" + ": " + externalSpecimenNumberID);

		// Click The Print
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickThePrintButton();

		// Click The Status
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().clickTheStatus();

		// Click The Approved
		CommonUtility.sleepControl(500);
		LabDirector.getInstance().clickTheApproved();

		// Enter The Notes
		CommonUtility.sleepControl(500);
		LabDirector.getInstance().enterTheNotes(AppConstants.COMMON_COMMENTS);

		// Save Button
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().clickTheSave();
		LOGGER.info("External Barcode Approval Suceesfully");

		// Logout
		commonDefinition.logOut();

		// ----------------------------------------------------------------------------
		// Login in

		// Center Manager

		CenterManagerFlow centerManagerFlow = new CenterManagerFlow();
		centerManagerFlow.centerManager();

//--------------------------------------------------------------------------------------------------------
		// Lab Junior

		LabJuniorStepDefinition definition1 = new LabJuniorStepDefinition();
		definition1.enter_the_user_name_and_password_in_lab_junior_login();
		// Click The Specimen Inscan
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSpecimenInscan();
		LOGGER.info("Specimen Inscan Process : ");
//
		if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);//
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSaveButton();
		}

		// Click The Status
		CommonUtility.sleepControl(3000);
		LabDirector.getInstance().clickTheStatus();

		// Click The External Pending
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().clickTheExternalPending();
		LOGGER.info("Status : External Pending ");

		// Enter The lab Id
		// specimenInternalCondition =

		CommonUtility.sleepControl(2500);
		LabJunior.getInstance().enterTheLabId(externalLabId);// externalLabId
		LOGGER.info("External Lab ID" + ": " + externalLabId);

		// Click The Search Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		// Click The Map Barcode
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheMapBarcode();

		// Enter The Scan Specimen Number
		CommonUtility.sleepControl(3500);
		LabJunior.getInstance().enterTheMapBarcodeScanSpecimenNumberInRetest(externalSpecimenNumberID);//
		LOGGER.info("External Specimen Number : " + externalSpecimenNumberID);

		// Save Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheMapBarcodeSave();
		LOGGER.info("External barcode saved as complete successfully");

		// Log Out
		CommonUtility.sleepControl(2000);
		commonDefinition.logOut();

		// -------------------------------------------------------------------------------------------
		// Login Supervisor

		LabSupervisorStepDefinition definition6 = new LabSupervisorStepDefinition();
		definition6.enter_the_user_name_and_password_in_lab_supervisor_login();
		definition6.lab_supervisor_role_selection();

		// Click The Out Source Pending
		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheOutSourcePending();
		LOGGER.info("Outsource Pending");
		LOGGER.info("Pending :");

		// Scan The Specimen Number
//		CommonUtility.sleepControl(4000);
//		LabSupervisor.getInstance().scanTheSpecimenNumber("PL32300000116");
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		// Get The Specimen Number
		CommonUtility.sleepControl(1500);
		LOGGER.info("Specimen Number" + ": " + LabSupervisor.getInstance().getTheSpecimenNumberOutSourcePending());
		// Lab Id
		LOGGER.info("Lab Id" + ": " + LabSupervisor.getInstance().getTheLabIdOutSourcePending());
		// Enternal Specimen Id
		LOGGER.info(
				"External Specimen Id" + ": " + LabSupervisor.getInstance().getTheExternalSpecimenIdOutSourcePending());

		LOGGER.info("Successfully Scan The Serum Specimen Number" + ": " + serumSpecimenNumberExternal);

		// Click The Search Button
//		CommonUtility.sleepControl(3000);
//		CommonUtility.enterFunction();
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheCheckBox();
		// Click The TRF Form
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().clickThePrintButton();

		CommonUtility.sleepControl(2000);
		CommonDefinition.windowCloseFuncitonAltF4();

		// Click The Action
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheAction();

		// Click The Outsouring
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheOutsourcing();

		// Get The Action
		LOGGER.info("Action" + ": " + LabSupervisor.getInstance().getTheAction());

		// Click The Transfor Location
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheTransforLocation();

		// Click The Core Diagnostics Center
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheCoreDiagnosticsCenter();

		// Get The Transfor Location
		LOGGER.info("Transfer Location" + ": " + LabSupervisor.getInstance().getTheTransforLocation());

		// Transfer Date
		CommonUtility.sleepControl(1000);
//		LabSupervisor.getInstance().clickTheTransferDate();

		// Click Current Date
		CommonUtility.sleepControl(1000);
		// LabSupervisor.getInstance().clickTheCurrentDate();

		// Get Transfer Date
		// LOGGER.info("Transfer Date" + ": " +
		// LabSupervisor.getInstance().getTheCurrentDate());

		// Save Button
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheSave();
		LOGGER.info("Diagnostic centre details updated successfully");

		// Generate STF
		// Click The Generate STF
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollUp500();
		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheGenerateSTF();
		LOGGER.info("Generate STF :");

		// Click The Search
		CommonUtility.sleepControl(2000);
		// Get The STF ID
		LOGGER.info("Speciment Batch STF ID" + ": " + LabSupervisor.getInstance().getTheSTFID());

		// Get The Generate Date
		LOGGER.info("Generated date" + ": " + LabSupervisor.getInstance().getTheGenerateDate());

		// Select All
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheSelectAll();

		// Get External Specimen Id
		LOGGER.info("External Specimen Id" + ": " + LabSupervisor.getInstance().getExternalSpecimenId());

		// Click Save
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheVaccineSaveButton();
		LOGGER.info("STF generated successfully!");

//		// Completed
//		CommonUtility.sleepControl(5000);
//		CommonUtility.scrollUp500();
//		CommonUtility.sleepControl(2000);
//		LabSupervisor.getInstance().clickTheCompleted();
//		LOGGER.info("Completed :");
//
//		// Enter Lab Id
//		CommonUtility.sleepControl(20000);
//		LabSupervisor.getInstance().enterTheLabId(externalLabId);
//		LOGGER.info("External Lab Id :" + externalLabId);
//		CommonUtility.sleepControl(4000);
//		LabSupervisor.getInstance().clickTheSearchButton();
//		CommonUtility.sleepControl(4000);
//		CommonUtility.scrollDown1000();
//
//		// Click The View Icon
//		CommonUtility.sleepControl(4000);
//		LabSupervisor.getInstance().clickTheViewIcon();
//
//	
//
//		// Click Close
//		CommonUtility.sleepControl(2000);
//		LabSupervisor.getInstance().clickTheClose();
//		LOGGER.info("Lab Tests Details");
//		LOGGER.info("Test Name : Western Blot for HIV");
//		LOGGER.info("Priority : Normal");
		CommonUtility.sleepControl(2000);
		commonDefinition.logOut();

		// Reload

		// Log in GRO
		// Log in GRO
//		CommonUtility.sleepControl(1000);
//		GROModules  groModules = new GROModules();
//		groModules.groSpecimenTransmittalFrom();

		// Central Lab Authority

		CommonUtility.sleepControl(2000);
		CommonDefinition commonDefinition1 = new CommonDefinition();

		CentralLabAuthority authority = new CentralLabAuthority();
		authority.centralLabAuthorityFlow();
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_40)) {
			CommonDefinition commonDefinition2 = new CommonDefinition();
			commonDefinition2.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

//------------------------------------------------------------------------------------

		// Lab Worklist Base on the country Internal Test
		if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				internalTestBaseOnTheLocation(ConstantProperties.COUNTRY);

			} else if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				internalTestBaseOnTheLocation(ConstantProperties.COUNTRY);
			}
		}

		// Lab Senior
		if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				internalTestBaseOnLocationInLabSenior(ConstantProperties.COUNTRY);

			} else if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				internalTestBaseOnLocationInLabSenior(ConstantProperties.COUNTRY);
			}
		}

		// Lab Supervisor
		if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				internalTestBaseOnLocationInLabSupervisor(ConstantProperties.COUNTRY);

			} else if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				internalTestBaseOnLocationInLabSupervisor(ConstantProperties.COUNTRY);
			}
//		StemzGPCertificatePage certificatePage = new StemzGPCertificatePage();
//		certificatePage.referralCertificatePage();
		}
	}

	public static void specimenGenerationBaseOnLocation(String country) {

		switch (country) {
		case AppConstants.INDIA_COUNTRY:
			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				statusCondition = true;
				LOGGER.info("Internal Plasma Specimen Number" + ": " + "Yet to be Generated");
			}
			if (LabJuniorWorkList.labConfirmatory == true) {
				if (statusCondition == false) {
					LOGGER.info("External Serum Specimen Number" + ": " + "Yet to be Generated");
				} else {
					LOGGER.info("External Serum Specimen Number" + ": " + "Yet to be Generated");
				}
			}
			break;
		case AppConstants.PHILIPPINES_COUNTRY:
			LOGGER.info("Serum Specimen Number" + ": " + "Yet to be Generated");
			LOGGER.info("Plasma Specimen Number" + ": " + "Yet to be Generated");
			break;
		case AppConstants.PAKISTAN_COUNTRY:
			LOGGER.info("Serum Specimen Number" + ": " + "Yet to be Generated");
			LOGGER.info("Plasma Specimen Number" + ": " + "Yet to be Generated");
			break;
		default:
			break;
		}

	}

	public void specimenCollectionBaseOnLocation(String country) throws Throwable {

		switch (country) {

		case AppConstants.INDIA_COUNTRY:

			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				CommonUtility.sleepControl(2000);
				serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
				LOGGER.info("Internal   Serum Specimen Number " + ": " + serumSpecimenNumberInternal);
				statusCondition = true;
			}

			if (LabJuniorWorkList.labConfirmatory == true) {
				if (statusCondition == false) {
					CommonUtility.sleepControl(1500);
					serumSpecimenNumberExternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
					LOGGER.info("External Serum Specimen Number " + ": " + serumSpecimenNumberExternal);
				} else {
					CommonUtility.sleepControl(1500);
					serumSpecimenNumberExternal = (NurseSampleOutgoingPageObject.getInstance()
							.getTheSerumSpecimenNumber());
					LOGGER.info("External Serum Specimen Number " + ": " + serumSpecimenNumberExternal);
				}
			}
			break;

		case AppConstants.PHILIPPINES_COUNTRY:

			CommonUtility.sleepControl(1000);
			serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
			LOGGER.info("Internal   Serum Specimen Number " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(100);
			serumSpecimenNumberExternal = (NurseSampleOutgoingPageObject.getInstance().getTheSerumSpecimenNumber());
			LOGGER.info("External Serum Specimen Number " + ": " + serumSpecimenNumberExternal);
			break;

		case AppConstants.PAKISTAN_COUNTRY:

			CommonUtility.sleepControl(1000);
			serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
			LOGGER.info("Internal   Serum Specimen Number " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(100);
			serumSpecimenNumberExternal = (NurseSampleOutgoingPageObject.getInstance().getTheSerumSpecimenNumber());
			LOGGER.info("External Serum Specimen Number " + ": " + serumSpecimenNumberExternal);
			break;
		default:
			break;
		}

	}

	public void location_Base_Outgoing_Sample(String country) throws Throwable {
		switch (country) {

		case AppConstants.INDIA_COUNTRY:
			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				CommonUtility.sleepControl(2000);
				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);

				LOGGER.info(
						"Successfully scan the Internal Serum Specimen Number  " + ": " + serumSpecimenNumberInternal);
			}
			if (LabJuniorWorkList.labConfirmatory == true) {
				if (statusCondition == false) {
					CommonUtility.sleepControl(1000);
					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);

					LOGGER.info("Successfully scan the External Serum Specimen Number  " + ": "
							+ serumSpecimenNumberExternal);
				} else {

					CommonUtility.sleepControl(1000);
					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);

					LOGGER.info("Successfully scan the External Serum Specimen Number  " + ": "
							+ serumSpecimenNumberExternal);
				}
			}

			break;

		case AppConstants.PHILIPPINES_COUNTRY:
			CommonUtility.sleepControl(1500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Successfully scan the Internal Serum Specimen Number  " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

			LOGGER.info("Successfully scan the Serum Specimen Number External " + ": " + serumSpecimenNumberExternal);
			break;

		case AppConstants.PAKISTAN_COUNTRY:
			CommonUtility.sleepControl(1500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Successfully scan the Internal Serum Specimen Number  " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

			LOGGER.info("Successfully scan the Serum Specimen Number External " + ": " + serumSpecimenNumberExternal);
			break;
		default:
			break;
		}

	}

	public void juniorLabInscanSpceimenBaseOnLocation(String country) throws Throwable {

		switch (country) {
		case AppConstants.INDIA_COUNTRY:
			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberInternal);//
				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSearchButton();
				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);
				LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberInternal);

				// Click Search Button
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown100();

				CommonUtility.sleepControl(1000);
				internalLabId = LabJunior.getInstance().getTheGetLabId();
				LOGGER_LAB.info("Internal Lab Id : " + internalLabId);

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clearTheSpecimen();
			}

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberExternal);//

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);
			LOGGER_LAB.info("External Serum Specimen Number" + ": " + serumSpecimenNumberExternal);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			externalLabId = LabJunior.getInstance().getTheComformatoryGetLabId();
			LOGGER_LAB.info("External Lab Id : " + externalLabId);
			break;

		case AppConstants.PHILIPPINES_COUNTRY:

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberInternal);// serumSpecimenNumberInternal

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberInternal);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			internalLabId = LabJunior.getInstance().getTheGetLabId();
			LOGGER_LAB.info("Internal Lab Id : " + internalLabId);

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clearTheSpecimen();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberExternal);// serumSpecimenNumberExternal

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberExternal);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			externalLabId = LabJunior.getInstance().getTheComformatoryGetLabId();
			LOGGER_LAB.info("External Lab Id : " + externalLabId);
			break;

		case AppConstants.PAKISTAN_COUNTRY:

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberInternal);// serumSpecimenNumberInternal

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberInternal);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			internalLabId = LabJunior.getInstance().getTheGetLabId();
			LOGGER_LAB.info("Internal Lab Id : " + internalLabId);

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clearTheSpecimen();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberExternal);// serumSpecimenNumberExternal

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberExternal);
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberExternal);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			externalLabId = LabJunior.getInstance().getTheComformatoryGetLabId();
			LOGGER_LAB.info("External Lab Id : " + externalLabId);
			break;

		default:
			break;
		}
	}

	public static void internalTestBaseOnTheLocation(String country) throws Throwable {
		LabJuniorStepDefinition definition7 = new LabJuniorStepDefinition();
		definition7.enter_the_user_name_and_password_in_lab_junior_login();

		CommonUtility.sleepControl(4000);
		LabJunior.getInstance().clickTheLabWorkist();

		// Enter The Lab Id
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().enterTheLabId(internalLabId);

		// Click Search Button
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().clickTheSearchButton();

		// Click Edit Button
		CommonUtility.sleepControl(2500);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(1500);
		LabJunior.getInstance().clickTheEditButton();
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown50();

		switch (country) {

		case AppConstants.INDIA_COUNTRY:
			if (ConstantProperties.TITER_VALUE.equals("100")) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().enterTheTiterValue(ConstantProperties.TITER_VALUE);
				LOGGER.info("Titer value : " + ConstantProperties.TITER_VALUE);
			}
			if (ConstantProperties.TITER_VALUE.equals("0")) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().enterTheTiterValue(ConstantProperties.TITER_VALUE);
				LOGGER.info("Titer Value : " + ConstantProperties.TITER_VALUE);
			}
			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheCompletedButton();

			// TPHA

			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheSelectQualitativeType();

			if (ConstantProperties.TPHA.equals(AppConstants.RPR_REACTIVE)) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickThePositiveOption();
				LOGGER.info("TPHA : " + ConstantProperties.TPHA);
			}
			if (ConstantProperties.TPHA.equals(AppConstants.RPR_NON_REACTIVE)) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheNegativeOption();
				LOGGER.info("TPHA : " + ConstantProperties.TPHA);
			}

			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheCompletedButton();

			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheSelectQualitativeType();

			if (ConstantProperties.RPR_INTERNAL_TEST.equals(AppConstants.RPR_REACTIVE)) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickThePositiveOption();
				LOGGER.info("RPR : " + ConstantProperties.RPR_INTERNAL_TEST);
			}
			if (ConstantProperties.RPR_INTERNAL_TEST.equals(AppConstants.RPR_NON_REACTIVE)) {

				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheNegativeOption();
				LOGGER.info("RPR : " + ConstantProperties.RPR_INTERNAL_TEST);
			}
			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheCompletedButton();

			break;
		case AppConstants.PHILIPPINES_COUNTRY:

			break;
		case AppConstants.PAKISTAN_COUNTRY:
			if (LabJuniorWorkList.HBsAg_Internal_Test_Status == true) {

				CommonUtility.sleepControl(1500);
				LabJunior.getInstance().clickTheHbsagInternalResult();

				if (ConstantProperties.HBSAG_CONFIRMATION_RESULT.equals(AppConstants.ANTI_HCV_POSITIVE)) {
					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickThePositiveResult();
				}

				if (ConstantProperties.HBSAG_CONFIRMATION_RESULT.equals(AppConstants.ANTI_HCV_NEGATIVE)) {
					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickTheNegativeResult();

				}
				LOGGER.info("HBsAg Confirmation (Internal) : " + ConstantProperties.HBSAG_CONFIRMATION_RESULT);
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheCompletedButton();
			}

			if (LabJuniorWorkList.RPR_Internal_Test_Status == true) {
				if (ConstantProperties.TITER_VALUE.equals("1")) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().enterTheTiterValue(ConstantProperties.TITER_VALUE);
					LOGGER.info("Titer value : " + ConstantProperties.TITER_VALUE);
				}
				if (ConstantProperties.TITER_VALUE.equals("0")) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().enterTheTiterValue(ConstantProperties.TITER_VALUE);
					LOGGER.info("Titer Value : " + ConstantProperties.TITER_VALUE);
				}
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheCompletedButton();

				// TPHA

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSelectQualitativeType();

				if (ConstantProperties.TPHA.equals(AppConstants.RPR_REACTIVE)) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickThePositiveOption();
					LOGGER.info("TPHA : " + ConstantProperties.TPHA);
				}
				if (ConstantProperties.TPHA.equals(AppConstants.RPR_NON_REACTIVE)) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickTheNegativeOption();
					LOGGER.info("TPHA : " + ConstantProperties.TPHA);
				}
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheCompletedButton();

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSelectQualitativeType();

				if (ConstantProperties.RPR_INTERNAL_TEST.equals(AppConstants.RPR_REACTIVE)) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickThePositiveOption();
					LOGGER.info("RPR : " + ConstantProperties.RPR_INTERNAL_TEST);
				}
				if (ConstantProperties.RPR_INTERNAL_TEST.equals(AppConstants.RPR_NON_REACTIVE)) {

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickTheNegativeOption();
					LOGGER.info("RPR : " + ConstantProperties.RPR_INTERNAL_TEST);
				}
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheCompletedButton();
			}

			break;
		default:
			break;
		}
		// Click The Submit for first review
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickThesubmitForFirstReview();
		LOGGER.info("Result submitted for authorization successfully");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}

	public static void internalTestBaseOnLocationInLabSenior(String country) throws Throwable {

		LabSeniorStepDefinition seniorStepDefinition = new LabSeniorStepDefinition();
		seniorStepDefinition.enter_the_user_name_and_password_in_lab_senior_login();
		CommonUtility.sleepControl(3000);

		LabSenior.getInstance().clickTheresultEntryReview();
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().enterTheLabId(internalLabId);
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheEditButton();
		switch (country) {

		case AppConstants.INDIA_COUNTRY:

			CommonUtility.sleepControl(1500);
			LabSenior.getInstance().clickTheReviewButton();

			CommonUtility.sleepControl(1500);
			LabSenior.getInstance().clickTheReviewButton();

			CommonUtility.sleepControl(1500);
			LabSenior.getInstance().clickTheReviewButton();
			break;
		case AppConstants.PHILIPPINES_COUNTRY:

			break;
		case AppConstants.PAKISTAN_COUNTRY:
			if (LabJuniorWorkList.HBsAg_Internal_Test_Status == true) {

				CommonUtility.sleepControl(1500);
				LabSenior.getInstance().clickTheReviewButton();
			}

			if (LabJuniorWorkList.RPR_Internal_Test_Status == true) {

				CommonUtility.sleepControl(1500);
				LabSenior.getInstance().clickTheReviewButton();

				CommonUtility.sleepControl(1500);
				LabSenior.getInstance().clickTheReviewButton();

				CommonUtility.sleepControl(1500);
				LabSenior.getInstance().clickTheReviewButton();
				// TPHA

			}

			break;
		default:
			break;
		}
		// Click The Submit for first review
		CommonUtility.sleepControl(2000);
		LabSenior.getInstance().clickThesubmitForReview();
		LOGGER.info("Result submitted for authorization successfully");

		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}

	public static void internalTestBaseOnLocationInLabSupervisor(String country) throws Throwable {

		LabSupervisorStepDefinition definition = new LabSupervisorStepDefinition();
		definition.enter_the_user_name_and_password_in_lab_supervisor_login();
		definition.lab_supervisor_role_selection();

		CommonUtility.sleepControl(4000);

		LabSupervisor.getInstance().clickThePathlogist();
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().enterTheLabId(internalLabId);
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		CommonUtility.sleepControl(3000);

		LabSupervisor.getInstance().clickTheEdit();

		CommonUtility.sleepControl(3000);

		LabSupervisor.getInstance().clickTheAuthorizeAll();

		CommonUtility.sleepControl(3000);

		LabSupervisor.getInstance().clickTheSubmit();

		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}

}
