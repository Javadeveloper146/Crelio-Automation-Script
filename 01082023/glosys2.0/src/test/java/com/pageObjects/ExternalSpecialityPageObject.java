package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExternalSpecialityPageObject {

	private static ExternalSpecialityPageObject externalSpeciality;

	// Create Private Constrictor
	private ExternalSpecialityPageObject() {
	}

	// GetInstance
	public static ExternalSpecialityPageObject getInstance() {

		if (externalSpeciality == null) {
			externalSpeciality = new ExternalSpecialityPageObject();
		}
		return externalSpeciality;

	}

	// Get Error Message
	@FindBy(xpath = "//mat-error")
	private WebElement ERROR_MESSAGE;

	public String getErrorMessage() {
		return ERROR_MESSAGE.getText();

	}

	// Cardilogy Referral

	// Incase Cardiology Problem

	// Clear The Cardiology Details
	@FindBy(xpath = "//textarea[@placeholder='Enter Cardiovascular System']")
	private WebElement CARDIOLOGY_DETAILS_clear;

	public void ClearTheCardiologyDetails() {
		CARDIOLOGY_DETAILS_clear.clear();
	}

	// Enter The Cardiology Details
	@FindBy(xpath = "//textarea[@placeholder='Enter Cardiovascular System']")
	private WebElement CARDIOLOGY_DETAILS;

	public void enterTheCardiologyDetails(String cardiologyDetails) {
		CARDIOLOGY_DETAILS.sendKeys(cardiologyDetails);
	}

	// Click The Add Button
	@FindBy(xpath = "(//mat-icon)[1]")
	private WebElement ADD_BUTTON;

	public void clickTheAddButton() {
		ADD_BUTTON.click();
	}

	// Click The Clinical Notes
	@FindBy(xpath = "//textarea[@formcontrolname='clinical_notes']")
	private WebElement CLINICAL_NOTES_Click;

	public void clickTheClinicalNotes() {
		CLINICAL_NOTES_Click.click();
	}

	// Enter The Clinical Notes
	@FindBy(xpath = "(//textarea[@placeholder='Enter Notes'])[1]")
	private WebElement CLINICAL_NOTES;

	public void enterTheClinicalNotes(String clinicalNotes) {
		CLINICAL_NOTES.sendKeys(clinicalNotes);
	}

	// Click The Clinic Save Button
	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement SAVE_BUTTON_FOR_CLINIC;

	public void clickTheSaveButtonForClinicalNotes() {
		SAVE_BUTTON_FOR_CLINIC.click();
	}

	// Deformity Referral Create

// Click The Yes Option
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[3]")
	private WebElement YesOption;

	public void clickTheYesOption() {
		YesOption.click();
	}

	// Enter The Deformity
	@FindBy(xpath = "//textarea[@placeholder='Deformities']")
	private WebElement deformity;

	public void enterTheDeformity(String deformityNote) {
		deformity.sendKeys(deformityNote);
	}

	// Respiratory System
	@FindBy(xpath = "//textarea[@placeholder='Respiratory System']")
	private WebElement respiratorySystem;

	public void clearTheRespiratorySystem() {
		respiratorySystem.clear();
	}

	public void enterTheRespiratorySystem(String enterTheValue) {
		respiratorySystem.sendKeys(enterTheValue);
	}

	// Click The Add Button
	@FindBy(xpath = "//*[@class='iconify iconify--material-symbols']")
	private WebElement addButton;

	public void clickTheAddButton2() {
		addButton.click();
	}

	// Click the Speciality

	@FindBy(xpath = "//mat-select[@formcontrolname='speciality']")
	private WebElement speciality;

	public void clickSpeciality() {
		speciality.click();
	}

	// Click The Add Button
	@FindBy(xpath = "//span[contains(text(),'Pulmonology')]")
	private WebElement pulmonology;

	public void clickThePulmonology() {
		pulmonology.click();
	}

	// Skin
	@FindBy(xpath = "//textarea[@placeholder='Skin']")
	private WebElement skin;

	public void clearSkin() {
		skin.clear();
	}

	public void enterTheSkin(String enterSkin) {
		skin.sendKeys(enterSkin);
	}

	// Click The Add Button
	@FindBy(xpath = "//span[contains(text(),'Dermatology')]")
	private WebElement dermatology;

	public void clickTheDermatology() {
		dermatology.click();
	}

	// Ear
	@FindBy(xpath = "//textarea[@placeholder='Ear']")
	private WebElement ear;

	public void clearEar() {
		ear.clear();
	}

	public void enterTheEar(String enterEar) {
		ear.sendKeys(enterEar);
	}

	// Psychiatry

	@FindBy(xpath = "//textarea[@placeholder='Enter Psychiatry']")
	private WebElement psychiatry;

	public void clearPsychiatry() {
		psychiatry.clear();
	}

	public void enterThePhychiatry(String enterPsyc) {
		psychiatry.sendKeys(enterPsyc);
	}
}
