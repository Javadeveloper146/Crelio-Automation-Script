package com.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.emailConnection.EmailConnect;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.AdditionalLabTest;
import com.modules.ApplicationStatusCheck;
import com.modules.CentralGp;
import com.modules.CredentialsController;
import com.modules.MOH;
import com.modules.MOI;
import com.modules.ReferralDocumentApprovalController;
import com.modules.StemzGPCertificatePage;
import com.modules.XrayModule;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GpModule;
import com.pageObjects.LabDirector;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.pageObjects.PatientProfiles;
import com.referral.CentralLabAuthority;
import com.referral.LabConfirmatory;
import com.referralAndCertificatePom.ReferralDocumentPOM;
import com.referralHandler.AutoReferralHandler;
import com.tokenVerify.GROReferralTokenVerify;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestFinalModule {

	public static int count1;
	public static int count2;
	public static int count3;
	public static int count4;
	public static int count5;
	public static int count6;
	public static int count7;
	public static int count8;
	public static int count9;
	public static int count10;

	public static String documentType1;
	public static String documentType2;
	public static String documentType3;
	public static String documentType4;
	public static String documentType5;
	public static String documentType6;
	public static String documentType7;
	public static String documentType8;
	public static String documentType9;
	public static String documentType10;

	public static int totalCountValue;
	public static int value;
	public static int documentTypeValue;

	public static int reducedCount;
	public static String approvalStatus;
	ReferralDocumentApprovalController approvalController = new ReferralDocumentApprovalController();
	private static final Logger LOGGER = LogManager.getLogger(TestFinalModule.class);

	@Given("Test Flow")
	public void test() throws Throwable {

		DriverManager.getDriver().get(ConstantProperties.APPURL);
		
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.groReferral();

		AutoReferralHandler autoReferralHandler = new AutoReferralHandler();
		autoReferralHandler.referralHandlerAutomatic();
		
		NurseModuleStepDefinition definition = new NurseModuleStepDefinition();
		definition.enter_the_user_name_and_password_in_nurse_login();
		definition.select_the_role_selection_nurse();
		definition.select_the_counter_selection_nurse();

		GROReferralTokenVerify groReferralTokenVerify = new GROReferralTokenVerify();
		groReferralTokenVerify.groReferralTokenVerify();
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();

		LOGGER.info(" Specimen Generation : ");

		LabConfirmatory.specimenGenerationBaseOnLocation(ConstantProperties.COUNTRY);
		LOGGER.info("Speciman Genarated Successfully");

		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheSpecimanGenarationButton();

		CommonUtility.sleepControl(7000);
		NurseModule.getInstance().clickTheSpecimanCollectionAllSelectOption();

		// Get The Specimen Number
		LOGGER.info("Specimen Collection : ");

		// Base on The country Specimen Collection
		LabConfirmatory.specimenCollectionBaseOnLocation(ConstantProperties.COUNTRY);

		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheCheckBox();
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheCheckBox();
		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickTheCollectedButton();
		LOGGER.info("Speciman Collected Successfully");

		CommonUtility.sleepControl(5000);
		NurseSampleOutgoingPageObject.getInstance().clickTheSampleOutgoing();
		LOGGER.info("Sample Outgoing : ");

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown50();

		// Location Base Sample Outgoing
		LabConfirmatory.location_Base_Outgoing_Sample(ConstantProperties.COUNTRY);

		// Tech And Gro Information
		NurseModuleStepDefinition definition2 = new NurseModuleStepDefinition();
		definition2.lab_technician_and_gro_info_and_collected();
		// Log Out
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.logOut();

		
		// MOH

		// MOI
		if (ConstantProperties.FINAL_APPROVAL_AUTHORIZE.equals(AppConstants.MOI)) {
			MOI moi = new MOI();
			moi.moiFlow();
		}
		StemzGPCertificatePage gpCertificatePage1 = new StemzGPCertificatePage();
		gpCertificatePage1.referralCertificatePage();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_44)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
	}
}