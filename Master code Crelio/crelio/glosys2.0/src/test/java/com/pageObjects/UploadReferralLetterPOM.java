package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadReferralLetterPOM {
	private static UploadReferralLetterPOM uploadReferralLetter;

	private UploadReferralLetterPOM() {

	}

	public static UploadReferralLetterPOM getInstance() {
		if (uploadReferralLetter == null) {
			uploadReferralLetter = new UploadReferralLetterPOM();
		}

		return uploadReferralLetter;

	}

// First Upload
// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[1]")
	private WebElement firstUploadIcon;

	public void clickTheFisrtUploadIcon() {
		firstUploadIcon.click();
	}

	public boolean getTheUploadIconStatus1() {
		return firstUploadIcon.isDisplayed();
	}

// Get The Document
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[1]")
	private WebElement onedocument;

	public String GetDoumentTypeNameOne() {
		return onedocument.getText();

	}
// Click The Document Type

	@FindBy(xpath = "//mat-select[@formcontrolname='document_type']")
	private WebElement documentType;

	public void clickTheDocumentType() {
		documentType.click();
	}
// Click The Document As Per The Req

	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement asPerDocument;

	public void clickTheDocumentTypeAsPerTheDocument() {
		asPerDocument.click();
	}

// Two
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[2]")
	private WebElement secondDocument;

	public String GetDoumentTypeNameTwo() {
		return secondDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[2]")
	private WebElement secondUploadIcon;

	public void clickTheSecondUploadIcon() {
		secondUploadIcon.click();
	}

	public boolean getTheUploadIconStatus2() {
		return secondUploadIcon.isDisplayed();
	}

// Three
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[3]")
	private WebElement threeDocument;

	public String GetDoumentTypeNameThree() {
		return threeDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[3]")
	private WebElement threeUploadIcon;

	public void clickTheThreeUploadIcon() {
		threeUploadIcon.click();
	}

	public boolean getTheUploadIconStatus3() {
		return threeUploadIcon.isDisplayed();
	}

// Four
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[4]")
	private WebElement fourDocument;

	public String GetDoumentTypeNamefour() {
		return fourDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[4]")
	private WebElement fourUploadIcon;

	public void clickTheFourUploadIcon() {
		fourUploadIcon.click();
	}

	public boolean getTheUploadIconStatus4() {
		return fourUploadIcon.isDisplayed();
	}

// Five
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[5]")
	private WebElement fiveDocument;

	public String GetDoumentTypeNameFive() {
		return fiveDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[5]")
	private WebElement fiveUploadIcon;

	public void clickTheFiveUploadIcon() {
		fiveUploadIcon.click();
	}

	public boolean getTheUploadIconStatus5() {
		return fiveUploadIcon.isDisplayed();
	}

// Six
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[6]")
	private WebElement sixDocument;

	public String GetDoumentTypeNameSix() {
		return sixDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[6]")
	private WebElement sixUploadIcon;

	public void clickTheSixUploadIcon() {
		sixUploadIcon.click();
	}

	public boolean getTheUploadIconStatus6() {
		return sixUploadIcon.isDisplayed();
	}

// SEVEN
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[7]")
	private WebElement sevenDocument;

	public String GetDoumentTypeNameSeven() {
		return sevenDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[7]")
	private WebElement sevenUploadIcon;

	public void clickTheSevenUploadIcon() {
		sevenUploadIcon.click();
	}

	public boolean getTheUploadIconStatus7() {
		return sevenUploadIcon.isDisplayed();
	}

// Eight
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[8]")
	private WebElement eightDocument;

	public String GetDoumentTypeNameEight() {
		return eightDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[8]")
	private WebElement eightUploadIcon;

	public void clickTheEightUploadIcon() {
		eightUploadIcon.click();
	}

	public boolean getTheUploadIconStatus8() {
		return eightUploadIcon.isDisplayed();
	}

// Nine
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[9]")
	private WebElement nineDocument;

	public String GetDoumentTypeNameNine() {
		return nineDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[9]")
	private WebElement nineUploadIcon;

	public void clickTheNineUploadIcon() {
		nineUploadIcon.click();
	}

	public boolean getTheUploadIconStatus9() {
		return nineUploadIcon.isDisplayed();
	}

// Ten
// Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[10]")
	private WebElement tenDocument;

	public String GetDoumentTypeNameTen() {
		return tenDocument.getText();

	}

// Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[10]")
	private WebElement tenUploadIcon;

	public void clickTheTenUploadIcon() {
		tenUploadIcon.click();
	}

	public boolean getTheUploadIconStatus10() {
		return tenUploadIcon.isDisplayed();
	}

//11
//Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[11]")
	private WebElement Document11;

	public String GetDoumentTypeName11() {
		return Document11.getText();

	}

//Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[11]")
	private WebElement UploadIcon11;

	public void clickTheUploadIcon11() {
		UploadIcon11.click();
	}

	public boolean getTheUploadIconStatus11() {
		return UploadIcon11.isDisplayed();
	}

//12
//Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[12]")
	private WebElement Document12;

	public String GetDoumentTypeName12() {
		return Document12.getText();

	}

//Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[12]")
	private WebElement UploadIcon12;

	public void clickTheUploadIcon12() {
		UploadIcon12.click();
	}

	public boolean getTheUploadIconStatus12() {
		return UploadIcon12.isDisplayed();
	}

//13
//Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[13]")
	private WebElement Document13;

	public String GetDoumentTypeName13() {
		return Document13.getText();

	}

//Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[13]")
	private WebElement UploadIcon13;

	public void clickTheUploadIcon13() {
		UploadIcon13.click();
	}

	public boolean getTheUploadIconStatus13() {
		return UploadIcon13.isDisplayed();
	}

//14
//Get The Document Type
	@FindBy(xpath = "(//div[@class='matt-group matt-select'])[14]")
	private WebElement Document14;

	public String GetDoumentTypeName14() {
		return Document14.getText();

	}

//Upload icon
	@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[14]")
	private WebElement UploadIcon14;

	public void clickTheUploadIcon14() {
		UploadIcon14.click();
	}

	public boolean getTheUploadIconStatus14() {
		return UploadIcon14.isDisplayed();
	}
	
	//14
	//Get The Document Type
		@FindBy(xpath = "(//div[@class='matt-group matt-select'])[15]")
		private WebElement Document15;

		public String GetDoumentTypeName15() {
			return Document15.getText();

		}

	//Upload icon
		@FindBy(xpath = "(//*[@data-icon='ic:outline-upload'])[15]")
		private WebElement UploadIcon15;

		public void clickTheUploadIcon15() {
			UploadIcon15.click();
		}

		public boolean getTheUploadIconStatus15() {
			return UploadIcon15.isDisplayed();
		}
}
