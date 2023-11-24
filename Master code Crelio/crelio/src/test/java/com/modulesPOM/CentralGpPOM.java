package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CentralGpPOM {
	private static CentralGpPOM centralGpPOM;

	// Create Private Constrictor
	private CentralGpPOM() {
	}

	// GetInstance
	public static CentralGpPOM getInstance() {

		if (centralGpPOM == null) {
			centralGpPOM = new CentralGpPOM();
		}
		return centralGpPOM;

	}
	
	// Click The Central Gp Option
		@FindBy(xpath = "//span[contains(text(),'Central GP ')]")
		private WebElement NURSE_CHENNAI_OPTION;

		public void clickTheCentralGpRole() {
			NURSE_CHENNAI_OPTION.click();
		}
		
	
		@FindBy(xpath = "//a[contains(text(),'CGP Worklist')]")
		private WebElement cgpWorkList;

		public void clickTheCGPWorkList() {
			cgpWorkList.click();
		}
		
		@FindBy(xpath = "//input[@formcontrolname='visa_number']")
		private WebElement visaNumber;

		public void enterTheVisaNumber(String enterTheVisaNumber) {
			visaNumber.sendKeys(enterTheVisaNumber);

		}
		
		@FindBy(xpath = "//button[contains(text(),'Search')]")
		private WebElement search;

		public void clickTheSearch() {
			search.click();
		}
		
		@FindBy(xpath = "(//h4)[2]")
		private WebElement confirmatoryLab;

		public void clickTheConfirmatoryLab() {
			confirmatoryLab.click();
		}
		
		
		@FindBy(xpath = "//*[@data-icon='clarity:edit-line']")
		private WebElement edit;

		public void clickTheEditIcon() {
			edit.click();
		}
		
		@FindBy(xpath = "//span[contains(text(),'Yes')]")
		private WebElement Yes;

		public void clickTheYes() {
			Yes.click();
		}
}
