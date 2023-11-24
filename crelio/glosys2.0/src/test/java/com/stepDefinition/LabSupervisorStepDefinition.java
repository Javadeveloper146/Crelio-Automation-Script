package com.stepDefinition;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.constantProperties.LabConstants;
import com.driverManager.DriverManager;
import com.flowContoller.FlowController;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.ApplicationStatusCheck;
import com.modules.CountryController;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LabSupervisorStepDefinition {
	private static final Logger LOGGER = LogManager.getLogger(LabSupervisorStepDefinition.class);

	public static Long start;
	public static Long end;
	static Long millisecondsSupervisor;
	public static boolean status;
	public static int rejectTotalCount;
	public static Long supersivorTotalSeconds;
	LabJuniorStepDefinition labJuniorStepDefinition;
	public static long TotalRunTime;

	@Given("enter the userName and Password in Lab Supervisor Login")
	public void enter_the_user_name_and_password_in_lab_supervisor_login() throws Throwable {

		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		// Incase Separately Nurse module flow Run Using This driver APPURL Uncommend

		// DriverManager.getDriver().get(ConstantProperties.APPURL);

		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.LAB_SUPERVISOR_UNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.LAB_SUPERVISOR_PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
		LOGGER.info("Lab Supervisor Module");
	}

	@Then("Lab Supervisor Role Selection")
	public void lab_supervisor_role_selection() throws Throwable {
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1700);
		} else {
			CommonUtility.sleepControl(1000);
		}
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(500);
		LabSupervisor.getInstance().clickTheLabSupervisor();
		LOGGER.info("Role Section" + ": " + LabSupervisor.getInstance().getTheLabSupervisorOption());
		// Click The country

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

	}

	@Then("Pathalogist Worklist")
	public void pathalogist_worklist() throws Throwable {
		LOGGER.info("Pathalogist Worklist :");
		// Click The Pathalogist Worklist
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2800);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabSupervisor.getInstance().clickThePathlogist();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1700);
		} else {
			CommonUtility.sleepControl(1000);
		}
		LabJunior.getInstance().enterTheLabId(LabSeniorStepDefinition.labId);

		// LabJunior.getInstance().enterTheLabId(ConstantProperties.LAB_ID);

		// LabJunior.getInstance().enterTheLabId("2390");
		LOGGER.info("Lab ID" + ": " + LabSeniorStepDefinition.labId);
		// Click Search Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabJunior.getInstance().clickTheSearchButton();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		LabSupervisor.getInstance().clickTheEdit();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		CommonUtility.scrollDown100();

		// Click The Authorize All
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabSupervisor.getInstance().clickTheAuthorizeAll();

		// Pathalogist Work List
		LOGGER.info("Result Entry :");
		LOGGER.info("Lab Supervisor Authorize in Result Entry :");

		String genderType = GROStepDefinition.gender;

		LOGGER.info("Gender Type" + ": " + genderType);
		boolean hemoglobinRetakeStatus = LabJuniorWorkList.hamoglobin;
		boolean hivRetakeStatus = LabJuniorWorkList.hiv;
		boolean antiHCVRetakeStatus = LabJuniorWorkList.antiHCV;
		boolean hbsAgRetakeStatus = LabJuniorWorkList.hBsAg;
		boolean sgotRetakeStatus = LabJuniorWorkList.sgot;
		boolean sgptRetakeStatus = LabJuniorWorkList.sgpt;
		boolean creatinineRetakeStatus = LabJuniorWorkList.creatinine;
		boolean rprRetakeStatus = LabJuniorWorkList.rpr;
		boolean glucoseRetakeStatus = LabJuniorWorkList.glucose;
		boolean betaHCGRetakeStatus = LabJuniorWorkList.bEtaHCG;

		if (hemoglobinRetakeStatus == false) {
			LOGGER.info("Hemoglobin" + ": " + LabConstants.HAEMOGLOBIN + " = " + "Authorized");
		}

		LOGGER.info("Blood Group" + ": " + LabConstants.BlOOD_GROUP + " = " + "Authorized");

		if (hivRetakeStatus == false) {
			LOGGER.info("HIV" + ": " + LabConstants.HIV + " = " + "Authorized");
		}
		if (antiHCVRetakeStatus == false) {
			LOGGER.info("Anti HCV" + ": " + LabConstants.AntiHCV + " = " + "Authorized");
		}
		if (hbsAgRetakeStatus == false) {
			LOGGER.info("HBsAg" + ": " + LabConstants.HBsAg + " = " + "Authorized");
		}
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown1000();

		if (sgotRetakeStatus == false) {
			LOGGER.info("SGOT" + ": " + LabConstants.SGOT + " = " + "Authorized");
		}
		if (sgptRetakeStatus == false) {

			LOGGER.info("SGPT" + ": " + LabConstants.SGPT + " = " + "Authorized");
		}
		if (creatinineRetakeStatus == false) {
			LOGGER.info("Creatinine" + ": " + LabConstants.CREATININE + " = " + "Authorized");
		}

		if (rprRetakeStatus == false) {
			LOGGER.info("RPR" + ": " + LabConstants.RPR + " = " + "Authorized");
		}
		switch (genderType) {

		case "Male":
			if (glucoseRetakeStatus == false) {
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Authorized");
			}
			break;

		default:
			if (betaHCGRetakeStatus == false) {
				LOGGER.info("BEta HC" + ": " + LabConstants.BEtaHCG + " = " + "Authorized");
			}
			if (glucoseRetakeStatus == false) {
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Authorized");
			}
			break;

		}
//		CommonUtility.sleepControl(2000);
//		CommonUtility.scrollDown400();
		// Click The Submit for Authorizer
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2200);
		} else {
			CommonUtility.sleepControl(1200);
		}
		LabSupervisor.getInstance().clickTheSubmit();
		LOGGER.info("Results authorized successfully!");

	}

	@Then("Logout Supervisor")
	public void logout() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
		CommonUtility.sleepControl(7000);
		commonDefinition.logOut();
		LOGGER.info("Log out For Supervisor");

		end = System.currentTimeMillis();
		millisecondsSupervisor = (end - start);
		supervisorRunTime(millisecondsSupervisor);

		// --------------------------------------------------------------------
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO
				.equals(ApplicationScenarioConstants.SC_14)) {
			CommonDefinition commonDefinition4 = new CommonDefinition();
			commonDefinition4.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_29)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		
		
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_33)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_37)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_41)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		FlowController controller = new FlowController();
		controller.flowControllerBaseOnTheModule();
	}

	public void supervisorRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		supersivorTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + supersivorTotalSeconds + " " + "seconds");

	}
}