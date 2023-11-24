package com.labJuniorFlow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LabIconpageObjects.LabJuniorCompletedPOM;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.modules.ApplicationStatusCheck;
import com.pageObjects.LabJunior;
import com.pageObjects.PatientProfiles;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

import junit.framework.Assert;

public class LabJuniorWorkList {

	public static boolean labConfirmatory;
	public static boolean additionalLabTest;
	public static boolean retakeSpecimenStatus;
	public static boolean hamoglobin;
	public static boolean bloodGroup;
	public static boolean hiv;
	public static boolean antiHCV;
	public static boolean hBsAg;
	public static boolean sgot;
	public static boolean sgpt;
	public static boolean creatinine;
	public static boolean rpr;
	public static boolean glucose;
	public static boolean bEtaHCG;
	public static int genernalMedicineCountForCertificatePage;
	public static boolean plasma;
	public static boolean serum;
	public static boolean wholdBlood;
	public static int sgotReferralCountForCertificatePage;
	public static int sgptReferralCountForCertificatePage;
	public static int creatinineReferralCountForCertificatePage;
	public static int glucoseReferralCountForCertificatePage;
	public static int hemoglobinReferralCountForCertificatePage;
	public static int hamoglobinReferralCount;
	public static int hivReferralCount;
	public static int antiHCVReferralCount;
	public static int hBsAgReferralCount;
	public static int sgotReferralCount;
	public static int sgptReferralCount;
	public static int creatinineReferralCount;
	public static int rprReferralCount;
	public static int glucoseReferralCount;
	public static int bEtaHCGReferralCount;
	public static int bEtaHCGPositiveReferralToCentralLabAuthority;
	public static boolean referralStatus;
	public static boolean betaHCGReferralStatus;
	public static boolean bmiStatusInNurse;
	public static boolean RPR_Ref_Status;
	public static boolean speclityStatus;
	public static boolean sgotReferralStattus;
	public static boolean sgptReferralStatus;
	public static boolean creatinineReferralStatus;
	public static boolean glucoseReferralStatus;
	public static boolean triggerControllerStatus;
	public static boolean referralCertificateStatus;
	public static boolean hivPositiveInManilaLocationStatus;
	public static boolean hhbsagPositiveInManilaLocationStatus;
	public static boolean hbsAg_Pakistan_Location_Status;
	public static boolean ND_Status;
	public static boolean NND_Status;
	public static boolean RPR_Internal_Test_Status;
	public static int RPR_Internal_Test_Count;
	public static boolean HBsAg_Internal_Test_Status;
	private static final Logger LOGGER = LogManager.getLogger(LabJuniorWorkList.class);
	public static boolean NN_Status;
	public static boolean Hamoglobin_Status;
	public static boolean SGOT_Status;
	public static boolean SGPT_Status;
	public static boolean Creatinine_Status;
	public static boolean Glucose_Status;

	public void labWorkList() throws Throwable {
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(5000);
		} else {
			CommonUtility.sleepControl(3000);
		}
		CommonUtility.scrollDown100();
		bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
		// Haemoglobin

		// Low 10 (Gen + HbRepeat) -- High (17 - Gen)
		if (LabConstants.HAEMOGLOBIN.equals(AppConstants.HAEMOGLOBIN_NORMAL)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(2300);
			} else {
				CommonUtility.sleepControl(1000);
			}
			LabJunior.getInstance().enterTheHaemoglobinValue(LabConstants.HAEMOGLOBIN);
		}

		if (LabConstants.HAEMOGLOBIN.equals(AppConstants.HAEMOGLOBIN_LOW_VALUE)) {
			Hamoglobin_Status = true;
			hemoglobinReferralCountForCertificatePage = 1;
			speclityStatus = true;
			genernalMedicineCountForCertificatePage = 1;
			referralCertificateStatus = true;
			referralStatus = true;
			additionalLabTest = true;
			ND_Status = true;

			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(2500);
			} else {
				CommonUtility.sleepControl(1000);
			}

			LabJunior.getInstance().enterTheHaemoglobinValue(LabConstants.HAEMOGLOBIN);

			if (bmiStatusInNurse == true) {
				hamoglobinReferralCount = 1;
				triggerControllerStatus = true;
			} else {
				triggerControllerStatus = true;
				hamoglobinReferralCount = 1;
			}
		}

		if (LabConstants.HAEMOGLOBIN.equals(AppConstants.HAEMOGLOBIN_HIGH_VALUE)) {

			referralCertificateStatus = true;
			referralStatus = true;
			additionalLabTest = true;
			ND_Status = true;

			if (bmiStatusInNurse == true) {
				hamoglobinReferralCount = 0;
				LOGGER.info("Hamoglobin Value Asssign 0 -> Assign To General Medicine");
			} else {
				triggerControllerStatus = true;
				hamoglobinReferralCount = 1;
			}

			LOGGER.info("Hamoglobin Trigger Status :" + triggerControllerStatus);
			LOGGER.info("Hamoglobin Referral Count :" + hamoglobinReferralCount);

			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(2500);
			} else {
				CommonUtility.sleepControl(1200);
			}

			LabJunior.getInstance().enterTheHaemoglobinValue(LabConstants.HAEMOGLOBIN);

		}

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1400);
		} else {
			CommonUtility.sleepControl(800);
		}

		LabJuniorCompletedPOM.getInstance().clickTheHemoglobinComplete();
		LOGGER.info("Haemoglobin" + ": " + LabConstants.HAEMOGLOBIN);

		// Haemoglobin Retest
		if (LabConstants.HAEMOGLOBIN_SPECIMEN.equals(AppConstants.RETEST)) {

			LOGGER.info("Retest For" + ": " + AppConstants.HAEMOGLOBIN_RETAKE + "- Restest Result Value : "
					+ LabConstants.HAEMOGLOBIN_RETEST_VALUE);

			String retestSpecimen = AppConstants.HAEMOGLOBIN_RETAKE;
			RetestSpecimens.specimenResetProcess(retestSpecimen);

		}

		// Retake
		if (LabConstants.HAEMOGLOBIN_SPECIMEN.equals(AppConstants.RETAKE)) {
			plasma = true;
			hamoglobin = true;
			retakeSpecimenStatus = true;
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.HAEMOGLOBIN_RETAKE;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);

			// Sample retake Status
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_7)) {
				CommonDefinition commonDefinition = new CommonDefinition();
				commonDefinition.logOut();

				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();

			}
		}

		// ---------------------------------------------------------------------------
		// Blood Group
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1500);
		} else {
			CommonUtility.sleepControl(700);
		}
		LabJunior.getInstance().clickTheBloodGroup();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJunior.getInstance().clickTheNegativeOption();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheBloodGroupComplete();
		LOGGER.info("Blood Group" + ": " + LabConstants.BlOOD_GROUP);

		// --------------------------------------------------------------------------
		// HIV
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);

		}
		LabJunior.getInstance().clickTheHIV();

		if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(300);
			}
			LabJunior.getInstance().clickTheNegativeOption();

		} else if (LabConstants.HIV.equals(AppConstants.HIV_POSITIVE)) {
			NN_Status = true;
			referralCertificateStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(300);
			}
			LabJunior.getInstance().clickThePositiveOption();
			referralStatus = true;

			if (ConstantProperties.COUNTRY.equals(AppConstants.PHILIPPINES_COUNTRY)) {
				hivPositiveInManilaLocationStatus = true;
				hivReferralCount = 2;
			}
			if (ConstantProperties.COUNTRY.equals(AppConstants.INDIA_COUNTRY)) {
				hivReferralCount = 1;
			}
			if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				hivReferralCount = 1;
			}
			labConfirmatory = true;
			NN_Status = true;
		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(300);
		}
		LabJuniorCompletedPOM.getInstance().clickTheHIVComplete();
		LOGGER.info("HIV" + ": " + LabConstants.HIV);

		// Retest
		if (LabConstants.HIV_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.Hiv_Retake + "- Restest Result Value : "
					+ LabConstants.HIV_RETEST_VALUE);

			String retestSpecimen = AppConstants.Hiv_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.HIV_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			hiv = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.Hiv_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}

		// -----------------------------------------------------------
		// Anti HCV
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(700);
			LabJunior.getInstance().clickTheAntiHCV();
		}

		if (LabConstants.AntiHCV.equals(AppConstants.ANTI_HCV_NEGATIVE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().clickTheNegativeOption();

		} else if (LabConstants.AntiHCV.equals(AppConstants.ANTI_HCV_POSITIVE)) {

			referralCertificateStatus = true;
			referralStatus = true;
			antiHCVReferralCount = 1;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().clickThePositiveOption();
			labConfirmatory = true;
			NN_Status = true;
		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheAntiHCVComplete();
		LOGGER.info("Anti HCV" + ": " + LabConstants.AntiHCV);

		// Retest
		if (LabConstants.AntiHCV_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.AntiHCV_Retake + "- Restest Result Value : "
					+ LabConstants.AntiHCV_RETEST_VALUE);

			String retestSpecimen = AppConstants.AntiHCV_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.AntiHCV_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			antiHCV = true;
			retakeSpecimenStatus = true;
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.AntiHCV_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}

		// ------------------------Approval------------------------
		// Status updated successfully
		// HBsAg
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJunior.getInstance().clickTheHBsAg();

		if (LabConstants.HBsAg.equals(AppConstants.HBsAg_NEGATIVE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().clickTheNegativeOption();

		} else if (LabConstants.HBsAg.equals(AppConstants.HBsAg_POSITIVE)) {

			if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				HBsAg_Internal_Test_Status = true;
			}
			NN_Status = true;
			referralCertificateStatus = true;
			referralStatus = true;

			
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}

			LabJunior.getInstance().clickThePositiveOption();
			labConfirmatory = true;
			NN_Status = true;
		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheHBsAgComplete();
		LOGGER.info("HBsAg" + ": " + LabConstants.HBsAg);

		// Retest
		if (LabConstants.HBsAg_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.HbsAg_Retake + "- Restest Result Value : "
					+ LabConstants.HBsAg_RETEST_VALUE);

			String retestSpecimen = AppConstants.HbsAg_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.HBsAg_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			hBsAg = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.HbsAg_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}

		// --------------------------------------------------------------------------------

		// SGOT
		if (LabConstants.SGOT.equals(AppConstants.SGOT_NEGATIVE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(700);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabJunior.getInstance().enterTheSGOTValue(LabConstants.SGOT);

		} else if (LabConstants.SGOT.equals(AppConstants.SGOT_POSITIVE)) {
			SGOT_Status = true;
			genernalMedicineCountForCertificatePage = 1;
			speclityStatus = true;
			sgotReferralCountForCertificatePage = 1;
			sgotReferralStattus = true;

			referralCertificateStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(700);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabJunior.getInstance().enterTheSGOTValue(LabConstants.SGOT);
			referralStatus = true;
			bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
			additionalLabTest = true;
			ND_Status = true;

			if (bmiStatusInNurse == true) {
				sgotReferralCount = 1;
			} else {
				if (triggerControllerStatus == true) {
					sgotReferralCount = 1;
				} else {
					triggerControllerStatus = true;
					sgotReferralCount = 2;
				}

			}
		}
		LOGGER.info("SGOT Trigger Status :" + triggerControllerStatus);
		LOGGER.info("SGOT Referral Count :" + sgotReferralCount);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheSGOTComplete();
		LOGGER.info("SGOT" + ": " + LabConstants.SGOT);

		// Retest
		if (LabConstants.SGOT_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.Sgot_Retake + "- Restest Result Value : "
					+ LabConstants.SGOT_RETEST_VALUE);

			String retestSpecimen = AppConstants.Sgot_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.SGOT_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			sgot = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.Sgot_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}
		// ----------------------------------------------------------------------------------

		// SGPT

		if (LabConstants.SGPT.equals(AppConstants.SGPT_NORMAL_VALUE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT);
		} else if (LabConstants.SGPT.equals(AppConstants.SGPT_ABNORMAL_VALUE)) {
			SGPT_Status = true;
			sgptReferralCountForCertificatePage = 1;
			speclityStatus = true;
			sgptReferralStatus = true;
			genernalMedicineCountForCertificatePage = 1;
			referralCertificateStatus = true;
			referralStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(500);
			} else {
				CommonUtility.sleepControl(100);
			}
			LabJunior.getInstance().enterTheSGPTValue(LabConstants.SGPT);
			additionalLabTest = true;
			ND_Status = true;
			bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
			if (bmiStatusInNurse == true) {
				sgptReferralCount = 1;
			} else {
				if (triggerControllerStatus == true) {
					sgptReferralCount = 1;

				} else {
					triggerControllerStatus = true;
					sgptReferralCount = 2;
				}

			}

		}
		LOGGER.info("SGPT Trigger Status :" + triggerControllerStatus);
		LOGGER.info("SGPT Referral Count :" + sgptReferralCount);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheSGPTComplete();
		LOGGER.info("SGPT" + ": " + LabConstants.SGPT);

		// Retest
		if (LabConstants.SGPT_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.Sgpt_Retake + "- Restest Result Value : "
					+ LabConstants.SGPT_RETEST_VALUE);

			String retestSpecimen = AppConstants.Sgpt_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.SGPT_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			sgpt = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.Sgpt_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(200);
		} else {
			CommonUtility.sleepControl(1000);
		}
		CommonUtility.scrollDown400();

		// --------------------------------------------------------------------------------------
		// Creatinine

		if (LabConstants.CREATININE.equals(AppConstants.CREATININE_NORMAL_VALUE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().enterTheCreatinine(LabConstants.CREATININE);
		} else if (LabConstants.CREATININE.equals(AppConstants.CREATININE_ABNORMAL_VALUE)) {
			Creatinine_Status = true;
			speclityStatus = true;
			creatinineReferralCountForCertificatePage = 1;
			creatinineReferralStatus = true;
			referralCertificateStatus = true;
			referralStatus = true;
			genernalMedicineCountForCertificatePage = 1;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().enterTheCreatinine(LabConstants.CREATININE);
			additionalLabTest = true;
			ND_Status = true;
			bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
			if (bmiStatusInNurse == true) {
				creatinineReferralCount = 1;
			} else {
				if (triggerControllerStatus == true) {

					creatinineReferralCount = 1;

				} else {
					triggerControllerStatus = true;
					creatinineReferralCount = 2;
				}

			}
		}
		LOGGER.info("Creatinine Trigger Status :" + triggerControllerStatus);
		LOGGER.info("Creatinine Referral Count :" + creatinineReferralCount);
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJuniorCompletedPOM.getInstance().clickTheCreatinineComplete();
		LOGGER.info("Creatinine" + ": " + LabConstants.CREATININE);

		// Retest
		if (LabConstants.CREATININE_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.Creatinine_Retake + "- Restest Result Value : "
					+ LabConstants.CREATININE_RETEST_VALUE);

			String retestSpecimen = AppConstants.Creatinine_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.CREATININE_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			creatinine = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.Creatinine_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}

		// ---------------------------------------------------------------------------------------
		// RPR
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		LabJunior.getInstance().clickTheRPR();

		if (LabConstants.RPR.equals(AppConstants.RPR_NON_REACTIVE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(200);
			}
			LabJunior.getInstance().clickThePositiveOption();

		} else if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
			if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {
				RPR_Internal_Test_Status = true;
			}

			RPR_Ref_Status = true;
			NN_Status = true;
			referralCertificateStatus = true;
			referralStatus = true;
			rprReferralCount = 1;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(300);
			}
			LabJunior.getInstance().clickTheNegativeOption();
			labConfirmatory = true;

		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(200);
		}

		LabJuniorCompletedPOM.getInstance().clickTheRPRComplete();
		LOGGER.info("RPR" + ": " + LabConstants.RPR);

		// Retest
		if (LabConstants.RPR_SPECIMEN.equals(AppConstants.RETEST)) {
			LOGGER.info("Retest For" + ": " + AppConstants.Rpr_Retake + " - Restest Result Value : "
					+ LabConstants.RPR_RETEST_VALUE);

			String retestSpecimen = AppConstants.Rpr_Retake;
			RetestSpecimens.specimenResetProcess(retestSpecimen);
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown50();
		}

		// Retake
		if (LabConstants.RPR_SPECIMEN.equals(AppConstants.RETAKE)) {
			serum = true;
			rpr = true;
			retakeSpecimenStatus = true;
			CommonUtility.sleepControl(2000);
			LOGGER.info("Retake Specimen  Process: ");
			String retakeSpecimen = AppConstants.Rpr_Retake;
			RetakeSpecimen.specimensOneRetake(retakeSpecimen);
		}

		// -----------------------------------------------------------------------------------

		String genderType = GROStepDefinition.gender;
		switch (genderType) {
		case AppConstants.MALE_GENDER:

			// Glucose
			if (LabConstants.GLUCOSE.equals(AppConstants.GLUCOSE_NORMAL_VALUE)) {
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1800);
				} else {
					CommonUtility.sleepControl(500);
				}
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE);
			} else if (LabConstants.GLUCOSE.equals(AppConstants.GLUCOSE_ABNORMAL_VALUE)) {
				Glucose_Status = true;
				speclityStatus = true;
				genernalMedicineCountForCertificatePage = 1;
				glucoseReferralCountForCertificatePage = 1;
				glucoseReferralStatus = true;
				referralCertificateStatus = true;
				referralStatus = true;
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(500);
				}
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE);
				additionalLabTest = true;
				ND_Status = true;
				bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
				if (bmiStatusInNurse == true) {
					glucoseReferralCount = 1;
				} else {
					if (triggerControllerStatus == true) {
						glucoseReferralCount = 1;
					} else {
						triggerControllerStatus = true;
						glucoseReferralCount = 1;
					}

				}

			}
			LOGGER.info("Glucose Trigger Status :" + triggerControllerStatus);
			LOGGER.info("Glucose Referral Count :" + glucoseReferralCount);
			LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE);
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJuniorCompletedPOM.getInstance().clickTheGlucoseComplete();

			// Retest
			if (LabConstants.GLUCOSE_SPECIMEN.equals(AppConstants.RETEST)) {
				LOGGER.info("Retest For" + ": " + AppConstants.Glucose_Retake + "- Restest Result Value : "
						+ LabConstants.GLUCOSE_RETEST_VALUE);

				String retestSpecimen = AppConstants.Glucose_Retake;
				RetestSpecimens.specimenResetProcess(retestSpecimen);
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown50();
			}

			// Retake
			if (LabConstants.GLUCOSE_SPECIMEN.equals(AppConstants.RETAKE)) {
				wholdBlood = true;
				glucose = true;
				retakeSpecimenStatus = true;

				LOGGER.info("Retake Specimen  Process: ");
				String retakeSpecimen = AppConstants.Glucose_Retake;
				RetakeSpecimen.specimensOneRetake(retakeSpecimen);
			}

			break;

		default:

			// BEta HCG
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJunior.getInstance().clickTheBetaHCG();

			if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_NEGATIVE)) {

				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {
					if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
						CommonUtility.sleepControl(1000);
					} else {
						CommonUtility.sleepControl(500);
					}
					LabJunior.getInstance().clickTheNegativeOption();
					LOGGER.info("Pregnant No And Lab Beta Hcg Result value Negative");
				} else {
					ND_Status = true;
					referralCertificateStatus = true;
					referralStatus = true;
					speclityStatus = true;
					betaHCGReferralStatus = true;
					bEtaHCGReferralCount = 1;
					if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
						CommonUtility.sleepControl(1000);
					} else {
						CommonUtility.sleepControl(500);
					}
					LabJunior.getInstance().clickTheNegativeOption();
				}
			} else if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_POSITIVE)) {
				NN_Status = true;
				referralCertificateStatus = true;
				labConfirmatory = true;
				betaHCGReferralStatus = true;
				referralStatus = true;
				bEtaHCGPositiveReferralToCentralLabAuthority = 1;

				bEtaHCGReferralCount = 1;
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickThePositiveOption();
			} else if (LabConstants.BEtaHCG.equals(AppConstants.BETA_HCG_INDETERMINATE)) {

				referralCertificateStatus = true;
				labConfirmatory = true;
				betaHCGReferralStatus = true;
				bEtaHCGReferralCount = 1;
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().clickTheIndeterminateOption();
			}
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			LabJuniorCompletedPOM.getInstance().clickTheBetaHCGComplete();
			LOGGER.info("BEta HC" + ": " + LabConstants.BEtaHCG);

			// Retest
			if (LabConstants.BEtaHCG_SPECIMEN.equals(AppConstants.RETEST)) {
				LOGGER.info("Retest For" + ": " + AppConstants.BetaHCG_Retake + "- Restest Result Value : "
						+ LabConstants.BEtaHCG_RETEST_VALUE);

				String retestSpecimen = AppConstants.BetaHCG_Retake;
				RetestSpecimens.specimenResetProcess(retestSpecimen);
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown50();
			}

			// Retake
			if (LabConstants.BEtaHCG_SPECIMEN.equals(AppConstants.RETAKE)) {
				serum = true;
				bEtaHCG = true;
				retakeSpecimenStatus = true;
				CommonUtility.sleepControl(2000);
				LOGGER.info("Retake Specimen  Process: ");
				String retakeSpecimen = AppConstants.Glucose_Retake;
				RetakeSpecimen.specimensOneRetake(retakeSpecimen);
			}
			// ------------------------------------------------------------------------------------
			// Glucose

			if (LabConstants.GLUCOSE.equals(AppConstants.GLUCOSE_NORMAL_VALUE)) {
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE);
			} else if (LabConstants.GLUCOSE.equals(AppConstants.GLUCOSE_ABNORMAL_VALUE)) {
				Glucose_Status = true;
				genernalMedicineCountForCertificatePage = 1;
				speclityStatus = true;
				glucoseReferralCountForCertificatePage = 1;
				glucoseReferralStatus = true;
				referralCertificateStatus = true;
				referralStatus = true;
				CommonUtility.sleepControl(500);
				LabJunior.getInstance().enterTheGlucose(LabConstants.GLUCOSE);
				additionalLabTest = true;
				ND_Status = true;
				bmiStatusInNurse = NurseModuleStepDefinition.bmiReferralStatus;
				if (bmiStatusInNurse == true) {
					glucoseReferralCount = 1;
				} else {
					if (triggerControllerStatus == true) {
						glucoseReferralCount = 1;
					} else {
						triggerControllerStatus = true;
						glucoseReferralCount = 2;
					}

				}
			}

			LOGGER.info("Glucose Trigger Status :" + triggerControllerStatus);
			LOGGER.info("Glucose Referral Count :" + glucoseReferralCount);
			LOGGER.info("Glucose" + ": " + LabConstants.GLUCOSE);
			CommonUtility.sleepControl(500);
			LabJuniorCompletedPOM.getInstance().clickTheGlucoseComplete();

			// Retest
			if (LabConstants.GLUCOSE_SPECIMEN.equals(AppConstants.RETEST)) {
				LOGGER.info("Retest For" + ": " + AppConstants.Glucose_Retake + "- Restest Result Value : "
						+ LabConstants.GLUCOSE_RETEST_VALUE);

				String retestSpecimen = AppConstants.Glucose_Retake;
				RetestSpecimens.specimenResetProcess(retestSpecimen);
				CommonUtility.sleepControl(2000);
				CommonUtility.scrollDown50();
			}

			// Retake
			if (LabConstants.GLUCOSE_SPECIMEN.equals(AppConstants.RETAKE)) {
				wholdBlood = true;
				glucose = true;
				retakeSpecimenStatus = true;
				CommonUtility.sleepControl(2000);
				LOGGER.info("Retake Specimen  Process: ");
				String retakeSpecimen = AppConstants.Glucose_Retake;
				RetakeSpecimen.specimensOneRetake(retakeSpecimen);
			}

			break;
		}

		// Click The Submit for first review
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2900);
		} else {
			CommonUtility.sleepControl(1500);
		}
		LabJunior.getInstance().clickThesubmitForFirstReview();
		LOGGER.info("Result submitted for authorization successfully");

	}

}
