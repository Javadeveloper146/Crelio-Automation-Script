package com.modules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.modulesPOM.CentralGpPOM;
import com.modulesPOM.MOHPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class MOH {
	private static final Logger LOGGER = LogManager.getLogger(MOH.class);
	public static long mohTotalSeconds;
	public static long start;
	public static long end;
	public static long millisecondsMoh;

	public void mohFlow() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOH_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.MOH_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOH_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.MOH_PASSWORD);

		CommonUtility.sleepControl(200);
		LoginPage.getInstance().clickTheSignInButton();

		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		// Role Selection
		// Role Selection

		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOHPOM.getInstance().clickTheMOHRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOH WorkList
		CommonUtility.sleepControl(1000);
		MOHPOM.getInstance().clickTheMOHWorkList();
		LOGGER.info("MOH Worklist : ");

		CommonUtility.sleepControl(3000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheSearch();

		LOGGER.info("Country : " + ConstantProperties.COUNTRY);
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_27)) {
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

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheEditIcon();

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheYes();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_28)) {
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheAssignedTo();

			CommonUtility.sleepControl(1500);
			MOHPOM.getInstance().clickMOHLab();
			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheSaveCertificate();

			LOGGER.info("Assigned to MOH Lab successfully!");

			MOHLab mohLab = new MOHLab();
			mohLab.mohLab();

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ConstantProperties.FINAL_APPROVAL_AUTHORIZE.equals(AppConstants.MOI)) {
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheAssignedTo();

			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_21)) {
				CommonUtility.sleepControl(1500);
				MOHPOM.getInstance().clickMOHLab();
				CommonUtility.sleepControl(2000);
				GpModule.getInstance().clickTheSaveCertificate();

				LOGGER.info("Assigned to MOH Lab successfully!");
				CommonDefinition commonDefinition = new CommonDefinition();
				commonDefinition.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			// MOI
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickMOI();
		}

		CommonUtility.sleepControl(3000);
		if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.FIT)) {
			MOHPOM.getInstance().clickFit();
		} else if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			MOHPOM.getInstance().clickUnFit();
		}

		CommonUtility.sleepControl(2000);
		GpModule.getInstance().clickTheSaveCertificate();

		LOGGER.info("Assigned to MOI successfully!");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_22)) {
			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_23)) {
			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_24)) {
			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}

	public void mohAutofitReviwer() throws Throwable {

		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOH_UNAME);
		CommonUtility.sleepControl(200);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOH_PASSWORD);

		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();

		// Role Selection
		LOGGER.info("MOH");
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOHPOM.getInstance().clickTheMOHRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOH WorkList
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		MOHPOM.getInstance().clickTheMOHWorkList();
		LOGGER.info("MOH Worklist : ");

		// Auto Fit Reviwer
		LOGGER.info("Autofit Review : ");

		CommonUtility.sleepControl(60000);
		MOHPOM.getInstance().clickAutoFitReviwer();

		LOGGER.info("Country : " + ConstantProperties.COUNTRY);
		LOGGER.info("Status : Autofit Review");
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CentralGpPOM.getInstance().clickTheSearch();

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown100();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CentralGpPOM.getInstance().clickTheEditIcon();

		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_15)) {

			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheAssignedTo();

			// MOI
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickCentralGp();

			CommonUtility.sleepControl(1000);
			GpModule.getInstance().clickTheSaveCertificate();

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_16)) {
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheAssignedTo();
			// MOI
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickCentralGp();

			CommonUtility.sleepControl(1000);
			GpModule.getInstance().clickTheSaveCertificate();

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();
			CentralGp.centralGPAssignToStemzGp();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

//		CommonUtility.sleepControl(1000);
//		GpModule.getInstance().clickTheAssignedTo();
//
//		CommonUtility.sleepControl(3000);
//		MOHPOM.getInstance().clickMOI();
		if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.FIT)) {
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickFit();
		}
		if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickUnFit();

			CommonUtility.sleepControl(700);
			MOHPOM.getInstance().clickSelectReason();
			CommonUtility.sleepControl(500);
			MOHPOM.getInstance().clickHIVResult();

			CommonUtility.sleepControl(200);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyPress(KeyEvent.VK_ESCAPE);

		}

		if (ConstantProperties.FINAL_APPROVAL_AUTHORIZE.equals(AppConstants.MOI)) {
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();

			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickTheAssignedTo();

			// MOI
			CommonUtility.sleepControl(1000);
			MOHPOM.getInstance().clickMOI();

		}

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(700);
		}
		GpModule.getInstance().clickTheSaveCertificate();
		if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			CommonUtility.sleepControl(1000);
			CentralGpPOM.getInstance().clickTheYes();
			CommonUtility.sleepControl(500);
			CentralGpPOM.getInstance().clickTheYes();
			CommonUtility.sleepControl(500);
			CentralGpPOM.getInstance().clickTheYes();
		}

		if (ConstantProperties.FINAL_APPROVAL_AUTHORIZE.equals(AppConstants.MOI)) {
			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			MOI moi = new MOI();
			moi.moiCompletedCard();
		}

		// LOGGER.info("Assigned to MOI successfully!");
		LOGGER.info("Final certification updated successfully");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		end = System.currentTimeMillis();
		millisecondsMoh = (end - start);
		LOGGER.info("Lab Senior Runing Time :");
		mohRunTime(millisecondsMoh);

	}

	public void mohRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		mohTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + mohTotalSeconds + " " + "seconds");

	}
}
