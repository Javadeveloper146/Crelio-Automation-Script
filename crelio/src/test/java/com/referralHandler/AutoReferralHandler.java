
package com.referralHandler;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.ApplicationStatusCheck;
import com.modules.XrayModule;
import com.pageObjects.GROReferral;
import com.pageObjects.PrintReferralLetterPOM;
import com.pageObjects.UploadReferralLetterPOM;
import com.referral.PrintReceipt;
import com.referral.PrintReferralLetter;
import com.referral.UploadReferralLetter;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

public class AutoReferralHandler {
	private static final Logger LOGGER = LogManager.getLogger(UploadReferralLetter.class);

	public static boolean PrintIconStatus1;
	public static boolean PrintIconStatus2;
	public static boolean PrintIconStatus3;
	public static boolean PrintIconStatus4;
	public static boolean PrintIconStatus5;
	public static boolean PrintIconStatus6;
	public static boolean PrintIconStatus7;
	public static boolean PrintIconStatus8;
	public static boolean PrintIconStatus9;
	public static boolean PrintIconStatus10;
	public static boolean PrintIconStatus11;
	public static boolean PrintIconStatus12;
	public static boolean PrintIconStatus13;
	public static boolean PrintIconStatus14;
	public static boolean PrintIconStatus15;
	public static boolean PrintIconStatus16;
	public static boolean PrintIconStatus17;
	public static boolean PrintIconStatus18;
	public static boolean PrintIconStatus19;
	public static boolean PrintIconStatus20;

	
	public static String Owner_Text_1;
	public static String Owner_Text_2;
	public static String Owner_Text_3;
	
	
	public static boolean UploadIconStatus1;
	public static boolean UploadIconStatus2;
	public static boolean UploadIconStatus3;
	public static boolean UploadIconStatus4;
	public static boolean UploadIconStatus5;
	public static boolean UploadIconStatus6;
	public static boolean UploadIconStatus7;
	public static boolean UploadIconStatus8;
	public static boolean UploadIconStatus9;
	public static boolean UploadIconStatus10;
	public static boolean UploadIconStatus11;
	public static boolean UploadIconStatus12;
	public static boolean UploadIconStatus13;
	public static boolean UploadIconStatus14;
	public static boolean UploadIconStatus15;
	public static boolean UploadIconStatus16;
	public static boolean UploadIconStatus17;
	public static boolean UploadIconStatus18;
	public static boolean UploadIconStatus19;
	public static boolean UploadIconStatus20;

	public static int totalCount;

	public static int dedcuedTheVisionValue;

	public static int totalUploadValue;

	public void referralHandlerAutomatic() throws Throwable {

//		// Referral Count
//		int bmiCount = NurseModuleStepDefinition.bmiReferralCount; // =1
//		int visionCountCount = NurseModuleStepDefinition.visionReferralCount; // =1
//		int colorVisionCount = NurseModuleStepDefinition.colorVisionReferralCount; // =1
//		int bpCount = 0;
//		if (NurseModuleStepDefinition.bpConditionStatus == true && LabJuniorWorkList.triggerControllerStatus == true) {
//			bpCount = 1;
//		} else {
//			bpCount = NurseModuleStepDefinition.bpReferralCount;
//		}
//
//		int cardilogyCount = GpModuleStepDefinition.cardilogyReferralCount; // =1
//		int deformatoryCount = GpModuleStepDefinition.deformatoryReferralCount; // =1
//		int respitoryRefCount = GpModuleStepDefinition.respitoryRefCount;
//		int skinRefCount = GpModuleStepDefinition.skinRefCount;
//		int earRefCount = GpModuleStepDefinition.earRefCount;
//		int psychiatryRefCount = GpModuleStepDefinition.PsychiatryRefCount;
//
//		int xrayReferralCount = XrayModule.xrayFitWithReferralCount;
//
//		int hamoglobinCount = LabJuniorWorkList.hamoglobinReferralCount; // =2
//		int hivCount = LabJuniorWorkList.hivReferralCount; // =1
//		int antihvcCount = LabJuniorWorkList.antiHCVReferralCount; // =1
//		int hbsAgCount = LabJuniorWorkList.hBsAgReferralCount;
//		int sgotCount = LabJuniorWorkList.sgotReferralCount; // 2
//		int sgptCount = LabJuniorWorkList.sgptReferralCount; // 2
//		int creatinineCount = LabJuniorWorkList.creatinineReferralCount;
//		int rprCount = LabJuniorWorkList.rprReferralCount;
//		int betaHcgCount = LabJuniorWorkList.bEtaHCGReferralCount;
//		int glucoseCount = LabJuniorWorkList.glucoseReferralCount;
//
//		ArrayList<Integer> allValue = new ArrayList<>();
//		allValue.add(bmiCount);
//		allValue.add(visionCountCount);
//		allValue.add(colorVisionCount);
//		allValue.add(bpCount);
//		allValue.add(cardilogyCount);
//		allValue.add(deformatoryCount);
//		allValue.add(respitoryRefCount);
//		allValue.add(skinRefCount);
//		allValue.add(earRefCount);
//		allValue.add(psychiatryRefCount);
//		allValue.add(xrayReferralCount);
//		allValue.add(hamoglobinCount);
//		allValue.add(hivCount);
//		allValue.add(antihvcCount);
//		allValue.add(hbsAgCount);
//		allValue.add(sgotCount);
//		allValue.add(sgptCount);
//		allValue.add(creatinineCount);
//		allValue.add(rprCount);
//		allValue.add(betaHcgCount);
//		allValue.add(glucoseCount);
//
//		totalCount = 0;
//
//		for (int number : allValue) {
//			totalCount += number;
//
//		}
//		LOGGER.info("Total Print Referral Count And Details  For No Lab General Medicine Reduced : " + totalCount);
////		boolean sgptAndSgotAndCreatinineAndGlucoseStatusCheck = LabJuniorWorkList.triggerControllerStatus;
////
////		boolean bmiReferralStatusCheckForNurse = NurseModuleStepDefinition.bmiReferralStatus;
//
////		if (sgptAndSgotAndCreatinineAndGlucoseStatusCheck == true) {
////			LOGGER.info("Additional Lab Test Enable Add The Value To BMI Value  = 1");
////			totalCount --;
////		}
////		if (sgptAndSgotAndCreatinineAndGlucoseStatusCheck == true && bmiReferralStatusCheckForNurse == true) {
////			LOGGER.info("Additional Lab Test Reduced The Value To BMI");
////			
////			totalCount --;
////		}
//
//		LOGGER.info("Total Print Referral Count And Details : " + totalCount);
//
//		HashMap<String, Integer> getAllReferralValue = new HashMap<String, Integer>();
//		getAllReferralValue.put("BMI : ", bmiCount);
//		getAllReferralValue.put("Vision : ", visionCountCount);
//		getAllReferralValue.put("Color Vision : ", colorVisionCount);
//		getAllReferralValue.put("Bp  : ", bpCount);
//		getAllReferralValue.put("Cardilogy : ", cardilogyCount);
//		getAllReferralValue.put("Deformatory : ", deformatoryCount);
//		getAllReferralValue.put("Respitory Ref Count : ", respitoryRefCount);
//		getAllReferralValue.put("Skin Ref Count : ", skinRefCount);
//		getAllReferralValue.put("Ear Ref Count : ", earRefCount);
//		getAllReferralValue.put("Psychiatry Ref Count : ", psychiatryRefCount);
//		getAllReferralValue.put("Xray", xrayReferralCount);
//		getAllReferralValue.put("Hamoglobin : ", hamoglobinCount);
//		getAllReferralValue.put("HIV : ", hivCount);
//		getAllReferralValue.put("AntiHCV : ", antihvcCount);
//		getAllReferralValue.put("HBsAg : ", hbsAgCount);
//		getAllReferralValue.put("SGOT : ", sgotCount);
//		getAllReferralValue.put("SGPT : ", sgptCount);
//		getAllReferralValue.put("Creatinine : ", creatinineCount);
//		getAllReferralValue.put("RPR : ", rprCount);
//		getAllReferralValue.put("Beta HCG", betaHcgCount);
//		getAllReferralValue.put("Glucose : ", glucoseCount);

//		LOGGER.info("How Many Referrals Details And Count : " + getAllReferralValue);

		PrintReferralLetter printReferralLetter = new PrintReferralLetter();
		
//		CommonUtility.sleepControl(3000);
//		Owner_Text_1 = PrintReferralLetterPOM.getInstance().GetTheOwner1();
//		System.err.println(Owner_Text_1);
//		
//		if(Owner_Text_1.equals("STEMZ GP")) {
//		
//		}
		
		try {
			CommonUtility.sleepControl(4500);
			PrintIconStatus1 = PrintReferralLetterPOM.getInstance().getThePrintOneStatus1();
			CommonUtility.sleepControl(50);
			PrintIconStatus2 = PrintReferralLetterPOM.getInstance().getPrintIconStatus2();
			CommonUtility.sleepControl(50);
			PrintIconStatus3 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus3();
			CommonUtility.sleepControl(50);
			PrintIconStatus4 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus4();
			CommonUtility.sleepControl(50);
			PrintIconStatus5 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus5();
			CommonUtility.sleepControl(100);
			PrintIconStatus6 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus6();
			CommonUtility.sleepControl(50);
			PrintIconStatus7 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus7();
			CommonUtility.sleepControl(50);
			PrintIconStatus8 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus8();
			CommonUtility.sleepControl(50);
			PrintIconStatus9 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus9();
			CommonUtility.sleepControl(50);
			PrintIconStatus10 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus10();
			CommonUtility.sleepControl(50);
			PrintIconStatus11 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus11();
			CommonUtility.sleepControl(50);
			PrintIconStatus12 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus12();
			CommonUtility.sleepControl(50);
			PrintIconStatus13 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus13();
			CommonUtility.sleepControl(50);
			PrintIconStatus14 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus14();
			CommonUtility.sleepControl(50);
			PrintIconStatus15 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus15();
			CommonUtility.sleepControl(50);
			PrintIconStatus16 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus16();
			CommonUtility.sleepControl(50);
			PrintIconStatus17 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus17();
			CommonUtility.sleepControl(50);
			PrintIconStatus18 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus18();
			CommonUtility.sleepControl(50);
			PrintIconStatus19 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus19();
			CommonUtility.sleepControl(50);
			PrintIconStatus20 = PrintReferralLetterPOM.getInstance().getThePrintIconStatus20();
		}catch (Exception e) {
		
		}
		
		if (PrintIconStatus1 == true) {
			System.err.println("1");
			totalCount++;
		}
		if (PrintIconStatus2 == true) {
			System.err.println("2");
			totalCount++;
		}
		if (PrintIconStatus3 == true) {
			System.err.println("3");
			totalCount++;
		}
		if (PrintIconStatus4 == true) {
			System.err.println("4");
			totalCount++;
		}
		if (PrintIconStatus5 == true) {
			System.err.println("5");
			totalCount++;
		}
		if (PrintIconStatus6 == true) {
			System.err.println("6");
			totalCount++;
		}
		if (PrintIconStatus7 == true) {
			System.err.println("7");
			totalCount++;
		}
		if (PrintIconStatus8 == true) {
			System.err.println("8");
			totalCount++;
		}
		if (PrintIconStatus9 == true) {
			System.err.println("9");
			totalCount++;
		}
		if (PrintIconStatus10 == true) {
			System.err.println("10");
			totalCount++;
		}

		if (PrintIconStatus11 == true) {
			System.err.println("11");
			totalCount++;
		}
		if (PrintIconStatus12 == true) {
			totalCount++;
		}
		if (PrintIconStatus13 == true) {
			totalCount++;
		}
		if (PrintIconStatus14 == true) {
			totalCount++;
		}
		if (PrintIconStatus15 == true) {
			totalCount++;
		}
		if (PrintIconStatus16 == true) {
			totalCount++;
		}
		if (PrintIconStatus17 == true) {
			totalCount++;
		}
		if (PrintIconStatus18 == true) {
			totalCount++;
		}
		if (PrintIconStatus19 == true) {
			totalCount++;
		}
		if (PrintIconStatus20 == true) {
			totalCount++;
		}

		LOGGER.info("How Many Referrals Details And Count : " + totalCount);
		
		if (totalCount == 1) {
			printReferralLetter.onePrintReferralLetter();

		}

		if (totalCount == 2) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();

		}

		if (totalCount == 3) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();

		}

		if (totalCount == 4) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
		}

		if (totalCount == 5) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();

		}

		if (totalCount == 6) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();

		}

		if (totalCount == 7) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
		}
		if (totalCount == 8) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
			printReferralLetter.eightPrintReferralLetter();
		}

		if (totalCount == 9) {

			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
			printReferralLetter.eightPrintReferralLetter();
			printReferralLetter.ninethPrintReferralLetter();
		}

		if (totalCount == 10) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
			printReferralLetter.eightPrintReferralLetter();
			printReferralLetter.ninethPrintReferralLetter();
			printReferralLetter.tenthPrintReferralLetter();
		}

		if (totalCount == 11) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
			printReferralLetter.eightPrintReferralLetter();
			printReferralLetter.ninethPrintReferralLetter();
			printReferralLetter.tenthPrintReferralLetter();
			printReferralLetter.printReferralLetter11();

		}
		if (totalCount == 12) {
			printReferralLetter.onePrintReferralLetter();
			printReferralLetter.twoPrintReferralLetter();
			printReferralLetter.threePrintReferralLetter();
			printReferralLetter.fourPrintReferralLetter();
			printReferralLetter.fivePrintReferralLetter();
			printReferralLetter.sixPrintReferralLetter();
			printReferralLetter.sevenPrintReferralLetter();
			printReferralLetter.eightPrintReferralLetter();
			printReferralLetter.ninethPrintReferralLetter();
			printReferralLetter.tenthPrintReferralLetter();
			printReferralLetter.printReferralLetter11();
			printReferralLetter.printReferralLetter12();

		}

		// --------------Upload Referral Letter-------------------

		UploadReferralLetter uploadReferralLetter = new UploadReferralLetter();
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown1000();
		CommonUtility.sleepControl(1500);
		GROReferral.getInstance().clickTheNext();
		CommonUtility.sleepControl(3000);

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_30)) {
			CommonDefinition commonDefinition = new CommonDefinition();
			commonDefinition.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_34)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_38)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_42)) {
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
		
		LOGGER.info(PrintReferralLetterPOM.getInstance().getReferral());
		CommonUtility.sleepControl(1000);
		CommonUtility.scrollDown100();

		// Manila Location Reduced The Hiv Count
		try {

			CommonUtility.sleepControl(1000);
			UploadIconStatus1 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus1();
			CommonUtility.sleepControl(50);
			UploadIconStatus2 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus2();
			CommonUtility.sleepControl(50);
			UploadIconStatus3 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus3();
			CommonUtility.sleepControl(50);
			UploadIconStatus4 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus4();
			CommonUtility.sleepControl(50);
			UploadIconStatus5 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus5();
			CommonUtility.sleepControl(50);
			UploadIconStatus6 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus6();
			CommonUtility.sleepControl(50);
			UploadIconStatus7 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus7();
			CommonUtility.sleepControl(50);
			UploadIconStatus8 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus8();
			CommonUtility.sleepControl(50);
			UploadIconStatus9 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus9();
			CommonUtility.sleepControl(50);
			UploadIconStatus10 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus10();
			CommonUtility.sleepControl(50);
			UploadIconStatus11 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus11();
			CommonUtility.sleepControl(50);
			UploadIconStatus12 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus12();
			CommonUtility.sleepControl(50);
			UploadIconStatus13 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus13();
			CommonUtility.sleepControl(50);
			UploadIconStatus14 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus14();
			CommonUtility.sleepControl(50);
			UploadIconStatus15 = UploadReferralLetterPOM.getInstance().getTheUploadIconStatus15();

		} catch (Exception e) {
			System.out.println("Upload");
		}

		if (UploadIconStatus1 == true) {
			System.err.println("1");
			totalUploadValue++;
		}
		if (UploadIconStatus2 == true) {
			System.err.println("2");
			totalUploadValue++;
		}

		if (UploadIconStatus3 == true) {
			System.err.println("3");
			totalUploadValue++;
		}
		if (UploadIconStatus4 == true) {
			System.err.println("4");
			totalUploadValue++;
		}
		if (UploadIconStatus5 == true) {
			System.err.println("5");
			totalUploadValue++;
		}
		if (UploadIconStatus6 == true) {
			System.err.println("6");
			totalUploadValue++;
		}

		if (UploadIconStatus7 == true) {
			System.err.println("7");
			totalUploadValue++;
		}

		if (UploadIconStatus8 == true) {
			System.err.println("8");
			totalUploadValue++;
		}
		if (UploadIconStatus9 == true) {
			System.err.println("9");
			totalUploadValue++;
		}

		if (UploadIconStatus10 == true) {
			System.err.println("10");
			totalUploadValue++;
		}
		if (UploadIconStatus11 == true) {

			totalUploadValue++;
		}
		if (UploadIconStatus12 == true) {
			totalUploadValue++;
		}

		if (UploadIconStatus13 == true) {
			totalUploadValue++;
		}

		if (UploadIconStatus14 == true) {
			totalUploadValue++;
		}

		if (UploadIconStatus15 == true) {
			totalUploadValue++;
		}
		LOGGER.info("Upload Referral Count : " + totalUploadValue);

		if (totalUploadValue == 1) {

			uploadReferralLetter.oneUploadRefferralLetter();
		}

		if (totalUploadValue == 2) {
			uploadReferralLetter.oneUploadRefferralLetter();

			uploadReferralLetter.twoUploadReferralLetter();
		}

		if (totalUploadValue == 3) {
			uploadReferralLetter.oneUploadRefferralLetter();

			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();
		}

		if (totalUploadValue == 4) {
			uploadReferralLetter.oneUploadRefferralLetter();

			uploadReferralLetter.twoUploadReferralLetter();

			uploadReferralLetter.threeUploadReferralLetter();

			uploadReferralLetter.fourUploadReferralLetter();
		}

		if (totalUploadValue == 5) {
			uploadReferralLetter.oneUploadRefferralLetter();

			uploadReferralLetter.twoUploadReferralLetter();

			uploadReferralLetter.threeUploadReferralLetter();

			uploadReferralLetter.fourUploadReferralLetter();

			uploadReferralLetter.fiveUploadReferralLetter();

		}

		if (totalUploadValue == 6) {
			uploadReferralLetter.oneUploadRefferralLetter();
			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();

			uploadReferralLetter.fourUploadReferralLetter();

			uploadReferralLetter.fiveUploadReferralLetter();

			uploadReferralLetter.sixUploadReferralLetter();
		}

		if (totalUploadValue == 7) {
			uploadReferralLetter.oneUploadRefferralLetter();
			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();

			uploadReferralLetter.fourUploadReferralLetter();

			uploadReferralLetter.fiveUploadReferralLetter();

			uploadReferralLetter.sixUploadReferralLetter();

			uploadReferralLetter.sevenUploadReferralLetter();
		}

		if (totalUploadValue == 8) {
			uploadReferralLetter.oneUploadRefferralLetter();
			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();

			uploadReferralLetter.fourUploadReferralLetter();

			uploadReferralLetter.fiveUploadReferralLetter();

			uploadReferralLetter.sixUploadReferralLetter();

			uploadReferralLetter.sevenUploadReferralLetter();

			uploadReferralLetter.eightUploadReferralLetter();

		}

		if (totalUploadValue == 9) {
			uploadReferralLetter.oneUploadRefferralLetter();
			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();
			uploadReferralLetter.fourUploadReferralLetter();
			uploadReferralLetter.fiveUploadReferralLetter();
			uploadReferralLetter.sixUploadReferralLetter();
			uploadReferralLetter.sevenUploadReferralLetter();
			uploadReferralLetter.eightUploadReferralLetter();
			uploadReferralLetter.nineUploadReferralLetter();
		}

		if (totalUploadValue == 10) {
			uploadReferralLetter.oneUploadRefferralLetter();
			uploadReferralLetter.twoUploadReferralLetter();
			uploadReferralLetter.threeUploadReferralLetter();
			uploadReferralLetter.fourUploadReferralLetter();
			uploadReferralLetter.fiveUploadReferralLetter();
			uploadReferralLetter.sixUploadReferralLetter();
			uploadReferralLetter.sevenUploadReferralLetter();
			uploadReferralLetter.eightUploadReferralLetter();
			uploadReferralLetter.nineUploadReferralLetter();
			uploadReferralLetter.tenUploadReferralLetter();
		}
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_31)) {
		

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_35)) {
			

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_39)) {
			

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		// Print Receipt And Logout
		PrintReceipt printReceipt = new PrintReceipt();
		printReceipt.onePrintReceiptAndFeedbackAndLogOut();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_17)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}
}