package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintReceiptPOM {
	private static PrintReceiptPOM printReceiptPOM;

	private PrintReceiptPOM() {

	}

	public static PrintReceiptPOM getInstance() {
		if (printReceiptPOM == null) {
			printReceiptPOM = new PrintReceiptPOM();
		}

		return printReceiptPOM;

	}

	// Get The One Name

	@FindBy(xpath = "(//td)[3]")
	private WebElement documentOne;

	public String GetOneDoumentTypeName() {
		return documentOne.getText();

	}

	public boolean oneDocumentStatus() {
		return documentOne.isDisplayed();
	}

	// Two
	@FindBy(xpath = "(//td)[6]")
	private WebElement documentTwo;

	public String GetTwoDoumentTypeName() {
		return documentTwo.getText();

	}

	public boolean twoDocumentStatus() {
		return documentTwo.isDisplayed();
	}

	// Three
	@FindBy(xpath = "(//td)[9]")
	private WebElement document3;

	public String GetDoumentTypeName3() {
		return document3.getText();

	}

	public boolean documentStatus3() {
		return document3.isDisplayed();
	}

	// Four
	@FindBy(xpath = "(//td)[12]")
	private WebElement document4;

	public String GetDoumentTypeName4() {
		return document4.getText();

	}

	public boolean documentStatus4() {
		return document4.isDisplayed();
	}

	// Five
	@FindBy(xpath = "(//td)[15]")
	private WebElement document5;

	public String GetDoumentTypeName5() {
		return document5.getText();

	}

	public boolean documentStatus5() {
		return document5.isDisplayed();
	}

	// Six
	@FindBy(xpath = "(//td)[18]")
	private WebElement document6;

	public String GetDoumentTypeName6() {
		return document6.getText();

	}

	public boolean documentStatus6() {
		return document6.isDisplayed();
	}

	// Seven
	@FindBy(xpath = "(//td)[21]")
	private WebElement document7;

	public String GetDoumentTypeName7() {
		return document7.getText();

	}

	public boolean documentStatus7() {
		return document7.isDisplayed();
	}

	// Eight
	@FindBy(xpath = "(//td)[24]")
	private WebElement document8;

	public String GetDoumentTypeName8() {
		return document8.getText();

	}

	public boolean documentStatus8() {
		return document8.isDisplayed();
	}

	// Nine
	@FindBy(xpath = "(//td)[27]")
	private WebElement document9;

	public String GetDoumentTypeName9() {
		return document9.getText();

	}

	public boolean documentStatus9() {
		return document9.isDisplayed();
	}

	// Ten
	@FindBy(xpath = "(//td)[30]")
	private WebElement document10;

	public String GetDoumentTypeName10() {
		return document10.getText();

	}

	public boolean documentStatus10() {
		return document10.isDisplayed();
	}

	// Eleven
	@FindBy(xpath = "(//td)[33]")
	private WebElement document11;

	public String GetDoumentTypeName11() {
		return document11.getText();

	}

	public boolean documentStatus11() {
		return document11.isDisplayed();
	}

	// Click The Print Receipt Icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[2]")
	private WebElement ptintrecipt;

	public void clickThePrintReceiptIcon() {
		ptintrecipt.click();
	}

}
