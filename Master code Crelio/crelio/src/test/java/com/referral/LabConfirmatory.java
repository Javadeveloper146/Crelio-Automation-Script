package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
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
	public static String ReGenarate_Specimen_Number_External_1 ="PL92300004843";
	public static String ReGenarate_Specimen_Number_External_2 ="QT92300004844";
	public static String External_SpecimenNumber_ID_1;
	public static String External_SpecimenNumber_ID_2;
	public static boolean statusCondition;
	public static boolean Conformatory_Status;
	public static String internalLabId;
	public static String External_Lab_ID_1 ="5122";
	public static String External_Lab_ID_2 ="5123";
	public static String Specimen_Type_1;
	public static String Specimen_Type_2;
	public static String Specimen_Type_3;
	public static String Specimen_Type_4;
	public static String Specimen_Type_5;
	LabJuniorStepDefinition labJuniorStepDefinition;

	CommonDefinition commonDefinition = new CommonDefinition();
	LabJuniorStepDefinition juniorStepDefinition;
	LabSupervisorStepDefinition labSupervisor;

	public void hivPositiveRef() throws Throwable {

		// Login Nurse

		// Login Junior
		LabJuniorStepDefinition definition3 = new LabJuniorStepDefinition();
		definition3.enter_the_user_name_and_password_in_lab_junior_login();

		// Scan The Specimen Number
		// Click Specimen Inscan
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSpecimenInscan();

		// Scan The Specimen Number
		juniorLabInscanSpceimenBaseOnLocation(ConstantProperties.COUNTRY);

		LOGGER_LAB.info("Specimen inscan details saved successfully");

		commonDefinition.logOut();

		// Central Lab Authority

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
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		// Click The Search Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		if (LabConstants.BEtaHCG.equals(AppConstants.HIV_POSITIVE)) {
			CommonUtility.sleepControl(1000);
			LOGGER.info("Site Name" + ": " + LabDirector.getInstance().getTheSiteName());

			// Specimen Number
			CommonUtility.sleepControl(500);
			ReGenarate_Specimen_Number_External_1 = LabDirector.getInstance().getTheSpecimenNumebr();
			LOGGER.info("Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);

			// Get The External Specimen Name
			CommonUtility.sleepControl(500);
			External_SpecimenNumber_ID_1 = (LabDirector.getInstance().getTheExternalSpecimenNumber());
			LOGGER.info("External Specimen Number" + ": " + External_SpecimenNumber_ID_1);

			// Click The Print
			CommonUtility.sleepControl(1000);
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
			CommonUtility.sleepControl(500);
			LabDirector.getInstance().clickTheSave();
			LOGGER.info("External Barcode Approval Suceesfully");
		}
		// Get The Site Name
		if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE) && LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
				&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

		} else {
			CommonUtility.sleepControl(2000);
			LOGGER.info("Site Name" + ": " + LabDirector.getInstance().getTheSiteName());

			// Specimen Number
			CommonUtility.sleepControl(500);
			ReGenarate_Specimen_Number_External_1 = LabDirector.getInstance().getTheSpecimenNumebr();
			LOGGER.info("Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);

			// Get The External Specimen Name
			CommonUtility.sleepControl(1000);
			External_SpecimenNumber_ID_1 = (LabDirector.getInstance().getTheExternalSpecimenNumber());
			LOGGER.info("External Specimen Number" + ": " + External_SpecimenNumber_ID_1);

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

		}

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
		CommonUtility.sleepControl(2000);
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
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheStatus();

		// Click The External Pending
		CommonUtility.sleepControl(500);
		LabJunior.getInstance().clickTheExternalPending();
		LOGGER.info("Status : External Pending ");

		// Enter The lab Id
		// specimenInternalCondition =
		if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE) && LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
				&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

		} else {

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheLabId(External_Lab_ID_1);// externalLabId
			LOGGER.info("External Lab ID" + ": " + External_Lab_ID_1);

			// Click The Search Button
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSearchButton();

			// Click The Map Barcode
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheMapBarcode();

			// Enter The Scan Specimen Number
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheMapBarcodeScanSpecimenNumberInRetest(External_SpecimenNumber_ID_1);//
			LOGGER.info("External Specimen Number : " + External_SpecimenNumber_ID_1);

			// Save Button
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheMapBarcodeSave();
			LOGGER.info("External barcode saved as complete successfully");

			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {

				LabJunior.getInstance().enterTheLabId(External_Lab_ID_2);// externalLabId
				LOGGER.info("External Lab ID" + ": " + External_Lab_ID_2);

				// Click The Search Button
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().clickTheSearchButton();

				// Click The Map Barcode
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().clickTheMapBarcode();

				// Enter The Scan Specimen Number
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().enterTheMapBarcodeScanSpecimenNumberInRetest(External_SpecimenNumber_ID_2);//
				LOGGER.info("External Specimen Number : " + External_SpecimenNumber_ID_2);

				// Save Button
				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheMapBarcodeSave();
				LOGGER.info("External barcode saved as complete successfully");
			}

		}
		if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheLabId(External_Lab_ID_1);// externalLabId
			LOGGER.info("External Lab ID" + ": " + External_Lab_ID_1);

			// Click The Search Button
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSearchButton();

			// Click The Map Barcode
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheMapBarcode();

			// Enter The Scan Specimen Number
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheMapBarcodeScanSpecimenNumberInRetest(External_SpecimenNumber_ID_1);//
			LOGGER.info("External Specimen Number : " + External_SpecimenNumber_ID_1);

			// Save Button
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheMapBarcodeSave();
			LOGGER.info("External barcode saved as complete successfully");
		}

		// Log Out
		CommonUtility.sleepControl(1000);
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
		CommonUtility.sleepControl(1000);
		LOGGER.info("Specimen Number" + ": " + LabSupervisor.getInstance().getTheSpecimenNumberOutSourcePending());
		// Lab Id
		LOGGER.info("Lab Id" + ": " + LabSupervisor.getInstance().getTheLabIdOutSourcePending());
		// Enternal Specimen Id
		LOGGER.info(
				"External Specimen Id" + ": " + LabSupervisor.getInstance().getTheExternalSpecimenIdOutSourcePending());

		LOGGER.info("Successfully Scan The Serum Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);

		// Click The Search Button
//		CommonUtility.sleepControl(3000);
//		CommonUtility.enterFunction();
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheCheckBox();
		// Click The TRF Form
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().clickThePrintButton();

		CommonUtility.sleepControl(1000);
		CommonDefinition.windowCloseFuncitonAltF4();

		// Click The Action
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheAction();

		// Click The Outsouring
		CommonUtility.sleepControl(500);
		LabSupervisor.getInstance().clickTheOutsourcing();

		// Get The Action
		LOGGER.info("Action" + ": " + LabSupervisor.getInstance().getTheAction());

		// Click The Transfor Location
		CommonUtility.sleepControl(500);
		LabSupervisor.getInstance().clickTheTransforLocation();

		// Click The Core Diagnostics Center
		CommonUtility.sleepControl(500);
		LabSupervisor.getInstance().clickTheCoreDiagnosticsCenter();

		// Get The Transfor Location
		LOGGER.info("Transfer Location" + ": " + LabSupervisor.getInstance().getTheTransforLocation());

		// Transfer Date
		CommonUtility.sleepControl(1000);
//		LabSupervisor.getInstance().clickTheTransferDate();

		// Click Current Dat
		// LabSupervisor.getInstance().clickTheCurrentDate();

		// Get Transfer Date
		// LOGGER.info("Transfer Date" + ": " +
		// LabSupervisor.getInstance().getTheCurrentDate());

		// Save Button
		CommonUtility.sleepControl(1000);
		LabDirector.getInstance().clickTheSave();
		LOGGER.info("Diagnostic centre details updated successfully");

		// Generate STF
		// Click The Generate STF
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollUp500();
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheGenerateSTF();
		LOGGER.info("Generate STF :");

		// Click The Search

		// Get The STF ID
		CommonUtility.sleepControl(1000);
		LOGGER.info("Speciment Batch STF ID" + ": " + LabSupervisor.getInstance().getTheSTFID());

		// Get The Generate Date
		LOGGER.info("Generated date" + ": " + LabSupervisor.getInstance().getTheGenerateDate());

		// Select All
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(1000);
		LabSupervisor.getInstance().clickTheSelectAll();

		// Get External Specimen Id
		LOGGER.info("External Specimen Id" + ": " + LabSupervisor.getInstance().getExternalSpecimenId());

		// Click Save
		CommonUtility.sleepControl(1000);
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
		CommonUtility.sleepControl(1000);
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
			if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {
			} else {
				LOGGER.info("Serum - Plain Tube " + ": " + "Yet to be Generated");
			}

			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
				LOGGER.info(" Plasma - Container 'Lithium Heparin, QT tube'" + ": " + "Yet to be Generated");
//				LOGGER.info(" Whole Blood - Container 'Null Tube'" + ": " + "Yet to be Generated");
//				LOGGER.info(" Whole Blood - Container 'TB1 Tube'" + ": " + "Yet to be Generated");
//				LOGGER.info(" Whole Blood - Container 'TB2 Tube'" + ": " + "Yet to be Generated");
//				LOGGER.info(" Whole Blood - Container 'Mitogen Tube'" + ": " + "Yet to be Generated");
			}
			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				statusCondition = true;
				LOGGER.info("Internal Plasma Specimen Number" + ": " + "Yet to be Generated");
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

	public static void specimenCollectionBaseOnLocation(String country) throws Throwable {

		switch (country) {

		case AppConstants.INDIA_COUNTRY:

			if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

			} else {
				CommonUtility.sleepControl(1500);
				ReGenarate_Specimen_Number_External_1 = (NurseSampleOutgoingPageObject.getInstance()
						.getThePlasmaNumber());
				LOGGER.info(
						"External Serum Plain Tube Specimen Number " + ": " + ReGenarate_Specimen_Number_External_1);
				if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
					ReGenarate_Specimen_Number_External_2 = NurseSampleOutgoingPageObject.getInstance().getTheType2();
					LOGGER.info("Plasma - Lithium Heparin, QT tube - Specimen Number " + ": "
							+ ReGenarate_Specimen_Number_External_2);

				}
			}
			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {

				ReGenarate_Specimen_Number_External_1 = NurseSampleOutgoingPageObject.getInstance().getTheType1();
				LOGGER.info("Plasma - Lithium Heparin, QT tube - Specimen Number " + ": "
						+ ReGenarate_Specimen_Number_External_1);
				// Specimen_Type_2 = NurseSampleOutgoingPageObject.getInstance().getTheType2();
//				LOGGER.info("Whole Blood - TB1 Tube	 - Specimen Number " + ": " + Specimen_Type_2);
//				Specimen_Type_3 = NurseSampleOutgoingPageObject.getInstance().getTheType3();
//				LOGGER.info("Whole Blood - TB2 Tube	 - Specimen Number " + ": " + Specimen_Type_3);
//				Specimen_Type_4 = NurseSampleOutgoingPageObject.getInstance().getTheType4();
//				LOGGER.info("Whole Blood - Mitogen Tube - Specimen Number " + ": " + Specimen_Type_4);
//				Specimen_Type_5 = NurseSampleOutgoingPageObject.getInstance().getTheType5();
//				LOGGER.info("Plasma - Lithium Heparin, QT tube - Specimen Number " + ": " + Specimen_Type_5);

			}
			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				CommonUtility.sleepControl(2000);
				serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
				LOGGER.info("Internal Serum Specimen Number " + ": " + serumSpecimenNumberInternal);
				statusCondition = true;
			}

			break;

		case AppConstants.PHILIPPINES_COUNTRY:

			CommonUtility.sleepControl(1000);
			serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
			LOGGER.info("Internal   Serum Specimen Number " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(100);
			ReGenarate_Specimen_Number_External_1 = (NurseSampleOutgoingPageObject.getInstance()
					.getTheSerumSpecimenNumber());
			LOGGER.info("External Serum Specimen Number " + ": " + ReGenarate_Specimen_Number_External_1);
			break;

		case AppConstants.PAKISTAN_COUNTRY:

			CommonUtility.sleepControl(1000);
			serumSpecimenNumberInternal = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
			LOGGER.info("Internal   Serum Specimen Number " + ": " + ReGenarate_Specimen_Number_External_1);

			CommonUtility.sleepControl(100);
			ReGenarate_Specimen_Number_External_1 = (NurseSampleOutgoingPageObject.getInstance()
					.getTheSerumSpecimenNumber());
			LOGGER.info("External Serum Specimen Number " + ": " + ReGenarate_Specimen_Number_External_1);
			break;
		default:
			break;
		}

	}

	public static void location_Base_Outgoing_Sample(String country) throws Throwable {
		switch (country) {

		case AppConstants.INDIA_COUNTRY:

			if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

			} else {

				CommonUtility.sleepControl(1000);
				NurseSampleOutgoingPageObject.getInstance()
						.scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);

				LOGGER.info("Successfully scan the External Specimen Number  " + ": "
						+ ReGenarate_Specimen_Number_External_1);

				if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
					CommonUtility.sleepControl(500);
					NurseSampleOutgoingPageObject.getInstance()
							.scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_2);
					LOGGER.info("Successfully scan the External Specimen Number  " + ": "
							+ ReGenarate_Specimen_Number_External_2);
				}

			}

			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {

				CommonUtility.sleepControl(2000);
				NurseSampleOutgoingPageObject.getInstance()
						.scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);
//				CommonUtility.sleepControl(500);
//				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_2);
//				CommonUtility.sleepControl(500);
//				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_3);
//				CommonUtility.sleepControl(500);
//				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_4);
//				CommonUtility.sleepControl(500);
//				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_5);
				LOGGER.info(" Successfully scan Specimen Number : " + ReGenarate_Specimen_Number_External_1);

			}

			if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				CommonUtility.sleepControl(2000);
				NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);
				LOGGER.info("Successfully scan the Internal  Specimen Number  " + ": " + serumSpecimenNumberInternal);
			}

			break;

		case AppConstants.PHILIPPINES_COUNTRY:
			CommonUtility.sleepControl(1500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Successfully scan the Internal Serum Specimen Number  " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

			LOGGER.info("Successfully scan the Serum Specimen Number External " + ": "
					+ ReGenarate_Specimen_Number_External_1);
			break;

		case AppConstants.PAKISTAN_COUNTRY:
			CommonUtility.sleepControl(1500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Successfully scan the Internal Serum Specimen Number  " + ": " + serumSpecimenNumberInternal);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);

			CommonUtility.sleepControl(500);
			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

			LOGGER.info("Successfully scan the Serum Specimen Number External " + ": "
					+ ReGenarate_Specimen_Number_External_1);
			break;
		default:
			break;
		}

	}

	public static void juniorLabInscanSpceimenBaseOnLocation(String country) throws Throwable {

		switch (country) {
		case AppConstants.INDIA_COUNTRY:
			if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

			} else {
				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().enterTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);//

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSearchButton();

				CommonUtility.sleepControl(1500);
				External_Lab_ID_1 = LabJunior.getInstance().getTheComformatoryGetLabId();
				LOGGER_LAB.info("External Lab Id 1 : " + External_Lab_ID_1);

				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);
				LOGGER_LAB.info("External Serum Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);
				CommonUtility.sleepControl(1000);
				CommonUtility.scrollDown100();

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSaveButton();

				if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
					CommonUtility.sleepControl(1000);
					LabJunior.getInstance().clearTheSpecimen();
					CommonUtility.sleepControl(500);
					LabJunior.getInstance().enterTheSpecimenNumber(ReGenarate_Specimen_Number_External_2);//

					CommonUtility.sleepControl(500);
					LabJunior.getInstance().clickTheSearchButton();

					CommonUtility.sleepControl(1000);
					External_Lab_ID_1 = LabJunior.getInstance().getTheComformatoryGetLabId();
					LOGGER_LAB.info("External Lab Id 2 : " + External_Lab_ID_2);
					CommonUtility.sleepControl(2000);
					LabJunior.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_2);

					CommonUtility.sleepControl(1000);
					CommonUtility.scrollDown100();

					CommonUtility.sleepControl(1000);
					LabJunior.getInstance().clickTheSaveButton();
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_2);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_3);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_4);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_5);
				}
			}

			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)&&LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.AntiHCV.equals(AppConstants.HIV_NEGATIVE)
					&& LabConstants.HBsAg.equals(AppConstants.HIV_NEGATIVE)) {

				CommonUtility.sleepControl(3000);
				LabJunior.getInstance().enterTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);//

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSearchButton();

				CommonUtility.sleepControl(1000);
				External_Lab_ID_1 = LabJunior.getInstance().getTheComformatoryGetLabId();
				LOGGER_LAB.info("External Lab Id 1 : " + External_Lab_ID_1);

				CommonUtility.sleepControl(3000);
				LabJunior.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);

				CommonUtility.sleepControl(1000);
				CommonUtility.scrollDown100();

				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().clickTheSaveButton();
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_2);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_3);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_4);
//					CommonUtility.sleepControl(500);
//					NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(Specimen_Type_5);
			}

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

			break;

		case AppConstants.PHILIPPINES_COUNTRY:

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(serumSpecimenNumberInternal);// serumSpecimenNumberInternal

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + serumSpecimenNumberInternal);

			// Click Search Button
			CommonUtility.sleepControl(1000);
			internalLabId = LabJunior.getInstance().getTheGetLabId();
			LOGGER_LAB.info("Internal Lab Id : " + internalLabId);

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clearTheSpecimen();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);// Serum_Specimen_Number_External_ID_1

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);

			// Click Search Button
			CommonUtility.sleepControl(2000);
			External_Lab_ID_1 = LabJunior.getInstance().getTheComformatoryGetLabId();
			LOGGER_LAB.info("External Lab Id : " + External_Lab_ID_1);

			CommonUtility.sleepControl(2200);
			LabJunior.getInstance().clearTheClearBtn();
			CommonUtility.sleepControl(3000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(3500);
			LabJunior.getInstance().scanTheSpecimenNumber(serumSpecimenNumberInternal);
			CommonUtility.sleepControl(500);
			LabJunior.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);

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
			LabJunior.getInstance().enterTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);// Serum_Specimen_Number_External_ID_1

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(ReGenarate_Specimen_Number_External_1);
			LOGGER_LAB.info("Internal Serum Specimen Number" + ": " + ReGenarate_Specimen_Number_External_1);

			// Click Search Button'
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			CommonUtility.sleepControl(1000);
			External_Lab_ID_1 = LabJunior.getInstance().getTheComformatoryGetLabId();
			LOGGER_LAB.info("External Lab Id : " + External_Lab_ID_1);
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
