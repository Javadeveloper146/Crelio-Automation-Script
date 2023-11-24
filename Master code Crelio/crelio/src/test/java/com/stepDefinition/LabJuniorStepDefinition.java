package com.stepDefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
import com.modules.CredentialsController;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.LabJunior;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.referral.PrintReceipt;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LabJuniorStepDefinition {

	private static final Logger LOGGER = LogManager.getLogger(LabJuniorStepDefinition.class);
	public static Long start;
	public static Long end;
	public static Long millisecondsJunior;
	public static String labId;
	public static Long juniorTotalSeconds;

	public static Boolean NN_Status;

	public static Boolean Sample_Reject_Status = false;

	@Given("enter the userName and Password in Lab Junior Login")
	public void enter_the_user_name_and_password_in_lab_junior_login() throws Throwable {
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		// Incase Seperately Nurse module flow Run Using This driver APPURL Uncommend
//	DriverManager.getDriver().get(ConstantProperties.APPURL);

		// Credential
		CredentialsController controller = new CredentialsController();
		controller.labJuniorCredentials(ConstantProperties.STATE);

		CommonUtility.sleepControl(200);
		LoginPage.getInstance().clickTheSignInButton();
		LOGGER.info("Lab Junior Module");

	}

	@Then("Lab Junior Role Selection")
	public void lab_junior_role_selection() throws Throwable {

	}

	@Then("Specimen Inscan Process")
	public void specimen_inscan_process() throws Throwable {
		LOGGER.info("Specimen Inscan Process");
		// Click Specimen Inscan
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(6000);
		} else {
			CommonUtility.sleepControl(2500);
		}
		LabJunior.getInstance().clickTheSpecimenInscan();

		// Enter the Specimen Number
//		CommonUtility.sleepControl(2000);
//		LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.wholeBloodSpecimenNumber);//
//		CommonUtility.sleepControl(1000);
//		LabJunior.getInstance().clickTheSearchButton();

		// Click Search Button
//		CommonUtility.sleepControl(3000);
//		CommonUtility.scrollDown100();

//		CommonUtility.sleepControl(1000);

//
//		LOGGER.info("Lab ID" + ": " + labId);

		// Clear
//		CommonUtility.sleepControl(1000);
//		LabJunior.getInstance().clickTheClearButton();
//
//		CommonUtility.sleepControl(2000);
//		LabJunior.getInstance().clickTheSearchButton();

		if (ConstantProperties.NEGATIVE_SCENARIO_STATUS.equals(AppConstants.NEGATIVE_SCENARIO_YES)) {
			CommonUtility.scrollDown400();
			CommonUtility.sleepControl(1600);
			LabJunior.getInstance().clickTheSaveButton();
			LOGGER.info("Kindly scan any one of the specimen number");

			// Enter Specimen Number

			// Get The Lab Id

		}

	}

	@Then("Scan Plasma Serum Whole Blood Specimen Number")
	public void scan_specimen_number() throws Throwable {

		// Scan The plasma Specimen Number
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(18000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		CommonUtility.scrollDown100();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4200);
		} else {
			CommonUtility.sleepControl(2000);
		}
		if (ConstantProperties.REJECT_FOR_PLASMA.equals(AppConstants.APPROVAL_REJECT)) {
			Sample_Reject_Status = true;
			LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);//
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();

			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);
			LOGGER.info("Plasma Specimen Number" + ": " + NurseModuleStepDefinition.plasmaSpecimenNumber);
		}
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);
		LOGGER.info("Plasma Specimen Number" + ": " + NurseModuleStepDefinition.plasmaSpecimenNumber);
		LOGGER.info("Successfully Scan Plasma Specimen Number");

		if (ConstantProperties.REJECT_FOR_PLASMA.equals(AppConstants.APPROVAL_REJECT)) {
			CommonUtility.sleepControl(2000);
			rejectSample();

		}

//		CommonUtility.sleepControl(500);
//		NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}
		System.err.println("erweweror");
		// NurseModuleStepDefinition.serumSpecimenNumberSST = "ST92300004474";
		if (ConstantProperties.REJECT_FOR_SERUM_SST.equals(AppConstants.APPROVAL_REJECT)) {
			Sample_Reject_Status = true;
			LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberSST);
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(3000);
		}
		CommonUtility.sleepControl(100);
		LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberSST);
		LOGGER.info("Serum SST Specimen Number" + ": " + NurseModuleStepDefinition.serumSpecimenNumberSST);
//		CommonUtility.sleepControl(200);
//		NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
		LOGGER.info("Successfully Scan Serum SST Specimen Number ");
		if (ConstantProperties.REJECT_FOR_SERUM_SST.equals(AppConstants.APPROVAL_REJECT)) {
			rejectSample();

		}
		// Scan The serumSpecimenNumber
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(1000);
		}

		// NurseModuleStepDefinition.serumSpecimenNumberPlainTube = "ST92300004470";
		if (ConstantProperties.REJECT_FOR_SERUM_PLAIN_TUBE.equals(AppConstants.APPROVAL_REJECT)) {
			Sample_Reject_Status = true;
			LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberPlainTube);
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(3000);
		}
		CommonUtility.sleepControl(200);
		LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberPlainTube);
		LOGGER.info("Serum PLT Specimen Number" + ": " + NurseModuleStepDefinition.serumSpecimenNumberPlainTube);

		if (ConstantProperties.REJECT_FOR_SERUM_PLAIN_TUBE.equals(AppConstants.APPROVAL_REJECT)) {
			rejectSample();

		}

//		CommonUtility.sleepControl(200);
//		NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
		LOGGER.info("Successfully Scan Serum Plain Specimen Number");

		// Scan The wholeBloodSpecimenNumber
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}

		// NurseModuleStepDefinition.wholeBloodSpecimenNumber = "ED92300004471";
		if (ConstantProperties.REJECT_FOR_WHOLD_BLOOD.equals(AppConstants.APPROVAL_REJECT)) {
			Sample_Reject_Status = true;
			LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.wholeBloodSpecimenNumber);
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheSearchButton();
			CommonUtility.sleepControl(3000);
		}
		CommonUtility.sleepControl(200);
		LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.wholeBloodSpecimenNumber);
		LOGGER.info("Whole Blood Specimen Number" + ": " + NurseModuleStepDefinition.wholeBloodSpecimenNumber);

		if (ConstantProperties.REJECT_FOR_SERUM_PLAIN_TUBE.equals(AppConstants.APPROVAL_REJECT)) {
			rejectSample();

		}

		// Reject Worklist
		if (Sample_Reject_Status == true) {
			NN_Status = true;
			rejectWorkList();
		}

//		CommonUtility.sleepControl(200);
//		NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

		// Click The Save
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2800);
		} else {
			CommonUtility.sleepControl(1500);
		}

		CommonUtility.scrollDown1000();

		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSaveButton();
		LOGGER.info("Specimen inscan details saved successfully");

	}

	@Then("Go To Work List")
	public void go_to_work_list() throws Throwable {

		LOGGER.info("Lab Work List");
		String genderType = GROStepDefinition.gender;
		LOGGER.info("Gender Type" + ": " + genderType);

		// Click The Lab Work List
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3800);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabJunior.getInstance().clickTheLabWorkist();

//		CommonUtility.sleepControl(3000);
//		WebElement pathToken = DriverManager.getDriver().findElement(By.xpath("(//td)[2]"));
//		// retrieving html attribute value using getAttribute() method
//		String tokenValue = pathToken.getAttribute("id");
//
//		LOGGER.info("Lab ID" + ": " + tokenValue);
//
//		CommonDefinition commonDefinition = new CommonDefinition();
//		commonDefinition.logOut();
		// Enter Specimen Number
		// Enter The Lab Id
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1800);
		}
		LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberSST);
		// Click Search Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJunior.getInstance().clickTheSearchButton();

		// Click Edit Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2600);
		} else {
			CommonUtility.sleepControl(2000);
		}
		CommonUtility.scrollDown100();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2600);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabJunior.getInstance().clickTheEditButton();

		// Enter Specimens Result
		LabJuniorWorkList juniorWorkList = new LabJuniorWorkList();
		juniorWorkList.labWorkList();
	}

	@Then("Lab Junior Module Logout")
	public void gp_module_logout() throws Throwable {

//		TestModule  module = new  TestModule();
//		module.test1();
		// LogOut
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();
		end = System.currentTimeMillis();
		millisecondsJunior = (end - start);
		LOGGER.info("Lab Junior Runing Time:");
		juniorRunTime(millisecondsJunior);
	}

	public void juniorRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		juniorTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + juniorTotalSeconds + " " + "seconds");

	}

	public void rejectSample() throws Throwable {
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheReject();
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().clickSelectReason();

		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickFirstDropDownOption();
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().clickSaveBtnReject();
		LOGGER.info("Reject the Sample");
		CommonUtility.sleepControl(9000);
		LabJunior.getInstance().clickTheClearButton();

	}

	public static void rejectWorkList() throws Throwable {
		// Reject WorlList
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickRejectWorkList();
		CommonUtility.sleepControl(1500);
		LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);//
		CommonUtility.sleepControl(500);
		LabJunior.getInstance().clickTheSearchButton();
		CommonUtility.sleepControl(1500);
		LabJunior.getInstance().clickTheRetake();
		CommonUtility.sleepControl(1500);
		LabJunior.getInstance().clickRejectWorkListRetakeReason();
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickFirstDropDownOption();
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().clickRetakeSave();
		LOGGER.info("  Retake initiated successfully");

		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		commonDefinition.groReferral();

		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheNext();

		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();

		// Login Nurse
		NurseModuleStepDefinition definition = new NurseModuleStepDefinition();
		definition.enter_the_user_name_and_password_in_nurse_login();
		definition.select_the_role_selection_nurse();
		definition.select_the_counter_selection_nurse();
		definition.token_verify_page();
		definition.speciman_genaration();
		definition.speciman_collection();
		definition.feedback();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_9)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}
}
