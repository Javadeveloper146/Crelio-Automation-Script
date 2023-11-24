package com.referral;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.commonUtility.CommonUtility;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.XrayModule;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.PatientProfiles;
import com.pageObjects.PrintReceiptPOM;
import com.pageObjects.PrintReferralLetterPOM;
import com.referralHandler.AutoReferralHandler;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

public class PrintReceipt {
	private static final Logger LOGGER = LogManager.getLogger(PrintReceipt.class);

	public static boolean firstNameStatus;
	public static boolean seccondNameStatus;
	public static boolean threeNameStatus;
	public static boolean fourNameStatus;
	public static boolean fiveNameStatus;
	public static boolean sixNameStatus;
	public static boolean sevenNameStatus;
	public static boolean eightNameStatus;
	public static boolean nineNameStatus;
	public static boolean tenNameStatus;
	public static boolean NND;
	public static boolean ND;
	public static String printReceiptOne;
	public static String printReceiptTwo;
	public static String printReceiptThree;
	public static String printReceiptFour;
	public static String printReceiptFive;
	public static String printReceiptSix;
	public static String printReceiptSeven;
	public static String printReceiptEight;
	public static String printReceiptnine;
	public static String printReceiptTen;
	public static String printReceiptEleven;

	public static String groReferralToken;
	public static String groReferralTokenString;

	public void onePrintReceiptAndFeedbackAndLogOut() throws Throwable {

		// Click The Print Receipt
		CommonUtility.waitFor2Sec();
		CommonUtility.scrollDown100();
		CommonUtility.sleepControl(3000);
		GROReferral.getInstance().clickTheNext();
		CommonUtility.sleepControl(3000);
		CommonUtility.scrollDown100();

		int totalReferralCount = AutoReferralHandler.totalCount;
		LOGGER.info("Total Print Receipt Count : " + totalReferralCount);
		// Frist Status
		if (totalReferralCount == 1) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
		}

		if (totalReferralCount == 2) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
		}

		// 3
		if (totalReferralCount == 3) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
		}

		// 4
		if (totalReferralCount == 4) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
		}

		// 5
		if (totalReferralCount == 5) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
		}

		CommonUtility.sleepControl(2000);
		CommonUtility.scrollDown100();

		// 6
		if (totalReferralCount == 6) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
		}

		// 7
		if (totalReferralCount == 7) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
			printReceiptSeven = PrintReceiptPOM.getInstance().GetDoumentTypeName7();
			LOGGER.info("Print Receipt Name : " + printReceiptSeven);
		}

		// 8
		if (totalReferralCount == 8) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
			printReceiptSeven = PrintReceiptPOM.getInstance().GetDoumentTypeName7();
			LOGGER.info("Print Receipt Name : " + printReceiptSeven);
			printReceiptEight = PrintReceiptPOM.getInstance().GetDoumentTypeName8();
			LOGGER.info("Print Receipt Name : " + printReceiptEight);
		}

		// 9
		if (totalReferralCount == 9) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
			printReceiptSeven = PrintReceiptPOM.getInstance().GetDoumentTypeName7();
			LOGGER.info("Print Receipt Name : " + printReceiptSeven);
			printReceiptEight = PrintReceiptPOM.getInstance().GetDoumentTypeName8();
			LOGGER.info("Print Receipt Name : " + printReceiptEight);
			printReceiptnine = PrintReceiptPOM.getInstance().GetDoumentTypeName9();
			LOGGER.info("Print Receipt Name : " + printReceiptnine);
		}

		// 10
		if (totalReferralCount == 10) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
			printReceiptSeven = PrintReceiptPOM.getInstance().GetDoumentTypeName7();
			LOGGER.info("Print Receipt Name : " + printReceiptSeven);
			printReceiptEight = PrintReceiptPOM.getInstance().GetDoumentTypeName8();
			LOGGER.info("Print Receipt Name : " + printReceiptEight);
			printReceiptnine = PrintReceiptPOM.getInstance().GetDoumentTypeName9();
			LOGGER.info("Print Receipt Name : " + printReceiptnine);
			printReceiptTen = PrintReceiptPOM.getInstance().GetDoumentTypeName10();
			LOGGER.info("Print Receipt Name : " + printReceiptTen);
		}
		if (totalReferralCount == 11) {
			CommonUtility.sleepControl(2000);
			printReceiptOne = PrintReceiptPOM.getInstance().GetOneDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptOne);
			printReceiptTwo = PrintReceiptPOM.getInstance().GetTwoDoumentTypeName();
			LOGGER.info("Print Receipt Name : " + printReceiptTwo);
			printReceiptThree = PrintReceiptPOM.getInstance().GetDoumentTypeName3();
			LOGGER.info("Print Receipt Name : " + printReceiptThree);
			printReceiptFour = PrintReceiptPOM.getInstance().GetDoumentTypeName4();
			LOGGER.info("Print Receipt Name : " + printReceiptFour);
			printReceiptFive = PrintReceiptPOM.getInstance().GetDoumentTypeName5();
			LOGGER.info("Print Receipt Name : " + printReceiptFive);
			printReceiptSix = PrintReceiptPOM.getInstance().GetDoumentTypeName6();
			LOGGER.info("Print Receipt Name : " + printReceiptSix);
			printReceiptSeven = PrintReceiptPOM.getInstance().GetDoumentTypeName7();
			LOGGER.info("Print Receipt Name : " + printReceiptSeven);
			printReceiptEight = PrintReceiptPOM.getInstance().GetDoumentTypeName8();
			LOGGER.info("Print Receipt Name : " + printReceiptEight);
			printReceiptnine = PrintReceiptPOM.getInstance().GetDoumentTypeName9();
			LOGGER.info("Print Receipt Name : " + printReceiptnine);
			printReceiptTen = PrintReceiptPOM.getInstance().GetDoumentTypeName10();
			LOGGER.info("Print Receipt Name : " + printReceiptTen);
			printReceiptEleven = PrintReceiptPOM.getInstance().GetDoumentTypeName11();
			LOGGER.info("Print Receipt Name : " + printReceiptEleven);
		}

		// CLick The Print Receipt Icon
		CommonUtility.sleepControl(2000);
		CommonUtility.scrollUp500();
		CommonUtility.sleepControl(2000);
		PrintReceiptPOM.getInstance().clickThePrintReceiptIcon();
		CommonUtility.sleepControl(2000);
		groReferralToken = PatientProfiles.getInstance().getTheTokenDetails();
		// Window Handing
		CommonUtility.sleepControl(2000);
		CommonDefinition commonDefinition = new CommonDefinition();
		CommonDefinition.windowCloseFuncitonAltF4();

		// Get The Token

		LOGGER.info("GRO Refferral Token : " + groReferralToken);
		String referralType = groReferralToken.trim();
		String groRefToken = referralType;

	
		
//		if (nurseND_Status == true) {
//			groReferralTokenString = groRefToken.substring(10, 15);
//		}
//		if (nurseNND_Status == true) {
//			groReferralTokenString = groRefToken.substring(10, 16);}
//	
//ND001
		
//---------------------------------------------------------------------------		
		if( NurseModuleStepDefinition.bmiReferralStatus ==true) {
			groReferralTokenString = groRefToken.substring(10, 15);
		}
		if (NurseModuleStepDefinition.colorVisionReferralStatus == true) {
			groReferralTokenString = groRefToken.substring(10, 15);
		}
		if (NurseModuleStepDefinition.bpReferralStatus) {
			groReferralTokenString = groRefToken.substring(10, 15);
		}
		if(LabJuniorWorkList.NN_Status ==true) {
			groReferralTokenString = groRefToken.substring(10, 15);
		}
		if( NurseModuleStepDefinition.visionReferralStatus ==true) {
			groReferralTokenString = groRefToken.substring(10, 16);
		}
//------------------------------------------------------------------------------
		
		
//		boolean nurse_Status = NurseModuleStepDefinition.NND_Status;
//
//		boolean gpND_dStatus = GpModuleStepDefinition.ND_Status;
//		boolean nx = XrayModule.NX_Status;
//		boolean nn = LabJuniorWorkList.NN_Status;
//		boolean labND = LabJuniorWorkList.ND_Status;

//		if (nurseND_Status == false && gpND_dStatus == false == labND == false) {
//
//		} else {
//			groReferralTokenString = groRefToken.substring(10, 15);
//		}
//		if (nx == true) {
//			groReferralTokenString = groRefToken.substring(10, 15);
//		}
//		if (nn == true) {
//			groReferralTokenString = groRefToken.substring(10, 15);
//		}
//		if(nurseNND_Status ==true) {
//			groReferralTokenString = groRefToken.substring(10, 16);
//		}
//		if(nurseNND_Status == true && nx ==true) {
//			groReferralTokenString = groRefToken.substring(10, 17);
//		}

		LOGGER.info("GRO Referral Token Trim in String: " + groReferralTokenString);
		CommonUtility.sleepControl(2000);
		GpModule.getInstance().clickTheCollectFeedbackButton();
		LOGGER.info("Collected Feedback Successfully");

		// Log Out
		CommonUtility.sleepControl(1000);

		commonDefinition.logOut();

	}

}
