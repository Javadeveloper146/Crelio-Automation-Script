package com.stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.commonUtility.LabPropertiesValidation;
import com.commonUtility.Validation;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.modules.CredentialsController;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabJunior;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.PatientProfiles;
import io.cucumber.java.Before;

public class CommonDefinition {
	public static String counterStatus;
	public static Boolean counterPushCondition;
	public static String testName;
	public static String employeeId;
	public static String employeeName;
	public static String Year;
	public static String Month;
	public static String Day;
	public static String gender;
	public static String Package;
	public static String age;
	private static final Logger LOGGER = LogManager.getLogger(CommonDefinition.class);

	@Before
	public void beforeScenario() throws Throwable {
//		File file = new File(
//				"C:\\Users\\Jerry\\Downloads\\21-07-2023-20230721T114604Z-001\\21-07-2023\\glosys2.0\\src\\test\\resources\\CrelioReports.xlsx");
//
//		FileInputStream fileInputStream = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//
//		XSSFSheet sheet = workbook.getSheetAt(0);
//
//		
//	
//		int rowCount = sheet.getLastRowNum();
//		int columnCount = sheet.getRow(0).getLastCellNum();
//
//		System.out.println("Row count : " + rowCount + " Column Count : " + columnCount);
//		int count = 1;//
//		for (int i = count; i <= rowCount; i++) {
//
//			XSSFRow celldata = sheet.getRow(i);
//
//			
//			employeeId = celldata.getCell(0).getStringCellValue();
////			employeeId = celldata.getCell(1).getStringCellValue();
////			double yearincome = celldata.getCell(2).getNumericCellValue();
//
//			employeeName = celldata.getCell(1).getStringCellValue();
//			gender = celldata.getCell(3).getStringCellValue();
//			double ageInt = celldata.getCell(4).getNumericCellValue();
//			String ageConver = Double.toString(ageInt);
//			age = ageConver.substring(0, 2);
//			// age = celldata.getCell(4).getNumericCellValue();
//			Year = celldata.getCell(5).getStringCellValue();
//			Month = celldata.getCell(6).getStringCellValue();
//			Day = celldata.getCell(7).getStringCellValue();
//			System.out.println("Serial Number : " + i);
//			System.out.println("ID : " + employeeId);
//			System.out.println("Name : " + employeeName);
//			System.out.println("Gender : " + gender);
//			System.out.println("Age : " + age);
//			System.out.println("Year : " + Year);
//			System.out.println("Month : " + Month);
//			System.out.println("Day : " + Day);
//
////			ageInt = celldata.getCell(2).getNumericCellValue();
////			String ageConver = Double.toString(ageInt);
////			age = ageConver.substring(0, 2);
////			gender = celldata.getCell(3).getStringCellValue();
////			testPackage = celldata.getCell(4).getStringCellValue();
////
////			double yearincome = celldata.getCell(5).getNumericCellValue();
////			String ageConver1 = Double.toString(yearincome);
////			System.err.println(yearincome);
////			year = ageConver1.substring(0, 4);
////
////			month = celldata.getCell(6).getStringCellValue();
////			System.err.println(month);
////
////			double dayincome = celldata.getCell(7).getNumericCellValue();
////			String ageConver111 = Double.toString(dayincome);
//
//			workbook.close();
//			fileInputStream.close();
//		}

		// ---------------------------------------------------------------------------------------------------------
//		File file = new File(
//				"C:\\\\Users\\\\Jerry\\\\Downloads\\\\21-07-2023-20230721T114604Z-001\\\\21-07-2023\\\\glosys2.0\\\\src\\\\test\\\\resources\\\\CrelioReports.xlsx");
//
//		FileInputStream fileInputStream = new FileInputStream(file);
//		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
//
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		int rowCount = sheet.getLastRowNum();
//		int columnCount = sheet.getRow(0).getLastCellNum();
//
//		System.out.println("Row count : " + rowCount + " Column Count : " + columnCount);
//		int count = 1;//Not Edit
//		for (int i = count; i <= rowCount; i++) {
//
//			XSSFRow celldata = sheet.getRow(i);
//			String employeeName = celldata.getCell(0).getStringCellValue();
//			//employeeId = celldata.getCell(1).getStringCellValue();
//			//double yearincome = celldata.getCell(2).getNumericCellValue();
//		
//			workbook.close();
//			fileInputStream.close();
//			
//			LOGGER.info("ID : " + i);
//			LOGGER.info("Employee Name : " + employeeName);
		// LOGGER.info("Employee ID : " + employeeId);
		// LOGGER.info("Age : " + yearincome);

		// LOGGER.info("Glosys2.0 Application Execution Started....");

		try {

			LocalDate date = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
			String formattedString = date.format(formatter);
			System.err.println(formattedString);

			String expiryDate = "30 June 2023";
			String dateTrim = formattedString.substring(0, 2);

			int expiryNumber = Integer.parseInt(dateTrim);

			System.err.println(expiryNumber);

			if (expiryNumber <= 30) {
				CommonUtility commonUtility = new CommonUtility();
				commonUtility.loadProperties();

			} else {
				System.err.println("  :)-(:__-- Automation Code Invalid Please Contact Stemz Developer --__:)-(: ");
			}
			if (DriverManager.getDriver() == null) {

				DriverManager.launchTheBrowser();

				// Browser Size Control
				DriverManager.browserMaxize();

				// Browser Cookies Clear
				DriverManager.allCookiesClear();
				// Controlled By CommonUtility
				CommonUtility.initialWebElementsOfPageObjects();
//				}else {
//					System.err.println(" Wrong Password Try Again" );
//				}

			}

		} catch (Exception e) {

		}

	}

	public void Login() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
		CommonUtility.sleepControl(500);
	}

	public void logOut() throws Throwable {
		CommonUtility.sleepControl(2000);
		PatientProfiles.getInstance().clickTheLogOutProfile();
		CommonUtility.sleepControl(700);
		PatientProfiles.getInstance().clickTheLogout();
		CommonUtility.sleepControl(500);
		PatientProfiles.getInstance().clickTheYesOption();

		LOGGER.info("Logout Successfully");
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().closeTheDownPopUp();
	}

	public void groUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void nurseUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void stemzGpUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void labJuniorUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void labSeniorUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void labSupervisorUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void xrayUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void moiUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void mohUserNameAndPassword() throws Throwable {
		CommonUtility.sleepControl(1000);
		LoginPage.getInstance().enterTheUserName(ConstantProperties.USERNAME);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().enterThePassword(ConstantProperties.PASSWORD);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
	}

	public void pregnantOptionYes() throws Throwable {
		Boolean pregnancyCareWithRPRpackageStatus = PatientProfiles.getInstance()
				.checkThePregnancyCareWithRPRPackageStatus();
		LOGGER.info("Pregnancy care with RPR" + ": " + pregnancyCareWithRPRpackageStatus);

	}

	public void pregnantOptionMaybe() throws Throwable {
		LOGGER.info("Pregnancy care with RPR" + ": "
				+ PatientProfiles.getInstance().checkThePregnancyCareWithRPRPackageStatus());

	}

	public void pregnantOptionNo() throws Throwable {
		LOGGER.info("Medical Visa Package RPR" + ": " + PatientProfiles.getInstance().checkTheMedicalVisaPackageRPR());
		LOGGER.info("MMR AND TD Vaccination" + ": " + PatientProfiles.getInstance().checkTheMMRAndTDVaccination());
		LOGGER.info("Chest Xray" + ": " + PatientProfiles.getInstance().checkTheChestXrayStatus());

	}

	public void maleApplicant() throws Throwable {
		LOGGER.info("Medical Visa Package RPR" + ": " + PatientProfiles.getInstance().checkTheMedicalVisaPackageRPR());
		LOGGER.info("MMR AND TD Vaccination" + ": " + PatientProfiles.getInstance().checkTheMMRAndTDVaccination());
		LOGGER.info("Chest Xray" + ": " + PatientProfiles.getInstance().checkTheChestXrayStatus());

	}

	public void visaGenderTypeFemale() throws Throwable {
		CommonUtility.sleepControl(6000);
		PatientProfiles.getInstance().clickTheSaveAndPrintButton();
		CommonUtility.sleepControl(3000);
		CommonUtility.scrollUp100();

		// Get All Error Message
		LOGGER.error(PatientProfiles.getInstance().getTheTitleError());
		// LOGGER.error(PatientProfiles.getInstance().getTheMaritalError());

		LOGGER.error(PatientProfiles.getInstance().getThePregnacyError());

		// LOGGER.error(PatientProfiles.getInstance().getTheCountryError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getTheLangSpeakError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getTheLangReadError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getThePrefferedLocationError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getThePreHospitalError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getTheSMSAlertError());
		CommonUtility.sleepControl(600);
		// LOGGER.error(PatientProfiles.getInstance().getTheRecurimentAgencyError());

	}

	public void visaGenderTypeMale() throws Throwable {
		CommonUtility.sleepControl(6000);
		PatientProfiles.getInstance().clickTheSaveAndPrintButton();
		CommonUtility.sleepControl(1000);

		// Get All Error Message
		LOGGER.error(PatientProfiles.getInstance().getTheTitleError());
		// LOGGER.error(PatientProfiles.getInstance().getTheMaritalError());

		LOGGER.error(PatientProfiles.getInstance().getThePregnacyError());

		// LOGGER.error(PatientProfiles.getInstance().getTheCountryError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getTheLangSpeakError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getTheLangReadError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getThePrefferedLocationError());
		CommonUtility.sleepControl(600);
		LOGGER.error(PatientProfiles.getInstance().getThePreHospitalError());
		// CommonUtility.sleepControl(600);
		// LOGGER.error(PatientProfiles.getInstance().getTheSMSAlertError());
		CommonUtility.sleepControl(4000);
		CommonUtility.scrollUp500();

	}

	public void gro_module_capture_identify_page_vaccination_document_upload_function() throws Throwable {

		// Incase Vaccination Document Upload Using this

		// Upload Document Condition
		String vaccinationDocumentPathLocation = AppConstants.VACCINATION_DOCUMENT_PATH;
		StringSelection stringSelection = new StringSelection(vaccinationDocumentPathLocation);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		CommonUtility.sleepControl(2500);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		CommonUtility.sleepControl(2500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		LOGGER.info("Vaccination Document Upload Successfully");
	}

	public void uploadDocumentRobotFunction() throws Throwable {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public void vaccinationDocumentUploadedInGROModuleAndNurseModuleNoOptionChooseAndResonSelected() throws Throwable {
		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickTheTDVaccineNoRadioButton();
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheVaccineSelectReason();
		CommonUtility.sleepControl(1000);
		CommonUtility.enterFunction();
		// Click The "No" Radio Button in "MMR Vaccine"
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheMMRVaccineNoRadioButton();
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheVaccineSelectReason();
		CommonUtility.sleepControl(1000);
		CommonUtility.enterFunction();
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheVaccineSaveButton();
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheVaccineInformationYesOption();
		CommonUtility.sleepControl(3000);
	}

	public void vaccinationDocumentNotUploadInGROModuleByNurseModuleEnterTheBatchNumber() throws Throwable {
		CommonUtility.sleepControl(1800);
		NurseModule.getInstance().clickTheTDVaccineYesRadioButton();

		// Click The TD Vaccine Box

		// Enter The TD Vaccine Batch Number
		CommonUtility.sleepControl(200);
		NurseModule.getInstance().enterTheTDVaccineDetails(AppConstants.TD_VACCINE_BATCH_NUMBER);
		LOGGER.info("TD VAccine Batch Number : " + AppConstants.TD_VACCINE_BATCH_NUMBER);
		LOGGER.info("Successfully enter the TD Vaccine Details");

		// MMR Vaccine
		// Click The MMR Vaccine "Yes" Radio Button
		CommonUtility.sleepControl(200);
		NurseModule.getInstance().clickTheMMRVaccineYesRadioButton();

		// Click The MMR Vaccine Box

		// Enter The MMR Vaccine Batch Number
		CommonUtility.sleepControl(200);
		NurseModule.getInstance().enterTheMMRVaccineDetails(AppConstants.MMR_VACCINE_BATCH_NUMBER);
		LOGGER.info("MMR VAccine Batch Number : " + AppConstants.MMR_VACCINE_BATCH_NUMBER);
		// Save Button
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheVaccineSaveButton();
		LOGGER.info("Successfully enter the MMR Vaccine Details");
	}

	public void windowsPageHanding() throws Throwable {
		CommonUtility.sleepControl(3000);
		Set<String> handles = DriverManager.getDriver().getWindowHandles();
		List<String> list = new ArrayList<>(handles);
		CommonUtility.sleepControl(2000);
		DriverManager.getDriver().switchTo().window(list.get(1));
		DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(list.get(0));
		CommonUtility.sleepControl(2000);
	}

	public static void countryIndia() throws Throwable {
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheCountry();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheIndia();
		LOGGER.info("Country : India");

	}

	public static void countryPhilippines() throws Throwable {
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheCountry();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickThePhilippines();
		LOGGER.info("Country : Philippines");
	}

	public static void srilankaCountry() throws Throwable {
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheCountry();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheSrilanka();
		LOGGER.info("Country : Srilanka");
	}

	public static void pakistan_Country() throws Throwable {
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheCountry();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickThePakistan();
		LOGGER.info("Country : Pakistan");
	}

	public static void bangaladesh_Country() throws Throwable {
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheCountry();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheBangaladesh();
		LOGGER.info("Country : Bangaladesh");
	}

	public void nurseNextTokenFlow() throws Throwable {

		CommonUtility.sleepControl(1500);
		NurseModule.getInstance().clickThSkipButton();
		CommonUtility.sleepControl(900);
		NurseModule.getInstance().clickTheReason();
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickFirstDropDownOption();
		CommonUtility.sleepControl(900);
		NurseModule.getInstance().clickTheSkipTheToken();

		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheNextButton();
		CommonUtility.sleepControl(2500);
		NurseModule.getInstance().clickTheArrivedButton();

	}

	public void getTotalTime(long milliseconds) {

		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints: " + totalTime + " mints" + "  " + totalTimeforSec + " seconds");

		long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time  Seconds = " + seconds + " " + "seconds");

	}

	public void groReferral() throws Throwable {

		CredentialsController controller = new CredentialsController();
		controller.groCredentialsController(ConstantProperties.STATE);
		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();
		GROStepDefinition definition = new GROStepDefinition();
		definition.select_the_counter_selection();

		CommonUtility.sleepControl(1500);
		GRODashBoard.getInstance().enterTheVisaApplicationNumber(ConstantProperties.VISA_NUMBER);
		LOGGER.info("Visa Number" + ": " + ConstantProperties.VISA_NUMBER);

		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheValidateVNButton();
		CommonUtility.sleepControl(1500);
		GRODashBoard.getInstance().clickTheReferralCallLog();
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();
	}

	// Log in GRO Call Center
	public void groCallCenterReferralLog() throws Throwable {

		Login();

		GROStepDefinition definition = new GROStepDefinition();
		definition.select_the_role_selection();
		definition.select_the_counter_selection();

		// Call Center Referral Log

		// Click The Call Center Referral Log
		CommonUtility.sleepControl(3000);
		GRODashBoard.getInstance().clickTheCallCenterReferralLog();

		// Enter The Visa Number
		CommonUtility.sleepControl(5000);
		GRODashBoard.getInstance().enterTheVisaNumberInCallCenter(ConstantProperties.VISA_NUMBER);

		// Click The Search Button
		CommonUtility.sleepControl(6000);
		LabJunior.getInstance().clickTheSearchButton();
		// Click The Phone Icon
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheCallIcon();

		// Click The Answer Opion
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheAnswerOption();

		// Click The Preferred Language
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickThePreferredLanguage();
		CommonUtility.sleepControl(1000);
		CommonUtility.enterFunction();

		// Click The Inbound
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheInbound();
		CommonUtility.enterFunction();

		// Enter The Comments
		CommonUtility.sleepControl(2000);
		// GRODashBoard.getInstance().enterTheCommentsInCallCenter(ConstantProperties.COMMENTS);

		// Click The Save Button
		CommonUtility.sleepControl(2000);
		GRODashBoard.getInstance().clickTheSaveButton();
		LOGGER.info("Call log details created successfully");

		CommonUtility.sleepControl(2000);
		logOut();

	}

	public static void recallToken() throws Throwable {
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheRecallOptionButton();

		// Click The Recall Token Box
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheRecallTokenTextBox();

		// Enter The Visa Number
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().enterTheVisaNumberInRecallToken(ConstantProperties.VISA_NUMBER);

		// Click The Recall Token Button
		CommonUtility.sleepControl(2000);
		NurseModule.getInstance().clickTheRecallTokenButton();

		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheArrivedButton();

		// Click The Verify Token Button
		CommonUtility.sleepControl(1500);
		NurseModule.getInstance().clickTheVerifyTokenButton();
	}

	public static void windowHandling() throws Throwable {
		Set<String> handles = DriverManager.getDriver().getWindowHandles();
		List<String> list = new ArrayList<>(handles);

		DriverManager.getDriver().switchTo().window(list.get(1));
		DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(list.get(0));
		// CommonUtility.sleepControl(500);
	}

	public static void counterAutoRefreshAndHandle() throws Throwable {
		CommonUtility.sleepControl(2200);
		GRODashBoard.getInstance().clickTheSelectCounter();

		try {
			CommonUtility.sleepControl(1200);
			GRODashBoard.getInstance().clickTheCounter();
		} catch (Exception e) {

		}
		CommonUtility.sleepControl(500);
		counterStatus = GRODashBoard.getInstance().getTheCounterStatus();
		LOGGER.info("Choose The Counter is" + ": " + counterStatus);

		if (counterStatus.equals("Select Counter")) {

			do {
				CommonUtility.sleepControl(500);
				DriverManager.getDriver().navigate().refresh();
				CommonUtility.sleepControl(500);

				Alert alert = DriverManager.getDriver().switchTo().alert();
				alert.accept();

				CommonUtility.sleepControl(2000);
				GRODashBoard.getInstance().clickTheSelectCounter();
				try {
					CommonUtility.sleepControl(1000);
					GRODashBoard.getInstance().clickTheCounter();
				} catch (Exception e) {
				}
				CommonUtility.sleepControl(200);
				counterStatus = GRODashBoard.getInstance().getTheCounterStatus();
				LOGGER.info("Choose The Counter is" + ": " + counterStatus);

				if (counterStatus.equals("Select Counter")) {

					counterPushCondition = true;
					System.err.println("Counter is empty");
				} else {
					counterPushCondition = false;
				}

			} while (counterPushCondition == true);
		}

		CommonUtility.sleepControl(1000);
		GRODashBoard.getInstance().clickTheSelectButton();
		// GROStepDefinition.endTime();
		LOGGER.info("Signed into the counter successfully");
	}

// WindowClose
	public static void windowCloseFuncitonAltF4() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}

	public void recallFunction() throws Throwable {
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheRecallOptionButton();
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().enterTheVisaNumberInRecallToken(ConstantProperties.VISA_NUMBER);
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheRecallTokenButton();
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheArrivedButton();

	}

	public static void windowRefresh() throws Throwable {
		CommonUtility.sleepControl(1000);
		DriverManager.getDriver().navigate().refresh();
		CommonUtility.sleepControl(500);
		Alert alert = DriverManager.getDriver().switchTo().alert();
		alert.accept();

		CommonUtility.sleepControl(3000);
	}
}
