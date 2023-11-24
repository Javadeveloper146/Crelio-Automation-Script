package com.modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.io.FileHandler;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.modulesPOM.ApplicationStatusCheckPom;
import com.modulesPOM.MOIPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;

public class ApplicationStatusCheck {
	private static final Logger LOGGER = LogManager.getLogger(ApplicationStatusCheck.class);

	public void applicationStatusCheck() throws Throwable {

		newChormeTabOpen();
		moiLogin();
		moiLoginAndRoleSelectionLocationBased(ConstantProperties.COUNTRY);
		visaStatusCheckResult();
		// perviousPage();

	}

	public void moiLogin() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(CredentialsProperties.MOI_UNAME);
		CommonUtility.sleepControl(200);
		LoginPage.getInstance().enterThePassword(CredentialsProperties.MOI_PASSWORD);
		CommonUtility.sleepControl(200);
		LoginPage.getInstance().clickTheSignInButton();

	}

	public void moiLoginAndRoleSelectionLocationBased(String country) throws Throwable {
		LOGGER.info("MOI");
		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(500);
		MOIPOM.getInstance().clickTheMOIRole();
		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());

		switch (country) {
		case "India":
			CommonDefinition.countryIndia();
			break;
		case "Philippines":
			CommonDefinition.countryPhilippines();
			break;

		case "Srilanka":
			CommonDefinition.srilankaCountry();
			break;

		case "Pakistan":
			CommonDefinition.pakistan_Country();
			break;
		default:

			break;
		}
		GRODashBoard.getInstance().clickTheProceedButton();

	}

	public void visaStatusCheckResult() throws Throwable {
		CommonUtility.sleepControl(2000);
		ApplicationStatusCheckPom.getInstance().clickApplicationStatus();
		CommonUtility.sleepControl(1000);
		ApplicationStatusCheckPom.getInstance().enterTheVisaNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(2000);
		ApplicationStatusCheckPom.getInstance().clickSearch();
		LOGGER.info("Visa Number : " + ConstantProperties.VISA_NUMBER);
		LOGGER.info("Current Status :");
		LOGGER.info("     Type :                  " + "           Status");
		CommonUtility.sleepControl(2000);
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheOneValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheTwoValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThethreeValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheFourValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheFiveValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheSixValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheSevenValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheEightValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThe9Value() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getThe10Value());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThe11Value() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getThe12Value());
		CommonUtility.sleepControl(1500);
//		CommonUtility.scrollDown50();
//		screenShortForCurrentStatus();
//		// Click Application Visit At Qmc
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickApplicationVisitAtQmc();
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollDown50();
//		screenShortForApplicationVisitAtQMC();
//		// Reporting
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickReporting();
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollDown50();
//		screenShortForReporting();
//		// Certification
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollUp100();
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickCertification();
//		CommonUtility.sleepControl(1000);
//		screenShortForCertification();

	}

	public void onlyDircetVisaNumberVisaStatusCheckResult() throws Throwable {
		CommonUtility.sleepControl(2000);
		ApplicationStatusCheckPom.getInstance().clickApplicationStatus();
		CommonUtility.sleepControl(1000);
		ApplicationStatusCheckPom.getInstance()
				.enterTheVisaNumber(ConstantProperties.APPLICATION_STATUS_CHECK_ENTER_YOUR_VISA_NUMBER);
		CommonUtility.sleepControl(2000);
		ApplicationStatusCheckPom.getInstance().clickSearch();
		LOGGER.info("Visa Number : " + ConstantProperties.APPLICATION_STATUS_CHECK_ENTER_YOUR_VISA_NUMBER);
		LOGGER.info("Current Status :");
		LOGGER.info("     Type :                  " + "           Status");
		CommonUtility.sleepControl(2000);
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheOneValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheTwoValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThethreeValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheFourValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheFiveValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheSixValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getTheSevenValue() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getTheEightValue());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThe9Value() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getThe10Value());
		LOGGER.info("  " + ApplicationStatusCheckPom.getInstance().getThe11Value() + " ------  "
				+ ApplicationStatusCheckPom.getInstance().getThe12Value());
		CommonUtility.sleepControl(1500);
//		CommonUtility.scrollDown50();
//		screenShortForCurrentStatus();
//		// Click Application Visit At Qmc
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickApplicationVisitAtQmc();
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollDown50();
//		screenShortForApplicationVisitAtQMC();
//		// Reporting
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickReporting();
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollDown50();
//		screenShortForReporting();
//		// Certification
//		CommonUtility.sleepControl(1000);
//		CommonUtility.scrollUp100();
//		CommonUtility.sleepControl(1000);
//		ApplicationStatusCheckPom.getInstance().clickCertification();
//		CommonUtility.sleepControl(1000);
//		screenShortForCertification();

	}

	public void newChormeTabOpen() throws Throwable {

		CommonUtility.sleepControl(1000);
		DriverManager.getDriver().switchTo().newWindow(WindowType.TAB);
		DriverManager.getDriver().get("http://172.31.30.221/#/authenticate/login");

	}

	public void perviousPage() throws Throwable {
		Set<String> handles = DriverManager.getDriver().getWindowHandles();
		List<String> list = new ArrayList<>(handles);
		DriverManager.getDriver().switchTo().window(list.get(1));
		DriverManager.getDriver().close();
		CommonUtility.sleepControl(1000);
		DriverManager.getDriver().switchTo().window(list.get(0));

	}


}
