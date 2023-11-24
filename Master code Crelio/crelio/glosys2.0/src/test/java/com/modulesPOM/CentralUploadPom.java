package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralUploadPom {

	private static CentralUploadPom centralUploadPom;

	// Create Private Constrictor
	private CentralUploadPom() {
	}

	// GetInstance
	public static CentralUploadPom getInstance() {

		if (centralUploadPom == null) {
			centralUploadPom = new CentralUploadPom();
		}
		return centralUploadPom;

	}

	// Role Selection Central Upload
	@FindBy(xpath = "//span[contains(text(),'Central Upload ')]")
	private WebElement centralUpload;

	public void clickCentralUpload() {
		centralUpload.click();
	}

	// Central Result Upload
	@FindBy(xpath = "//a[contains(text(),'Central Result Upload')]")
	private WebElement centralResultUpload;

	public void clickCentralResultUpload() {
		centralResultUpload.click();
	}

	@FindBy(xpath = "//p[contains(text(),'Reupload')]")
	private WebElement reupload;

	public void clickReupload() {
		reupload.click();
	}

	@FindBy(xpath = "//input[@formcontrolname='visa_number']")
	private WebElement visaNumber;

	public void enterTheVisaNumber(String enterVisaNumber) {
		visaNumber.sendKeys(enterVisaNumber);
	}

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement search;

	public void clickSearchButton() {
		search.click();
	}

	// Get The Test name 1
	@FindBy(xpath = "(//td)[6]")
	private WebElement testName1;

	public String getTestName1() {
		return testName1.getText();
	}

	// Get The Test name 2
	@FindBy(xpath = "(//td)[23]")
	private WebElement testName2;

	public String getTestName2() {
		return testName2.getText();
	}

	// Get The Test name 3
	@FindBy(xpath = "(//td)[40]")
	private WebElement testName3;

	public String getTestName3() {
		return testName3.getText();
	}

	// Get The Test name 4
	@FindBy(xpath = "(//td)[57]")
	private WebElement testName4;

	public String getTestName4() {
		return testName4.getText();
	}

	// Get The Test name 5
	@FindBy(xpath = "(//td)[74]")
	private WebElement testName5;

	public String getTestName5() {
		return testName5.getText();
	}

	// Get The Test name 6
	@FindBy(xpath = "(//td)[91]")
	private WebElement testName6;

	public String getTestName6() {
		return testName6.getText();
	}

	// upload 1

	@FindBy(xpath = "(//*[@title='Upload'])[1]")
	private WebElement upload1;

	public void clickUploadIcon1() {
		upload1.click();
	}

	// upload 2

	@FindBy(xpath = "(//*[@title='Upload'])[2]")
	private WebElement upload2;

	public void clickUploadIcon2() {
		upload2.click();
	}
	// upload 3

	@FindBy(xpath = "(//*[@title='Upload'])[3]")
	private WebElement upload3;

	public void clickUploadIcon3() {
		upload3.click();
	}
	// upload 4

	@FindBy(xpath = "(//*[@title='Upload'])[4]")
	private WebElement upload4;

	public void clickUploadIcon4() {
		upload4.click();
	}
	// upload 5

	@FindBy(xpath = "(//*[@title='Upload'])[5]")
	private WebElement upload5;

	public void clickUploadIcon5() {
		upload5.click();
	}
	// upload 6

	@FindBy(xpath = "(//*[@title='Upload'])[6]")
	private WebElement upload6;

	public void clickUploadIcon6() {
		upload6.click();
	}

	// Document Name
	@FindBy(xpath = "//input[@formcontrolname='document_name']")
	private WebElement docuementName;

	public void enterTheDocumentName(String enterDocumentName) {
		docuementName.sendKeys(enterDocumentName);
	}

	// Comment
	@FindBy(xpath = "//input[@formcontrolname='comments']")
	private WebElement comment;

	public void enterComments(String comments) {
		comment.sendKeys(comments);
	}

	@FindBy(xpath = "//*[@data-icon='ic:outline-file-upload']")
	private WebElement documentUploadIcon;

	public void clickDocumentUploadIcon() {
		documentUploadIcon.click();
	}

	@FindBy(xpath = "//*[@data-icon='ant-design:save-outlined']")
	private WebElement save;

	public void clickSave() {
		save.click();
	}

	// Additional
	@FindBy(xpath = "//h4[contains(text(),'Additional')]")
	private WebElement additional;

	public void clickAdditional() {
		additional.click();
	}
}
