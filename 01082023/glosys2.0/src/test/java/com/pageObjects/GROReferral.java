package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GROReferral {
	// Implement The Design Pattern
	private static GROReferral groReferral;

	// Create Private Constrictor
	private GROReferral() {

	}

	// GetInstance
	public static GROReferral getInstance() {

		if (groReferral == null) {
			groReferral = new GROReferral();
		}
		return groReferral;

	}

	// Get Error Message
	@FindBy(xpath = "(//mat-error)[1]")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage1() {
		return ERROR_MESSAGE.getText();

	}

	// Get Error Message
	@FindBy(xpath = "(//mat-error)[2]")
	private WebElement ERROR_MESSAGE2;

	public String getErrorMessage2() {
		return ERROR_MESSAGE2.getText();

	}

	// Print Referral Letter
	// Enter The Comment
	@FindBy(xpath = "(//input[@data-placeholder='Enter comments'])[1]")
	private WebElement PrintReferralLetterComment;

	public void enterThePrintReferralLetterComment(String printReferralLetterComment) {
		PrintReferralLetterComment.sendKeys(printReferralLetterComment);
	}

	// Click The Print Icon Cardilogy
	@FindBy(xpath = "(//a)[23]")
	private WebElement PrintIcon;

	public void clickThePrintIconCardilogy() {
		PrintIcon.click();
	}

	// Click The Upload Refferal Document
	@FindBy(xpath = "//a[contains(text(),' Upload Referral Document')]")
	private WebElement UploadReferralDocument;

	public void clickTheUploadReferralDocument() {
		UploadReferralDocument.click();
	}

	// Click The Next
	@FindBy(xpath = "//a[contains(text(),'Next')]")
	private WebElement next;

	public void clickTheNext() {
		next.click();
	}

	// Click The Upload Icon For Cardilofy Upload referral Document
	@FindBy(xpath = "(//a)[24]")
	private WebElement UploadIconInUploadReferralDocumentPage;

	public void clickTheUploadIconInUploadReferralDocumentPageCardilogy() {
		UploadIconInUploadReferralDocumentPage.click();
	}

	// Enter The Document Name
	@FindBy(xpath = "//input[@placeholder='Document Name']")
	private WebElement DocumentName;

	public void EnterTheDocumentName(String documentName) {
		DocumentName.sendKeys(documentName);
	}

	// Enter The Comments
	@FindBy(xpath = "//input[@placeholder='Comments']")
	private WebElement CommentsForUploadReferralDocument;

	public void EnterTheComments(String comments) {
		CommentsForUploadReferralDocument.sendKeys(comments);
	}

	// Click The Browse Option
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement BrowseOption;

	public void clickTheBrowseOption() {
		BrowseOption.click();
	}

	// Click the Upload Referral Docuemtn View Icon
	@FindBy(xpath = "(//a[@class='edit-icon text-primary'])[2]")
	private WebElement ReferralDocumentViewIcon;

	public void clickTheReferralDocumentViewIcon() {
		ReferralDocumentViewIcon.click();
	}

	// Click The View icon
	@FindBy(xpath = "(//a)[25]")
	private WebElement ViewIcon;

	public void clickTheViewIcon() {
		ViewIcon.click();
	}

	// Click The View Document Icon
	@FindBy(xpath = "(//a)[27]")
	private WebElement ViewDocumentIcon;

	public void clickTheViewDocumentIcon() {
		ViewDocumentIcon.click();
	}

	// Click The Close icon
	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")
	private WebElement CloseIcon;

	public void clickTheCloseIcon() {
		CloseIcon.click();
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[2]")
	private WebElement CloseSecondIcon;

	public void clickTheCloseSecondIcon() {
		CloseSecondIcon.click();
	}

	// Click The Yes
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	private WebElement yes;

	public void clickTheYes() {
		yes.click();
	}

	// ******************************************************************************************
	// Print Referral Letter
	// Deformity (Orthopedic) Print Referral

	// Enter The Comment
	@FindBy(xpath = "(//input[@placeholder='Enter comments'])[2]")
	private WebElement deformityprintReferralLetterComment;

	public void deformityenterThePrintReferralLetterComment(String printReferralLetterComment) {
		deformityprintReferralLetterComment.sendKeys(printReferralLetterComment);
	}

	// Click The Print Icon Deformity
	@FindBy(xpath = "(//a)[24]")
	private WebElement PrintIconDeformity;

	public void clickThePrintIconDeformity() {
		PrintIconDeformity.click();
	}

	// Deformity Upload Referral Letter
	// Click The Upload Icon For Cardilofy Upload referral Document Deformity
	@FindBy(xpath = "(//a)[27]")
	private WebElement UploadIconInUploadReferralDocumentPageDeformity;

	public void clickTheUploadIconInUploadReferralDocumentPageDeformity() {
		UploadIconInUploadReferralDocumentPageDeformity.click();
	}

	// ________________________________________________________________________________
	// BMI
	// Click The BMI Print Icon
	@FindBy(xpath = "(//a)[23]")
	private WebElement bmiPrintIcon;

	public void clickThebmiPrintIcon() {
		bmiPrintIcon.click();
	}

}

// Click The
