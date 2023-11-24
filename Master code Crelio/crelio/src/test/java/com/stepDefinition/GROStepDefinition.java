package com.stepDefinition;

import java.awt.Robot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hamcrest.DiagnosingMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.modulesPOM.RegistrationPOM;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LoginPage;
import com.pageObjects.PatientProfiles;
import com.testName.TestResult;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class GROStepDefinition {

	public static String Patient_ID;
	public static String Amount;
	private static final Logger LOGGER = LogManager.getLogger(GROStepDefinition.class);
	CommonUtility commonUtility = new CommonUtility();

	public static long millisecondsForGro;
	public static String gender;
	public static String JobPosition;
	public static Boolean counterPushCondition;
	public static Boolean counterError;
	public static String getTheTokenDetails;
	public static String counterStatus;
	public static String tokenForFemaleInPregnacyYes;
	public static String tokenforFemaleNoPregnacy;
	public static String tokenForMale;

	public static Boolean genderStatus;
	public static String tokenLastTwoNumberForPregnacyYesAndMayBe;
	public static String tokenLastTwoNumberForPregnacyNo;
	public static String tokenLastTwoNumberForMale;

	public static String groTokenLastTwoNumberFinal;
	public static long groTotalSeconds;
	public static Long GROstart;
	public static Long secs;
	public static Long GROend;
	public static int count;
	public static Boolean Status;

	@Given("enter the url")
	public void enter_the_url() throws Throwable {
		File file = new File(
				"C:\\Users\\Jerry\\Desktop\\Master code Crelio\\crelio\\src\\test\\resources\\ReportFile.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();

		System.out.println("Row count : " + rowCount + "Col Count : " + colCount);

		LOGGER.info("Crelio Automation Script Run In :  " + ConstantProperties.BROWSER + " Browser");
		DriverManager.getDriver().get(ConstantProperties.APPURL);

		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(200);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);

		CommonUtility.sleepControl(200);
		LoginPage.getInstance().clickTheSignInButton();
		CommonUtility.sleepControl(700);
		try {
			Status = RegistrationPOM.getInstance().getTheLoginStatus();
		} catch (Exception e) {
			Status = false;
		}

		if (Status == true) {
			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().clickLogin_Close();
		}
		for (int i = 0; i <= rowCount; i++) {

			XSSFRow celldata = sheet.getRow(i);

			String testName = celldata.getCell(0).getStringCellValue();
			System.out.println(i + " : " + testName);

			String value = sheet.getRow(1).getCell(0).getStringCellValue();

			workbook.close();
			fileInputStream.close();

			CommonUtility.sleepControl(3000);
			RegistrationPOM.getInstance().clickPatientType();

			CommonUtility.sleepControl(200);
			Patient_ID = RegistrationPOM.getInstance().getPatient_id();
			LOGGER.info("Patient ID : " + Patient_ID);

			CommonUtility.sleepControl(700);
			RegistrationPOM.getInstance().clickDirect();
			LOGGER.info("Select Patient Type : Direct");
//		CommonUtility.sleepControl(500);
//		RegistrationPOM.getInstance().clickPatientName();

			CommonUtility.sleepControl(500);
			WebElement test = DriverManager.getDriver()
					.findElement(By.xpath("//div[contains(text(),'Enter Patient Name')]"));
			Actions actions2 = new Actions(DriverManager.getDriver());
			actions2.sendKeys(test, testName).build().perform();

			LOGGER.info("Patient Name :" + testName);
			CommonUtility.sleepControl(500);
			if (ConstantProperties.GENDER.equals(AppConstants.FEMALE_GENDER)) {
				RegistrationPOM.getInstance().clickFemale();
				LOGGER.info("Gender : Female");
			} else {
				RegistrationPOM.getInstance().clickMale();
				LOGGER.info("Gender : Male");
			}

			CommonUtility.sleepControl(500);
			WebElement test11 = DriverManager.getDriver().findElement(By.xpath("//input[@id='age-year-input']"));
			Actions actions21 = new Actions(DriverManager.getDriver());
			actions21.sendKeys(test11, ConstantProperties.AGE).build().perform();
			LOGGER.info("Age : " + ConstantProperties.AGE);

			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().clickOrganisation();

			CommonUtility.sleepControl(400);
			RegistrationPOM.getInstance().clickDirect2();

			CommonUtility.sleepControl(400);
			RegistrationPOM.getInstance().clickReferral();
			CommonUtility.sleepControl(400);
			RegistrationPOM.getInstance().clickSelf();
			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().clickRegisterBill();
			CommonUtility.sleepControl(2000);
			WebElement test1 = DriverManager.getDriver()
					.findElement(By.xpath("(// div[contains(text(),'Search & Select List')])[1]"));
			Actions actions3 = new Actions(DriverManager.getDriver());
			actions3.sendKeys(test1, testName).build().perform();
			LOGGER.info("Test Name :" + testName);

			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();

			CommonUtility.sleepControl(1200);
			RegistrationPOM.getInstance().clickTestAdd_Symbol();
			CommonUtility.sleepControl(500);
			Amount = RegistrationPOM.getInstance().getAmount();
			LOGGER.info("Amount : " + Amount);
			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().enterPayTheAmount(Amount);
			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().clickConfirm_And_Bill();

			CommonUtility.sleepControl(2500);
			RegistrationPOM.getInstance().clickReceive_Print();
		//	CommonUtility.sleepControl(2000);
			Robot robot2 = new Robot();
//			robot2.keyPress(KeyEvent.VK_CONTROL);
//			robot2.keyPress(KeyEvent.VK_W);
//			robot2.keyRelease(KeyEvent.VK_CONTROL);
//			robot2.keyRelease(KeyEvent.VK_W);
			CommonUtility.sleepControl(1300);
			RegistrationPOM.getInstance().clickClose();
			CommonUtility.sleepControl(1200);

			CommonUtility.sleepControl(1000);
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_R);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			robot2.keyRelease(KeyEvent.VK_R);
			CommonUtility.sleepControl(1000);
		}
			CommonUtility.sleepControl(1500);
			RegistrationPOM.getInstance().clickRegistration2();

			CommonUtility.sleepControl(600);
			RegistrationPOM.getInstance().clickOperation2();

			CommonUtility.sleepControl(1000);
			Set<String> handles1 = DriverManager.getDriver().getWindowHandles();
			List<String> list1 = new ArrayList<>(handles1);
			CommonUtility.sleepControl(200);
			DriverManager.getDriver().switchTo().window(list1.get(1));

			CommonUtility.sleepControl(4000);
			RegistrationPOM.getInstance().clickThePatientId();

			CommonUtility.sleepControl(1000);
			WebElement test4 = DriverManager.getDriver().findElement(By.xpath(
					"//div[contains(text(),'Select by Patient Id / Patient Name / Accession Number / Bill Id / Order Id / National ID')]"));
			Actions actions5 = new Actions(DriverManager.getDriver());
			actions5.sendKeys(test4, Patient_ID).build().perform();

			CommonUtility.sleepControl(2000);
			CommonUtility.enterFunction();

			CommonUtility.sleepControl(2000);
			RegistrationPOM.getInstance().clickTable2();

			TestResult result = new TestResult();
		//	result.testResultValue(testName);

			CommonUtility.sleepControl(2000);
			RegistrationPOM.getInstance().enterPasskey("123");

			CommonUtility.sleepControl(2000);
			RegistrationPOM.getInstance().clickSaveAndSign();
			LOGGER.info("Report Updated Successfully ");

			CommonUtility.sleepControl(2500);
			RegistrationPOM.getInstance().clickReview();

			CommonUtility.sleepControl(1500);
			RegistrationPOM.getInstance().clickWith_LetterHead();
			CommonUtility.sleepControl(1000);
			Robot robot2 = new Robot();
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_S);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			robot2.keyRelease(KeyEvent.VK_S);
			CommonUtility.sleepControl(300);
			CommonUtility.enterFunction();

			CommonUtility.sleepControl(1000);
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_W);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			robot2.keyRelease(KeyEvent.VK_W);
		

			CommonUtility.sleepControl(1000);
			robot2.keyPress(KeyEvent.VK_CONTROL);
			robot2.keyPress(KeyEvent.VK_W);
			robot2.keyRelease(KeyEvent.VK_CONTROL);
			robot2.keyRelease(KeyEvent.VK_W);

			
	}

	@When("enter the valid userId login")
	public void enter_the_valid_userId_login() throws Throwable {

//		CommonUtility.sleepControl(4500);
//		WebElement element = DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Admin')]"));
//		Actions actions = new Actions(DriverManager.getDriver());
//
//		actions.moveToElement(element).click().build().perform();
//
//		LOGGER.info("Registration : ");
//		CommonUtility.sleepControl(1500);
//		RegistrationPOM.getInstance().clickRegistration();

//		CommonUtility.sleepControl(2000);
//		RegistrationPOM.getInstance().clickSearch_SelectList();

//		CommonUtility.sleepControl(500);
//		RegistrationPOM.getInstance().clickCash();

//		Robot robot2 = new Robot();
//		robot2.keyPress(KeyEvent.VK_CONTROL);
//		robot2.keyPress(KeyEvent.VK_W);
//		robot2.keyRelease(KeyEvent.VK_CONTROL);
//		robot2.keyRelease(KeyEvent.VK_W);
//		CommonUtility.sleepControl(1000);
//		RegistrationPOM.getInstance().clickPrint_Receipt();
//
//		CommonUtility.sleepControl(1500);
//
//		robot2.keyPress(KeyEvent.VK_CONTROL);
//		robot2.keyPress(KeyEvent.VK_W);
//		robot2.keyRelease(KeyEvent.VK_CONTROL);
//		robot2.keyRelease(KeyEvent.VK_W);

//		CommonUtility.sleepControl(2000);
//		RegistrationPOM.getInstance().clickRegistration2();
//
//		CommonUtility.sleepControl(1500);
//		RegistrationPOM.getInstance().clickAccession();
//
//		CommonUtility.sleepControl(2000);
//		Set<String> handles = DriverManager.getDriver().getWindowHandles();
//		List<String> list = new ArrayList<>(handles);
//		CommonUtility.sleepControl(200);
//		DriverManager.getDriver().switchTo().window(list.get(1));
//		// RegistrationPOM.getInstance().clickCheck_Box();
//
//		CommonUtility.sleepControl(3000);
//		WebElement test4 = DriverManager.getDriver().findElement(By.xpath(
//				"//div[contains(text(),'Select by Patient Id / Patient Name / Accession Number / Bill Id / Order Id / National ID')]"));
//		Actions actions5 = new Actions(DriverManager.getDriver());
//		actions5.sendKeys(test4, Patient_ID).build().perform();
//
//		CommonUtility.sleepControl(2000);
//		CommonUtility.enterFunction();
//
//		CommonUtility.sleepControl(3000);
//		RegistrationPOM.getInstance().clickCollect_Print();
//
//		CommonUtility.sleepControl(1500);
//		Robot robot3 = new Robot();
//		robot3.keyPress(KeyEvent.VK_CONTROL);
//		robot3.keyPress(KeyEvent.VK_W);
//		robot3.keyRelease(KeyEvent.VK_CONTROL);
//		robot3.keyRelease(KeyEvent.VK_W);
//
//		CommonUtility.sleepControl(2500);
//		RegistrationPOM.getInstance().clickReceive();

	}

	@When("select the role selection")
	public void select_the_role_selection() throws Throwable {

		CommonUtility.sleepControl(1500);
		RegistrationPOM.getInstance().clickRegistration2();

		CommonUtility.sleepControl(600);
		RegistrationPOM.getInstance().clickOperation2();

		CommonUtility.sleepControl(1000);
		Set<String> handles1 = DriverManager.getDriver().getWindowHandles();
		List<String> list1 = new ArrayList<>(handles1);
		CommonUtility.sleepControl(200);
		DriverManager.getDriver().switchTo().window(list1.get(1));

		CommonUtility.sleepControl(3000);
		RegistrationPOM.getInstance().clickThePatientId();

		CommonUtility.sleepControl(1000);
		WebElement test4 = DriverManager.getDriver().findElement(By.xpath(
				"//div[contains(text(),'Select by Patient Id / Patient Name / Accession Number / Bill Id / Order Id / National ID')]"));
		Actions actions5 = new Actions(DriverManager.getDriver());
		actions5.sendKeys(test4, Patient_ID).build().perform();

		CommonUtility.sleepControl(2000);
		CommonUtility.enterFunction();

		CommonUtility.sleepControl(2000);
		CommonUtility.enterFunction();

		TestResult result = new TestResult();
		result.testResultValue(ConstantProperties.TEST_NAME);

	}

	@When("select the counter	selection")
	public void select_the_counter_selection() throws Throwable {
		CommonUtility.sleepControl(2000);
		RegistrationPOM.getInstance().enterPasskey("123");

		CommonUtility.sleepControl(1000);
		RegistrationPOM.getInstance().clickSaveAndSign();
		LOGGER.info("Report Updated Successfully ");

		CommonUtility.sleepControl(1500);
		RegistrationPOM.getInstance().clickReview();
		

//		Robot robot3 = new Robot();
//		CommonUtility.sleepControl(1500);
//		robot3.keyPress(KeyEvent.VK_LEFT);
//		robot3.keyRelease(KeyEvent.VK_LEFT);
//		
//		CommonUtility.sleepControl(1000);
//		robot3.keyPress(KeyEvent.VK_CONTROL);
//		robot3.keyPress(KeyEvent.VK_S);
//		robot3.keyRelease(KeyEvent.VK_CONTROL);
//		robot3.keyRelease(KeyEvent.VK_S);

//		CommonUtility.sleepControl(5000);

//		
//		CommonUtility.sleepControl(1000);
		// RegistrationPOM.getInstance().clickSubmit();
//		LOGGER.info("Report has been submitted Successfully ");
	}

}
