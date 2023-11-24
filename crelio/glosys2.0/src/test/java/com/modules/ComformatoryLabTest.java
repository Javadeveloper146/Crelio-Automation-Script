package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.modulesPOM.ConformatoryTestPOM;
import com.pageObjects.GpModule;
import com.referralAndCertificatePom.ReferralDocumentPOM;

public class ComformatoryLabTest {
	private static final Logger LOGGER = LogManager.getLogger(ComformatoryLabTest.class);
	public static int count1;
	public static int count2;
	public static int count3;
	public static int count4;
	public static int count5;

	public static String documentType1;
	public static String documentType2;
	public static String documentType3;
	public static String documentType4;
	public static String documentType5;

	public static int totalCountValue;
	public static int referralCount;
	public static int value;
	public static int documentTypeValue;
	public static int reducedCount;

	public static String approvalStatus = ReferralDocumentApprovalController.approvalStatus;

	public void conformatoryLabTestProcess(int referralCount) throws Throwable {

		ReferralDocumentApprovalController approvalController = new ReferralDocumentApprovalController();
		CommonUtility.sleepControl(2000);
		ConformatoryTestPOM.getInstance().clickLabConfirmatory();
		CommonUtility.sleepControl(2000);
		documentType4 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType3();
		System.err.println("3 : " + documentType3);
	
		documentType4 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType4();
		System.err.println("4 : " + documentType4);
	

		if (referralCount == 1) {
			CommonUtility.sleepControl(2000);
			
			
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);
			CommonUtility.sleepControl(2000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
			LOGGER.info("Approval Status : " + approvalStatus);
			CommonUtility.sleepControl(2000);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				}

		} else if (referralCount == 2) {
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);
			CommonUtility.sleepControl(2000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
			LOGGER.info("Approval Status : " + approvalStatus);
			CommonUtility.sleepControl(2000);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
			
			} else {
				reducedCount++;// 1
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();
			value = 2;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType2);
			} else {
				documentType2 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType2);
			}
			LOGGER.info("Document Type 2: " + documentType2);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);

				saveButtonControl(totalCountValue);

				LOGGER.info("Approval status updated successfully");
				
			}
		}

		else if (referralCount == 3) {
			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);
			CommonUtility.sleepControl(2000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
			LOGGER.info("Approval Status : " + approvalStatus);
			CommonUtility.sleepControl(2000);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
			
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();
			value = 2;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType2);
			} else {
				documentType2 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType2);
			}
			LOGGER.info("Document Type 2: " + documentType2);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
					} else {
				reducedCount++; // 2
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 3
			CommonUtility.sleepControl(2000);
			value = 3;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType3);
			} else if (documentTypeValue == 2) {
				documentType3 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType3);
			} else {
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType3();
				System.err.println("3 : " + documentType3);

			}
			LOGGER.info("Document Type 3 : " + documentType3);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count3 = 3;
				totalCountValue = (count3 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
			
			}
		} else if (referralCount == 4) {

			documentType1 = ReferralDocumentPOM.getInstance().getDocumentType1();
			LOGGER.info("Document Type 1 : " + documentType1);
			CommonUtility.sleepControl(2000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType1);
			LOGGER.info("Approval Status : " + approvalStatus);
			CommonUtility.sleepControl(2000);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count1 = 1;
				totalCountValue = count1;
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
							LOGGER.info("Referral Closed  Sucessfully");
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 2
			CommonUtility.sleepControl(2000);
			CommonUtility.scrollDown100();
			value = 2;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType2 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType2);
			} else {
				documentType2 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType2);
			}
			LOGGER.info("Document Type 2: " + documentType2);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType2);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count2 = 2;
				totalCountValue = (count2 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
				
			
			} else {
				reducedCount++; // 2
				System.err.println("Reduced Count : " + reducedCount);
			}

			// 3
			CommonUtility.sleepControl(2000);
			value = 3;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType3 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType3);
			} else if (documentTypeValue == 2) {
				documentType3 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType3);
			} else {
				documentType3 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType3();
				System.err.println("3 : " + documentType3);

			}
			LOGGER.info("Document Type 3 : " + documentType3);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType3);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				System.err.println("Condition Accepted");
				count3 = 3;
				totalCountValue = (count3 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
			
			} else {
				reducedCount++;
				System.err.println("Reduced Count : " + reducedCount);
			}
			CommonUtility.sleepControl(2000);
			value = 4;
			documentTypeValue = (value - reducedCount);
			if (documentTypeValue == 1) {
				documentType4 = ReferralDocumentPOM.getInstance().getDocumentType1();
				System.err.println("1 : " + documentType4);
			} else if (documentTypeValue == 2) {
				documentType4 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType2();
				System.err.println("2 : " + documentType4);
			} else if (documentTypeValue == 3) {
				documentType4 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType3();
				System.err.println("3 : " + documentType3);
			} else {
				documentType4 = ReferralDocumentPOM.getInstance().getComformatoryDocumentType4();
				System.err.println("4 : " + documentType4);
			}

			LOGGER.info("Document Type 4 : " + documentType4);
			CommonUtility.sleepControl(3000);
			approvalStatus = approvalController.referralApprovalStatusControl(documentType4);
			CommonUtility.sleepControl(2000);
			LOGGER.info("Approval : " + approvalStatus);

			if (approvalStatus.equals(AppConstants.APPROVAL_ACCEPT)) {
				count4 = 4;
				totalCountValue = (count4 - reducedCount);
				System.out.println("Total Count Value : " + totalCountValue);
				saveButtonControl(totalCountValue);
				LOGGER.info("Approval status updated successfully");
			
			}
		}

	}

	public void saveButtonControl(int count) throws Throwable {

		switch (count) {
		case 1:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave1();
			break;
		case 2:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave2();
			break;

		case 3:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave3();
			break;

		case 4:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave4();
			break;

		case 5:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave5();
			break;
		case 6:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave6();
			break;
		case 7:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave7();
			break;

		case 8:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave8();
			break;
		case 9:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave9();
			break;
		case 10:
			CommonUtility.sleepControl(2000);
			ReferralDocumentPOM.getInstance().clickTheSave10();
			break;
		default:
			break;
		}
	}
}
