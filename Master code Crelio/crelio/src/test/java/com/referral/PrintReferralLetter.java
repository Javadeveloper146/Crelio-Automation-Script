package com.referral;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.commonUtility.CommonUtility;
import com.pageObjects.PrintReferralLetterPOM;
import com.stepDefinition.CommonDefinition;

public class PrintReferralLetter {
	private static final Logger LOGGER = LogManager.getLogger(PrintReferralLetter.class);

	public static String commentOne;
	public static String commentTwo;
	public static String commentThree;
	public static String commentFour;
	public static String commentFive;
	public static String commentSix;
	public static String commentSeven;
	public static String commentEight;
	public static String commentnine;
	public static String commentTen;
	public static String comment11;
	public static String comment12;

	public void onePrintReferralLetter() throws Throwable {

		LOGGER.info("Print Referral Letter Page: ");
		CommonUtility.sleepControl(2000);
		LOGGER.info(PrintReferralLetterPOM.getInstance().getReferral());
		CommonUtility.sleepControl(200);
		commentOne = PrintReferralLetterPOM.getInstance().GetOneDoumentTypeName();

		LOGGER.info("Document Type: " + commentOne);
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickFirstCommment(commentOne);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickTheFirstPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1000);
		CommonDefinition.windowHandling();
		LOGGER.info(commentOne + " Print Referral Letter saved Successfully");

	}

	public void twoPrintReferralLetter() throws Throwable {

		// Two
		CommonUtility.sleepControl(1500);
		commentTwo = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeTwo();

		LOGGER.info("Document Type : " + commentTwo);
		CommonUtility.sleepControl(2000);
		PrintReferralLetterPOM.getInstance().clickSecondCommment(commentTwo);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickTheSecondPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();

		LOGGER.info(commentTwo + " Print Referral Letter saved Successfully");

	}

	public void threePrintReferralLetter() throws Throwable {
		// Three
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(1000);
		commentThree = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeThree();

		LOGGER.info("Document Type : " + commentThree);
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickThreeCommment(commentThree);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickThePrintIcon3();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentThree + " Print Referral Letter saved Successfully");

	}

	public void fourPrintReferralLetter() throws Throwable {
		// Four Ref
		CommonUtility.sleepControl(1500);
		commentFour = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeFour();

		LOGGER.info("Document Type : " + commentFour);
		CommonUtility.sleepControl(1500);
		PrintReferralLetterPOM.getInstance().clickFourCommment(commentFour);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickThefourPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1000);
		CommonDefinition.windowHandling();

		LOGGER.info(commentFour + " Print Referral Letter saved Successfully");
		CommonUtility.waitFor2Sec();
		CommonUtility.scrollDown50();

	}

	public void fivePrintReferralLetter() throws Throwable {

		// Five Ref
		CommonUtility.sleepControl(1000);
		commentFive = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeFive();

		LOGGER.info("Document Type : " + commentFive);
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickFiveCommment(commentFive);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickTheFivePrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentFive + " Print Referral Letter saved Successfully");

	}

	public void sixPrintReferralLetter() throws Throwable {
		// Six Ref
		CommonUtility.sleepControl(1000);
		commentSix = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeSix();

		LOGGER.info("Document Type : " + commentSix);
		CommonUtility.sleepControl(1500);
		PrintReferralLetterPOM.getInstance().clickSixCommment(commentSix);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickTheSixPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1000);
		CommonDefinition.windowHandling();
		LOGGER.info(commentSix + " Print Referral Letter saved Successfully");

	}

	public void sevenPrintReferralLetter() throws Throwable {
		// Seven Ref
		CommonUtility.waitFor2Sec();
		commentSeven = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeSeven();

		LOGGER.info("Document Type : " + commentSeven);
		CommonUtility.waitFor2Sec();
		PrintReferralLetterPOM.getInstance().clickSevenCommment(commentSeven);

		// Click The PrintIcon Button
		CommonUtility.waitFor2Sec();
		PrintReferralLetterPOM.getInstance().clickTheSevenPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentSeven + " Print Referral Letter saved Successfully");
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown50();
		CommonUtility.sleepControl(300);

	}

	public void eightPrintReferralLetter() throws Throwable {
		// Eight Ref
		CommonUtility.waitFor2Sec();
		commentEight = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeEight();

		LOGGER.info("Document Type : " + commentEight);
		CommonUtility.waitFor2Sec();
		PrintReferralLetterPOM.getInstance().clickEightCommment(commentEight);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(700);
		PrintReferralLetterPOM.getInstance().clickTheEightPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentEight + " Print Referral Letter saved Successfully");

	}

	public void ninethPrintReferralLetter() throws Throwable {
		// nine Ref
		CommonUtility.waitFor2Sec();
		commentnine = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeNine();

		LOGGER.info("Document Type : " + commentnine);
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().clickNineCommment(commentnine);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickThePrintIcon9();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentnine + " Print Referral Letter saved Successfully");
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown50();

	}

	public void tenthPrintReferralLetter() throws Throwable {
		// ten Ref
		CommonUtility.waitFor2Sec();
		commentTen = PrintReferralLetterPOM.getInstance().GetTheDoumentTypeTen();

		LOGGER.info("Document Type : " + commentTen);
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickTenCommment(commentTen);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickTheTenPrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(commentTen + " Print Referral Letter saved Successfully");
		CommonUtility.waitFor2Sec();
	}

	public void printReferralLetter11() throws Throwable {
		// ten Ref
		CommonUtility.waitFor2Sec();
		comment11 = PrintReferralLetterPOM.getInstance().GetTheDoumentType11();

		LOGGER.info("Document Type : " + comment11);
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().enter11Commment(comment11);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickThePrintIcon11();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(comment11 + " Print Referral Letter saved Successfully");
		CommonUtility.waitFor2Sec();
	}

	public void printReferralLetter12() throws Throwable {
		// ten Ref
		CommonUtility.waitFor2Sec();
		comment12 = PrintReferralLetterPOM.getInstance().GetTheDoumentType12();

		LOGGER.info("Document Type : " + comment12);
		CommonUtility.sleepControl(500);
		PrintReferralLetterPOM.getInstance().enter12Commment(comment12);

		// Click The PrintIcon Button
		CommonUtility.sleepControl(1000);
		PrintReferralLetterPOM.getInstance().clickThe12PrintIcon();

		// Close The Print Letter page
		CommonUtility.sleepControl(1500);
		CommonDefinition.windowHandling();
		LOGGER.info(comment11 + " Print Referral Letter saved Successfully");
		CommonUtility.waitFor2Sec();
	}

}
