package com.modules;

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

public class MOHLab {
	private static final Logger LOGGER = LogManager.getLogger(MOHLab.class);

	public void mohLab() throws Throwable {
		
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOH_LAB_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.MOH_LAB_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOH_LAB_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.MOH_LAB_PASSWORD);

		CommonUtility.sleepControl(200);
		LoginPage.getInstance().clickTheSignInButton();

		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOHPOM.getInstance().clickTheMOH_Lab_Role();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOH Lab WorkList
		MOHPOM.getInstance().clickTheMOH_Lab_WorkList();
		LOGGER.info("MOH Lab Worklist : ");

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(1000);
		CentralGpPOM.getInstance().clickTheSearch();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_28)) {
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
		
	}
}
