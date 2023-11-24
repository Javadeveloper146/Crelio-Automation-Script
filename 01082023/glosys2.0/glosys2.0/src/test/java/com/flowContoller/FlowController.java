package com.flowContoller;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.labJuniorFlow.LabJuniorWorkList;
import com.labRetakesEntryFlow.RetakeProcess;
import com.modules.ApplicationStatusCheck;
import com.modules.AutoFitReviewer;
import com.modules.CentralGp;
import com.modules.MOH;
import com.modules.MOHLab;
import com.modules.MOI;
import com.modules.ReferralDocumentApprovalController;
import com.modules.StemzGPCertificatePage;
import com.modules.StemzGpRejectApprovalCentralResultUpload;
import com.modules.XrayModule;
import com.referral.LabConfirmatory;
import com.referralHandler.AutoReferralHandler;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.LabJuniorStepDefinition;
import com.stepDefinition.LabSeniorStepDefinition;
import com.stepDefinition.LabSupervisorStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

import io.cucumber.java.en.Given;

public class FlowController {
	private static final Logger LOGGER = LogManager.getLogger(FlowController.class);

	public static long TotalRunTime;

	public void flowControllerBaseOnTheModule() throws Throwable {
		boolean retakeStatus = LabJuniorWorkList.retakeSpecimenStatus;

		if (retakeStatus == true) {
			// Log in GP
			LOGGER.info("Retake will be initiated");
			LOGGER.info("Retake Process : ");

			RetakeProcess process = new RetakeProcess();
			process.retakeProcess();
		}

		// Automatic
		boolean nurseReferralStatus = NurseModuleStepDefinition.referralStatus;
		boolean gpReferralStatus = GpModuleStepDefinition.referralStatus;
		boolean xrayReferralStatus = XrayModule.referralStatus;
		boolean labReferralStatus = LabJuniorWorkList.referralStatus;

		LOGGER.info("Nurse Referral Status : " + nurseReferralStatus);
		LOGGER.info("Gp  Referral Status : " + gpReferralStatus);
		LOGGER.info("Lab  Referral Status : " + labReferralStatus);
		LOGGER.info("Xray  Referral Status : " + xrayReferralStatus);

		if (nurseReferralStatus == false && gpReferralStatus == false && labReferralStatus == false
				&& xrayReferralStatus == false) {

			LOGGER.info("No Refferral Iniziated");
		} else {
			LOGGER.info("GRO Referral Flow Start");
			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.groReferral();

			AutoReferralHandler autoReferralHandler = new AutoReferralHandler();
			autoReferralHandler.referralHandlerAutomatic();

		}

		// Lab Comformatory Referrral Process Print Ref Upload Ref
		// Include Beta Hcg Positive
//		boolean additionalLabTestStatus = LabJuniorWorkList.additionalLabTest;

		if (LabJuniorWorkList.labConfirmatory == false
				&& XrayModule.Xray_MOH_Fit_With_Ref_Comformatory_Status == false) {
		} else {
			LOGGER.info("Lab Confirmatory Process: ");
			LabConfirmatory confirmatory = new LabConfirmatory();
			confirmatory.hivPositiveRef();

		}
		boolean nurseCertificateReferralStatus = NurseModuleStepDefinition.referralCertificateStatus;
		boolean gpCertificateReferralStaus = GpModuleStepDefinition.referralCertificateStatus;
		boolean xrayCertificateReferralStaus = XrayModule.referralCertificateStatus;
		boolean labJuniorCertificateReferralStatus = LabJuniorWorkList.referralCertificateStatus;

		HashMap<String, Boolean> getTheValue = new HashMap<String, Boolean>();
		getTheValue.put("Nurse Module Refferral Status", nurseCertificateReferralStatus);
		getTheValue.put("Stemz Gp Module Refferral Status", gpCertificateReferralStaus);
		getTheValue.put("Xray Module Refferral Status", xrayCertificateReferralStaus);
		getTheValue.put("Lab Junoir Module Refferral Status", labJuniorCertificateReferralStatus);

		LOGGER.info("Certificate Refferral Status : " + getTheValue);

		if (nurseCertificateReferralStatus == false && gpCertificateReferralStaus == false
				&& xrayCertificateReferralStaus == false && labJuniorCertificateReferralStatus == false) {
			LOGGER.info("Certificate Refferral Status is False");
		} else {
			// Certificate Page Only Referral Process Should be Allowed

			StemzGPCertificatePage gpCertificatePage = new StemzGPCertificatePage();
			gpCertificatePage.referralCertificatePage();

			// Central Gp
			CentralGp centralGp = new CentralGp();
			centralGp.centralGpFlow();

			// MOH

			MOH moh = new MOH();
			moh.mohFlow();

			// MOI
			if (ConstantProperties.FINAL_APPROVAL_AUTHORIZE.equals(AppConstants.MOI)) {
				MOI moi = new MOI();
				moi.moiFlow();
			}

		}

		// Gp Reject Flow
		boolean rejectStatus = ReferralDocumentApprovalController.rejectStatus;
		if (rejectStatus == true) {

			StemzGpRejectApprovalCentralResultUpload andGroRef = new StemzGpRejectApprovalCentralResultUpload();
			andGroRef.stemzGpApprovalRejectAndGroRef();
		}

		// AutoFit Reviewer
		if (nurseCertificateReferralStatus == false && gpCertificateReferralStaus == false
				&& xrayCertificateReferralStaus == false && labJuniorCertificateReferralStatus == false) {

			LOGGER.info("Autofit Reviwer ");
			AutoFitReviewer autoFitReviewer = new AutoFitReviewer();
			autoFitReviewer.autoFitReviewer();

			MOH moh = new MOH();
			// Assign to Moi
	
			moh.mohAutofitReviwer();


			// Autofit Reviwer
			// Authorized
			if (ConstantProperties.MOH_FINAL_STATUS.equals(AppConstants.UN_FIT)) {

			} else if (ConstantProperties.MOI_FINAL_STATUS.equals(AppConstants.UN_FIT)) {

			} else {
				LOGGER.info("Autofit Reviwer ");
				autoFitReviewer.autofitReviwerAuthorized();
			}

			// MOH Fit
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_1)) {
				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			// MOI Fit
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_2)) {
				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			// MOH UnFit
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_3)) {
				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}
			// MOI UnFit
			if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_4)) {
				ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
				applicationStatusCheck.applicationStatusCheck();
			}

			// UnFit

			// All Modue Time
			long groTime = GROStepDefinition.groTotalSeconds;
			long nurseTime = NurseModuleStepDefinition.nurseTotalSeconds;
			long stemzGpTime = GpModuleStepDefinition.gpTotalSeconds;
			long xrayTime = XrayModule.xrayTotalSeconds;
			long juniorTime = LabJuniorStepDefinition.juniorTotalSeconds;
			long seniorTime = LabSeniorStepDefinition.seniorTotalSeconds;
			long supervisorTime = LabSupervisorStepDefinition.supersivorTotalSeconds;
			long autofitReviewer = AutoFitReviewer.autofitReviwerTotalSeconds;

			LOGGER.info("GRO Run Time : " + groTime);
			LOGGER.info("Nurse Run Time : " + nurseTime);
			LOGGER.info("Stemz Gp Run Time : " + stemzGpTime);
			LOGGER.info("Xray Run Time : " + xrayTime);
			LOGGER.info("Lab Junior Run Time : " + juniorTime);
			LOGGER.info("Lab Senior Run Time : " + seniorTime);
			LOGGER.info("Lab Supervisor Run Time : " + supervisorTime);
			LOGGER.info("Autofit Reviwer Run Time : " + autofitReviewer);

			ArrayList<Long> allValue = new ArrayList<>();
			allValue.add(groTime);
			allValue.add(nurseTime);
			allValue.add(stemzGpTime);
			allValue.add(xrayTime);
			allValue.add(juniorTime);
			allValue.add(seniorTime);
			allValue.add(supervisorTime);
			allValue.add(autofitReviewer);

			TotalRunTime = 0;

			for (long number : allValue) {
				TotalRunTime += number;

			}

			LOGGER.info("Total Module Run Time : " + TotalRunTime);
		}

	}

}
