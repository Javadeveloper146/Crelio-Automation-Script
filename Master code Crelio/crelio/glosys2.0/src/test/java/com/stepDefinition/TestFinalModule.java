package com.stepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.emailConnection.EmailConnect;
import com.modules.AdditionalLabTest;
import com.modules.CentralGp;
import com.modules.CredentialsController;
import com.modules.MOH;
import com.modules.MOI;
import com.modules.ReferralDocumentApprovalController;
import com.modules.StemzGPCertificatePage;
import com.pageObjects.GpModule;
import com.pageObjects.LabDirector;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.referral.CentralLabAuthority;
import com.referralAndCertificatePom.ReferralDocumentPOM;
import com.referralHandler.AutoReferralHandler;

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

//	@Given("Test Flow")
	public void test() throws Throwable {

		DriverManager.getDriver().get(ConstantProperties.APPURL);
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.groReferral();

		AutoReferralHandler autoReferralHandler = new AutoReferralHandler();
		autoReferralHandler.referralHandlerAutomatic();

}
}