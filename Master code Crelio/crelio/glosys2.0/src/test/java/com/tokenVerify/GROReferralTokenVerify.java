package com.tokenVerify;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonUtility.CommonUtility;
import com.driverManager.DriverManager;
import com.labJuniorFlow.LabJuniorWorkList;
import com.modules.XrayModule;
import com.pageObjects.GRODashBoard;
import com.pageObjects.NurseModule;
import com.referral.PrintReceipt;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;
import com.stepDefinition.GpModuleStepDefinition;
import com.stepDefinition.NurseModuleStepDefinition;

public class GROReferralTokenVerify {
	private static final Logger LOGGER = LogManager.getLogger(GROReferralTokenVerify.class);

	public static int nurseTokenInLoop;
	private String nurseToken;
	private String groToken;
	private int nurseTokenStringtoInt;
	private int groTokenStringToInt;

	public static String groTrimTokenRe;

	public int getNurseTokenStringtoInt() {
		return nurseTokenStringtoInt;
	}

	public void setNurseTokenStringtoInt(int nurseTokenStringtoInt) {
		this.nurseTokenStringtoInt = nurseTokenStringtoInt;
	}

	public String getNurseToken() {
		return nurseToken;
	}

	public String getGroToken() {
		return groToken;
	}

	public void setNurseToken(String nurseToken) {
		this.nurseToken = nurseToken;
	}

	public void setGroToken(String groToken) {
		this.groToken = groToken;
	}

	public int getGroTokenStringToInt() {
		return groTokenStringToInt;
	}

	public void setGroTokenStringToInt(int groTokenStringToInt) {
		this.groTokenStringToInt = groTokenStringToInt;
	}

	public static String groTokenNumberFinalString;
	public static int groTokenNumberFinalInteger;
	public static int currentTokenNumber;

	public void groReferralTokenVerify() throws Throwable {

		// Get The Last Two Number In String = 12

		String getTheTokenLastString ="10";// PrintReceipt.groReferralTokenString;
		System.err.println("Token " + getTheTokenLastString);
		
		String getTheTokenLastTwoNumberInString1 = getTheTokenLastString.substring(getTheTokenLastString.length() - 2);

		LOGGER.info("Token Lenght For Gro Ref String : " + getTheTokenLastTwoNumberInString1);

		try {
			// Nurse Token Number 12 String To Integer Convert
			setGroTokenStringToInt(Integer.parseInt(getTheTokenLastTwoNumberInString1));
			LOGGER.info(" GRO Ref Current Token Number Next Token In Last Two Number Int :" + getGroTokenStringToInt());
		} catch (Exception e) {
		}

		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickTheNextButton();
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheArrivedButton();
		CommonUtility.sleepControl(2000);

		WebElement pathToken = DriverManager.getDriver().findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
		// retrieving html attribute value using getAttribute() method
		String tokenValue = pathToken.getAttribute("id");
		System.out.println("Value of type attribute: " + tokenValue);

		setNurseToken(tokenValue);

		LOGGER.info("Nurse Module Token : " + getNurseToken());

		// Get The Nurse Token NNDX0012
		String token = getNurseToken();

		// Get The Last Two Number In String = 12
		String getTheTokenLastTwoNumberInString = token.substring(token.length() - 2);
		LOGGER.info("Token Lenght For Nurse String : " + getTheTokenLastTwoNumberInString);

		try {
			// Nurse Token Number 12 String To Integer Convert
			setNurseTokenStringtoInt(Integer.parseInt(getTheTokenLastTwoNumberInString));
			LOGGER.info(" Nurse Current Token Number Next Token In Last Two Number :" + getNurseTokenStringtoInt());
		} catch (Exception e) {

		}

		CommonDefinition commonDefinition = new CommonDefinition();
		LOGGER.info("Gro Ref Token  " + getGroTokenStringToInt());
		LOGGER.info("Nurse Token :" + getNurseTokenStringtoInt());

		if (getNurseTokenStringtoInt() < getGroTokenStringToInt()) {
			LOGGER.info(
					"Nurse Token : " + getNurseTokenStringtoInt() + "--" + " Gro Token  :" + getGroTokenStringToInt());
			do {
				commonDefinition.nurseNextTokenFlow();
				CommonUtility.sleepControl(1000);

				WebElement pathToken1 = DriverManager.getDriver()
						.findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
				// retrieving html attribute value using getAttribute() method
				String tokenValue1 = pathToken1.getAttribute("id");
				System.out.println("Value of type attribute: " + tokenValue1);

				System.out.println("LOOP TOKEN :" + tokenValue1);

				setNurseToken(tokenValue1);

				// LOGGER.error("Nurse Module Token Is :" + getTheToken);
				LOGGER.info("Nurse Module  Loop Token : " + getNurseToken());

				// Loop Token
				String tokenInNurseLoop = getNurseToken();
				String loopTokenInNurse = tokenInNurseLoop.substring(tokenInNurseLoop.length() - 2);

				// Loop Token String To Int
				currentTokenNumber = (Integer.parseInt(loopTokenInNurse));
				nurseTokenInLoop = currentTokenNumber;

				LOGGER.info("Get The Loop Next Token For Nurse  " + nurseTokenInLoop);

				LOGGER.info("Nurse Token : " + nurseTokenInLoop + "--" + " Gro Token  :" + getGroTokenStringToInt());

			} while (nurseTokenInLoop < getGroTokenStringToInt());
		}
		CommonUtility.sleepControl(2000);

		NurseModule.getInstance().clickTheVerifyTokenButton();
		LOGGER.info("Successfully Verified in Token");
	}

}
