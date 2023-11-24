package com.tokenVerify;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.pageObjects.NurseModule;
import com.stepDefinition.CommonDefinition;
import com.stepDefinition.GROStepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NurseTokenVerify {
	private static final Logger LOGGER = LogManager.getLogger(NurseTokenVerify.class);

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

	public void next_token() throws Throwable {
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2800);
		} else {
		CommonUtility.sleepControl(2000);
		}
		NurseModule.getInstance().clickTheNextButton();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2100);
		} else {
			CommonUtility.sleepControl(1500);
		}
		NurseModule.getInstance().clickTheArrivedButton();

		WebElement pathToken = DriverManager.getDriver().findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
		// retrieving html attribute value using getAttribute() method
		String tokenValue = pathToken.getAttribute("id");

		setNurseToken(tokenValue);

		// LOGGER.info("Nurse Module Token : " + getNurseToken());

		// Get The Nurse Token NNDX0012
		String token = getNurseToken();

		// Get The Last Two Number In String = 12
		String getTheTokenLastTwoNumberInString = token.substring(token.length() - 2);
		// LOGGER.info("Token Lenght For Nurse String : " +
		// getTheTokenLastTwoNumberInString);

		try {
			// Nurse Token Number 12 String To Integer Convert
			setNurseTokenStringtoInt(Integer.parseInt(getTheTokenLastTwoNumberInString));
			// LOGGER.info(" Nurse Current Token Number Next Token In Last Two Number " +
			// getNurseTokenStringtoInt());
		} catch (Exception e) {

		}

		try {

			// Hard Code Result
			// setGroToken("15");
			// Get The Gro Token Int "NND012"
			setGroToken(GROStepDefinition.groTokenLastTwoNumberFinal);
			// LOGGER.info("Gro Token for String " + getGroToken());
		} catch (Exception e) {
		}

		try {
			// GRO Token String To Integer Convert
			setGroTokenStringToInt(Integer.parseInt(getGroToken()));
			// LOGGER.info("Gro Token Last Two Number In Int: " + getGroTokenStringToInt());
		} catch (Exception e) {
		}

		CommonDefinition commonDefinition = new CommonDefinition();

		if (getNurseTokenStringtoInt() < getGroTokenStringToInt()) {
			LOGGER.info(
					"Nurse Token : " + getNurseTokenStringtoInt() + " --" + " Gro Token  :" + getGroTokenStringToInt());
			do {
				commonDefinition.nurseNextTokenFlow();

				WebElement pathToken1 = DriverManager.getDriver()
						.findElement(By.xpath("//input[@formcontrolname='tokenNo']"));
				// retrieving html attribute value using getAttribute() method
				String tokenValue1 = pathToken1.getAttribute("id");

				// System.out.println("LOOP TOKEN :" + tokenValue1);

				setNurseToken(tokenValue1);

				// LOGGER.error("Nurse Module Token Is :" + getTheToken);
				LOGGER.info("Nurse Module  Loop Token : " + getNurseToken());

				// Loop Token
				String tokenInNurseLoop = getNurseToken();
				String loopTokenInNurse = tokenInNurseLoop.substring(tokenInNurseLoop.length() - 2);

				// Loop Token String To Int
				currentTokenNumber = (Integer.parseInt(loopTokenInNurse));
				nurseTokenInLoop = currentTokenNumber;

				// LOGGER.info("Get The Loop Next Token For Nurse " + nurseTokenInLoop);

				LOGGER.info("Nurse Token : " + nurseTokenInLoop + "--" + " Gro Token  :" + getGroTokenStringToInt());

			} while (nurseTokenInLoop < getGroTokenStringToInt());
		}
		LOGGER.info("Nurse Token : " + nurseTokenInLoop + "--" + " Gro Token  :" + getGroTokenStringToInt());
		;
	}

}
