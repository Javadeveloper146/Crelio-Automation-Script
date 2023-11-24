package com.stepDefinition;

import java.awt.Robot;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
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

	public static String JobPosition;
	public static Boolean counterPushCondition;
	public static Boolean counterError;
	public static String getTheTokenDetails;
	public static String counterStatus;
	public static String tokenForFemaleInPregnacyYes;
	public static String tokenforFemaleNoPregnacy;
	public static String tokenForMale;
	public static String Organization;
	public static Boolean genderStatus;
	public static String tokenLastTwoNumberForPregnacyYesAndMayBe;
	public static String tokenLastTwoNumberForPregnacyNo;
	public static String tokenLastTwoNumberForMale;
	public static String Year;
	public static String Month;
	public static String Day;

	public static String Package;

	public static String groTokenLastTwoNumberFinal;
	public static long groTotalSeconds;
	public static Long GROstart;
	public static Long secs;
	public static Long GROend;
	public static int count;
	public static String testName;
	public static String employeeName;
	public static String employeeId;
	public static String gender;
	public static String age;
	public static double birthdate;
	public static double ageInt;
	public static String testPackage;
	public static String yearTwo;
	public static String Bill_ID;
	public static String OrganizationInBill;
	public static Boolean Status;

	@Given("enter the url")
	public void enter_the_url() throws Throwable {
		File file = new File(
				"C:\\Users\\Jerry\\Downloads\\21-07-2023-20230721T114604Z-001\\21-07-2023\\glosys2.0\\src\\test\\resources\\CrelioReports.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		XSSFSheet sheet = workbook.getSheetAt(0);

		// System.out.println("Row count : " + rowCount + " Col Count1 : " + colCount1);
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
		try {
			CommonUtility.sleepControl(1000);
			RegistrationPOM.getInstance().clickGotIt();
		} catch (Exception e) {

		}

		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();

		System.out.println("Row count : " + rowCount + " Column Count : " + columnCount);
		int count = 132;// Result MIGUEL DAN EDUARDO CAMUEN
		for (int i = count; i <= rowCount; i++) {

			XSSFRow celldata = sheet.getRow(i);

			employeeId = celldata.getCell(0).getStringCellValue();
//			employeeId = celldata.getCell(1).getStringCellValue();
//			double yearincome = celldata.getCell(2).getNumericCellValue();

			employeeName = celldata.getCell(1).getStringCellValue();
			gender = celldata.getCell(3).getStringCellValue();
			double ageInt = celldata.getCell(4).getNumericCellValue();
			String ageConver = Double.toString(ageInt);
			age = ageConver.substring(0, 2);
			// age = celldata.getCell(4).getNumericCellValue();
			Year = celldata.getCell(5).getStringCellValue();
			Month = celldata.getCell(6).getStringCellValue();
			Day = celldata.getCell(7).getStringCellValue();
			Organization = celldata.getCell(10).getStringCellValue();
			testPackage = celldata.getCell(8).getStringCellValue();
			System.out.println("Serial Number : " + i);
			System.out.println("ID : " + employeeId);
			System.out.println("Name : " + employeeName);
			System.out.println("Gender : " + gender);
			System.out.println("Age : " + age);
			System.out.println("Year : " + Year);
			System.out.println("Month : " + Month);
			System.out.println("Day : " + Day);
			System.out.println("Organization : " + Organization);
			System.out.println("testPackage : " + testPackage);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//			ageInt = celldata.getCell(2).getNumericCellValue();
//			String ageConver = Double.toString(ageInt);
//			age = ageConver.substring(0, 2);
//			gender = celldata.getCell(3).getStringCellValue();
//			testPackage = celldata.getCell(4).getStringCellValue();
//
//			double yearincome = celldata.getCell(5).getNumericCellValue();
//			String ageConver1 = Double.toString(yearincome);
//			System.err.println(yearincome);
//			year = ageConver1.substring(0, 4);
//
//			month = celldata.getCell(6).getStringCellValue();
//			System.err.println(month);
//
//			double dayincome = celldata.getCell(7).getNumericCellValue();
//			String ageConver111 = Double.toString(dayincome);

			workbook.close();
			fileInputStream.close();

//			LOGGER.info(i + 1 + " Name : " + employeeName);
//			LOGGER.info(i + 1 + " Employee Id : " + employeeId);
//			LOGGER.info(i + 1 + " Age : " + age);
//			LOGGER.info(i + 1 + " Gender : " + gender);
//			LOGGER.info(i + 1 + " DOB : " + day + " - " + month + " - " + year);
//			LOGGER.info(i + 1 + " Test Packagee : " + testPackage);
			// LOGGER.info(i + " Name : " + employeeName);

//			System.out.println(i + " Name " + " : " + employeeName);
//			System.out.println("Employee Id" + " : " + employeeId);
//			System.out.println("Age" + " : " + age);
//			System.out.println("Gender " + " : " + gender);
//			System.out.println("Test Package" + " : " + testPackage);

//			String value = sheet.getRow(1).getCell(0).getStringCellValue();
//			String value1 = sheet.getRow(2).getCell(0).getStringCellValue();

			// -----------------------------------------------

			CommonUtility.sleepControl(3800);
			RegistrationPOM.getInstance().clickPatientType();

			CommonUtility.sleepControl(800);
		CommonUtility.enterFunction();
			CommonUtility.sleepControl(300);
			Patient_ID = RegistrationPOM.getInstance().getPatient_id();
			
			// LOGGER.info("Serial Number : " + i);
			LOGGER.info("Serial Number : " + i);
			LOGGER.info("Patient ID : " + Patient_ID);

			// RegistrationPOM.getInstance().clickDirect();
			LOGGER.info("Patient Type : Direct");
//		CommonUtility.sleepControl(500);
//		RegistrationPOM.getInstance().clickPatientName();

			CommonUtility.sleepControl(500);
			WebElement test12 = DriverManager.getDriver().findElement(By.xpath("//input[@id='labPatientId']"));
			Actions actions22 = new Actions(DriverManager.getDriver());
			actions22.sendKeys(test12, employeeId).build().perform();
			LOGGER.info("Patient MRN  ID : " + employeeId);
			CommonUtility.sleepControl(600);
			WebElement test99 = DriverManager.getDriver()
					.findElement(By.xpath("(//input[@aria-haspopup='listbox'])[2]"));
			Actions actions2 = new Actions(DriverManager.getDriver());
			actions2.sendKeys(test99, employeeName).build().perform();

			LOGGER.info("Patient Name : " + employeeName);
			CommonUtility.sleepControl(500);
			if (gender.equals(AppConstants.FEMALE_GENDER)) {
				RegistrationPOM.getInstance().clickFemale();
				LOGGER.info("Gender : Female");
			} else {
				RegistrationPOM.getInstance().clickMale();
				LOGGER.info("Gender : Male");
			}
			//

			CommonUtility.sleepControl(500);
			WebElement a1 = DriverManager.getDriver().findElement(By.xpath("(//input[@aria-autocomplete='list'])[4]"));
			Actions actions212 = new Actions(DriverManager.getDriver());
			actions212.sendKeys(a1, Day).build().perform();
			LOGGER.info("Day : " + Day);
			// CommonUtility.sleepControl(200);
			CommonUtility.enterFunction();
			Robot robot2 = new Robot();
//			CommonUtility.sleepControl(200);
//			robot2.keyPress(KeyEvent.VK_TAB);
//			robot2.keyRelease(KeyEvent.VK_TAB);

			CommonUtility.sleepControl(500);
			WebElement test1 = DriverManager.getDriver().findElement(By.xpath("//div[contains(text(),'Month')]"));
			Actions actions2121 = new Actions(DriverManager.getDriver());
			CommonUtility.sleepControl(200);
			actions2121.sendKeys(test1, Month).build().perform();
			LOGGER.info("Month : " + Month);
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();

			CommonUtility.sleepControl(500);
			WebElement test11111 = DriverManager.getDriver()
					.findElement(By.xpath("(//div[contains(text(),'year')])[1]"));
			Actions actions21111 = new Actions(DriverManager.getDriver());
			actions21111.sendKeys(test11111, Year).build().perform();
			CommonUtility.sleepControl(100);
			LOGGER.info("Year : " + Year);
			CommonUtility.enterFunction();
			// CommonUtility.sleepControl(500);
//			WebElement test11 = DriverManager.getDriver().findElement(By.xpath("//input[@id='age-year-input']"));
//			Actions actions21 = new Actions(DriverManager.getDriver());
//			actions21.sendKeys(test11, age).build().perform();
			LOGGER.info("Age : " + age);

			CommonUtility.sleepControl(500);
			WebElement test11112 = DriverManager.getDriver()
					.findElement(By.xpath("(//input[@aria-autocomplete='list'])[8]"));
			Actions actions21112 = new Actions(DriverManager.getDriver());
			actions21112.sendKeys(test11112, Organization).build().perform();
			LOGGER.info("Organization : " + Organization);
			CommonUtility.sleepControl(300);
			CommonUtility.enterFunction();
//			CommonUtility.sleepControl(400);
//			RegistrationPOM.getInstance().clickReferral();
//			CommonUtility.sleepControl(400);
//			RegistrationPOM.getInstance().clickSelf();
			CommonUtility.sleepControl(700);
			RegistrationPOM.getInstance().clickRegisterBill();
			CommonUtility.sleepControl(3200);
			WebElement test11 = DriverManager.getDriver()

					.findElement(By.xpath("(//input[@aria-autocomplete='list'])[18]"));
			Actions actions3 = new Actions(DriverManager.getDriver());
			actions3.sendKeys(test11, testPackage).build().perform();
			LOGGER.info("Test Name :" + testPackage);

			CommonUtility.sleepControl(1000);
			CommonUtility.enterFunction();
//
			CommonUtility.sleepControl(1000);
			RegistrationPOM.getInstance().clickTestAdd_Symbol();
//
//			CommonUtility.sleepControl(500);
//			WebElement test112 = DriverManager.getDriver()
//					.findElement(By.xpath("(//input[@aria-autocomplete='list'])[17]"));
//			Actions actions31 = new Actions(DriverManager.getDriver());
//			actions31.sendKeys(test112, ConstantProperties.TEST_NAME).build().perform();
//			CommonUtility.sleepControl(600);
//			CommonUtility.enterFunction();

			CommonUtility.sleepControl(500);
			Amount = RegistrationPOM.getInstance().getAmount();
			LOGGER.info("Amount : " + Amount);
//			CommonUtility.sleepControl(500);
//			RegistrationPOM.getInstance().enterPayTheAmount(Amount);
			CommonUtility.sleepControl(700);
			RegistrationPOM.getInstance().clickConfirm_And_Bill();

			CommonUtility.sleepControl(3000);
			Bill_ID = RegistrationPOM.getInstance().getBillID();
			LOGGER.info("Bill ID : " + Bill_ID);
			CommonUtility.sleepControl(500);
			RegistrationPOM.getInstance().clickClose();
			LOGGER.info(
					"________________________________________________________________________________________________");
			LOGGER.info("Patient ID : " + Patient_ID + " | Patient Name : " + employeeName + " | Age : " + age
					+ " | Employee ID : " + employeeId + " | Bill ID : " + Bill_ID);
			LOGGER.info(
					"_____________________________________Done_______________________________________________________");
		//	CommonUtility.sleepControl(1200);
//			robot2.keyPress(KeyEvent.VK_CONTROL);
//			robot2.keyPress(KeyEvent.VK_R);
//			robot2.keyRelease(KeyEvent.VK_CONTROL);
//			robot2.keyRelease(KeyEvent.VK_R);

//			try {
//				CommonUtility.sleepControl(2800);
//				RegistrationPOM.getInstance().clickReload();
//			} catch (Exception e) {
//
//			}
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
		result.testResultValue(testName);

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

		CommonUtility.sleepControl(1000);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_R);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_R);
		CommonUtility.sleepControl(1000);

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
