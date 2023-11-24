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
import com.constantProperties.LabConstants;
import com.modulesPOM.CentralGpPOM;
import com.modulesPOM.MOHPOM;
import com.modulesPOM.MOIPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class MOI {
	private static final Logger LOGGER = LogManager.getLogger(MOI.class);
	public static long moiTotalSeconds;
	public static long start;
	public static long end;
	public static long millisecondsMoi;

	public void moiFlow() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOI_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.MOI_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOI_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.MOI_PASSWORD);

		LoginPage.getInstance().clickTheSignInButton();
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);

		// Role Selection
		LOGGER.info("MOI");
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOIPOM.getInstance().clickTheMOIRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		CountryController controller = new CountryController();
		controller.countryController(ConstantProperties.COUNTRY);

		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOI Worklist
		CommonUtility.sleepControl(2000);
		MOIPOM.getInstance().clickTheMOIWorkList();

		CommonUtility.sleepControl(5000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheSearch();
		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheEditIcon();

		//

	}

	public void moiOtherPending() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOI_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.MOI_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOI_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.MOI_PASSWORD);

		LoginPage.getInstance().clickTheSignInButton();

		// Role Selection
		LOGGER.info("MOI");
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOIPOM.getInstance().clickTheMOIRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		if (ConstantProperties.COUNTRY.equals(AppConstants.MANILA_STATE)) {
			CommonDefinition.countryPhilippines();
		} else if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
			CommonDefinition.countryIndia();
		}
		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOI Worklist
		LOGGER.info("MOI Worklist : ");
		CommonUtility.sleepControl(3000);
		MOIPOM.getInstance().clickTheMOIWorkList();

		// Pregnancy Pending
		CommonUtility.sleepControl(5000);
		if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.YES)) {
			MOIPOM.getInstance().clickThePregnancyPending();
			LOGGER.info("Status : Pregnancy Pending");
		} else if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.NO)) {
			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
				MOIPOM.getInstance().clickThePregnancyPending();
				LOGGER.info("Status : Pregnancy Pending");
			}
		} else {

			// Other Pending
			LOGGER.info("Other Pending  : ");
			CommonUtility.sleepControl(10000);
			MOIPOM.getInstance().clickTheOtherPending();
			LOGGER.info("Status : Other Pending");
		}
		LOGGER.info("Country : " + ConstantProperties.COUNTRY);

		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		// Completed
//		CommonUtility.sleepControl(5000);
//		MOIPOM.getInstance().clickTheCompleted();

		CommonUtility.sleepControl(5000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheSearch();

		CommonUtility.sleepControl(5000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(5000);
		CentralGpPOM.getInstance().clickTheEditIcon();

		LOGGER.info("Certificate : ");
		CommonUtility.sleepControl(5000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(3000);
		if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.FIT)) {
			MOHPOM.getInstance().clickFit();
		} else if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			MOHPOM.getInstance().clickUnFit();
		}

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheSaveCertificate();
		LOGGER.info("Final certification updated successfully!");
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		end = System.currentTimeMillis();
		millisecondsMoi = (end - start);
		LOGGER.info("Lab Senior Runing Time :");
		moiRunTime(millisecondsMoi);

	}

	public void moiCompletedCard() throws Throwable {

		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOI_UNAME);
		LOGGER.info("Username" + ": " + CredentialsProperties.MOI_UNAME);
		CommonUtility.implicitWait(10);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOI_PASSWORD);
		LOGGER.info("Password" + ": " + CredentialsProperties.MOI_PASSWORD);

		LoginPage.getInstance().clickTheSignInButton();

		// Role Selection
		LOGGER.info("MOI");
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(1000);
		MOIPOM.getInstance().clickTheMOIRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		if (ConstantProperties.COUNTRY.equals(AppConstants.MANILA_STATE)) {
			CommonDefinition.countryPhilippines();
		} else if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
			CommonDefinition.countryIndia();
		}
		GRODashBoard.getInstance().clickTheProceedButton();

		// Click The MOI Worklist
		LOGGER.info("MOI Worklist : ");
		CommonUtility.sleepControl(2000);
		MOIPOM.getInstance().clickTheMOIWorkList();

		// Pregnancy Pending

		CommonUtility.sleepControl(5000);
		MOIPOM.getInstance().clickTheOtherPending();
		LOGGER.info("Status : Pending ");

		LOGGER.info("Country : " + ConstantProperties.COUNTRY);

		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);

		// Completed
//		CommonUtility.sleepControl(5000);
//		MOIPOM.getInstance().clickTheCompleted();

		CommonUtility.sleepControl(5000);
		CentralGpPOM.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheSearch();

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(2000);
		CentralGpPOM.getInstance().clickTheEditIcon();
		try {
			CommonUtility.sleepControl(2000);
			MOIPOM.getInstance().clickYes();
		} catch (Exception e) {
			System.out.println("");
		}

		LOGGER.info("Certificate : ");
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);

		CommonUtility.sleepControl(3000);
		if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.FIT)) {
			CommonUtility.sleepControl(2000);
			MOHPOM.getInstance().clickFit();
		} else if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			CommonUtility.sleepControl(2000);
			MOHPOM.getInstance().clickUnFit();

			CommonUtility.sleepControl(700);
			MOHPOM.getInstance().clickSelectReason();
			CommonUtility.sleepControl(500);
			MOHPOM.getInstance().clickHIVResult();

			CommonUtility.sleepControl(400);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyPress(KeyEvent.VK_ESCAPE);
		}

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheSaveCertificate();

		if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			CommonUtility.sleepControl(1000);
			CentralGpPOM.getInstance().clickTheYes();
			CommonUtility.sleepControl(500);
			CentralGpPOM.getInstance().clickTheYes();
			CommonUtility.sleepControl(500);
			CentralGpPOM.getInstance().clickTheYes();
		}

	}

	public void moiRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		moiTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + moiTotalSeconds + " " + "seconds");

	}
}
