package com.referralHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.pageObjects.PrintReferralLetterPOM;
import com.referral.AdditionalLabTest;
import com.referral.ExternalSpeciality;
import com.referral.GROReferralPrintRefAndUploadRefAndPrintReceiptAndFeedback;
import com.referral.GeneralMedicineReferral;
import com.referral.LabConfirmatory;
import com.referral.PrintReceipt;
import com.referral.PrintReferralLetter;
import com.referral.UploadReferralLetter;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GpModuleStepDefinition;

import io.cucumber.java.lu.a;

public class ReferralHandler {
	private static final Logger LOGGER = LogManager.getLogger(ReferralHandler.class);

	public void referralHandler() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
		// GRO Referral Module Create Referral
		// Happy Flow
		if (AppConstants.NEGATIVE_SCENARIO_NO.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			// Print Referral Letter

			// Hiv Ref
			if (LabConstants.HIV.equals(AppConstants.HIV_POSITIVE)
					&& LabConstants.RPR.equals(AppConstants.RPR_NON_REACTIVE)) {
				commonDefinition.groReferral();
				LabConfirmatory labConfirmatory = new LabConfirmatory();
				labConfirmatory.hivPositiveRef();

				// Hiv -- RPR Ref
			} else if (LabConstants.HIV.equals(AppConstants.HIV_POSITIVE)
					&& LabConstants.RPR.equals(AppConstants.RPR_REACTIVE)) {
				commonDefinition.groReferral();
				LabConfirmatory labConfirmatory = new LabConfirmatory();
				labConfirmatory.hivPositiveRef();

			} 
				

			}

		}

	}


