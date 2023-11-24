package com.modules;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.modulesPOM.AutoFitReviewerPom;
import com.modulesPOM.CentralUploadPom;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class AutoFitReviewer {
	private static final Logger LOGGER = LogManager.getLogger(AutoFitReviewer.class);
	public static long autofitReviwerTotalSeconds;
	public static long autofitTotalSeconds;
	public static long start;
	public static long end;
	public static long millisecondsAutofit;

	public void autoFitReviewer() throws Throwable {

		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.AUTOFIT_UNAME);
		CommonUtility.sleepControl(200);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.AUTOFIT_PASSWORD);

		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
		// Role Selection
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheRoleSelction();

		CommonUtility.sleepControl(1000);
		AutoFitReviewerPom.getInstance().clickAutofitRoleSelection();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
	
		// Click The Country
		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Autofit Worklist
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(5000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		AutoFitReviewerPom.getInstance().clickAutofitWorklist();

		// Autofit Pending
		LOGGER.info("Autofit Pending :");
		LOGGER.info("Country : " + ConstantProperties.COUNTRY);
		LOGGER.info("Status : Autofit Pending");
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CentralUploadPom.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(500);
		}
		CentralUploadPom.getInstance().clickSearchButton();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CommonUtility.scrollDown50();

		// Download
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		AutoFitReviewerPom.getInstance().clickDownload();

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollUp100();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_14)) {
			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		
		LOGGER.info("Review in Progress : ");

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(5000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		AutoFitReviewerPom.getInstance().clickReviwerInProgress();

		LOGGER.info("Country : " + ConstantProperties.COUNTRY);
		LOGGER.info("Status : Review in Progress");
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CentralUploadPom.getInstance().clickSearchButton();

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();

		// Save
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		AutoFitReviewerPom.getInstance().clickSave();
		LOGGER.info("Reviewed Successfully");
//
//		CommonUtility.sleepControl(2000);
//		CommonUtility.scrollUp100();
//
//		LOGGER.info("Reviewed : ");
//		CommonUtility.sleepControl(4000);
//		AutoFitReviewerPom.getInstance().clickReviwed();
//		LOGGER.info("Country : " + ConstantProperties.COUNTRY);
//		LOGGER.info("Status : Reviewed ");
//		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);
//
//		CommonUtility.sleepControl(3000);
//		CentralUploadPom.getInstance().clickSearchButton();
//
//		CommonUtility.sleepControl(2000);
//		CommonUtility.scrollDown400();
//		CommonUtility.sleepControl(2000);

		end = System.currentTimeMillis();

		millisecondsAutofit = (end - start);
		LOGGER.info("Lab Senior Runing Time :");

		autofitReviwerRunTime(millisecondsAutofit);

		CommonDefinition commonDefinition3 = new CommonDefinition();
		commonDefinition3.logOut();

	}

	public void autofitReviwerAuthorized() throws Throwable {
		CommonDefinition commonDefinition3 = new CommonDefinition();
		commonDefinition3.Login();
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		// Role Selection
		CommonUtility.sleepControl(2100);
		GRODashBoard.getInstance().clickTheRoleSelction();

		CommonUtility.sleepControl(500);
		AutoFitReviewerPom.getInstance().clickAutofitRoleSelection();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
		
		// Click The country
		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);
		CommonUtility.sleepControl(500);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Autofit Worklist
		CommonUtility.sleepControl(5000);
		AutoFitReviewerPom.getInstance().clickAutofitWorklist();

		LOGGER.info("Authorized : ");
		CommonUtility.sleepControl(20000);
		AutoFitReviewerPom.getInstance().clickAuthorized();

		LOGGER.info("Country : " + ConstantProperties.COUNTRY);

		LOGGER.info("Status : Reviewed ");

		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(2000);
		CentralUploadPom.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(1000);
		CentralUploadPom.getInstance().clickSearchButton();

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown100();

		// Download
		CommonUtility.sleepControl(1000);
		AutoFitReviewerPom.getInstance().clickDownload();

		LOGGER.info("<<<<<<<<''''----'''''''' Successfully Visa Process Completed '''''---''''''>>>>> : "
				+ ConstantProperties.VISA_NUMBER);
	
		end = System.currentTimeMillis();
		millisecondsAutofit = (end - start);
		LOGGER.info("Lab Senior Runing Time :");

		autofitReviwerRunTime(millisecondsAutofit);
		commonDefinition3.logOut();
		
		

	}

	public void autofitReviwerRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		autofitReviwerTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + autofitReviwerTotalSeconds + " " + "seconds");

	}

}
