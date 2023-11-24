package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.pageObjects.CenterManager;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabDirector;
import com.pageObjects.LabJunior;
import com.pageObjects.LoginPage;
import com.referral.LabConfirmatory;
import com.stepDefinition.CommonDefinition;

public class CenterManagerFlow {

	private static final Logger LOGGER = LogManager.getLogger(CenterManagerFlow.class);

	public void centerManager() throws Throwable {

		// Center Manager
		CommonDefinition commonDefinition = new CommonDefinition();
		centerManagerLogin(ConstantProperties.STATE);
		LOGGER.info("Country : " + ConstantProperties.COUNTRY);

		// Click The External Barcode Generate
		CommonUtility.sleepControl(3000);
		CenterManager.getInstance().clickTheExternalBarcodeGenerate();
		LOGGER.info("External Barcode Generation : ");

		// Click The Status
//				CommonUtility.sleepControl(3000);
//				CenterManager.getInstance().clickTheStatus();

		// Click The Approved
		LOGGER.info("Status  : Approved");

		// Enter The Visa Number
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		// Click The Search Button
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheSearchButton();

		// Specimen Number
		CommonUtility.sleepControl(1000);
		LabConfirmatory.serumSpecimenNumberExternal = LabDirector.getInstance().getTheSpecimenNumebr();
		LOGGER.info("Specimen Number" + ": " + LabConfirmatory.serumSpecimenNumberExternal);

		// Get The External Specimen Name
		CommonUtility.sleepControl(1000);
		LabConfirmatory.externalSpecimenNumberID = (LabDirector.getInstance().getTheExternalSpecimenNumber());
		LOGGER.info("External Specimen Name" + ": " + LabConfirmatory.externalSpecimenNumberID);
		// Click The Print
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickThePrintButton();

		// Click The Status
		CommonUtility.sleepControl(4000);
		LabDirector.getInstance().clickTheStatus();

		// Click The Completed
		CommonUtility.sleepControl(2000);
		CenterManager.getInstance().clickTheCompleted();
		LOGGER.info("Status  : Completed");

		// Enter The Notes
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().enterTheNotes(AppConstants.COMMON_COMMENTS);

		// Save Button
		CommonUtility.sleepControl(2000);
		LabDirector.getInstance().clickTheSave();

		LOGGER.info("External barcode marked as complete successfully");

		// Completed Status
		// Click The Status
		CommonUtility.sleepControl(3000);
		CenterManager.getInstance().clickTheStatus();

		// Click The Approved
		CommonUtility.sleepControl(2000);
		CenterManager.getInstance().clickTheComplted();

//				Enter The Visa Number
//				CommonUtility.sleepControl(2000);
//				LabDirector.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		// Click The Search Button
		CommonUtility.sleepControl(5000);
		LabJunior.getInstance().clickTheSearchButton();

		// Click The Print
		CommonUtility.sleepControl(3000);
		CenterManager.getInstance().clickThePrint();

		// Log Out
		CommonUtility.sleepControl(6000);
		commonDefinition.logOut();
	}

	public void centerManagerLogin(String state) {

		switch (state) {
		case AppConstants.CHENNAI_STATE:
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CHENNAI_CM_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CHENNAI_CM_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CHENNAI_CM_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CHENNAI_CM_PASSWORD);
			break;

		case AppConstants.DELHI_STATE:
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DELHI_CM_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DELHI_CM_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DELHI_CM_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DELHI_CM_PASSWORD);
			break;

		case AppConstants.MANILA_STATE:
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MANILA_CM_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MANILA_CM_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MANILA_CM_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MANILA_CM_PASSWORD);
			break;
		case AppConstants.ISLAMABAD_STATE:
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISLAMABAD_CM_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.ISLAMABAD_CM_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.ISLAMABAD_CM_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.ISLAMABAD_CM_PASSWORD);
			break;

		case AppConstants.KARACHI_STATE:
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KARACHI_CM_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KARACHI_CM_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KARACHI_CM_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KARACHI_CM_PASSWORD);
			break;
		default:
			break;
		}

		LoginPage.getInstance().clickTheSignInButton();

	}
}
