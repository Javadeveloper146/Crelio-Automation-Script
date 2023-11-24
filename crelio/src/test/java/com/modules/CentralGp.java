package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modulesPOM.AdditionalLabTestPOM;
import com.modulesPOM.CentralGpPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class CentralGp {
	private static final Logger LOGGER = LogManager.getLogger(CentralGp.class);

	public void centralGpFlow() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.CENTRAL_GP_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.CENTRAL_GP_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.CENTRAL_GP_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.CENTRAL_GP_PASSWORD);

		LoginPage.getInstance().clickTheSignInButton();

		// Role Selection

		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(500);
		CentralGpPOM.getInstance().clickTheCentralGpRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);
		CommonUtility.sleepControl(500);
		
		GRODashBoard.getInstance().clickTheProceedButton();
		// Click The CGP WorkList
		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheCGPWorkList();
		LOGGER.info("Central GP Worklist : ");
		boolean conformatoryStatus = LabJuniorWorkList.labConfirmatory;
		if (conformatoryStatus == true) {
			LOGGER.info("Confirmatory Lab : ");
			CommonUtility.sleepControl(1000);
			CentralGpPOM.getInstance().clickTheConfirmatoryLab();
	}

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(500);
		CentralGpPOM.getInstance().clickTheSearch();
		
		LOGGER.info("Country : " + ConstantProperties.COUNTRY);

		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);
		
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_26)) {
			// Enter The Comment
			CommonUtility.sleepControl(1000);
			GpModule.getInstance().enterTheCommentsForAmbiguity(AppConstants.COMMON_COMMENTS);

			CommonUtility.sleepControl(1000);
			GpModule.getInstance().clickTheCheckBox();

			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();

		}
		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheEditIcon();
		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheYes();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheAssignedTo();

		CommonUtility.sleepControl(500);
		GpModule.getInstance().clickTheAssignedToMOH();

		CommonUtility.sleepControl(500);
		GpModule.getInstance().clickTheSaveCertificate();
		LOGGER.info("Assigned to MOH successfully!");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_20)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}

	public static void centralGPAssignToStemzGp() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.CENTRAL_GP_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.CENTRAL_GP_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.CENTRAL_GP_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.CENTRAL_GP_PASSWORD);

		LoginPage.getInstance().clickTheSignInButton();

		// Role Selection

		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(500);
		CentralGpPOM.getInstance().clickTheCentralGpRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheProceedButton();
		// Click The CGP WorkList
		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheCGPWorkList();
		LOGGER.info("Central GP Worklist : ");

		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheSearch();
		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheEditIcon();
		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheYes();

		CommonUtility.sleepControl(2000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1500);
		GpModule.getInstance().clickTheAssignedTo();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheAssignedToStemzGp();

		CommonUtility.sleepControl(1000);
		GpModule.getInstance().clickTheSaveCertificate();
		LOGGER.info("Assigned to MOH successfully!");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}
}
