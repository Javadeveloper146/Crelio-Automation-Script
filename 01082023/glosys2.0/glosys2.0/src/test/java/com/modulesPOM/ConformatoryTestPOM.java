package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConformatoryTestPOM {
	private static ConformatoryTestPOM conformatorPom;

	// Create Private Constrictor
	private ConformatoryTestPOM() {
	}

	// GetInstance
	public static ConformatoryTestPOM getInstance() {

		if (conformatorPom == null) {
			conformatorPom = new ConformatoryTestPOM();
		}
		return conformatorPom;

	}
	
	// Click Confirmatory Lab
	@FindBy(xpath = "//h4[contains(text(),'Lab Confirmatory')]")
	private WebElement conformatory;

	public void clickLabConfirmatory() {
		conformatory.click();
	}
}
