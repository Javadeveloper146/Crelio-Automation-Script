package com.labRetakesEntryFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.labJuniorFlow.LabJuniorWorkList;
import com.pageObjects.LabSenior;
import com.stepDefinition.CommonDefinition;

public class LabSeniorFirstRetake {
	private static final Logger LOGGER = LogManager.getLogger(LabJuniorFirstRetakeResultEntry.class);

	CommonDefinition commonDefinition = new CommonDefinition();

	public void labSeniorFirstReake() throws Throwable {
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

		// Hamoglobin
		if (hemoglobinRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheHaemoglobinFirstReview();
		}
		if (hivRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheHIVFirstReview();
			LOGGER.info("HIV" + ": " + LabConstants.HIV + " = " + "Reviewed");
		}

		if (antiHCVRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheAntiHCVFirstReview();
			LOGGER.info("Anti HCV" + ": " + LabConstants.AntiHCV + " = " + "Reviewed");
		}
		if (hbsAgRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheHBsAgFirstReview();
			LOGGER.info("HBsAg" + ": " + LabConstants.HBsAg + " = " + "Reviewed");
		}

		if (sgotRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheSGOTFirstReview();
			LOGGER.info("SGOT" + ": " + LabConstants.SGOT + " = " + "Reviewed");
		}
		if (sgptRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheSGPTFirstReview();
			LOGGER.info("SGPT" + ": " + LabConstants.SGPT + " = " + "Reviewed");
		}
		if (creatinineRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheCreatinineFirstReview();
			LOGGER.info("Creatinine" + ": " + LabConstants.CREATININE + " = " + "Reviewed");
		}
		if (rprRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheRPRFirstReview();
			LOGGER.info("RPR" + ": " + LabConstants.RPR + " = " + "Reviewed");
		}
		if (betaHCGRetakeStatus == true) {
			CommonUtility.sleepControl(600);
			LabSenior.getInstance().clickTheGlucoseFirstReview();
			LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE + " = " + "Reviewed");
		}
		if (glucoseRetakeStatus == true) {
			CommonUtility.sleepControl(500);
			LabSenior.getInstance().clickTheBEtaHCGFirstReview();
			LOGGER.info("BEta HC" + ": " + LabConstants.BEtaHCG + " = " + "Reviewed");
		}

		CommonUtility.sleepControl(2000);
		LabSenior.getInstance().clickThesubmitForReview();
		commonDefinition.logOut();
	}
}
