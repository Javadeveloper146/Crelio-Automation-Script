package com.referralHandler;

import java.util.HashMap;
import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.pageObjects.GpModule;

public class gpReferralDocumentHandler {

	public static boolean firstAcceptStatus;
	public static boolean secondAcceptStatus;
	public static boolean thirdAcceptStatus;
	public static boolean fourthAcceptStatus;
	public static boolean fivethAcceptStatus;
	public static boolean sixthAcceptStatus;

	public void referralDocument() {

		firstAcceptStatus = GpModule.getInstance().getTheFirstAcceptIconStatus();
		secondAcceptStatus = GpModule.getInstance().getTheSecondAcceptIconStatus();
		thirdAcceptStatus = GpModule.getInstance().getTheThreeAcceptIconStatus();
		fourthAcceptStatus = GpModule.getInstance().getTheFourAcceptIconStatus();
		fivethAcceptStatus = GpModule.getInstance().getTheFiveAcceptIconStatus();
		sixthAcceptStatus = GpModule.getInstance().getTheSixAcceptIconStatus();

		HashMap<Integer, Boolean> getTheAllValue = new HashMap<Integer, Boolean>();
		getTheAllValue.put(1, firstAcceptStatus);
		getTheAllValue.put(2, secondAcceptStatus);
		getTheAllValue.put(3, thirdAcceptStatus);
		getTheAllValue.put(4, fourthAcceptStatus);
		getTheAllValue.put(5, fivethAcceptStatus);
		getTheAllValue.put(6, sixthAcceptStatus);
		System.err.println(getTheAllValue);

		if (firstAcceptStatus == true) {
			GpModule.getInstance().clickTheFirstAcceptIcon();
			GpModule.getInstance().clickTheSaveOne();
			
			// Click The close Ref
		}

		if (secondAcceptStatus == true) {
			GpModule.getInstance().clickTheSecondAcceptIcon();
			GpModule.getInstance().clickTheSaveTwo();
		}
		if (thirdAcceptStatus == true) {
			GpModule.getInstance().clickTheThreeAcceptIcon();
			GpModule.getInstance().clickTheSaveThree();
		}
		if (fourthAcceptStatus == true) {

			GpModule.getInstance().clickTheFourAcceptIcon();
			GpModule.getInstance().clickTheSaveFour();
		}

		if (fivethAcceptStatus == true) {
			GpModule.getInstance().clickTheFourAcceptIcon();
			GpModule.getInstance().clickTheSaveFive();
		}

		if (sixthAcceptStatus == true) {
			GpModule.getInstance().clickTheSixAcceptIcon();
			GpModule.getInstance().clickTheSaveSix();
		}
	}
	
	public void certificatePage() throws Throwable {
		
		// Click The Certificate
		
		GpModule.getInstance().clickTheCertificate();
		
		// Enter The Comments
		GpModule.getInstance().enterTheCommentsForCertificate(AppConstants.COMMON_COMMENTS);
		
		CommonUtility.scrollDown100();
		
		// Click The Assigned to
		GpModule.getInstance().clickTheAssignedTo();
		CommonUtility.enterFunction();
		
		GpModule.getInstance().clickTheSaveCertificate();
	}
}
