package com.stepDefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.constantProperties.LabConstants;
import com.driverManager.DriverManager;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.CredentialsController;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSenior;
import com.pageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LabSeniorStepDefinition {
	private static final Logger LOGGER = LogManager.getLogger(LabSeniorStepDefinition.class);
	public static Long start;
	public static Long end;
	public static Long millisecondsSenior;
	LabJuniorStepDefinition labJuniorStepDefinition;
	public static Long seniorTotalSeconds;
	public static String labId;

	@Given("enter the userName and Password in Lab Senior Login")
	public void enter_the_user_name_and_password_in_lab_senior_login() throws Throwable {
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);
		// Incase Seperately Nurse module flow Run Using This driver APPURL Uncommend

		// DriverManager.getDriver().get(ConstantProperties.APPURL);

		// Credential
		CredentialsController controller = new CredentialsController();
		controller.labSeniorCredentials(ConstantProperties.STATE);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
		LOGGER.info("Lab Senior Module");
	}

	@Then("Lab Senior Role Selection")
	public void lab_senior_role_selection() throws Throwable {
		
	}

	@Then("Result Entry Review")
	public void result_entry_review() throws Throwable {
		LOGGER.info("Result Entry Review");
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4000);
		} else {
			CommonUtility.sleepControl(2000);
		}
		LabSenior.getInstance().clickTheresultEntryReview();
	}

	@Then("enter lab id")
	public void enter_lab_id() throws Throwable {
		// Enter The Lab Id
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(1500);
		}
		LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.serumSpecimenNumberSST);

		// Click Search Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1800);
		} else {
			CommonUtility.sleepControl(1000);
		}
		
		LabJunior.getInstance().clickTheSearchButton();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(2000);
		}
		labId = LabJunior.getInstance().getTheGetLabId1();
		LOGGER.info("Lab ID" + ": " + labId);
//		LabJunior.getInstance().enterTheLabId(LabJuniorStepDefinition.labId);
//
//		LOGGER.info("Lab ID" + ": " + LabJuniorStepDefinition.labId);
//		// Click Search Button
//		CommonUtility.sleepControl(2000);
//		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CommonUtility.scrollDown100();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(1000);
		}
		LabJunior.getInstance().clickTheEditButton();
	}

	@Then("First Review and Review for Lab Senior")
	public void first_review() throws Throwable {
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(500);
		} else {
			CommonUtility.sleepControl(3000);
		}
		CommonUtility.scrollDown100();
		LOGGER.info("Lab Senior First Review");
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

		// First Review
		// Hemoglobin
		if (hemoglobinRetakeStatus == false) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheHaemoglobinFirstReview();
			LOGGER.info("Haemoglobin" + ": " + LabConstants.HAEMOGLOBIN + " = " + "Reviewed");
		}

		// Blood Group
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(500);
		} else {
			CommonUtility.sleepControl(100);
		}
		LabSenior.getInstance().clickTheBloodGroupFirstReview();
		LOGGER.info("Blood Group" + ": " + LabConstants.BlOOD_GROUP + " = " + "Reviewed");

		if (hivRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheHIVFirstReview();
			LOGGER.info("HIV" + ": " + LabConstants.HIV + " = " + "Reviewed");
		}

		if (antiHCVRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheAntiHCVFirstReview();
			LOGGER.info("Anti HCV" + ": " + LabConstants.AntiHCV + " = " + "Reviewed");
		}

		if (hbsAgRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheHBsAgFirstReview();
			LOGGER.info("HBsAg" + ": " + LabConstants.HBsAg + " = " + "Reviewed");
		}

		if (sgotRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheSGOTFirstReview();
			LOGGER.info("SGOT" + ": " + LabConstants.SGOT + " = " + "Reviewed");
		}

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}

		CommonUtility.scrollDown1000();
		CommonUtility.sleepControl(200);

		if (sgptRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(200);
			}
			LabSenior.getInstance().clickTheSGPTFirstReview();
			LOGGER.info("SGPT" + ": " + LabConstants.SGPT + " = " + "Reviewed");
		}

		if (creatinineRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheCreatinineFirstReview();
			LOGGER.info("Creatinine" + ": " + LabConstants.CREATININE + " = " + "Reviewed");
		}

		if (rprRetakeStatus == false) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabSenior.getInstance().clickTheRPRFirstReview();
			LOGGER.info("RPR" + ": " + LabConstants.RPR + " = " + "Reviewed");
		}

		switch (genderType) {
		case "Male":
			if (glucoseRetakeStatus == false) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(500);
				} else {
					CommonUtility.sleepControl(100);
				}
				LabSenior.getInstance().clickTheGlucoseFirstReview();
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Reviewed");
			}
			break;

		default:
			if (betaHCGRetakeStatus == false) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(500);
				} else {
					CommonUtility.sleepControl(100);
				}
				LabSenior.getInstance().clickTheBEtaHCGFirstReview();
				LOGGER.info("BEta HC" + ": " + LabConstants.BEtaHCG + " = " + "Reviewed");
			}
			if (glucoseRetakeStatus == false) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(500);
				} else {
					CommonUtility.sleepControl(100);
				}
				LabSenior.getInstance().clickTheGlucoseFirstReview();
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Reviewed");
			}
			break;
		}

		// Click Submit for review
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}

		LabSenior.getInstance().clickThesubmitForReview();

		LOGGER.info("Result submitted for authorization successfully");

	}

	@Then("Log Out Lab Senior")
	public void logoutforLabSenior() throws Throwable {
		//
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		end = System.currentTimeMillis();
		millisecondsSenior = (end - start);
		LOGGER.info("Lab Senior Runing Time :");
		seniorRunTime(millisecondsSenior);
	}

	public void seniorRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		seniorTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + seniorTotalSeconds + " " + "seconds");

	}

}
