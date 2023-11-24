package com.labJuniorFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LabIconpageObjects.LabJuniorRetakePOM;
import com.LabIconpageObjects.LabJuniorSaveIconPOM;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.pageObjects.LabJunior;

public class RetakeSpecimen {

	private static final Logger LOGGER = LogManager.getLogger(RetakeSpecimen.class);

	public static void specimensOneRetake(String retakeSpecimen) throws Throwable {
		switch (retakeSpecimen) {
		case AppConstants.HAEMOGLOBIN_RETAKE:
			CommonUtility.sleepControl(700);
			LabJuniorRetakePOM.getInstance().clickTheHemoglobinRetake();
			CommonUtility.sleepControl(1000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(500);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown100();
			break;
		case AppConstants.BloodGroup_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheBloodGroupRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown100();
			break;

		case AppConstants.HIV:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheHIVRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.AntiHCV_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheAntiHCVRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.HbsAg_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheHBsAgRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.Sgot_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheSGOTRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.Sgpt_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheSGPTRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.Creatinine_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheCreatinineRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.Rpr_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheRPRRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;

		case AppConstants.BetaHCG_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheBetaHCGRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;
		case AppConstants.Glucose_Retake:
			CommonUtility.sleepControl(3000);
			LabJuniorRetakePOM.getInstance().clickTheGlucoseRetake();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheReason();
			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();
			CommonUtility.sleepControl(2000);
			LabJunior.getInstance().clickTheSave();
			LOGGER.info(retakeSpecimen + " Retake initiated successfully");
			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			break;
		default:

			LOGGER.error("Retake Flow error Specimen type : " + retakeSpecimen);
			break;
		}

	}

}
