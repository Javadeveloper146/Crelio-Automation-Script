package com.labJuniorFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LabIconpageObjects.LabJuniorCompletedPOM;
import com.LabIconpageObjects.LabJuniorRetakePOM;
import com.LabIconpageObjects.LabJuniorRetestPOM;
import com.LabIconpageObjects.LabJuniorSaveIconPOM;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.pageObjects.LabJunior;
import com.pageObjects.PatientProfiles;

public class RetestSpecimens {
	private static final Logger LOGGER = LogManager.getLogger(RetestSpecimens.class);

	public static void specimenResetProcess(String retestSpecimen) throws Throwable {
		// Click The Haemoglobin Retest
		switch (retestSpecimen) {
		case AppConstants.HAEMOGLOBIN_RETAKE:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheHemoglobinRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.HAEMOGLOBIN_RETAKE + " -" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);

			LabJunior.getInstance().enterTheHaemoglobinValue(LabConstants.HAEMOGLOBIN_RETEST_VALUE);
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheHemoglobinSave();
			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheHemoglobinComplete();
			break;
		case AppConstants.BloodGroup_Retake:

			break;

		case AppConstants.HIV:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheHIVRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.HIV + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheHIV();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheNegativeOption();
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheHIVSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheHIVComplete();
			break;

		case AppConstants.AntiHCV_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheAntiHCVRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.AntiHCV_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheAntiHCV();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheNegativeOption();
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheAntiHCVSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheAntiHCVComplete();
			break;

		case AppConstants.HbsAg_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheHBsAgRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.HbsAg_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheHBsAg();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheNegativeOption();
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheHBsAgSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheHBsAgComplete();

			break;

		case AppConstants.Sgot_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheSGOTRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.Sgot_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSGOTValue(LabConstants.SGOT_RETEST_VALUE);
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheSGOTSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheSGOTComplete();
			break;

		case AppConstants.Sgpt_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheSGPTRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.Sgpt_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT_RETEST_VALUE);
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheSGPTSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheSGPTComplete();
			break;

		case AppConstants.Creatinine_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheSGPTRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.Creatinine_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT_RETEST_VALUE);
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheSGPTSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheSGPTComplete();
			break;

		case AppConstants.Rpr_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheRPRRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.Rpr_Retake + "-" + " Test submitted for retest successfully");
			LabJunior.getInstance().clickTheRPR();
			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheNegativeOption();
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheRPRSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheRPRComplete();
			break;

		case AppConstants.BetaHCG_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheBetaHCGRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.BetaHCG_Retake + "-" + " Test submitted for retest successfully");
			LabJunior.getInstance().clickTheBetaHCG();
			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheNegativeOption();
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheBetaHCGSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheBetaHCGComplete();
			break;
		case AppConstants.Glucose_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetestPOM.getInstance().clickTheGlucoseRetest();
			CommonUtility.sleepControl(2000);
			PatientProfiles.getInstance().clickTheYesOption();
			LOGGER.info(AppConstants.Glucose_Retake + "-" + " Test submitted for retest successfully");
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE_RETEST_VALUE);
			CommonUtility.sleepControl(2000);
			LabJuniorSaveIconPOM.getInstance().clickTheGlucoseSave();

			LOGGER.info("Results updated successfully");
//			LabJunior.getInstance().clickTheHaemoglobinView();
//			CommonUtility.sleepControl(2000);
//			LabJunior.getInstance().clickTheHaemoglobinViewedSave();
//			CommonUtility.sleepControl(2000);
			CommonUtility.sleepControl(2000);
			LabJuniorCompletedPOM.getInstance().clickTheGlucoseComplete();
			break;
		default:

			LOGGER.error("Retake Flow error Specimen type : " + retestSpecimen);
			break;
		}

	}

}
