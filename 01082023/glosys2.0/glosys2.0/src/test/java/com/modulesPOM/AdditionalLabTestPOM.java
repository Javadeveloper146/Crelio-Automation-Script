package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdditionalLabTestPOM {
	private static AdditionalLabTestPOM additionalLabTestPOM;

	// Create Private Constrictor
	private AdditionalLabTestPOM() {
	}

	// GetInstance
	public static AdditionalLabTestPOM getInstance() {

		if (additionalLabTestPOM == null) {
			additionalLabTestPOM = new AdditionalLabTestPOM();
		}
		return additionalLabTestPOM;

	}

	// Click Additional Lab
	@FindBy(xpath = "//h4[contains(text(),'Additional Lab Test')]")
	private WebElement additionalLabTest;

	public void clickAdditionalLabTest() {
		additionalLabTest.click();
	}

	// Result 1
	@FindBy(xpath = "(//input)[1]")
	private WebElement enterTheResult1;

	public void enterTheResult1(String result1) {
		enterTheResult1.sendKeys(result1);

	}

	// Result 2
	@FindBy(xpath = "(//input)[2]")
	private WebElement enterTheResult2;

	public void enterTheResult2(String result2) {
		enterTheResult2.sendKeys(result2);

	}

	// Result 3
	@FindBy(xpath = "(//input)[3]")
	private WebElement enterTheResult3;

	public void enterTheResult3(String result3) {
		enterTheResult3.sendKeys(result3);

	}

	// Result 4
	@FindBy(xpath = "(//input)[4]")
	private WebElement enterTheResult4;

	public void enterTheResult4(String result4) {
		enterTheResult4.sendKeys(result4);

	}

	// Result 5
	@FindBy(xpath = "(//input)[5]")
	private WebElement enterTheResult5;

	public void enterTheResult5(String result5) {
		enterTheResult5.sendKeys(result5);

	}
	@FindBy(xpath = "(//input)[6]")
	private WebElement enterTheResult6;

	public void enterTheResult6(String result6) {
		enterTheResult6.sendKeys(result6);

	}

}
