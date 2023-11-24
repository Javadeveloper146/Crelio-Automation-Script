package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.PatientProfiles;
import com.stepDefinition.CommonDefinition;

public class GeneralMedicineReferral {
	private static final Logger LOGGER = LogManager.getLogger(GeneralMedicineReferral.class);

	public void bloodPressureReferralOnlyCreate() throws Throwable {
		
		
		LOGGER.info("Print Referral Letter");
		LOGGER.info("Referral : External Speciality");
		LOGGER.info("Speciality :Blood pressure Check, General Medicine");
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.BP_DOCUMENT_NAME);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();
		LOGGER.info("General Medicine Print Referral Letter saved Successfully");

		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().deformityenterThePrintReferralLetterComment(AppConstants.BP_DOCUMENT_NAME);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Bp Recheck Print Referral Letter saved Successfully");
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		LOGGER.info("Upload Referral Document : ");
		LOGGER.info("Referral : External Speciality");
		LOGGER.info("Speciality :Blood pressure Check, General Medicine");
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(4000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.BP_DOCUMENT_NAME);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.BP_COMMENTS);

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


		// Upload Referral Letter
		// Click The Upload Icon For Upload referral Document Deformity
		CommonUtility.sleepControl(5000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageDeformity();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.BP_DOCUMENT_NAME);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.BP_COMMENTS);

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

		// Click The Print Receipt
		LOGGER.info("Print Receipt : ");

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickThePrintReceipt();

		// CLick The Print Receipt Icon
		CommonUtility.sleepControl(3000);
	//	GROReferral.getInstance().clickThePrintReceiptIcon();

		CommonUtility.sleepControl(2000);
		CommonDefinition commonDefinition2 = new CommonDefinition();
		commonDefinition2.windowsPageHanding();
//				// Click The Done Button
//				CommonUtility.sleepControl(3000);
//				GpModule.getInstance().clickTheDoneButton();
//				CommonUtility.sleepControl(3000);

		//

		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		// Log Out

		commonDefinition.logOut();
		
	}

	public void bmiReferralCreateOnlyNegative() {

	}

	public void bmiReferralCreateOnly() throws Throwable {
		LOGGER.info("Print Referral Letter: ");
		LOGGER.info("Referral : " + "External Speciality");
		LOGGER.info("Speciality : " + "General Medicine");
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.BMI_DOCUMENT_NAME);
		LOGGER.info("General Medicine Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThebmiPrintIcon();
		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		LOGGER.info("Upload Referral Document : ");
		LOGGER.info("Referral : " + "External Speciality");
		LOGGER.info("Speciality : " + "General Medicine");
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.BMI_DOCUMENT_NAME);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.BMI_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();
		LOGGER.info("(BMI) Speciality document uploaded successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		// Click The Print Receipt
		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickThePrintReceipt();

		// Click The Done Button
		CommonUtility.sleepControl(4000);
		GpModule.getInstance().clickTheDoneButton();

		// Click Yes
		CommonUtility.sleepControl(2000);
		PatientProfiles.getInstance().clickTheYesOption();

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		// Log Out
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

	}

	public void visionReferralCreate() throws Throwable {
		LOGGER.info("Print Referral Letter: ");
		LOGGER.info("Referral: External Speciality");
		LOGGER.info("Speciality: Ophthalmologist, Vision Recheck");

		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().enterThePrintReferralLetterComment(AppConstants.VISION_DOCUMENT_NAME);
		LOGGER.info("Ophthalmologist Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();

		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().deformityenterThePrintReferralLetterComment(AppConstants.VISION_DOCUMENT_NAME);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Vision Recheck Print Referral Letter saved Successfully");
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		LOGGER.info("Upload Referral Document : ");
		LOGGER.info("Referral: External Speciality");
		LOGGER.info("Speciality: Ophthalmologist, Vision Recheck");
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheDocumentName(AppConstants.VISION_DOCUMENT_NAME);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().EnterTheComments(AppConstants.VISION_COMMENTS);

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
		// Click The Print Receipt
		CommonUtility.sleepControl(3000);
		LOGGER.info("Print Receipt : ");
		GpModule.getInstance().clickThePrintReceipt();

		// Click The Done Button
		CommonUtility.sleepControl(4000);
		GpModule.getInstance().clickTheDoneButton();

		// Click Yes
		CommonUtility.sleepControl(2000);
		PatientProfiles.getInstance().clickTheYesOption();

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		// Log Out

		commonDefinition.logOut();

	}

	public void colorReferralCreate() throws Throwable {
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(2000);
		//GROReferral.getInstance().enterThePrintReferralLetterComment(ConstantProperties.CLINICAL_NOTES);
		LOGGER.info("Ophthalmologist Print Referral Letter saved Successfully");
		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconCardilogy();

		// Close The Print Letter
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.windowsPageHanding();

		CommonUtility.sleepControl(2000);
	//	GROReferral.getInstance().deformityenterThePrintReferralLetterComment(ConstantProperties.CLINICAL_NOTES);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickThePrintIconDeformity();

		// Close The Print Letter page
		CommonDefinition commonDefinition1 = new CommonDefinition();
		commonDefinition1.windowsPageHanding();
		LOGGER.info("Vision Recheck Print Referral Letter saved Successfully");
		// Upload Referral Letter
		// Click The Upload Refferal Document for Cardilogy
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheUploadReferralDocument();

		// Click The Upload Icon For Upload referral Document
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageCardilogy();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
	//	GROReferral.getInstance().EnterTheDocumentName(ConstantProperties.PREVOIUS_ILLNESS_DETAILS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
	//	GROReferral.getInstance().EnterTheComments(ConstantProperties.PREVOIUS_ILLNESS_DETAILS);

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

//	// Click The View Icon
//	CommonUtility.sleepControl(3000);
//	GROReferral.getInstance().clickTheViewIcon();
//
//	// Click The View Document Icon
//	CommonUtility.sleepControl(3000);
//	GROReferral.getInstance().clickTheViewDocumentIcon();
//
//	CommonDefinition commonDefinition111 = new CommonDefinition();
//	commonDefinition111.windowsPageHanding();
//
//	CommonUtility.sleepControl(3000);
//	GROReferral.getInstance().clickTheCloseIcon();

		// Upload Referral Letter
		// Click The Upload Icon For Upload referral Document Deformity
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheUploadIconInUploadReferralDocumentPageDeformity();

		// Enter The Document Name
		CommonUtility.sleepControl(2000);
//		GROReferral.getInstance().EnterTheDocumentName(ConstantProperties.PREVOIUS_ILLNESS_DETAILS);

		// Enter The Comments
		CommonUtility.sleepControl(2000);
	//	GROReferral.getInstance().EnterTheComments(ConstantProperties.PREVOIUS_ILLNESS_DETAILS);

		// Click The Browse Option
		CommonUtility.sleepControl(2000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(2000);
		String vaccinationDocumentPathLocation1 = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection1 = new StringSelection(vaccinationDocumentPathLocation1);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
		CommonDefinition commonDefinition111 = new CommonDefinition();
		commonDefinition111.uploadDocumentRobotFunction();
		LOGGER.info("Vision Recheck Upload Referral Letter Successfully");
		// Click The Close icon
		CommonUtility.sleepControl(6000);
		GROReferral.getInstance().clickTheCloseIcon();
		// Click The Print Receipt
		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickThePrintReceipt();

		// Click The Done Button
		CommonUtility.sleepControl(4000);
		GpModule.getInstance().clickTheDoneButton();

		// Click Yes
		CommonUtility.sleepControl(2000);
		PatientProfiles.getInstance().clickTheYesOption();

		CommonUtility.sleepControl(3000);
		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		// Log Out

		commonDefinition.logOut();

	}

	public void bloodPressureAndBMIReferralCreate() {

	}

}