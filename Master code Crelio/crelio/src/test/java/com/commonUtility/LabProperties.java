package com.commonUtility;

import java.util.Properties;

import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;

public class LabProperties {
	public void labProperties() {
		Properties labProperties = new Properties();

		try {

			labProperties.load(getClass().getResourceAsStream("/configuration.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		LabConstants.GLUCOSE = labProperties.getProperty("Glucose");
		LabConstants.CREATININE = labProperties.getProperty("Creatinine");
		LabConstants.RPR = labProperties.getProperty("RPR");
		LabConstants.SGPT = labProperties.getProperty("SGPT");
		LabConstants.SGOT = labProperties.getProperty("SGOT");
		LabConstants.HBsAg = labProperties.getProperty("HBsAg");
		LabConstants.AntiHCV = labProperties.getProperty("AntiHCV");
		LabConstants.HIV = labProperties.getProperty("HIV");
		LabConstants.BEtaHCG = labProperties.getProperty("BEtaHCG");
		LabConstants.BlOOD_GROUP = labProperties.getProperty("BloodGroup");
		LabConstants.HAEMOGLOBIN = labProperties.getProperty("Haemoglobin");
		
		LabConstants.HAEMOGLOBIN_SPECIMEN = labProperties.getProperty("HamoglobinSpecimen");
		LabConstants.BlOOD_GROUP_SPECIMEN = labProperties.getProperty("BloodGroupSpecimen");
		LabConstants.HIV_SPECIMEN = labProperties.getProperty("HIVSpecimen");
		LabConstants.AntiHCV_SPECIMEN = labProperties.getProperty("AntiHCVSpecimen");
		LabConstants.HBsAg_SPECIMEN = labProperties.getProperty("HBsAgSpecimen");
		LabConstants.SGOT_SPECIMEN = labProperties.getProperty("SGOTSpecimen");
		LabConstants.SGPT_SPECIMEN = labProperties.getProperty("SGPTSpecimen");
		LabConstants.CREATININE_SPECIMEN = labProperties.getProperty("CreatinineSpecimen");
		LabConstants.RPR_SPECIMEN= labProperties.getProperty("RPRSpecimen");
		LabConstants.GLUCOSE_SPECIMEN= labProperties.getProperty("GlucoseSpecimen");
		LabConstants.BEtaHCG_SPECIMEN = labProperties.getProperty("BEtaHCGSpecimen");

		// Retest Value
		LabConstants.HAEMOGLOBIN_RETEST_VALUE = labProperties.getProperty("HamoglobinRetestValue");
		LabConstants.HIV_RETEST_VALUE = labProperties.getProperty("HIVRetestValue");
		LabConstants.AntiHCV_RETEST_VALUE = labProperties.getProperty("AntiHCVRetestValue");
		LabConstants.HBsAg_RETEST_VALUE = labProperties.getProperty("HBsAgRetestValue");
		LabConstants.SGOT_RETEST_VALUE = labProperties.getProperty("SGOTRetestValue");
		LabConstants.SGPT_RETEST_VALUE = labProperties.getProperty("SGPTRetestValue");
		LabConstants.CREATININE_RETEST_VALUE = labProperties.getProperty("CreatinineRetestValue");
		LabConstants.RPR_RETEST_VALUE = labProperties.getProperty("RPRRetestValue");
		LabConstants.GLUCOSE_RETEST_VALUE = labProperties.getProperty("GlucoseRetestValue");
		LabConstants.BEtaHCG_RETEST_VALUE = labProperties.getProperty("BEtaHCGRetestValue");

		// Retake Value
		LabConstants.HAEMOGLOBIN_RETAKE_VALUE = labProperties.getProperty("HamoglobinRetakeValue");
		LabConstants.HIV_RETAKE_VALUE = labProperties.getProperty("HIVRetakeValue");
		LabConstants.AntiHCV_RETAKE_VALUE = labProperties.getProperty("AntiHCVRetakeValue");
		LabConstants.HBsAg_RETAKE_VALUE = labProperties.getProperty("HBsAgRetakeValue");
		LabConstants.SGOT_RETAKE_VALUE = labProperties.getProperty("SGOTRetakeValue");
		LabConstants.SGPT_RETAKE_VALUE = labProperties.getProperty("SGPTRetakeValue");
		LabConstants.CREATININE_RETAKE_VALUE = labProperties.getProperty("CreatinineRetakeValue");
		LabConstants.RPR_RETAKE_VALUE = labProperties.getProperty("RPRRetakeValue");
		LabConstants.GLUCOSE_RETAKE_VALUE = labProperties.getProperty("GlucoseRetakeValue");
		LabConstants.BEtaHCG_RETAKE_VALUE = labProperties.getProperty("BEtaHCGRetakeValue");
		
		// Manila Hiv Result
		LabConstants.HIV_INTERNAL_RESULT_IN_MANILA = labProperties.getProperty("HivInternalResult");
		
	}
}
