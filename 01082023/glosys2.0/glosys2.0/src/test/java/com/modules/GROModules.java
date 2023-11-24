package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.pageObjects.GRODashBoard;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROReferralStepDefinition;

public class GROModules {
	private static final Logger LOGGER = LogManager.getLogger(GROModules.class);
	
	public void groSpecimenTransmittalFrom() throws Throwable {
		CommonDefinition  commonDefinition = new CommonDefinition();
		commonDefinition.Login();
		GROReferralStepDefinition definition4 = new GROReferralStepDefinition();
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheGROChennaiOption();

		// Click The country
		if (ConstantProperties.COUNTRY.equals(AppConstants.MANILA_STATE)) {
			CommonDefinition.countryPhilippines();
		} else if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
			CommonDefinition.countryIndia();
		}
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheProceedButton();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
		GRODashBoard.getInstance().clickTheProceedButton();
		CommonUtility.sleepControl(2000);
		definition4.counter_select();

		// Click Specimen Transmittal form
		CommonUtility.sleepControl(3000);
		GRODashBoard.getInstance().clickTheSpecimenTransmittalForm();
		LOGGER.info("Specimen Transmittal form : ");

		// Click The Specimen Batch
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().ClickTheBatchStaffId();

		CommonUtility.sleepControl(3000);
		GRODashBoard.getInstance().ClickThePrintSTF();
		CommonUtility.sleepControl(2000);
		CommonDefinition.windowCloseFuncitonAltF4();

		CommonUtility.sleepControl(1000);

		GRODashBoard.getInstance().clickTheCloseSpeTra();

		commonDefinition.logOut();
	}
	

}
