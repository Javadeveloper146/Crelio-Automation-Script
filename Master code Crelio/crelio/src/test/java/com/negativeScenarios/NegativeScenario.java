package com.negativeScenarios;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROReferralStepDefinition;
import com.stepDefinition.GROStepDefinition;

public class NegativeScenario {
	private static final Logger LOGGER = LogManager.getLogger(GROReferralStepDefinition.class);
	private static final Logger LOGGER1 = LogManager.getLogger(GROStepDefinition.class);
	public void loginNegativeScenario() throws Throwable {
		LOGGER1.info("Glosys2.0 Application Negative Scenario Running.........");

		// Case :1 Click The Sign Button
		LOGGER1.info("Case" + ":" + 1 + ": " + "Click The Sign in Button");
		LoginPage.getInstance().clickTheSignInButton();

		// UserName Error Message
		LOGGER1.error(LoginPage.getInstance().userNameRequiredErrorMessage());

		// Password Error Message
		String errorPasswordMessage = LoginPage.getInstance().passwordRequiredErrorMessage();
		LOGGER1.error(errorPasswordMessage);

		// Case :2 Only Enter The UserName And Click The Sign Button
		LOGGER1.info("Case" + ":" + 2 + ": " + "Only Enter The UserName And Click The Signin Button");

		CommonUtility.sleepControl(2000);
		// Click The UserNameTextBox
		// LoginPage.getInstance().clickTheUserNameTextBox();

		// Enter The User Name
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		LOGGER1.info("User Name" + ": " + ConstantProperties.USERNAME);

		// Password error
		String errorPasswordMessage1 = LoginPage.getInstance().passwordRequiredErrorMessage();
		CommonUtility.sleepControl(2000);

		// Click The Sign In Button
		LoginPage.getInstance().clickTheSignInButton();
		LOGGER1.error(errorPasswordMessage1);

		// Case :3 Only Enter The Password And Click The Signin Button
		LOGGER1.info("Case" + ":" + 3 + ": " + "Only Enter The Password And Click The Signin Button");

		// Clear The UserName
		LoginPage.getInstance().clearTheUserName();

		WebElement textbox1 = DriverManager.getDriver().findElement(By.xpath("//*[@formcontrolname='username']"));
		textbox1.sendKeys(Keys.SPACE);
		WebElement textbox = DriverManager.getDriver().findElement(By.xpath("//*[@formcontrolname='username']"));
		textbox.sendKeys(Keys.BACK_SPACE);
		// Click The Password Text Box
		CommonUtility.sleepControl(2000);

		// Enter The Password
		// CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		LOGGER1.info("Password" + ": " + ConstantProperties.PASSWORD);

		// Error User Name
		LOGGER1.error(LoginPage.getInstance().userNameRequiredErrorMessage());

		// Click The Sign In Button
		LoginPage.getInstance().clickTheSignInButton();

		// Clear The Password
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().clearThePassword();

		// Click The Sign in button
		LoginPage.getInstance().clickTheSignInButton();

		// Enter The Incorrect UserName and Password
		LOGGER1.info("Case" + ":" + 4 + ": " + "Enter The Incorrect Username And Password");
		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().enterTheUserName(AppConstants.INCORRECT_USERNAME);
		LOGGER1.info("User Name" + ": " + AppConstants.INCORRECT_USERNAME);
		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().enterThePassword(AppConstants.INCORRECT_PASSWORD);
		LOGGER1.info("Password" + ": " + AppConstants.INCORRECT_PASSWORD);
		CommonUtility.sleepControl(2000);
		LoginPage.getInstance().clickTheSignInButton();
		CommonUtility.sleepControl(4000);
		LOGGER1.error("Incorrect username/password");

		// Clear The Username And Password
		LoginPage.getInstance().clearTheUserName();
		LoginPage.getInstance().clearThePassword();
	}
	
	
	
	
	
	public void cardilogyAndDeformityPrintReferralLetterNegativeScenario() throws Throwable {
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		LOGGER.error("Please enter comments #1");
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);
		LOGGER.info("Cardilogy Print Referral Letter saved successfully ");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();
		CommonUtility.sleepControl(2000);
		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().clickThePrintIconDeformity();
		LOGGER.error("Please enter comments #2");
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance()
				.deformityenterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		
	}

	
	public void cardilogyAndDeformityUploadReferralLetterNegativeScenario() throws Throwable {
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
//				// Click The View Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewIcon();
		//
//				// Click The View Document Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewDocumentIcon();
		//
//				CommonDefinition commonDefinition111 = new CommonDefinition();
//				commonDefinition111.windowsPageHanding();
		//
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheCloseIcon();

		// Upload Referral Letter
		// Click The Upload Icon For Upload referral Document Deformity
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageDeformity();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation1 = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection1 = new StringSelection(vaccinationDocumentPathLocation1);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		CommonDefinition commonDefinition111 = new CommonDefinition();
		commonDefinition111.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();

		
		
	}
	
	public void bloodPressureBpOnlyCreateNegativeScenario() throws Throwable {
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		LOGGER.error("Please enter comments #1");
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);
		LOGGER.info("General Medicine Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();
		CommonUtility.sleepControl(2000);
		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().clickThePrintIconDeformity();
		LOGGER.error("Please enter comments #2");
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().deformityenterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Bp Recheck Print Referral Letter saved Successfully");
//**************************************************************************************************
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("General Medicine Upload Referral Letter Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
//				// Click The View Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewIcon();
		//
//				// Click The View Document Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewDocumentIcon();
		//
//				CommonDefinition commonDefinition111 = new CommonDefinition();
//				commonDefinition111.windowsPageHanding();
		//
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheCloseIcon();

		// Upload Referral Letter
		// Click The Upload Icon For Upload referral Document Deformity
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageDeformity();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation1 = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection1 = new StringSelection(vaccinationDocumentPathLocation1);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		CommonDefinition commonDefinition111 = new CommonDefinition();
		commonDefinition111.uploadDocumentRobotFunction();
		LOGGER.info("Bp Recheck Upload Referral Letter Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
	}

	

	public void bloodPressureAndBMIReferralCreateNegativeScenario() {

	}

	
	public void colorReferralCreateNegativeScenario() throws Throwable {
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		LOGGER.error("Please enter comments #1");
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);
		LOGGER.info("Ophthalmologist Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();
		CommonUtility.sleepControl(2000);
		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().clickThePrintIconDeformity();
		LOGGER.error("Please enter comments #2");
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().deformityenterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Vision Recheck Print Referral Letter saved Successfully");
//**************************************************************************************************
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("Ophthalmologist Upload Referral Letter Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
//				// Click The View Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewIcon();
		//
//				// Click The View Document Icon
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheViewDocumentIcon();
		//
//				CommonDefinition commonDefinition111 = new CommonDefinition();
//				commonDefinition111.windowsPageHanding();
		//
//				CommonUtility.sleepControl(3000);
//				GROReferral.getInstance().clickTheCloseIcon();

		// Upload Referral Letter
		// Click The Upload Icon For Upload referral Document Deformity
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageDeformity();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation1 = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection1 = new StringSelection(vaccinationDocumentPathLocation1);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		CommonDefinition commonDefinition111 = new CommonDefinition();
		commonDefinition111.uploadDocumentRobotFunction();
		LOGGER.info("Vision Recheck Print Referral Letter saved Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();

	}
	public void visionReferralNegativeScenrio() throws Throwable {
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();

		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		LOGGER.error("Please enter comments #1");
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);
		LOGGER.info("Ophthalmologist Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();
		CommonUtility.sleepControl(2000);
		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().clickThePrintIconDeformity();
		LOGGER.error("Please enter comments #2");
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().deformityenterThePrintReferralLetterComment(AppConstants.COMMON_COMMENTS);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Vision Recheck Print Referral Letter saved Successfully");
//**************************************************************************************************
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage1());
		CommonUtility.sleepControl(1000);
		LOGGER.error(GROReferral.getInstance().getErrorMessage2());
		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.COMMON_COMMENTS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("Ophthalmologist Upload Referral Letter Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();

	}
	
}
