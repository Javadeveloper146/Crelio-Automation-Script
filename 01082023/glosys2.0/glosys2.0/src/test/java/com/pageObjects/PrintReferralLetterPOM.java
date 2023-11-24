package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintReferralLetterPOM {
	private static PrintReferralLetterPOM printReferralLetter;

	private PrintReferralLetterPOM() {

	}

	public static PrintReferralLetterPOM getInstance() {
		if (printReferralLetter == null) {
			printReferralLetter = new PrintReferralLetterPOM();
		}

		return printReferralLetter;

	}

// Referral Text
	@FindBy(xpath = "//div[@class='card-refrereal']")
	private WebElement referrral;

	public String getReferral() {
		return referrral.getText();

	}

// Speciality Text
	@FindBy(xpath = "(//p)[12]")
	private WebElement speciality;

	public String getSpecility() {
		return speciality.getText();

	}

// Get The Ref And Sp TExt

	@FindBy(xpath = "//div[@class='card-refrereal']")
	private WebElement refAndSpeciality;

	public String getrefAndSpeciality() {
		return refAndSpeciality.getText();

	}
// One Print Referral Letter

// Get One Document Name
	@FindBy(xpath = "(//td)[3]")
	private WebElement document;

	public String GetOneDoumentTypeName() {
		return document.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[1]")
	private WebElement oneComment;

	public void clickFirstCommment(String commentOne) {
		oneComment.sendKeys(commentOne);
	}

// Print icon 1

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[2]")
	private WebElement firstPrintIcon;

	public void clickTheFirstPrintIcon() {
		firstPrintIcon.click();
	}

	public boolean printIconStatus1() {
		return firstPrintIcon.isDisplayed();
	}

// Get The Print Icon Enable Or Disable
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[2]")
	private WebElement printOneStatus;

	public boolean getThePrintOneStatus1() {
		return printOneStatus.isDisplayed();
	}

// Two Ref

// Get The Document Name
	@FindBy(xpath = "(//td)[10]")
	private WebElement documentTypeTwo;

	public String GetTheDoumentTypeTwo() {
		return documentTypeTwo.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[2]")
	private WebElement twoComment;

	public void clickSecondCommment(String commentTwo) {
		twoComment.sendKeys(commentTwo);
	}

// Print icon 2

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[3]")
	private WebElement secondPrintIcon;

	public void clickTheSecondPrintIcon() {
		secondPrintIcon.click();
	}

	public boolean getPrintIconStatus2() {
		return secondPrintIcon.isDisplayed();
	}

// Three Print Ref

// Get The Document Name
	@FindBy(xpath = "(//td)[17]")
	private WebElement documentTypeThree;

	public String GetTheDoumentTypeThree() {
		return documentTypeThree.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[3]")
	private WebElement threeComment;

	public void clickThreeCommment(String commentThree) {
		threeComment.sendKeys(commentThree);
	}

// Print icon 3

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[4]")
	private WebElement threePrintIcon;

	public void clickThePrintIcon3() {
		threePrintIcon.click();
	}

	public boolean getThePrintIconStatus3() {
		return threePrintIcon.isDisplayed();
	}
// Four Ref

// Get The Document Name
	@FindBy(xpath = "(//td)[24]")
	private WebElement documentTypeFour;

	public String GetTheDoumentTypeFour() {
		return documentTypeFour.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[4]")
	private WebElement fourComment;

	public void clickFourCommment(String commentFour) {
		fourComment.sendKeys(commentFour);
	}

// Print icon 4

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[5]")
	private WebElement fourPrintIcon;

	public void clickThefourPrintIcon() {
		fourPrintIcon.click();
	}

	public boolean getThePrintIconStatus4() {
		return fourPrintIcon.isDisplayed();
	}

// Five Ref

// Get The Document Name
	@FindBy(xpath = "(//td)[31]")
	private WebElement documentTypeFive;

	public String GetTheDoumentTypeFive() {
		return documentTypeFive.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[5]")
	private WebElement fiveComment;

	public void clickFiveCommment(String commentFive) {
		fiveComment.sendKeys(commentFive);
	}

// Print icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[6]")
	private WebElement fivePrintIcon;

	public void clickTheFivePrintIcon() {
		fivePrintIcon.click();
	}

	public boolean getThePrintIconStatus5() {
		return fivePrintIcon.isDisplayed();
	}

// Six Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[38]")
	private WebElement documentTypeSix;

	public String GetTheDoumentTypeSix() {
		return documentTypeSix.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[6]")
	private WebElement sixComment;

	public void clickSixCommment(String commentSix) {
		sixComment.sendKeys(commentSix);
	}

// Print icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[7]")
	private WebElement sixPrintIcon;

	public void clickTheSixPrintIcon() {
		sixPrintIcon.click();
	}

	public boolean getThePrintIconStatus6() {
		return sixPrintIcon.isDisplayed();
	}

// Seven Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[45]")
	private WebElement documentTypeSeven;

	public String GetTheDoumentTypeSeven() {
		return documentTypeSeven.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[7]")
	private WebElement sevenComment;

	public void clickSevenCommment(String commentSeven) {
		sevenComment.sendKeys(commentSeven);
	}

// Print icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[8]")
	private WebElement sevenPrintIcon;

	public void clickTheSevenPrintIcon() {
		sevenPrintIcon.click();
	}

	public boolean getThePrintIconStatus7() {
		return sixPrintIcon.isDisplayed();
	}

// Eight Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[52]")
	private WebElement documentTypEight;

	public String GetTheDoumentTypeEight() {
		return documentTypEight.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[8]")
	private WebElement eightComment;

	public void clickEightCommment(String commentEight) {
		eightComment.sendKeys(commentEight);
	}

// Print icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[9]")
	private WebElement eightPrintIcon;

	public void clickTheEightPrintIcon() {
		eightPrintIcon.click();
	}

	public boolean getThePrintIconStatus8() {
		return eightPrintIcon.isDisplayed();
	}

// Nine Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[59]")
	private WebElement documentTypNine;

	public String GetTheDoumentTypeNine() {
		return documentTypNine.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[9]")
	private WebElement nineComment;

	public void clickNineCommment(String commentNine) {
		nineComment.sendKeys(commentNine);
	}

// Print icon

	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[10]")
	private WebElement ninePrintIcon;

	public void clickThePrintIcon9() {
		ninePrintIcon.click();
	}

	public boolean getThePrintIconStatus9() {
		return ninePrintIcon.isDisplayed();
	}

// Ten Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[66]")
	private WebElement documentTypeTen;

	public String GetTheDoumentTypeTen() {
		return documentTypeTen.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[10]")
	private WebElement tenComment;

	public void clickTenCommment(String commentTen) {
		tenComment.sendKeys(commentTen);
	}

// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[11]")
	private WebElement tenPrintIcon;

	public void clickTheTenPrintIcon() {
		tenPrintIcon.click();
	}

	public boolean getThePrintIconStatus10() {
		return tenPrintIcon.isDisplayed();
	}

// 11 Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[73]")
	private WebElement documentType11;

	public String GetTheDoumentType11() {
		return documentType11.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[11]")
	private WebElement Comment11;

	public void enter11Commment(String comment11) {
		Comment11.sendKeys(comment11);
	}

// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[12]")
	private WebElement PrintIcon11;

	public void clickThePrintIcon11() {
		PrintIcon11.click();
	}

	public boolean getThePrintIconStatus11() {
		return PrintIcon11.isDisplayed();
	}

// 12 Ref
// Get The Document Name
	@FindBy(xpath = "(//td)[80]")
	private WebElement documentType12;

	public String GetTheDoumentType12() {
		return documentType12.getText();

	}

// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[12]")
	private WebElement Comment12;

	public void enter12Commment(String comment12) {
		Comment12.sendKeys(comment12);
	}

// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[13]")
	private WebElement PrintIcon12;

	public void clickThe12PrintIcon() {
		PrintIcon12.click();
	}

	public boolean getThePrintIconStatus12() {
		return PrintIcon12.isDisplayed();
	}

//Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[13]")
	private WebElement Comment13;

	public void enter13Commment(String comment13) {
		Comment13.sendKeys(comment13);
	}

//Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[14]")
	private WebElement PrintIcon13;

	public void clickThe13PrintIcon() {
		PrintIcon13.click();
	}

	public boolean getThePrintIconStatus13() {
		return PrintIcon13.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[14]")
	private WebElement Comment14;

	public void enter14Commment(String comment14) {
		Comment14.sendKeys(comment14);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[15]")
	private WebElement PrintIcon14;

	public void clickThe14PrintIcon() {
		PrintIcon14.click();
	}

	public boolean getThePrintIconStatus14() {
		return PrintIcon14.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[15]")
	private WebElement Comment15;

	public void enter15Commment(String comment15) {
		Comment15.sendKeys(comment15);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[16]")
	private WebElement PrintIcon15;

	public void clickThe15PrintIcon() {
		PrintIcon15.click();
	}

	public boolean getThePrintIconStatus15() {
		return PrintIcon15.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[16]")
	private WebElement Comment16;

	public void enter16Commment(String comment16) {
		Comment16.sendKeys(comment16);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[17]")
	private WebElement PrintIcon16;

	public void clickThe16PrintIcon() {
		PrintIcon16.click();
	}

	public boolean getThePrintIconStatus16() {
		return PrintIcon16.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[17]")
	private WebElement Comment17;

	public void enter17Commment(String comment17) {
		Comment17.sendKeys(comment17);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[18]")
	private WebElement PrintIcon17;

	public void clickThe17PrintIcon() {
		PrintIcon17.click();
	}

	public boolean getThePrintIconStatus17() {
		return PrintIcon17.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[18]")
	private WebElement Comment18;

	public void enter18Commment(String comment18) {
		Comment18.sendKeys(comment18);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[19]")
	private WebElement PrintIcon18;

	public void clickThe18PrintIcon() {
		PrintIcon18.click();
	}

	public boolean getThePrintIconStatus18() {
		return PrintIcon18.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[19]")
	private WebElement Comment19;

	public void enter19Commment(String comment19) {
		Comment19.sendKeys(comment19);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[20]")
	private WebElement PrintIcon19;

	public void clickThe19PrintIcon() {
		PrintIcon19.click();
	}

	public boolean getThePrintIconStatus19() {
		return PrintIcon19.isDisplayed();
	}

	// Comments
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[20]")
	private WebElement Comment20;

	public void enter20Commment(String comment20) {
		Comment20.sendKeys(comment20);
	}

	// Print icon
	@FindBy(xpath = "(//*[@data-icon='ant-design:printer-outlined'])[21]")
	private WebElement PrintIcon20;

	public void clickThe20PrintIcon() {
		PrintIcon20.click();
	}

	public boolean getThePrintIconStatus20() {
		return PrintIcon20.isDisplayed();
	}
}