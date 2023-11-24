package com.commonUtility;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.referral.ExternalSpeciality;

public class Validation {
	private static final Logger LOGGER = LogManager.getLogger(Validation.class);

	public boolean configurationPropertiesFileValidation() {

		System.out.println("Configuration Properties Value Checking ....");

		if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_YES)) {

		} else if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_MAYBE)) {

		} else if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {

		} else {
			System.err.println(
					"[ERROR] : Spelling Mistake ApplicantBelievesPregnant : " + ConstantProperties.PREGNANT_STATUS);

			return false;
		}
		String visaNumber = ConstantProperties.VISA_NUMBER;

		if (visaNumber.length() == 12) {

		} else {
			System.err.println("[COUNT ERROR] Please enter valid visa application number " + "--" + visaNumber.length()
					+ " Number Available ");
			return false;
		}

		if (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS
				.equals(AppConstants.VACCINATION_DOCUMENT_STATUS_YES)) {

		} else if (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS
				.equals(AppConstants.VACCINATION_DOCUMENT_STATUS_NO)) {

		} else {
			System.err.println("[ERROR] : 'Yes' & 'No' Condition Only Allowed = " + " "
					+ ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS);
			return false;
		}

		if (ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS.equals(AppConstants.REFERRAL_DOCUMENT_STATUS_YES)) {

		} else if (ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS
				.equals(AppConstants.REFERRAL_DOCUMENT_STATUS_NO)) {

		} else {
			System.err.println("[ERROR] : 'Yes' & 'No' Condition Only Allowed = " + " "
					+ ConstantProperties.REFFERRAL_DOCUMENT_UPLOAD_STATUS);
			return false;
		}

		String height = ConstantProperties.HEIGHT;
		String weight = ConstantProperties.WEIGHT;
		int numberHeight = Integer.parseInt(height);
		int numberWeight = Integer.parseInt(weight);

		if (numberHeight == 160 && numberWeight == 60) {

		} else if (numberHeight == 200 && numberWeight == 200) {

		} else {
			System.err.println("[INVALID ERROR] : Invalid Values Your entered 'Height' = " + ConstantProperties.HEIGHT
					+ " 'Weight' =" + ConstantProperties.WEIGHT + " Please enter Valid Number ");
			return false;
		}

		if (ConstantProperties.VISION.equals(AppConstants.VISION_NORMAL)) {

		} else if (ConstantProperties.VISION.equals(AppConstants.VISION_ABNORMAL)) {

		} else {
			System.err.println(
					"[SPL ERROR] : Spelling Mistake" + "Your Enter Value Vision  is = " + ConstantProperties.VISION);
			return false;

		}
		if (ConstantProperties.COLOR.equals(AppConstants.COLOR_VISION_NORMAL)) {

		} else if (ConstantProperties.COLOR.equals(AppConstants.COLOR_VISION_POOR)) {

		} else {
			System.err.println("[SPL ERROR] :  Spelling Mistake" + "Your Enter Value Color Vision  is = "
					+ ConstantProperties.COLOR);
			return false;
		}

		String sysPressure = ConstantProperties.SYSTOLIC_PRESSURE;
		String diaPressure = ConstantProperties.DIASTOLIC_PRESSURE;
		int numberSys = Integer.parseInt(sysPressure);
		int numberDia = Integer.parseInt(diaPressure);

		if (numberSys == 120 && numberDia == 80) {

		} else if (numberSys == 200 && numberDia == 160) {

		} else {
			System.err.println("[INVALID ERROR] :  Invalid Values Your entered 'SysPressure' = "
					+ ConstantProperties.SYSTOLIC_PRESSURE + " 'DiaPressure' = " + ConstantProperties.DIASTOLIC_PRESSURE
					+ " Please enter Valid Number ");
			return false;
		}

		if (ConstantProperties.CARDIOLOGY.equals(AppConstants.CARDILOGY_PROBLEM)) {

		} else if (ConstantProperties.CARDIOLOGY.equals(AppConstants.CARDILOGY_NO_ISSUE)) {

		} else {
			System.err.println(
					"[SPL ERROR] : Spelling Mistake" + " Cardiology Comments is = " + ConstantProperties.CARDIOLOGY);
			return false;
		}

		if (ConstantProperties.DEFORMITY.equals(AppConstants.DEFORMITY_NO_ISSUE)) {

		} else if (ConstantProperties.DEFORMITY.equals(AppConstants.DEFORMITY_PROBLEM)) {

		} else {
			System.err.println(
					"[SPL ERROR] : Spelling Mistake" + " Deformity Comments  is = " + ConstantProperties.DEFORMITY);
			return false;
		}

		if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.MOH_FIT_XRAY_RESULT)) {

		} else if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.MOH_FIT_REF_XRAY_RESULT)) {

		} else if (ConstantProperties.XRAY_RESULTS.equals(AppConstants.QC_REJECT_XRAY_RESULT)) {

		}

		else {
			System.err.println("[SPL ERROR] Configuration Properties : Spelling Mistake"
					+ " Xray Results Comments  is = " + ConstantProperties.XRAY_RESULTS);
			return false;
		}

		if (LabConstants.HIV.equals(AppConstants.HIV_NEGATIVE)) {

		} else if (LabConstants.HIV.equals(AppConstants.HIV_POSITIVE)) {

		} else {
			System.err.println(
					"[SPL ERROR] Lab Properties : Spelling Mistake" + " HIV Comments  is = " + LabConstants.HIV);
			return false;
		}

		if (LabConstants.AntiHCV.equals(AppConstants.ANTI_HCV_NEGATIVE)) {

		} else if (LabConstants.AntiHCV.equals(AppConstants.ANTI_HCV_POSITIVE)) {

		} else {
			System.err.println("[SPL ERROR] Lab Properties : Spelling Mistake" + " Anti HCV Comments  is = "
					+ LabConstants.AntiHCV);
			return false;
		}

		if (LabConstants.HBsAg.equals(AppConstants.HBsAg_NEGATIVE)) {

		} else if (LabConstants.HBsAg.equals(AppConstants.HBsAg_POSITIVE)) {

		} else {
			System.err.println(
					"[SPL ERROR] Lab Properties : Spelling Mistake" + " HBsAg Comments  is = " + LabConstants.HBsAg);
			return false;
		}

		if (LabConstants.RPR.equals(AppConstants.RPR_NON_REACTIVE)) {

		} else if (LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {

		} else {
			System.err.println(
					"[SPL ERROR] Lab Properties : Spelling Mistake" + " RPR Comments  is = " + LabConstants.RPR);
			return false;
		}

		String haemoglobin = LabConstants.HAEMOGLOBIN;
		int numberHaemoglobin = Integer.parseInt(haemoglobin);

		if (numberHaemoglobin == 11) {

		} else if (numberHaemoglobin == 06) {

		}

		else if (numberHaemoglobin == 19) {

		} else {
			System.err.println("[INVAILD ERROR] Lab Properties : Invaild Number" + " Haemoglobin Value  is = "
					+ LabConstants.HAEMOGLOBIN);
			return false;
		}

		String sgot = LabConstants.SGOT;
		int numberSgot = Integer.parseInt(sgot);

		if (numberSgot == 22) {

		} else if (numberSgot == 200) {

		} else {
			System.err.println(
					"[INVAILD ERROR] Lab Properties : Invaild Number" + " SGOT Value  is = " + LabConstants.SGOT);
			return false;
		}

		String sgpt = LabConstants.SGPT;
		if (sgpt.isBlank()) {

			System.err.println("[ERROR] Lab Properties : SGPT Value is Empty ...Please Enter The SGPT Value");

		}
		int numberSgpt = Integer.parseInt(sgpt);

		if (numberSgpt == 44) {

		} else if (numberSgpt == 200) {

		}

		else {
			System.err.println(
					"[INVAILD ERROR] Lab Properties : Invaild Number" + " SGPT Value  is = " + LabConstants.SGPT);
			return false;
		}

		String creaatinine = LabConstants.CREATININE;
		int numberCreaatinine = Integer.parseInt(creaatinine);

		if (numberCreaatinine == 1) {

		} else if (numberCreaatinine == 2) {

		} else {
			System.err.println("[INVAILD ERROR] Lab Properties : Invaild Number" + " CREATININE Value  is = "
					+ LabConstants.CREATININE);
			return false;
		}
		String glucose = LabConstants.GLUCOSE;
		int numberGlucose = Integer.parseInt(glucose);

		if (numberGlucose == 80) {

		} else if (numberGlucose == 220) {

		} else {
			System.err.println("[INVAILD ERROR]  Lab Properties : Invaild Number" + " GLUCOSE Value  is = "
					+ LabConstants.GLUCOSE);
			return false;
		}
		// Stemz Cerfiticate Page
		if (ConstantProperties.GENERAL_MEDICINE_APPROVAL.equals(AppConstants.APPROVAL_ACCEPT)) {

		} else if (ConstantProperties.GENERAL_MEDICINE_APPROVAL.equals(AppConstants.APPROVAL_REJECT)) {

		} else if (ConstantProperties.GENERAL_MEDICINE_APPROVAL.isEmpty()) {
			System.err.println("[INVAILD ERROR] General Medicine Approval Value Is Empty [ Enter Accept Or Reject ]");

			return false;
		} else {
			System.err.println("[SPL ERROR] Invaild Argument Or InCorrect Value : "
					+ ConstantProperties.GENERAL_MEDICINE_APPROVAL);
			return false;
		}

		// MOH And MOI Validation
		if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.FIT)
				&& ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.FIT)) {
			System.err.println(
					"MOH Final Status and MOI Final Status Input Value Error Please enter Only one Input Value assign");
			return false;
		}

		else if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.FIT)
				&& ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			System.err.println(
					"MOH Final Status and MOI Final Status Input Value Error Please enter Only one Input Value assign");
			return false;
		} else if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)
				&& ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {
			System.err.println(
					"MOH Final Status and MOI Final Status Input Value Error Please enter Only one Input Value assign");
			return false;
		} else if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)
				&& ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.FIT)) {
			System.err.println(
					"MOH Final Status and MOI Final Status Input Value Error Please enter Only one Input Value assign");
			return false;

		}
		return true;
	}

}
