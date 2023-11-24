package com.labRetakesEntryFlow;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.labJuniorFlow.LabJuniorWorkList;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSupervisor;
import com.pageObjects.NurseModule;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.pageObjects.PatientProfiles;
import com.referral.PrintReceipt;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;
import com.stepDefinition.LabJuniorStepDefinition;
import com.stepDefinition.LabSeniorStepDefinition;
import com.stepDefinition.LabSupervisorStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

public class RetakeProcess {
	private static final Logger LOGGER_LAB = LogManager.getLogger(LabJuniorStepDefinition.class);

	private static final Logger LOGGER = LogManager.getLogger(RetakeProcess.class);
	public static String plasmaRetakeSample;
	public static String serumRetakeSample;
	public static String wholdBooldRetakeSample;
	public static String specimenNumberRetake;
	public static String retakeLabId;

	public void retakeProcess() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.groReferral();

		PrintReceipt printReceipt = new PrintReceipt();
		CommonUtility.sleepControl(2000);
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();

		// Login Nurse
		NurseModuleStepDefinition definition = new NurseModuleStepDefinition();
		definition.enter_the_user_name_and_password_in_nurse_login();
		definition.select_the_role_selection_nurse();
		definition.select_the_counter_selection_nurse();
		definition.token_verify_page();

		CommonUtility.sleepControl(3000);
		// Get The Retake Status
		boolean plasmaRetakeStatus = LabJuniorWorkList.plasma;
		boolean serumRetakeStatus = LabJuniorWorkList.serum;
		boolean wholdBloodRetakeStatus = LabJuniorWorkList.wholdBlood;

		HashMap<String, Boolean> getTheStatus = new HashMap<>();
		getTheStatus.put("PlasmaRetakeSampleStatus", plasmaRetakeStatus);
		getTheStatus.put("SerumRetakeSampleStatus", serumRetakeStatus);
		getTheStatus.put("wholdBloodRetakeSampleStatus", wholdBloodRetakeStatus);
		System.err.println(getTheStatus);

		if (plasmaRetakeStatus == true) {
			LOGGER.info("Plasma Retake Specimen Number" + ": " + "Yet to be Generated");
		}
		if (serumRetakeStatus = true) {
			LOGGER.info("Serum Retake Specimen Number" + ": " + "Yet to be Generated");
		}
		if (wholdBloodRetakeStatus == true) {
			LOGGER.info("Whole Blood Retake Specimen Number" + ": " + "Yet to be Generated");
		}
		NurseModule.getInstance().clickTheSpecimanGenarationSelectAllOption();
		LOGGER.info("Speciman Genarated Successfully");
		NurseModule.getInstance().clickTheSpecimanGenarationButton();

		CommonUtility.sleepControl(17000);

		NurseModule.getInstance().clickTheSpecimanCollectionAllSelectOption();
		CommonUtility.sleepControl(2000);

		// Get The Specimen Number
		if (plasmaRetakeStatus == true) {
			plasmaRetakeSample = (NurseSampleOutgoingPageObject.getInstance().getThePlasmaNumber());
			LOGGER.info("Plasma Retake Specimen Number " + ": " + plasmaRetakeSample + ": " + "Generated");
		}
		if (serumRetakeStatus = true) {
			serumRetakeSample = (NurseSampleOutgoingPageObject.getInstance().getTheSerumSpecimenNumber());
			LOGGER.info("Serum Retake Specimen Number" + ": " + serumRetakeSample + ": " + "Generated");
		}
		if (wholdBloodRetakeStatus == true) {
			wholdBooldRetakeSample = (NurseSampleOutgoingPageObject.getInstance().getTheWholeBloodSpecimenNumber());
			LOGGER.info("Whole Blood Retake Specimen Number" + ": " + wholdBooldRetakeSample + ": " + "Generated");
		}
		NurseModule.getInstance().clickTheCollectedButton();
		LOGGER.info("Speciman Collected Successfully");

		// Click The Nurse Module Collect Feedback
		CommonUtility.sleepControl(3000);
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Feedback Collected");

		// Sample Out Going
		// click The Sample Outgoing
		CommonUtility.sleepControl(6000);
		LOGGER.info("Nurse Outgoing : ");
		NurseSampleOutgoingPageObject.getInstance().clickTheSampleOutgoing();
		CommonUtility.sleepControl(4000);

		LOGGER.info(" Retake Specimen Number" + ": " + specimenNumberRetake);

		LOGGER.info("Scan Specimen Number");
		CommonUtility.sleepControl(1000);
		if (plasmaRetakeStatus == true) {
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(plasmaRetakeSample);
			LOGGER.info("Retake Specimen Number Outgoing Scan Successfully" + ": " + plasmaRetakeSample);

		}
		if (serumRetakeStatus = true) {
			CommonUtility.sleepControl(1000);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumRetakeSample);
			LOGGER.info("Retake Specimen Number Outgoing Scan Successfully" + ": " + serumRetakeSample);

		}
		if (wholdBloodRetakeStatus == true) {
			CommonUtility.sleepControl(1000);
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(wholdBooldRetakeSample);
			LOGGER.info("Retake Specimen Number Outgoing Scan Successfully" + ": " + wholdBooldRetakeSample);

		}
		CommonUtility.sleepControl(1000);
		NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();

		// Tech And Gro Information
		NurseModuleStepDefinition definition2 = new NurseModuleStepDefinition();
		definition2.lab_technician_and_gro_info_and_collected();
		// Log Out
		commonDefinition.logOut();

		// Login Junior
		CommonDefinition commonDefinition2 = new CommonDefinition();
		commonDefinition2.Login();
		// Role Selection
		LabJuniorStepDefinition definition3 = new LabJuniorStepDefinition();
		definition3.lab_junior_role_selection();

		// Scan The Specimen Number
		LOGGER_LAB.info("Specimen Inscan Process");
		// Click Specimen Inscan
		CommonUtility.sleepControl(4000);
		LabJunior.getInstance().clickTheSpecimenInscan();
		CommonUtility.sleepControl(3000);

		// Click Search Button
		NurseSampleOutgoingPageObject.getInstance().clickTheSearchButton();
		CommonUtility.sleepControl(3000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(1000);

		// Scan The Specimen Number
		CommonUtility.sleepControl(1000);
		if (plasmaRetakeStatus == true) {
			LabJunior.getInstance().scanTheSpecimenNumber(plasmaRetakeSample);
			LOGGER_LAB.info("Inscan The Specimen Number" + ": " + plasmaRetakeSample);
		}
		if (serumRetakeStatus == true) {
			LabJunior.getInstance().scanTheSpecimenNumber(serumRetakeSample);
			LOGGER_LAB.info("Inscan The Specimen Number" + ": " + serumRetakeSample);
		}
		if (wholdBloodRetakeStatus == true) {
			LabJunior.getInstance().scanTheSpecimenNumber(wholdBooldRetakeSample);
			LOGGER_LAB.info("Inscan The Specimen Number" + ": " + wholdBooldRetakeSample);
		}
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheScanButton0();
		LOGGER_LAB.info("Successfully Scan Specimen Number");
		retakeLabId = LabJunior.getInstance().getTheGetLabId();
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSaveButton();
		LOGGER_LAB.info("Specimen inscan details saved successfully");

		// Click The Lab Work List
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickTheLabWorkist();

		// Enter The Lab Id
		CommonUtility.sleepControl(1000);
		LabJunior.getInstance().enterTheLabId(retakeLabId);
		LOGGER_LAB.info("Lab Id : " + retakeLabId);
		// Click Search Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		// Click Edit Button
		CommonUtility.sleepControl(3000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheEditButton();

		// Lab Junior First Retake Result Entry
		LabJuniorFirstRetakeResultEntry firstRetakeResultEntry = new LabJuniorFirstRetakeResultEntry();
		firstRetakeResultEntry.labJuniorFirstResultEntry();

		// Lab Senior
		commonDefinition.Login();
		LabSeniorStepDefinition definition4 = new LabSeniorStepDefinition();
		definition4.lab_senior_role_selection();
		definition4.result_entry_review();
		definition4.enter_lab_id();

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(1000);

		/// Lab Senoir First Retake Review
		LabSeniorFirstRetake firstRetake = new LabSeniorFirstRetake();
		firstRetake.labSeniorFirstReake();

		// ----------------------------------------------------
		// Lab Supervisor
		commonDefinition.Login();
		LabSupervisorStepDefinition labSupervisorStepDefinition = new LabSupervisorStepDefinition();
		labSupervisorStepDefinition.lab_supervisor_role_selection();
		LOGGER.info("Pathalogist Worklist :");
		// Click The Pathalogist Worklist
		CommonUtility.sleepControl(3000);
		LabSupervisor.getInstance().clickThePathlogist();

		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().enterTheLabId(retakeLabId);

		// LabJunior.getInstance().enterTheLabId(ConstantProperties.LAB_ID);

		// LabJunior.getInstance().enterTheLabId("2390");
		LOGGER.info("Lab ID" + ": " + retakeLabId);

		// Click Search Button
		CommonUtility.sleepControl(2000);
		LabJunior.getInstance().clickTheSearchButton();

		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheEdit();

		CommonUtility.sleepControl(3000);
		CommonUtility.scrollDown100();

		// Click The Authorize All
		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheAuthorizeAll();

		// Pathalogist Work List
		LOGGER.info("Retake Result Entry :");
		LOGGER.info("Lab Supervisor Authorize in Result Entry :");
		CommonUtility.sleepControl(1000);

		GROStepDefinition definition1 = new GROStepDefinition();
		String genderType = definition1.gender;
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

		if (hemoglobinRetakeStatus == true) {
			LOGGER.info("Hemoglobin" + ": " + LabConstants.HAEMOGLOBIN + " = " + "Authorized");
		}

		LOGGER.info("Blood Group" + ": " + LabConstants.BlOOD_GROUP + " = " + "Authorized");

		if (hivRetakeStatus == true) {
			LOGGER.info("HIV" + ": " + LabConstants.HIV + " = " + "Authorized");
		}
		if (antiHCVRetakeStatus == true) {
			LOGGER.info("Anti HCV" + ": " + LabConstants.AntiHCV + " = " + "Authorized");
		}
		if (hbsAgRetakeStatus == true) {
			LOGGER.info("HBsAg" + ": " + LabConstants.HBsAg + " = " + "Authorized");
		}
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown1000();

		if (sgotRetakeStatus == true) {
			LOGGER.info("SGOT" + ": " + LabConstants.SGOT + " = " + "Authorized");
		}
		if (sgptRetakeStatus == true) {

			LOGGER.info("SGPT" + ": " + LabConstants.SGPT + " = " + "Authorized");
		}
		if (creatinineRetakeStatus == true) {
			LOGGER.info("Creatinine" + ": " + LabConstants.CREATININE + " = " + "Authorized");
		}

		if (rprRetakeStatus == true) {
			LOGGER.info("RPR" + ": " + LabConstants.RPR + " = " + "Authorized");
		}
		switch (genderType) {

		case "Male":
			if (glucoseRetakeStatus == true) {
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Authorized");
			}
			break;

		default:
			if (betaHCGRetakeStatus == true) {
				LOGGER.info("BEta HC" + ": " + LabConstants.BEtaHCG + " = " + "Authorized");
			}
			if (glucoseRetakeStatus == true) {
				LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Authorized");
			}
			break;

		}
		
		CommonUtility.sleepControl(2000);
		LabSupervisor.getInstance().clickTheSubmit();
	}
}
