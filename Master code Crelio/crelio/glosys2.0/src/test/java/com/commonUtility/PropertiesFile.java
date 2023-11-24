package com.commonUtility;

import java.util.Properties;
import com.constantProperties.ConstantProperties;

public class PropertiesFile {

	public void constantProperties() {

		Properties properties = new Properties();

		try {

			properties.load(getClass().getResourceAsStream("/configuration.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		ConstantProperties.NEGATIVE_SCENARIO_STATUS = properties.getProperty("NegativeScenarioScript");
		ConstantProperties.APPURL = properties.getProperty("AppUrl");
		ConstantProperties.BROWSER = properties.getProperty("Browser");
		ConstantProperties.USERNAME = properties.getProperty("UserName");
		ConstantProperties.PASSWORD = properties.getProperty("Password");
		ConstantProperties.COUNTRY = properties.getProperty("Country");

		ConstantProperties.STATE = properties.getProperty("State");
		// Incoorect UserName

		// Pregnant Status
		ConstantProperties.PREGNANT_STATUS = properties.getProperty("ApplicantBelievesPregnant");

		ConstantProperties.VISA_NUMBER = properties.getProperty("VisaApplicationNumber");

		// VaccinationDocumenUploadtStatus
		ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS = properties
				.getProperty("VaccinationDocumentUploadStatus");
		// Refferral Letter Status
		ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS = properties.getProperty("ReferralLetterDocumentStatus");

		ConstantProperties.TEMPERATURE = properties.getProperty("Temperature");
		// Nurse Module details
		ConstantProperties.HEIGHT = properties.getProperty("Height");
		ConstantProperties.WEIGHT = properties.getProperty("Weight");
		ConstantProperties.VISION = properties.getProperty("Vision");
		ConstantProperties.COLOR = properties.getProperty("Color");
		ConstantProperties.RECHECH_COLOR_VISION = properties.getProperty("RecheckColorVision");
		ConstantProperties.SYSTOLIC_PRESSURE = properties.getProperty("SystolicPressure");
		ConstantProperties.DIASTOLIC_PRESSURE = properties.getProperty("DiastolicPressure");

		ConstantProperties.PRE_VACCINATION_CHECKLIST = properties.getProperty("PreVaccinationCheckList");
		// Cardiology Problem

		ConstantProperties.CARDIOLOGY = properties.getProperty("Cardiovascular");

		// Deformity Problem
		ConstantProperties.DEFORMITY = properties.getProperty("Deformity");

		// Consultation Option
		ConstantProperties.MEDICAL_HISTORY = properties.getProperty("MedicalHistory");

		// XRay
		ConstantProperties.XRAY_RESULTS = properties.getProperty("XrayResults");

		// CLA Result
		ConstantProperties.HIV_CLA_RESULT = properties.getProperty("HivCLAResult");
		ConstantProperties.ANTI_HCV_CLA_RESULT = properties.getProperty("AntiHcvCLAResult");
		ConstantProperties.HBSAG_CLA_RESULT = properties.getProperty("HbsAgCLAResult");
		ConstantProperties.RPR_CLA_RESULT = properties.getProperty("RprCLAResult");
		ConstantProperties.NEUTRALISATION_HBSAG_CLA_RESULT = properties.getProperty("Neutralisation_HbsAg_CLA_Result");

		// Stemz Gp Referral Document Approval Status
		ConstantProperties.GENERAL_MEDICINE_APPROVAL = properties.getProperty("GeneralMedicineApproval");
		ConstantProperties.BLOOD_PRESSURE_CHECK_APPROVAL = properties.getProperty("BloodPressureCheckApproval");
		ConstantProperties.OPHTHAMOLOGIST_APPROVAL = properties.getProperty("OphthalmologistApproval");
		ConstantProperties.CARDIOLOGY_APPROVAL = properties.getProperty("CardiologyApproval");
		ConstantProperties.ORTHOPEDIC_APPROVAL = properties.getProperty("OrthopedicApproval");
		ConstantProperties.VISION_RECHECK_APPROVAL = properties.getProperty("VisionRecheck");

		ConstantProperties.COLOR_VISION_RECHECK_APPROVAL = properties.getProperty("ColorVisionRecheck");
		ConstantProperties.PULMONOLOGY_APPROVAL = properties.getProperty("Pulmonology_Approval");
		ConstantProperties.DERMATOLOGY_APPROVAL = properties.getProperty("Dermatology_Approval");
		ConstantProperties.ENT__APPROVAL = properties.getProperty("ENT_Approval");
		ConstantProperties.PSYCHIATRIST_APPROVAL = properties.getProperty("Psychiatrist_Approval");

		// Xray
		ConstantProperties.PLAIN_CT_CHEST_APPROVAL = properties.getProperty("Plain_CT_Chest_Approval");

		ConstantProperties.BETA_HCG_APPROVAL = properties.getProperty("BetaHCG_Approval");
		ConstantProperties.OPTOMETRIST_APPROVAL = properties.getProperty("OptometristApproval");

		ConstantProperties.FINAL_APPROVAL_AUTHORIZE = properties.getProperty("Final_Approval_Authorize");
		ConstantProperties.MOH_FINAL_STATUS = properties.getProperty("MOH_Final_Status");
		ConstantProperties.MOI_FINAL_STATUS = properties.getProperty("MOI_Final_Status");
		ConstantProperties.ASSIGN_TO = properties.getProperty("AssignTo");

		// Additional
		ConstantProperties.HAMOGLOBIN_APPROVAL = properties.getProperty("Hamoglobin_Approval");
		ConstantProperties.SGOT_APPROVAL = properties.getProperty("Sgot_Approval");
		ConstantProperties.SGPT_APPROVAL = properties.getProperty("Sgpt_Approval");
		ConstantProperties.GLUCOSE_HBA1C_APPROVAL = properties.getProperty("HbaA1c_Approval");
		ConstantProperties.CREATININE_APPROVAL = properties.getProperty("Creatinine_Approval");

		// Comformatory
		ConstantProperties.HIV_APPROVAL = properties.getProperty("HIV_Approval");
		ConstantProperties.ANTI_HCV_APPROVAL = properties.getProperty("AntiHCV_Approval");
		ConstantProperties.HBSAG_APPROVAL = properties.getProperty("HBsAg_Approval");
		ConstantProperties.RPR_APPROVAL = properties.getProperty("RPR_Approval");
		// Lab Id
		ConstantProperties.LAB_ID = properties.getProperty("labId");

		// Lab Reject
		ConstantProperties.REJECT_FOR_SERUM_SST = properties.getProperty("Reject_For_SerumSST");
		ConstantProperties.REJECT_FOR_SERUM_PLAIN_TUBE = properties.getProperty("Reject_For_Serum_Plain_Tube");
		ConstantProperties.REJECT_FOR_PLASMA = properties.getProperty("Reject_For_Plasma");
		ConstantProperties.REJECT_FOR_WHOLD_BLOOD = properties.getProperty("Reject_For_Whole_Blood");

		ConstantProperties.PLASMA = properties.getProperty("plasma");
		ConstantProperties.SERUM = properties.getProperty("serum");
		ConstantProperties.WHOLE_BLOOD = properties.getProperty("wholeBlood");

		ConstantProperties.RESPIRATORY = properties.getProperty("RespiratorySystem");
		ConstantProperties.SKIN = properties.getProperty("Skin");
		ConstantProperties.EAR = properties.getProperty("Ear");
		ConstantProperties.PSYCHIATRY = properties.getProperty("Psychiatry");
		ConstantProperties.PREVIOUS_ILLNESS = properties.getProperty("PreviousIllness");
		ConstantProperties.NEUROLOGICAL_DISORDER = properties.getProperty("NeurologicalDisorder");

		ConstantProperties.HBSAG_CONFIRMATION_RESULT = properties.getProperty("HBsAg_Confirmation_Result");
		ConstantProperties.TITER_VALUE = properties.getProperty("Titer_Value");
		ConstantProperties.TPHA = properties.getProperty("TPHA");
		ConstantProperties.RPR_INTERNAL_TEST = properties.getProperty("RPR_Internal_Test");

		ConstantProperties.APPLICATION_STATUS = properties.getProperty("ApplicationStatusCheck");
		ConstantProperties.APPLICATION_STATUS_CHECK_ENTER_YOUR_VISA_NUMBER = properties
				.getProperty("ApplicationStatusCheckEnterYourVisaNumber");
		ConstantProperties.TIME_CONFIGURATION = properties.getProperty("TimeConfiguration");
	}
}
