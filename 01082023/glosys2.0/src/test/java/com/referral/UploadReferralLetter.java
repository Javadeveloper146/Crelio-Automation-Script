package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.pageObjects.GROReferral;
import com.pageObjects.PrintReferralLetterPOM;
import com.pageObjects.UploadReferralLetterPOM;
import com.stepDefinition.CommonDefinition;

public class UploadReferralLetter {
	private static final Logger LOGGER = LogManager.getLogger(UploadReferralLetter.class);

	public static String documentOne;
	public static String documentTwo;
	public static String documentThree;
	public static String documentFour;
	public static String documentFive;
	public static String documentSix;
	public static String documentSeven;
	public static String documentEight;
	public static String documentNine;
	public static String documentTen;

	public void oneUploadRefferralLetter() throws Throwable {

		LOGGER.info("Upload Referral Letter Page :");
		CommonUtility.sleepControl(1000);

		// Get The Document Type
		documentOne = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameOne();
		LOGGER.info("Document Type : " + documentOne);

		// Click The First Upload Icon
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheFisrtUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentOne);

		// Enter The Comments
		CommonUtility.sleepControl(200);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(1000);
		GROReferral.getInstance().clickTheBrowseOption();
		CommonUtility.sleepControl(500);
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon

		CommonUtility.sleepControl(3500);
		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentOne + " document uploaded successfully");

	}

	public void twoUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(500);
		// Get The Document Type
		documentTwo = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameTwo();

		LOGGER.info("Document Type : " + documentTwo);

		// Click The First Upload Icon

		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheSecondUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentTwo);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentTwo + " document uploaded successfully");

	}

	public void threeUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentThree = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameThree();

		LOGGER.info("Document Type : " + documentThree);

		// Click The First Upload Icon
		CommonUtility.sleepControl(700);
		UploadReferralLetterPOM.getInstance().clickTheThreeUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentThree);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3500);
		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentThree + " document uploaded successfully");

	}

	public void fourUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(1000);

		// Get The Document Type
		documentFour = UploadReferralLetterPOM.getInstance().GetDoumentTypeNamefour();
		LOGGER.info("Document Type : " + documentFour);

		// Click The First Upload Icon
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheFourUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentFour);

		// Enter The Comments
		CommonUtility.sleepControl(200);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3500);
		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentFour + " document uploaded successfully");
	}

	public void fiveUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentFive = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameFive();

		LOGGER.info("Document Type : " + documentFive);

		// Click The First Upload Icon
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheFiveUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentFive);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3500);

		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentFive + " document uploaded successfully");
	}

	public void sixUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentSix = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameSix();

		LOGGER.info("Document Type : " + documentSix);

		// Click The First Upload Icon
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheSixUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentSix);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3500);

		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentSix + " document uploaded successfully");
	}

	public void sevenUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentSeven = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameSeven();

		LOGGER.info("Document Type : " + documentSeven);

		// Click The First Upload Icon
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheSevenUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentSeven);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3500);

		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentSeven + " document uploaded successfully");

	}

	public void eightUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentEight = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameEight();

		LOGGER.info("Document Type : " + documentEight);

		// Click The First Upload Icon
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheEightUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentEight);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentEight + " document uploaded successfully");

	}

	public void nineUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		CommonUtility.sleepControl(1000);
		// Get The Document Type
		documentNine = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameNine();

		LOGGER.info("Document Type : " + documentNine);

		// Click The First Upload Icon
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheNineUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentNine);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3000);

		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentNine + " document uploaded successfully");

	}

	public void tenUploadReferralLetter() throws Throwable {
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown400();
		// Get The Document Type
		documentTen = UploadReferralLetterPOM.getInstance().GetDoumentTypeNameTen();

		LOGGER.info("Document Type : " + documentTen);

		// Click The First Upload Icon

		CommonUtility.sleepControl(2000);
		UploadReferralLetterPOM.getInstance().clickTheTenUploadIcon();

		// Click The Document Type
		CommonUtility.sleepControl(1000);
		UploadReferralLetterPOM.getInstance().clickTheDocumentType();
		CommonUtility.sleepControl(500);
		UploadReferralLetterPOM.getInstance().clickTheDocumentTypeAsPerTheDocument();

		// Enter The Document Name
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheDocumentName(documentTen);

		// Enter The Comments
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().EnterTheComments(AppConstants.COMMON_COMMENTS);

		// Click The Browse Option
		CommonUtility.sleepControl(500);
		GROReferral.getInstance().clickTheBrowseOption();
		String vaccinationDocumentPathLocation = AppConstants.GRO_REFERRAL_CALL_LOG_LETTER_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);
		CommonUtility.sleepControl(500);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		CommonDefinition commonDefinition11 = new CommonDefinition();
		commonDefinition11.uploadDocumentRobotFunction();

		// Click The Close icon
		CommonUtility.sleepControl(3000);

		GROReferral.getInstance().clickTheCloseSecondIcon();

		LOGGER.info(documentTen + " document uploaded successfully");

	}
}
