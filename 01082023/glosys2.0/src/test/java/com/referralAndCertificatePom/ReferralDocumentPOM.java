package com.referralAndCertificatePom;

import org.apache.logging.log4j.message.Message;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReferralDocumentPOM {
	private static ReferralDocumentPOM referralDocumentPOM;

	private ReferralDocumentPOM() {

	}

	public static ReferralDocumentPOM getInstance() {
		if (referralDocumentPOM == null) {
			referralDocumentPOM = new ReferralDocumentPOM();
		}

		return referralDocumentPOM;

	}

	// CLick The Accept

	@FindBy(xpath = "//*[@class='text-gray']")
	private WebElement Accept;

	public void clickTheAcceptIcon() {
		Accept.click();
	}

	@FindBy(xpath = "//*[@data-icon='codicon:chrome-close']")
	private WebElement reject;

	public void clickTheRejectIcon() {
		reject.click();
	}

	// Reject Reason
	@FindBy(xpath = "//span[contains(text(),'Select reason')]")
	private WebElement reason;

	public void clickTheReason() {
		reason.click();
	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement save;

	public void clickTheSaveForReason() {
		save.click();
	}

	// Cardiology Accept
	@FindBy(xpath = "//a[@id='accept1666']")
	private WebElement cardioogyAccept;

	public void clickTheCardiologyAcceptIcon() {
		cardioogyAccept.click();
	}

	// Cardiology Rejectt
	@FindBy(xpath = "//a[@id='reject1666']")
	private WebElement cardioogyReject;

	public void clickTheCardiologyRejecttIcon() {
		cardioogyReject.click();
	}

	// Orthopedic Accept
	@FindBy(xpath = "//a[@id='accept1667']")
	private WebElement OrthopedicAccept;

	public void clickTheOrthopedicAcceptIcon() {
		OrthopedicAccept.click();
	}

	// Orthopedic Rejectt
	@FindBy(xpath = "//a[@id='reject1667']")
	private WebElement OrthopedicReject;

	public void clickTheOrthopedicRejecttIcon() {
		OrthopedicReject.click();
	}

	// VisionRecheck Accept
	@FindBy(xpath = "//a[@id='accept1669']")
	private WebElement VisionRecheckAccept;

	public void clickTheVisionRecheckAcceptIcon() {
		VisionRecheckAccept.click();
	}

	// Orthopedic Rejectt
	@FindBy(xpath = "//a[@id='reject1669']")
	private WebElement VisionRecheckReject;

	public void clickTheVisionRecheckRejecttIcon() {
		VisionRecheckReject.click();
	}

	// Ophthalmologist Accept
	@FindBy(xpath = "//a[@id='accept1668']")
	private WebElement OphthalmologistAccept;

	public void clickTheOphthalmologistAcceptIcon() {
		OphthalmologistAccept.click();
	}

	// Orthopedic Rejectt
	@FindBy(xpath = "//a[@id='reject1668']")
	private WebElement OphthalmologistReject;

	public void clickTheOphthalmologistRejecttIcon() {
		OphthalmologistReject.click();
	}

	// BloodpressureCheck Accept
	@FindBy(xpath = "//a[@id='accept1671']")
	private WebElement BloodpressureCheckAccept;

	public void clickTheBloodpressureCheckAcceptIcon() {
		BloodpressureCheckAccept.click();
	}

	// Orthopedic Rejectt
	@FindBy(xpath = "//a[@id='reject1671']")
	private WebElement BloodpressureCheckReject;

	public void clickTheBloodpressureCheckRejecttIcon() {
		BloodpressureCheckReject.click();
	}

	// GeneralMedicine Accept
	@FindBy(xpath = "//a[@id='accept1670']")
	private WebElement GeneralMedicineAccept;

	public void clickTheGeneralMedicineAcceptIcon() {
		GeneralMedicineAccept.click();
	}

	// Orthopedic Rejectt
	@FindBy(xpath = "//a[@id='reject1670']")
	private WebElement GeneralMedicineReject;

	public void clickTheGeneralMedicineRejecttIcon() {
		GeneralMedicineReject.click();
	}

	// Get The Document Typ1
	@FindBy(xpath = "(//td[@role='cell'])[1]")
	private WebElement docu1;

	public String getDocumentType1() {
		return docu1.getText();
	}

	// One Save
	@FindBy(xpath = "(//a[@title='Save'])[1]")
	private WebElement Save1;

	public void clickTheSave1() {
		Save1.click();
	}

	public boolean saveButtonStatus1() {
		return Save1.isDisplayed();
	}

	// Get The Document Typ2
	@FindBy(xpath = "(//td[@role='cell'])[7]")
	private WebElement docu2;

	public String getDocumentType2() {
		return docu2.getText();
	}

	// Two Save
	@FindBy(xpath = "(//a[@title='Save'])[2]")
	private WebElement Save2;

	public void clickTheSave2() {
		Save2.click();
	}

	public boolean saveButtonStatus2() {
		return Save2.isDisplayed();
	}

	// Three Save
	@FindBy(xpath = "(//a[@title='Save'])[3]")
	private WebElement Save3;

	public void clickTheSave3() {
		Save3.click();
	}

	public boolean saveButtonStatus3() {
		return Save3.isDisplayed();
	}

	// Get The Document Type3
	@FindBy(xpath = "(//td[@role='cell'])[13]")
	private WebElement docu3;

	public String getDocumentType3() {
		return docu3.getText();
	}

	// Get The Document Type3
	@FindBy(xpath = "(//td[@role='cell'])[12]")
	private WebElement Comfordocu2;

	public String getComformatoryDocumentType2() {
		return Comfordocu2.getText();
	}

	@FindBy(xpath = "(//td[@role='cell'])[23]")
	private WebElement Comfordocu3;

	public String getComformatoryDocumentType3() {
		return Comfordocu3.getText();
	}

	@FindBy(xpath = "(//td[@role='cell'])[34]")
	private WebElement Comfordocu4;

	public String getComformatoryDocumentType4() {
		return Comfordocu4.getText();
	}

	// Four Save
	@FindBy(xpath = "(//a[@title='Save'])[4]")
	private WebElement Save4;

	public void clickTheSave4() {
		Save4.click();
	}

	public boolean saveButtonStatus4() {
		return Save4.isDisplayed();
	}

	// Get The Document Type4
	@FindBy(xpath = "(//td[@role='cell'])[19]")
	private WebElement docu4;

	public String getDocumentType4() {
		return docu4.getText();

	}

	// Five Save
	@FindBy(xpath = "(//a[@title='Save'])[5]")
	private WebElement Save5;

	public void clickTheSave5() {
		Save5.click();
	}

	public boolean saveButtonStatus5() {
		return Save5.isDisplayed();
	}

	// Get The Document Type5
	@FindBy(xpath = "(//td[@role='cell'])[25]")
	private WebElement docu5;

	public String getDocumentType5() {
		return docu5.getText();

	}

	// Six Save
	@FindBy(xpath = "(//a[@title='Save'])[6]")
	private WebElement Save6;

	public void clickTheSave6() {
		Save6.click();
	}

	public boolean saveButtonStatus6() {
		return Save6.isDisplayed();
	}

	// Get The Document Type6
	@FindBy(xpath = "(//td[@role='cell'])[31]")
	private WebElement docu6;

	public String getDocumentType6() {
		return docu6.getText();

	}

	// Seven Save
	@FindBy(xpath = "(//a[@title='Save'])[7]")
	private WebElement Save7;

	public void clickTheSave7() {
		Save7.click();
	}

	public boolean saveButtonStatus7() {
		return Save7.isDisplayed();
	}

	// Get The Document Type7
	@FindBy(xpath = "(//td[@role='cell'])[37]")
	private WebElement docu7;

	public String getDocumentType7() {
		return docu7.getText();

	}

	// Eight Save
	@FindBy(xpath = "(//a[@title='Save'])[8]")
	private WebElement Save8;

	public void clickTheSave8() {
		Save8.click();
	}

	public boolean saveButtonStatus8() {
		return Save8.isDisplayed();
	}

	// Get The Document Type8
	@FindBy(xpath = "(//td[@role='cell'])[43]")
	private WebElement docu8;

	public String getDocumentType8() {
		return docu8.getText();

	}

	// Nine Save
	@FindBy(xpath = "(//a[@title='Save'])[9]")
	private WebElement Save9;

	public void clickTheSave9() {
		Save9.click();
	}

	public boolean saveButtonStatus9() {
		return Save9.isDisplayed();
	}

	// Get The Document Type9
	@FindBy(xpath = "(//td[@role='cell'])[49]")
	private WebElement docu9;

	public String getDocumentType9() {
		return docu9.getText();

	}

	// Ten Save
	@FindBy(xpath = "(//a[@title='Save'])[10]")
	private WebElement Save10;

	public void clickTheSave10() {
		Save10.click();
	}

	public boolean saveButtonStatus10() {
		return Save10.isDisplayed();
	}

	// Get The Document Type10
	@FindBy(xpath = "(//td[@role='cell'])[55]")
	private WebElement docu10;

	public String getDocumentType10() {
		return docu10.getText();

	}

	// 11 Save
	@FindBy(xpath = "(//a[@title='Save'])[11]")
	private WebElement Save11;

	public void clickTheSave11() {
		Save11.click();
	}

	public boolean saveButtonStatus11() {
		return Save11.isDisplayed();
	}

	// Get The Document Type10
	@FindBy(xpath = "(//td[@role='cell'])[61]")
	private WebElement docu11;

	public String getDocumentType11() {
		return docu11.getText();

	}

}