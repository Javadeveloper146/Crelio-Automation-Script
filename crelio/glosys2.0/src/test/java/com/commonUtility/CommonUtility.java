package com.commonUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.PageFactory;

import com.LabIconpageObjects.LabJuniorCompletedPOM;
import com.LabIconpageObjects.LabJuniorRetakePOM;
import com.LabIconpageObjects.LabJuniorRetestPOM;
import com.LabIconpageObjects.LabJuniorSaveIconPOM;
import com.constantProperties.ConstantProperties;
import com.driverManager.DriverManager;
import com.modulesPOM.AdditionalLabTestPOM;
import com.modulesPOM.ApplicationStatusCheckPom;
import com.modulesPOM.AutoFitReviewerPom;
import com.modulesPOM.CentralGpPOM;
import com.modulesPOM.CentralUploadPom;
import com.modulesPOM.ConformatoryTestPOM;
import com.modulesPOM.MOHPOM;
import com.modulesPOM.MOIPOM;
import com.pageObjects.CenterManager;
import com.pageObjects.CentralLabAuthorityPOM;
import com.pageObjects.ExternalSpecialityPageObject;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LabDirector;
import com.pageObjects.LabJunior;
import com.pageObjects.LabSenior;
import com.pageObjects.LabSupervisor;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.pageObjects.PatientProfiles;
import com.pageObjects.PrintReceiptPOM;
import com.pageObjects.PrintReferralLetterPOM;
import com.pageObjects.UploadReferralLetterPOM;
import com.pageObjects.XrayModulePOM;
import com.referralAndCertificatePom.CertificatePOM;
import com.referralAndCertificatePom.ReferralDocumentPOM;

public class CommonUtility {

	public void loadProperties() {
		PropertiesFile file = new PropertiesFile();
		file.constantProperties();

		LabProperties properties = new LabProperties();
		properties.labProperties();

		Credentials credential = new Credentials();
		credential.credentialsProperties();

		ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
		applicationStatusCheck.applicationStatusCheck();

	}

	public void labProperties() {

	}

	public static void initialWebElementsOfPageObjects() {

		PageFactory.initElements(DriverManager.getDriver(), LoginPage.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), GRODashBoard.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), PatientProfiles.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), NurseModule.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), GpModule.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), ExternalSpecialityPageObject.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), GROReferral.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), NurseSampleOutgoingPageObject.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabJunior.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabJuniorRetestPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabJuniorRetakePOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabJuniorSaveIconPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabJuniorCompletedPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabSenior.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabSupervisor.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), LabDirector.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CenterManager.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), PrintReferralLetterPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), UploadReferralLetterPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), PrintReceiptPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CentralLabAuthorityPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), XrayModulePOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), ReferralDocumentPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CertificatePOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), AdditionalLabTestPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), ConformatoryTestPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CentralGpPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), MOHPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), MOIPOM.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), AutoFitReviewerPom.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), CentralUploadPom.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), ApplicationStatusCheckPom.getInstance());
	}

	public static void enterFunction() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void scrollDown50() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,100)", "");

	}

	public static void scrollDown100() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();

		js.executeScript("window.scrollBy(0,300)", "");

	}

	public static void scrollDown400() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,400)", "");
	}

	public static void scrollDown1000() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,1000)", "");
	}

	public static void sleepControl(long time) throws Throwable {
		Thread.sleep(time);

	}

	public static void implicitWait(int time) {

		DriverManager.getDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void waitFor2Sec() throws Throwable {
		Thread.sleep(2000);

	}

	public static void scrollUp100() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,-200)", "");
	}

	public static void scrollUp500() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,-500)", "");
	}

	public static void scrollUp1000() {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,-1000)", "");
	}

	public static void readTheExcelData() throws IOException {
		// Path of the excel file
		FileInputStream fs = new FileInputStream(
				"C:\\Users\\stemz\\Automation-Script-Glosys2.0\\glosys2.0\\src\\test\\resources\\ReportFile.xlsx");
		// Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		System.out.println(sheet.getRow(0).getCell(0));
//		Row row1 = sheet.getRow(1);
//		Cell cell1 = row1.getCell(1);
//		System.out.println(sheet.getRow(0).getCell(1));
//		Row row2 = sheet.getRow(1);
//		Cell cell2 = row2.getCell(1);
//		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));

	}

	public void writeTheExcelValue(String sheetName, String value, int row, int colunm) throws IOException {
		String path = "C:\\Users\\stemz\\Automation-Script-Glosys2.0\\glosys2.0\\src\\test\\resources\\ReportFile.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		sheet.getRow(row).createCell(colunm).setCellValue(value);
		FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
		workbook.write(fileOutputStream);
		workbook.close();
		fileOutputStream.close();

	}

}
