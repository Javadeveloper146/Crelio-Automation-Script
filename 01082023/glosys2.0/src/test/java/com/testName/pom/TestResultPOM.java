package com.testName.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.modulesPOM.AdditionalLabTestPOM;

public class TestResultPOM {
	private static TestResultPOM testResultPOM;

	// Create Private Constrictor
	private TestResultPOM() {
	}

	// GetInstance
	public static TestResultPOM getInstance() {

		if (testResultPOM == null) {
			testResultPOM = new TestResultPOM();
		}
		return testResultPOM;

	}

	@FindBy(xpath = "//input[@tabindex='1']")
	private WebElement Value1;
	@FindBy(xpath = "//input[@tabindex='2']")
	private WebElement Value2;
	@FindBy(xpath = "//input[@tabindex='3']")
	private WebElement Value3;
	@FindBy(xpath = "//input[@tabindex='4']")
	private WebElement Value4;
	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement Value5;
	@FindBy(xpath = "//input[@tabindex='6']")
	private WebElement Value6;
	@FindBy(xpath = "//input[@tabindex='7']")
	private WebElement Value7;
	@FindBy(xpath = "//input[@tabindex='8']")
	private WebElement Value8;
	@FindBy(xpath = "//input[@tabindex='10']")
	private WebElement Value9;
	@FindBy(xpath = "//input[@tabindex='11']")
	private WebElement Value10;
	@FindBy(xpath = "//input[@tabindex='12']")
	private WebElement Value11;
	@FindBy(xpath = "//input[@tabindex='13']")
	private WebElement Value12;
	@FindBy(xpath = "//input[@tabindex='14']")
	private WebElement Value13;
	@FindBy(xpath = "//input[@tabindex='16']")
	private WebElement Value14;
	@FindBy(xpath = "//input[@tabindex='17']")
	private WebElement Value15;
	@FindBy(xpath = "//input[@tabindex='18']")
	private WebElement Value16;
	@FindBy(xpath = "//input[@tabindex='19']")
	private WebElement Value17;
	@FindBy(xpath = "//input[@tabindex='20']")
	private WebElement Value18;
	@FindBy(xpath = "//input[@tabindex='21']")
	private WebElement Value19;
	@FindBy(xpath = "//input[@tabindex='22']")
	private WebElement Value20;
	@FindBy(xpath = "//input[@tabindex='23']")
	private WebElement Value21;

	public void enterValue1(String value) {
		Value1.sendKeys(value);
	}

	public void enterValue2(String value) {
		Value2.sendKeys(value);
	}

	public void enterValue3(String value) {
		Value3.sendKeys(value);
	}

	public void enterValue4(String value) {
		Value4.sendKeys(value);
	}

	public void enterValue5(String value) {
		Value5.sendKeys(value);
	}

	public void enterValue6(String value) {
		Value6.sendKeys(value);
	}

	public void enterValue7(String value) {
		Value7.sendKeys(value);
	}

	public void enterValue8(String value) {
		Value8.sendKeys(value);
	}

	public void enterValue9(String value) {
		Value9.sendKeys(value);
	}

	public void enterValue10(String value) {
		Value10.sendKeys(value);
	}

	public void enterValue11(String value) {
		Value11.sendKeys(value);
	}

	public void enterValue12(String value) {
		Value12.sendKeys(value);
	}

	public void enterValue13(String value) {
		Value13.sendKeys(value);
	}

	public void enterValue14(String value) {
		Value14.sendKeys(value);
	}

	public void enterValue15(String value) {
		Value15.sendKeys(value);
	}

	public void enterValue16(String value) {
		Value16.sendKeys(value);
	}

	public void enterValue17(String value) {
		Value17.sendKeys(value);
	}

	public void enterValue18(String value) {
		Value18.sendKeys(value);
	}

	public void enterValue19(String value) {
		Value19.sendKeys(value);
	}

	public void enterValue20(String value) {
		Value20.sendKeys(value);
	}

	public void enterValue21(String value) {
		Value21.sendKeys(value);
	}
}