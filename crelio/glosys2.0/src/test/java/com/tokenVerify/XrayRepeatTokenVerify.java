package com.tokenVerify;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonUtility.CommonUtility;
import com.driverManager.DriverManager;
import com.modules.XrayModule;
import com.pageObjects.NurseModule;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;

public class XrayRepeatTokenVerify {
	private static final Logger LOGGER = LogManager.getLogger(XrayRepeatTokenVerify.class);

	public static int nurseTokenInLoop;
	private String nurseToken;
	private String groToken;
	private int nurseTokenStringtoInt;
	private int groTokenStringToInt;

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

	public void xrayRejectNext_token() throws Throwable {

		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickTheNextButton();
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheArrivedButton();
		CommonUtility.sleepControl(2500);

		WebElement pathToken = DriverManager.getDriver().findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
		// retrieving html attribute value using getAttribute() method
		String tokenValue = pathToken.getAttribute("id");

		setNurseToken(tokenValue);

	//	LOGGER.info("Xray Token : " + getNurseToken());

		// Get The Nurse Token NNDX0012
		String token = getNurseToken();

		// Get The Last Two Number In String = 12
		String getTheTokenLastTwoNumberInString = token.substring(token.length() - 2);
	//	LOGGER.info("Token Lenght For Xray String : " + getTheTokenLastTwoNumberInString);

		// Nurse Token Number 12 String To Integer Convert
		setNurseTokenStringtoInt(Integer.parseInt(getTheTokenLastTwoNumberInString));
	//	LOGGER.info(" Xray Current Token Number Next Token In Last Two Number " + getNurseTokenStringtoInt());

		// Hard Code Result
		// setGroToken("15");
		// Get The Gro Token Int "NND012"
		setGroToken(XrayModule.xrayQcRejectReferralToken);//
	//	LOGGER.info("Gro Token for String " + getGroToken());

		// GRO Token String To Integer Convert
		setGroTokenStringToInt(Integer.parseInt(getGroToken()));
	//	LOGGER.info("Gro Token Last Two Number In Int : " + getGroTokenStringToInt());

		CommonDefinition commonDefinition = new CommonDefinition();

		if (getNurseTokenStringtoInt() < getGroTokenStringToInt()) {
			LOGGER.info(
					"Xray Token : " + getNurseTokenStringtoInt() + " --" + " Gro Token  :" + getGroTokenStringToInt());
			do {
				commonDefinition.nurseNextTokenFlow();
				CommonUtility.sleepControl(1000);

				WebElement pathToken1 = DriverManager.getDriver()
						.findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
				// retrieving html attribute value using getAttribute() method
				String tokenValue1 = pathToken1.getAttribute("id");

				setNurseToken(tokenValue1);

				// LOGGER.error("Nurse Module Token Is :" + getTheToken);
		//		LOGGER.info("Xray Module  Loop Token : " + getNurseToken());

				// Loop Token
				String tokenInNurseLoop = getNurseToken();
				String loopTokenInNurse = tokenInNurseLoop.substring(tokenInNurseLoop.length() - 2);

				// Loop Token String To Int
				currentTokenNumber = (Integer.parseInt(loopTokenInNurse));
				nurseTokenInLoop = currentTokenNumber;

		//		LOGGER.info("Get The Loop Next Token For Xray  " + nurseTokenInLoop);

				LOGGER.info("Xray Token : " + nurseTokenInLoop + "--" + " Gro Token  :" + getGroTokenStringToInt());

			} while (nurseTokenInLoop < getGroTokenStringToInt());
		}

		LOGGER.info("GRO Referral Token : " + getGroTokenStringToInt() + " -- " + "Xray Token : "
				+ getNurseTokenStringtoInt());
		CommonUtility.sleepControl(1500);
		NurseModule.getInstance().clickTheVerifyTokenButton();
		LOGGER.info("Successfully Verified The Token");
	}
}
