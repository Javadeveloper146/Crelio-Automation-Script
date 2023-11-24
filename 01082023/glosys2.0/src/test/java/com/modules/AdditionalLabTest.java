package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.modulesPOM.AdditionalLabTestPOM;
import com.pageObjects.GpModule;
import com.referralAndCertificatePom.ReferralDocumentPOM;

public class AdditionalLabTest {
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

	public static int resultCount1;
	public static int resultCount2;
	public static int resultCount3;
	public static int resultCount4;
	public static int resultCount5;
	public static int resultCount6;
	public static int totalResultEntryCount;

	public static int totalCountValue;
	public static int referralCount;
	public static int value;
	public static int documentTypeValue;
	public static int reducedCount;
	public static String approvalStatus = ReferralDocumentApprovalController.approvalStatus;
	private static final Logger LOGGER = LogManager.getLogger(AdditionalLabTest.class);
	ReferralDocumentApprovalController approvalController = new ReferralDocumentApprovalController();

	public void addtionalLabTestProcess(int referralCount) throws Throwable {
		ReferralDocumentApprovalController approvalController = new ReferralDocumentApprovalController();
		CommonUtility.sleepControl(4000);
		AdditionalLabTestPOM.getInstance().clickAdditionalLabTest();

		LOGGER.info("Total Referral Count :" + referralCount);

		if (referralCount == 1) {

			resultCount1 = 1;
			CommonUtility.sleepControl(1000);
			approvalController.resultEntry(resultCount1);

			CommonUtility.sleepControl(500);
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

			LOGGER.info("Approval Status : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {

				resultCount1 = 1;
				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount1);

				CommonUtility.sleepControl(1000);
				documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
				LOGGER.info("Document Type 1 : " + documentType1);

				CommonUtility.sleepControl(1000);
				approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

				LOGGER.info("Approval Status : " + approvalStatus);

				if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
					count1 = 1;
					totalCountValue = count1;
					System.out.println("Total Count Value : " + totalCountValue);

					saveButtonControl(totalCountValue);
					LOGGER.info("Approval status updated successfully");

					CommonUtility.sleepControl(1500);
					GpModule.getInstance().clickTheCloseReferral();
					LOGGER.info("Close Referral Sucessfully");
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheYesOptionInReferralDocument();
					LOGGER.info("Referral Closed  Sucessfully");
				}
			}
		}

		// 2
		if (referralCount == 2) {
			resultCount1 = 1;
			CommonUtility.sleepControl(1000);
			approvalController.resultEntry(resultCount1);

			CommonUtility.sleepControl(500);
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

			LOGGER.info("Approval Status : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1500);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			resultCount2 = 2;
			resultCount3 = 3;
			resultCount4 = 4;
			resultCount5 = 5;
			resultCount6 = 6;

			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {
				approvalController.resultEntry(resultCount4);
			} else {
				approvalController.resultEntry(resultCount1);
			}

			CommonUtility.sleepControl(500);
			documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();
			System.err.println("2 : " + documentType2);

			LOGGER.info("Document Type 2: " + documentType2);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1500);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}
		}
		// 3
		if (referralCount == 3) {
			resultCount1 = 1;
			CommonUtility.sleepControl(1000);
			approvalController.resultEntry(resultCount1);

			CommonUtility.sleepControl(500);
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

			LOGGER.info("Approval Status : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1500);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			resultCount2 = 2;
			resultCount3 = 3;
			resultCount4 = 4;
			resultCount5 = 5;
			resultCount6 = 6;

			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {
				approvalController.resultEntry(resultCount4);
			} else {
				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount1);
			}

			CommonUtility.sleepControl(500);
			documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();
			System.err.println("2 : " + documentType2);

			LOGGER.info("Document Type 2: " + documentType2);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}

			// 3
			value = 3;
			resultCount3 = 3;
			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {

				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount5);
			} else {
				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount3);
			}

			CommonUtility.sleepControl(500);
			documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();
			System.err.println("3 : " + documentType3);
			LOGGER.info("Document Type 3 : " + documentType3);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count3 = 3;
				totalCountValue = (count3 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}

		} else if (referralCount == 4) {

			resultCount1 = 1;
			CommonUtility.sleepControl(1000);
			approvalController.resultEntry(resultCount1);

			CommonUtility.sleepControl(500);
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);

			LOGGER.info("Approval Status : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1500);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();

			resultCount2 = 2;
			resultCount3 = 3;
			resultCount4 = 4;
			resultCount5 = 5;
			resultCount6 = 6;

			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {
				approvalController.resultEntry(resultCount4);
			} else {
				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount2);
			}

			CommonUtility.sleepControl(500);
			documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();
			System.err.println("2 : " + documentType2);

			LOGGER.info("Document Type 2: " + documentType2);

			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}

			// 3
			value = 3;
			resultCount3 = 3;
			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {

				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount5);
			} else {
				CommonUtility.sleepControl(1000);
				approvalController.resultEntry(resultCount3);
			}

			CommonUtility.sleepControl(500);
			documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();
			System.err.println("3 : " + documentType3);
			LOGGER.info("Document Type 3 : " + documentType3);

			CommonUtility.sleepControl(1000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count3 = 3;
				totalCountValue = (count3 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}

			value = 4;
			resultCount4 = 4;

			if (ReferralDocumentApprovalController.Serum_Creatinine_Status == true) {

				approvalController.resultEntry(resultCount6);
			} else {

				approvalController.resultEntry(resultCount4);
			}

			CommonUtility.sleepControl(1000);
			documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
			System.err.println("4 : " + documentType4);

			LOGGER.info("Document Type 4 : " + documentType4);
			
			approvalStatus = approvalController.referralApprovalStatusControl(documentType4);

			LOGGER.info("Approval : " + approvalStatus);
			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count4 = 4;
				totalCountValue = (count4 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");

				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}

		} else if (referralCount == 5) {
			resultCount1 = 1;
			CommonUtility.sleepControl(1000);
			approvalController.resultEntry(resultCount1);

			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);
		
			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
			LOGGER.info("Approval Status : " + approvalStatus);
		

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(1000);
			CommonUtility.scrollDown100();
			value = 2;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				resultCount1 = 1;
				
				approvalController.resultEntry(resultCount1);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType2);
			} else {
				resultCount1 = 2;
				
				approvalController.resultEntry(resultCount1);
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType2();
				System.err.println("2 : " + documentType2);
			}
			LOGGER.info("Document Type 2: " + documentType2);
	
			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
		
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++; // 2
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 3
		
			value = 3;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				resultCount1 = 1;
			
				approvalController.resultEntry(resultCount1);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.out.println("1 : " + documentType3);
			} else if (documentTypeValue == 2) {
				resultCount1 = 2;
				
				approvalController.resultEntry(resultCount1);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType2();
				System.out.println("2 : " + documentType3);
			} else {
				resultCount1 = 3;
	
				approvalController.resultEntry(resultCount1);
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();
				System.out.println("3 : " + documentType3);

			}
			LOGGER.info("Document Type 3 : " + documentType3);
	
			approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
						LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.out.println("Condition Accepted");
				count3 = 3;
				totalCountValue = (count3 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}
		
			value = 4;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				resultCount1 = 1;
				
				approvalController.resultEntry(resultCount1);

				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType4);
			} else if (documentTypeValue == 2) {
				resultCount1 = 2;
				
				approvalController.resultEntry(resultCount1);

				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType2();
				System.err.println("2 : " + documentType4);

			} else if (documentTypeValue == 3) {
				resultCount1 = 3;
				
				approvalController.resultEntry(resultCount1);

				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType3();
				System.err.println("3 : " + documentType3);
			} else {
				resultCount1 = 4;
				
				approvalController.resultEntry(resultCount1);
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.err.println("4 : " + documentType4);
			}

			LOGGER.info("Document Type 4 : " + documentType4);
		
			approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
		
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count4 = 4;
				totalCountValue = (count4 - reducedCount);
				System.out.println("Total Count Value 4 : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 5
		
			value = 5;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				resultCount1 = 1;
				
				approvalController.resultEntry(resultCount1);

				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.out.println("1 : " + documentType5);
			} else if (documentTypeValue == 2) {

				resultCount1 = 2;
				
				approvalController.resultEntry(resultCount1);

				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType2();
				System.out.println("2 : " + documentType5);

			} else if (documentTypeValue == 3) {
				resultCount1 = 3;
			
				approvalController.resultEntry(resultCount1);

				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType3();
				System.out.println("3 : " + documentType3);

			} else if (documentTypeValue == 4) {
				resultCount1 = 4;
				
				approvalController.resultEntry(resultCount1);

				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType4();
				System.out.println("4 : " + documentType5);
			} else {

				resultCount1 = 5;
		
				approvalController.resultEntry(resultCount1);
				documentType5 = ReferralDocumentPOM.getInstance().getDocumentType5();
			}

			LOGGER.info("Document Type 5 : " + documentType5);
		
			approvalStatus = approvalController.referralApprovalStatusControl(documentType5);
		
			LOGGER.info("Approval : " + approvalStatus);
			if (approvalStatus == AppConstants.APPROVAL_ACCEPT) {
				count5 = 5;
				totalCountValue = (count5 - reducedCount);
				System.out.println("Total Count Value 5: " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheCloseReferral();
				LOGGER.info("Close Referral Sucessfully");
				CommonUtility.sleepControl(1000);
				GpModule.getInstance().clickTheYesOptionInReferralDocument();
				LOGGER.info("Referral Closed  Sucessfully");
			}
		}

	}

	public void saveButtonControl(int count) throws Throwable {

		switch (count) {
		case 1:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave1();
			System.out.println("Save Button 1");
			break;
		case 2:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave2();
			System.out.println("Save Button 2" + "");
			break;

		case 3:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave3();
			System.out.println("Save Button 3");
			break;

		case 4:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave4();
			System.out.println("Save Button 4");
			break;

		case 5:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave5();
			System.out.println("Save Button 5");
			break;
		case 6:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave6();
			System.out.println("Save Button 6");
			break;
		case 7:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave7();
			System.out.println("Save Button 7");
			break;

		case 8:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave8();
			System.out.println("Save Button 8");
			break;
		case 9:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave9();
			System.out.println("Save Button 9");
			break;
		case 10:
			CommonUtility.sleepControl(700);
			ReferralDocumentPOM.getInstance().clickTheSave10();
			System.out.println("Save Button 10");
			break;
		default:
			break;
		}

	}
}
