package com.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.LabConstants;
import com.driverManager.DriverManager;
import com.negativeScenarios.NegativeScenario;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.referral.ExternalSpeciality;
import com.referral.GeneralMedicineReferral;
import com.referral.LabConfirmatory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GROReferralStepDefinition {
	private static final Logger LOGGER = LogManager.getLogger(GROReferralStepDefinition.class);

	GROStepDefinition definition = new GROStepDefinition();

	// login Gro
	@Given("enter the userName and Password in GRO Login")
	public void enter_the_user_name_and_password_in_gro_login() throws Throwable {

		// Single Module Run

		CommonUtility.sleepControl(2000);
//		DriverManager.getDriver().get(ConstantProperties.APPURL);

		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().clickTheSignInButton();
		CommonUtility.sleepControl(2000);

		LOGGER.info("GRO Referral Module");
	}

	@When("Select Role Gro")
	public void select_role() throws Throwable {
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheRoleSelction();
		CommonUtility.sleepControl(2000);

		GRODashBoard.getInstance().clickTheGROChennaiOption();

		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
		GRODashBoard.getInstance().clickTheProceedButton();
		CommonUtility.sleepControl(2000);

	}

	@When("Counter Select")
	public void counter_select() throws Throwable {
		definition.select_the_counter_selection();
	}

	@When("Enter The Visa Number")
	public void enter_the_visa_number() throws Throwable {
		CommonUtility.sleepControl(3000);
		GRODashBoard.getInstance().enterTheVisaApplicationNumber(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheValidateVNButton();

	}

	@When("Verify The Biomatric ref")
	public void verify_the_biomatric() throws Throwable {
		CommonUtility.sleepControl(3000);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();
	}

	@When("Print Referral Letter")
	public void print_referral_letter() throws Throwable {

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			// Print Referral Letter
			// Enter The Comment

			if (AppConstants.CARDILOGY_PROBLEM.equals(ConstantProperties.CARDIOLOGY)
					&& AppConstants.DEFORMITY_PROBLEM.equals(ConstantProperties.DEFORMITY)) {

				NegativeScenario negativeScenario = new NegativeScenario();
				// Print Referral Letter
				negativeScenario.cardilogyAndDeformityPrintReferralLetterNegativeScenario();
				// Upload Referral Letter
				negativeScenario.cardilogyAndDeformityUploadReferralLetterNegativeScenario();
			}

			// BP Referral Create Negative Scenario

			else if (ConstantProperties.SYSTOLIC_PRESSURE.equals(AppConstants.ABNORMAL_SYSTOLIC_PRESSURE)
					&& ConstantProperties.DIASTOLIC_PRESSURE.equals(AppConstants.ABNORMAL_DIASTOLIC_PRESSURE)) {

				NegativeScenario negativeScenario = new NegativeScenario();
				negativeScenario.bloodPressureAndBMIReferralCreateNegativeScenario();

			} else if (ConstantProperties.HEIGHT.equals(AppConstants.ABNORMAL_HEIGHT)
					&& ConstantProperties.WEIGHT.equals(AppConstants.ABNORMAL_WEIGHT)) {
//				GeneralMedicineReferral generalMedicineReferral = new GeneralMedicineReferral();
//				generalMedicineReferral.bloodPressureAndBMIReferralCreate();
			}

		}

//______________________________________________________________________________________
		// Happy Flow
		if (AppConstants.NEGATIVE_SCENARIO_NO.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			// Print Referral Letter
			// Enter The Comment
			// Cardilogy And Deformity Print Referral Letter And Upload Referral Letter
			if (AppConstants.CARDILOGY_PROBLEM.equals(ConstantProperties.CARDIOLOGY)
					&& AppConstants.DEFORMITY_PROBLEM.equals(ConstantProperties.DEFORMITY)) {

			}

			// BP Refferal Create
			else if (ConstantProperties.SYSTOLIC_PRESSURE.equals(AppConstants.ABNORMAL_SYSTOLIC_PRESSURE)
					&& ConstantProperties.DIASTOLIC_PRESSURE.equals(AppConstants.ABNORMAL_DIASTOLIC_PRESSURE)) {

				GeneralMedicineReferral generalMedicineReferral = new GeneralMedicineReferral();
				generalMedicineReferral.bloodPressureReferralOnlyCreate();

			} else if (ConstantProperties.HEIGHT.equals(AppConstants.ABNORMAL_HEIGHT)
					&& ConstantProperties.WEIGHT.equals(AppConstants.ABNORMAL_WEIGHT)) {

				GeneralMedicineReferral generalMedicineReferral = new GeneralMedicineReferral();
				generalMedicineReferral.bmiReferralCreateOnly();

			} else if (ConstantProperties.VISION.equals(AppConstants.VISION_ABNORMAL)) {

				GeneralMedicineReferral generalMedicineReferral = new GeneralMedicineReferral();
				generalMedicineReferral.visionReferralCreate();

			} else if (ConstantProperties.COLOR.equals(AppConstants.COLOR_VISION_POOR)) {
				GeneralMedicineReferral generalMedicineReferral = new GeneralMedicineReferral();
				generalMedicineReferral.colorReferralCreate();

			} else if (LabConstants.HIV.equals(AppConstants.HIV_POSITIVE)
					&& LabConstants.RPR == AppConstants.RPR_NON_REACTIVE) {

				LabConfirmatory labConfirmatory = new LabConfirmatory();
				labConfirmatory.hivPositiveRef();
			}

		}

	}

	@When("Print Receipt")
	public void print_receipt() throws Throwable {

		// Click The Print Receipt
		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickThePrintReceipt();

		// Click The Done Button
		CommonUtility.sleepControl(3000);
	
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();

	}

	@When("Gro Feedback")
	public void gp_feedback() throws Throwable {
		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}
}
