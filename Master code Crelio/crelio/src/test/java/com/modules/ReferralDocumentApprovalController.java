package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.modulesPOM.AdditionalLabTestPOM;
import com.referralAndCertificatePom.ReferralDocumentPOM;

public class ReferralDocumentApprovalController {

	public static boolean generalMedicineStatus;
	public static boolean gynacologyStatus;
	public static boolean cardilogyStatus;
	public static boolean ophthalmologistStatus;
	public static boolean bpStatus;
	public static boolean orthopedicStatus;
	public static boolean sgotStatus;
	public static boolean sgptStatus;
	public static boolean glucosehbsgcStatus;
	public static boolean creatinineStatus;
	public static boolean hbsagStatus;
	public static boolean hivStatus;
	public static boolean antiHcvStatus;
	public static boolean rprStatus;
	public static boolean betaHcgGynacNegativeStatus;
	public static int generalMedicineCount;
	public static int gynacologyCount;
	public static int cardilogyCount;
	public static int ophthalmologistCount;
	public static int bpCount;
	public static int orthopedicCount;
	public static int sgotCount;
	public static int sgptCount;
	public static int glucosehbsgcCount;
	public static int creatinineCount;
	public static int hbsagCount;
	public static int hivCount;
	public static int antiHcvCount;
	public static int rprCount;
	public static int betaHcgGynacNegativeCount;
	public static boolean rejectStatus;
	public static String approvalStatus;
	public static int totalResultEntry;
	public static boolean Serum_Creatinine_Status;
	public static String referralTypeNotApproved;
	private static final Logger LOGGER = LogManager.getLogger(ReferralDocumentApprovalController.class);

	public String referralApprovalStatusControl(String getTheReferralType) throws Throwable {

		LOGGER.info("Approval Referral Name : " + getTheReferralType);
		String referralTypeTrim = getTheReferralType;
		String referralType = referralTypeTrim.trim();

		switch (referralType) {
		case "Vision Recheck":
			LOGGER.info("Vision Recheck Approval Status : " + "Accepted");
			approvalStatus = AppConstants.APPROVAL_ACCEPT;
			referralTypeNotApproved = "No";
			break;

		case "Blood pressure Check":

			LOGGER.info("Blood pressure Check Approval Status : " + "Accepted");
			approvalStatus = AppConstants.APPROVAL_ACCEPT;
			referralTypeNotApproved = "No";
			break;

		case "Color Vision Recheck":
			LOGGER.info("Color Vision Recheck Approval Status : " + "Accepted");
			approvalStatus = AppConstants.APPROVAL_ACCEPT;
			referralTypeNotApproved = "No";
			break;

		case "General Medicine":

			if (ConstantProperties.GENERAL_MEDICINE_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.GENERAL_MEDICINE_APPROVAL;
				referralTypeNotApproved = "Yes";
				LOGGER.info("General Medicine Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.GENERAL_MEDICINE_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.GENERAL_MEDICINE_APPROVAL;
				LOGGER.info("General Medicine Approval Status : " + approvalStatus);
				generalMedicineStatus = true;
				generalMedicineCount = 1;
				rejectStatus = true;
			}

			break;

		case "Gynaecology":

			if (ConstantProperties.BETA_HCG_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {

				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.BETA_HCG_APPROVAL;
				LOGGER.info("Gynaecology Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.BETA_HCG_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.BETA_HCG_APPROVAL;
				LOGGER.info("Gynaecology Approval Status : " + approvalStatus);
				gynacologyStatus = true;
				gynacologyCount = 1;
				rejectStatus = true;
			}
			break;

		case "Cardiology":

			if (ConstantProperties.CARDIOLOGY_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {

				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.CARDIOLOGY_APPROVAL;
				LOGGER.info("Cardiology Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.CARDIOLOGY_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.CARDIOLOGY_APPROVAL;
				LOGGER.info("Cardiology Approval Status : " + approvalStatus);
				cardilogyStatus = true;
				cardilogyCount = 1;
				rejectStatus = true;
			}

			break;

		case "Ophthalmologist":

			if (ConstantProperties.OPHTHAMOLOGIST_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {

				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.OPHTHAMOLOGIST_APPROVAL;
				LOGGER.info("Ophthalmologist Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.OPHTHAMOLOGIST_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.OPHTHAMOLOGIST_APPROVAL;
				LOGGER.info("Ophthalmologist Approval Status : " + approvalStatus);
				ophthalmologistStatus = true;
				ophthalmologistCount = 1;
				rejectStatus = true;
			}
			break;

		case "Orthopedic":

			if (ConstantProperties.ORTHOPEDIC_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.ORTHOPEDIC_APPROVAL;
				LOGGER.info("Orthopedic Approval Status : " + approvalStatus);
				referralTypeNotApproved = "Yes";
			}
			if (ConstantProperties.ORTHOPEDIC_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.ORTHOPEDIC_APPROVAL;
				LOGGER.info("Orthopedic Approval Status : " + approvalStatus);
				orthopedicStatus = true;
				orthopedicCount = 1;
				rejectStatus = true;
			}
			break;
		case "Optometrist":

			if (ConstantProperties.OPTOMETRIST_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.OPTOMETRIST_APPROVAL;
				LOGGER.info("Optometrist Approval Status : " + approvalStatus);
				referralTypeNotApproved = "Yes";
				System.err.println("Referral T+P : " + referralTypeNotApproved);
			}
//			if (ConstantProperties.OPTOMETRIST_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
//				CommonUtility.sleepControl(2000);
//				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
//				CommonUtility.sleepControl(1000);
//				ReferralDocumentPOM.getInstance().clickTheReason();
//				CommonUtility.sleepControl(1000);
//				CommonUtility.enterFunction();
//				CommonUtility.sleepControl(1000);
//				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
//				approvalStatus = ConstantProperties.OPTOMETRIST_APPROVAL;
//				LOGGER.info("Orthopedic Approval Status : " + approvalStatus);
//				orthopedicStatus = true;
//				orthopedicCount = 1;
//				rejectStatus = true;
//			}
			break;
		case "Pulmonology":

			if (ConstantProperties.PULMONOLOGY_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.PULMONOLOGY_APPROVAL;
				LOGGER.info("Pulmonology Approval Status : " + approvalStatus);

			}
			break;
		case "Dermatology":

			if (ConstantProperties.DERMATOLOGY_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.DERMATOLOGY_APPROVAL;
				LOGGER.info("Dermatology Approval Status : " + approvalStatus);

			}
			break;
		case "ENT":

			if (ConstantProperties.ENT__APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";

				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.ENT__APPROVAL;
				LOGGER.info("ENT Approval Status : " + approvalStatus);

			}
			break;
		case "Psychiatrist":

			if (ConstantProperties.PSYCHIATRIST_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.PSYCHIATRIST_APPROVAL;
				LOGGER.info("Psychiatrist Approval Status : " + approvalStatus);

			}
			break;
		case "SGOT-Repeat":

			if (ConstantProperties.SGOT_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.SGOT_APPROVAL;
				LOGGER.info("SGOT-Repeat Approval Status : " + approvalStatus);

			}

			if (ConstantProperties.SGOT_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.SGOT_APPROVAL;
				LOGGER.info("SGOT-Repeat Approval Status : " + approvalStatus);
				sgotStatus = true;
				sgotCount = 1;
				rejectStatus = true;
			}
			break;
		case "SGPT-Repeat":

			if (ConstantProperties.SGPT_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				CommonUtility.sleepControl(1000);
				approvalStatus = ConstantProperties.SGPT_APPROVAL;
				LOGGER.info("SGPT-Repeat Approval Status : " + approvalStatus);
			}

			if (ConstantProperties.SGPT_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.SGPT_APPROVAL;
				LOGGER.info("SGPT-Repeat Approval Status : " + approvalStatus);
				sgptStatus = true;
				sgptCount = 1;
				rejectStatus = true;
			}
			break;
		case "HbA1c Repeat":

			if (ConstantProperties.GLUCOSE_HBA1C_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.GLUCOSE_HBA1C_APPROVAL;
				LOGGER.info("HbA1c Repeat Approval Status : " + approvalStatus);
			}
//			if (ConstantProperties.GLUCOSE_HBA1C_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
//				CommonUtility.sleepControl(2000);
//				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
//				CommonUtility.sleepControl(1000);
//				ReferralDocumentPOM.getInstance().clickTheReason();
//				CommonUtility.sleepControl(1000);
//				CommonUtility.enterFunction();
//				CommonUtility.sleepControl(1000);
//				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
//				approvalStatus = ConstantProperties.GLUCOSE_HBA1C_APPROVAL;
//				LOGGER.info("HbA1c Approval Status : " + approvalStatus);
//				glucosehbsgcStatus = true;
//				glucosehbsgcCount = 1;
//				rejectStatus = true;
//			}
			break;
		case "Serum Creatinine-Repeat":

			if (ConstantProperties.CREATININE_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {

				Serum_Creatinine_Status = true;
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.CREATININE_APPROVAL;
				LOGGER.info("Serum Creatinine-Repeat Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.CREATININE_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.CREATININE_APPROVAL;
				LOGGER.info("Serum Creatinine-Repeat Approval Status : " + approvalStatus);
				creatinineStatus = true;
				creatinineCount = 1;
				rejectStatus = true;
			}

			break;

		case "Neutralisation (HbsAg) anti HBc":
			if (ConstantProperties.HBSAG_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.HBSAG_APPROVAL;
				referralTypeNotApproved = "Yes";
				LOGGER.info("Neutralisation (HbsAg) anti HBc Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.HBSAG_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.HBSAG_APPROVAL;
				LOGGER.info("Neutralisation (HbsAg) anti HBc Approval Status : " + approvalStatus);
				hbsagStatus = true;
				hbsagCount = 1;
				rejectStatus = true;
			}
			break;
		case "Western Blot for HIV":
			if (ConstantProperties.HIV_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.HIV_APPROVAL;
				LOGGER.info("Western Blot for HIV Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.HIV_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.HIV_APPROVAL;
				LOGGER.info("Western Blot for HIV Approval Status : " + approvalStatus);
				hivStatus = true;
				hivCount = 1;
				rejectStatus = true;
			}
			break;
		case "PCR FOR HCV":
			if (ConstantProperties.ANTI_HCV_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.ANTI_HCV_APPROVAL;
				LOGGER.info("PCR FOR HCV Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.ANTI_HCV_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.ANTI_HCV_APPROVAL;
				LOGGER.info("PCR FOR HCV Approval Status : " + approvalStatus);
				antiHcvStatus = true;
				antiHcvCount = 1;
				rejectStatus = true;
			}
			break;
		case "RPR + Titer Value + TPHA":
			if (ConstantProperties.RPR_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.RPR_APPROVAL;
				LOGGER.info("RPR + Titer Value + TPHA Approval Status : " + approvalStatus);
			}
			if (ConstantProperties.RPR_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(2000);
				ReferralDocumentPOM.getInstance().clickTheRejectIcon();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheReason();
				CommonUtility.sleepControl(1000);
				CommonUtility.enterFunction();
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheSaveForReason();
				approvalStatus = ConstantProperties.RPR_APPROVAL;
				LOGGER.info("RPR + Titer Value + TPHA Approval Status : " + approvalStatus);
				rprStatus = true;
				rprCount = 1;
				rejectStatus = true;
			}
			break;

		case "Anti Hbc(total) (Neutralization Hbsag and Anti HBC Total)":

			if (ConstantProperties.HBSAG_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.HBSAG_APPROVAL;
				LOGGER.info("Anti Hbc(total) (Neutralization Hbsag and Anti HBC Total) : " + approvalStatus);
			}
			break;

		case "Neutralisation (HbsAg) (Neutralization Hbsag and Anti HBC Total)":
			if (ConstantProperties.HBSAG_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.HBSAG_APPROVAL;
				LOGGER.info("Neutralisation (HbsAg) (Neutralization Hbsag and Anti HBC Total) : " + approvalStatus);
			}
			break;
		case "Plain CT CHEST":
			if (ConstantProperties.PLAIN_CT_CHEST_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {
				referralTypeNotApproved = "Yes";
				CommonUtility.sleepControl(1000);
				ReferralDocumentPOM.getInstance().clickTheAcceptIcon();
				approvalStatus = ConstantProperties.PLAIN_CT_CHEST_APPROVAL;
				LOGGER.info("Plain CT Chest : " + approvalStatus);
			}
			break;

		default:
			break;
		}

		return approvalStatus;

	}

	public void resultEntry(int resultCount) throws Throwable {
		String resultEntryValue = "8.4";
		if (resultCount == 1) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult1(resultEntryValue);
			LOGGER.info("Result Entry Value 1  : " + resultEntryValue);

		}

		if (resultCount == 2) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult2(resultEntryValue);
			LOGGER.info("Result Entry Value 2  : " + resultEntryValue);
		}
		if (resultCount == 3) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult3(resultEntryValue);
			LOGGER.info("Result Entry Value 3  : " + resultEntryValue);
		}
		if (resultCount == 4) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult4(resultEntryValue);
			LOGGER.info("Result Entry Value 4  : " + resultEntryValue);
		}
		if (resultCount == 5) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult5(resultEntryValue);
			LOGGER.info("Result Entry Value 5  : " + resultEntryValue);
		}
		if (resultCount == 6) {
			CommonUtility.sleepControl(500);
			AdditionalLabTestPOM.getInstance().enterTheResult6(resultEntryValue);
			LOGGER.info("Result Entry Value 6 : " + resultEntryValue);
		}
	}
}
