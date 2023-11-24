package com.labRetakesEntryFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LabIconpageObjects.LabJuniorCompletedPOM;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.labJuniorFlow.LabJuniorWorkList;
import com.pageObjects.LabJunior;
import com.stepDefinition.CommonDefinition;

public class LabJuniorFirstRetakeResultEntry {
	private static final Logger LOGGER = LogManager.getLogger(LabJuniorFirstRetakeResultEntry.class);

	public void labJuniorFirstResultEntry() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
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
			// Haemoglobin
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().enterTheHaemoglobinValue(LabConstants.HAEMOGLOBIN_RETAKE_VALUE);
			CommonUtility.sleepControl(3000);
			LabJuniorCompletedPOM.getInstance().clickTheHemoglobinComplete();
			LOGGER.info("Haemoglobin Retake Value" + ": " + LabConstants.HAEMOGLOBIN_RETAKE_VALUE);
		}

		// Hiv
		if (hivRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheHIV();
			CommonUtility.sleepControl(2000);

			if (LabConstants.HIV_RETAKE_VALUE.equals(AppConstants.HIV_NEGATIVE)) {
				LabJunior.getInstance().clickTheNegativeOption();

			} else if (LabConstants.HIV_RETAKE_VALUE.equals(AppConstants.HIV_POSITIVE)) {
				LabJunior.getInstance().clickThePositiveOption();

			}
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheHIVComplete();
			LOGGER.info("HIV Retake Value" + ": " + LabConstants.HIV_RETAKE_VALUE);
		}

		// Anti HCv
		if (antiHCVRetakeStatus == true) {
			CommonUtility.sleepControl(3000);
			LabJunior.getInstance().clickTheAntiHCV();
			CommonUtility.sleepControl(1000);
			if (LabConstants.AntiHCV_RETAKE_VALUE.equals(AppConstants.ANTI_HCV_NEGATIVE)) {
				LabJunior.getInstance().clickTheNegativeOption();

			} else if (LabConstants.AntiHCV_RETAKE_VALUE.equals(AppConstants.ANTI_HCV_POSITIVE)) {
				LabJunior.getInstance().clickThePositiveOption();

			}
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheAntiHCVComplete();
			LOGGER.info("Anti HCV Retake Value" + ": " + LabConstants.AntiHCV_RETAKE_VALUE);
		}

		// HbsAg
		if (hbsAgRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheHBsAg();
			CommonUtility.sleepControl(1000);
			if (LabConstants.HBsAg_RETAKE_VALUE.equals(AppConstants.HBsAg_NEGATIVE)) {
				LabJunior.getInstance().clickTheNegativeOption();
			} else if (LabConstants.HBsAg_RETAKE_VALUE.equals(AppConstants.HBsAg_POSITIVE)) {
				LabJunior.getInstance().clickThePositiveOption();

			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheHBsAgComplete();
			LOGGER.info("HBsAg Retake Value" + ": " + LabConstants.HBsAg_RETAKE_VALUE);
		}
		// SGOT
		if (sgotRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			if (LabConstants.SGOT_RETAKE_VALUE.equals(AppConstants.SGOT_NEGATIVE)) {
				LabJunior.getInstance().enterTheSGOTValue(LabConstants.SGOT_RETAKE_VALUE);
			} else if (LabConstants.SGOT_RETAKE_VALUE.equals(AppConstants.SGOT_POSITIVE)) {
				LabJunior.getInstance().enterTheSGOTValue(LabConstants.SGOT_RETAKE_VALUE);

			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheSGOTComplete();
			LOGGER.info("SGOT Retake Value" + ": " + LabConstants.SGOT_RETAKE_VALUE);
		}

		// SGPT
		if (sgptRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			if (LabConstants.SGPT_RETAKE_VALUE.equals(AppConstants.SGPT_NORMAL_VALUE)) {
				LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT_RETAKE_VALUE);
			} else if (LabConstants.SGPT_RETAKE_VALUE.equals(AppConstants.SGPT_ABNORMAL_VALUE)) {
				LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT_RETAKE_VALUE);
			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheSGPTComplete();
			LOGGER.info("SGPT Retake Value" + ": " + LabConstants.SGPT_RETAKE_VALUE);
		}

		// Creatinine
		if (creatinineRetakeStatus == true) {
			CommonUtility.sleepControl(3000);
			if (LabConstants.CREATININE_RETAKE_VALUE.equals(AppConstants.CREATININE_NORMAL_VALUE)) {
				LabJunior.getInstance().enterTheCreatinine(LabConstants.CREATININE_RETAKE_VALUE);
			} else if (LabConstants.CREATININE_RETAKE_VALUE.equals(AppConstants.CREATININE_ABNORMAL_VALUE)) {
				LabJunior.getInstance().enterTheCreatinine(LabConstants.CREATININE_RETAKE_VALUE);

			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheCreatinineComplete();
			LOGGER.info("Creatinine Retake Value" + ": " + LabConstants.CREATININE_RETAKE_VALUE);
		}

		// RPR
		if (rprRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheRPR();
			CommonUtility.sleepControl(1000);
			if (LabConstants.RPR_RETAKE_VALUE.equals(AppConstants.RPR_NON_REACTIVE)) {
				LabJunior.getInstance().clickTheNonReactive();
			} else if (LabConstants.RPR_RETAKE_VALUE.equals(AppConstants.RPR_REACTIVE)) {
				LabJunior.getInstance().clickTheNegativeOption();

			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheRPRComplete();
			LOGGER.info("RPR Retake Value" + ": " + LabConstants.RPR_RETAKE_VALUE);
		}
		// Glucose
		if (glucoseRetakeStatus == true) {
			CommonUtility.sleepControl(2000);
			if (LabConstants.GLUCOSE_RETAKE_VALUE.equals(AppConstants.GLUCOSE_NORMAL_VALUE)) {
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE_RETAKE_VALUE);
			} else if (LabConstants.GLUCOSE.equals(AppConstants.GLUCOSE_ABNORMAL_VALUE)) {
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE_RETAKE_VALUE);

			}

			LOGGER.info("Glucose Retake Value" + ": " + LabConstants.GLUCOSE_RETAKE_VALUE);
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheGlucoseComplete();
		}

		// Beta HCG
		if (betaHCGRetakeStatus == true) {

			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheBetaHCG();
			CommonUtility.sleepControl(1000);
			if (LabConstants.BEtaHCG_RETAKE_VALUE.equals(AppConstants.BETA_HCG_NEGATIVE)) {
				LabJunior.getInstance().clickTheNegativeOption();

			} else if (LabConstants.BEtaHCG_RETAKE_VALUE.equals(AppConstants.BETA_HCG_POSITIVE)) {
				LabJunior.getInstance().clickThePositiveOption();
			} else if (LabConstants.BEtaHCG_RETAKE_VALUE.equals(AppConstants.BETA_HCG_INDETERMINATE)) {
				LabJunior.getInstance().clickTheIndeterminateOption();
			}
			CommonUtility.sleepControl(1000);
			LabJuniorCompletedPOM.getInstance().clickTheBetaHCGComplete();
			LOGGER.info("BEta HCG Retake Value" + ": " + LabConstants.BEtaHCG_RETAKE_VALUE);
		}
		CommonUtility.sleepControl(3000);
		LabJunior.getInstance().clickThesubmitForFirstReview();

		commonDefinition.logOut();
	}

}
