package com.stepDefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.labJuniorFlow.LabJuniorWorkList;
import com.labRetakesEntryFlow.RetakeProcess;
import com.modules.AdditionalLabTest;
import com.modules.ApplicationStatusCheck;
import com.modules.AutoFitReviewer;
import com.modules.CentralGp;
import com.modules.ComformatoryLabTest;
import com.modules.CredentialsController;
import com.modules.MOH;
import com.modules.MOI;
import com.modules.StemzGPCertificatePage;
import com.modules.XrayModule;
import com.pageObjects.CenterManager;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LabDirector;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.PatientProfiles;
import com.pageObjects.XrayModulePOM;
import com.referral.CentralLabAuthority;
import com.referral.LabConfirmatory;
import com.referral.PrintReceipt;
import com.referralHandler.AutoReferralHandler;
import com.tokenVerify.GROReferralTokenVerify;
import com.tokenVerify.XrayRepeatTokenVerify;

import io.cucumber.java.en.Given;

public class TestModule {

	public static boolean NNDX_Status;
	public static boolean NDX_Status;
	public static boolean NND_Status;
	public static boolean NNX_Status;
	public static boolean NN_Status;
	public static boolean NX_Status;

	private static final Logger LOGGER = LogManager.getLogger(TestFinalModule.class);

	public static String serumSpecimenNumberRetest = "BLS1454255917";
	public static String externalSpecimenNumber = "306728E";
	public static String labIdForConfirmatory = "1530";
	public static int totalCount;

	//@Given("Test Flow")
	public void test() throws Throwable {

		DriverManager.getDriver().get(ConstantProperties.APPURL);

		CentralGp centralGp = new CentralGp();
		centralGp.centralGpFlow();

		// MOH

		MOH moh = new MOH();
		moh.mohFlow();

	
		

		

	}

}
