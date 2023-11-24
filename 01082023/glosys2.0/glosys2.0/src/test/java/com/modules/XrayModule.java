package com.modules;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.PatientProfiles;
import com.pageObjects.PrintReceiptPOM;
import com.pageObjects.XrayModulePOM;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.tokenVerify.XrayRepeatTokenVerify;

public class XrayModule {
	private static final Logger LOGGER = LogManager.getLogger(XrayModule.class);
	public static int xrayFitWithReferralCount;
	public static boolean referralCertificateStatus;
	public static Long start;
	public static Long end;
	public static Long millisecondsXray;
	public static boolean referralStatus;
	public static Long xrayTotalSeconds;
	public static String xrayQcRejectReferralToken;
	public static boolean qcRejectSatus;
	public static boolean Xray_MOH_Fit_With_Ref_Comformatory_Status;
	public static boolean NX_Status;

	public void xrayModuleFlows() throws Throwable {
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		CommonUtility.sleepControl(1000);
		CredentialsController controller = new CredentialsController();
		controller.xrayCredentials(ConstantProperties.STATE);

		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();

		CommonUtility.sleepControl(2000);
		GpModuleStepDefinition definition = new GpModuleStepDefinition();
		definition.select_the_counter_for_gp_selection();
		definition.gp_token_verify_page();
		definition.biometric_verification();

		LOGGER.info("Radiology Results : ");

		if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.QC_REJECT_XRAY_RESULT)) {
			qcRejectSatus = true;
			// Click The QC Reject
			CommonUtility.sleepControl(3000);
			XrayModulePOM.getInstance().clickTheQcReject();
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown1000();
		}

		else if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.MOH_FIT_XRAY_RESULT)) {
			// Click The MOH Fit
			CommonUtility.sleepControl(9000);
			XrayModulePOM.getInstance().clickTheMOHFit();
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown1000();

		} else if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.MOH_FIT_REF_XRAY_RESULT)) {
			NX_Status = true;
			referralCertificateStatus = true;
			xrayFitWithReferralCount = 1;
			referralStatus = true;
			CommonUtility.sleepControl(9000);
			XrayModulePOM.getInstance().clickTheMOHFitRef();
			Xray_MOH_Fit_With_Ref_Comformatory_Status = true;
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown1000();

		}
		LOGGER.info("Results : " + ConstantProperties.XRAY_RESULTS);
		LOGGER.info("Results updated successfully");

		// Validate
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LOGGER.info("Result : " + XrayModulePOM.getInstance().getTheResult());
		LOGGER.info("Level : " + XrayModulePOM.getInstance().getTheLevel());
		LOGGER.info("Review Date : " + XrayModulePOM.getInstance().getTheReviewDae());
		LOGGER.info("Referral : " + XrayModulePOM.getInstance().getTheReferral());
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(5000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		XrayModulePOM.getInstance().clickTheValidateButton();

//		CommonUtility.sleepControl(1500);
//		XrayModulePOM.getInstance().closeTheDownPopUp();
		// Save
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3200);
		} else {
			CommonUtility.sleepControl(3000);
		}
		XrayModulePOM.getInstance().clickTheSaveButton();

		LOGGER.info("Xray details details updated successfully");
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3800);
		} else {
			CommonUtility.sleepControl(3000);
		}
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();

		LOGGER.info("Xray Feedback Collected");

		CommonUtility.sleepControl(5000);
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();
		end = System.currentTimeMillis();
		LOGGER.info("Xray  Run Time : ");
		millisecondsXray = (end - start);
		xrayRunTime(millisecondsXray);

	}

	public void xrayQcRejectAndRepeatTest() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);
		commonDefinition.groReferral();
		// Xray

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown1000();
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheNext();
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheNext();
		int totalReferralCount = 1;
		String printReceiptOne;
		if (totalReferralCount == 1) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);

			// CLick The Print Receipt Icon
			CommonUtility.sleepControl(2000);
			PrintReceiptPOM.getInstance().clickThePrintReceiptIcon();
			CommonUtility.sleepControl(2000);

			String getTheXrayRejectTokenInGro = PatientProfiles.getInstance().getTheTokenDetails();

			String xrayTokenEmptySpaceRemove = getTheXrayRejectTokenInGro.trim();
			// Window Handing
			CommonUtility.sleepControl(2000);
			CommonDefinition.windowCloseFuncitonAltF4();

			// Token no (NX002) generated successfully
			xrayQcRejectReferralToken = xrayTokenEmptySpaceRemove.substring(10, 15);
			LOGGER.info("Xray Refferral Token : " + xrayQcRejectReferralToken);
			xrayQcRejectReferralToken = xrayQcRejectReferralToken.substring(xrayQcRejectReferralToken.length() - 2);
			System.err.println(xrayQcRejectReferralToken);
			LOGGER.info("Xray Refferral Token : " + xrayQcRejectReferralToken);

			CommonUtility.sleepControl(3000);
			GpModule.getInstance().clickTheCollectFeedbackButton();
			LOGGER.info("Collected Feedback Successfully");

			// Log Out
			CommonUtility.sleepControl(2000);
			commonDefinition.logOut();

			commonDefinition.Login();
			CommonUtility.sleepControl(2000);
			GRODashBoard.getInstance().clickTheRoleSelction();
			CommonUtility.sleepControl(3500);
			XrayModulePOM.getInstance().clickTheXray();
			CommonUtility.sleepControl(1000);
			LOGGER.info("Role Section" + ": " + XrayModulePOM.getInstance().getTheXray());
			CommonUtility.sleepControl(1000);
			if (ConstantProperties.COUNTRY.equals(AppConstants.MANILA_STATE)) {
				CommonDefinition.countryPhilippines();
			} else if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				CommonDefinition.countryIndia();
			}
			GRODashBoard.getInstance().clickTheProceedButton();

			CommonUtility.sleepControl(2000);
			GpModuleStepDefinition definition = new GpModuleStepDefinition();
			definition.select_the_counter_for_gp_selection();

			XrayRepeatTokenVerify repeatTokenVerify = new XrayRepeatTokenVerify();
			repeatTokenVerify.xrayRejectNext_token();
			definition.biometric_verification();
			LOGGER.info("Radiology Results : ");
			CommonUtility.sleepControl(7000);
			XrayModulePOM.getInstance().clickQcAccept();
			CommonUtility.sleepControl(2000);
			XrayModulePOM.getInstance().clickTheMOHFit();
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown1000();
			LOGGER.info("Results : QC Accept");
			LOGGER.info("Results updated successfully");
			// Validate
			CommonUtility.sleepControl(5000);
			XrayModulePOM.getInstance().clickTheValidateButton();

			// Save
			CommonUtility.sleepControl(6000);
			XrayModulePOM.getInstance().clickTheSaveButton();
			LOGGER.info("Xray details details updated successfully");

			CommonUtility.sleepControl(4000);
			PatientProfiles.getInstance().clickTheCollectFeedbackButton();

			LOGGER.info("Xray Feedback Collected");

			CommonUtility.sleepControl(6000);
			commonDefinition.logOut();
			end = System.currentTimeMillis();
			LOGGER.info("Xray  Run Time : ");
			millisecondsXray = (end - start);
			xrayRunTime(millisecondsXray);

		}
	}

	public void xrayRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		xrayTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + xrayTotalSeconds + " " + "seconds");

	}
}