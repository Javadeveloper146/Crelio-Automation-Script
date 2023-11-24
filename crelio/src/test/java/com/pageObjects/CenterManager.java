package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CenterManager {
	private static CenterManager centerManager;

	// Create Private Constrictor
	private CenterManager() {
	}

	// GetInstance
	public static CenterManager getInstance() {

		if (centerManager == null) {
			centerManager = new CenterManager();
		}
		return centerManager;

	}

	// Role Centermanage
	// Click The Centermanager - chennai Option
	@FindBy(xpath = "(//span[contains(text(),'Center Manager')])[1]")
	private WebElement CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION;

	public void clickTheCenterManger() {
		CLICK_THE_LAB_JUNIOR_CHENNAI_OPTION.click();
	}

	// Click The External Barcode Generate

	@FindBy(xpath = "//a[contains(text(),'External Barcode Generate')]")
	private WebElement externalBarcode;

	public void clickTheExternalBarcodeGenerate() {
		externalBarcode.click();
	}

	// Click The Status
	@FindBy(xpath = "//mat-select[@formcontrolname='external_print_status']")
	private WebElement status;

	public void clickTheStatus() {
		status.click();
	}

	// Click The Approved
	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	private WebElement approved;

	public void clickTheApprovedOption() {
		approved.click();
	}

	@FindBy(xpath = "//span[contains(text(),'Completed')]")
	private WebElement Completed;

	public void clickTheCompleted() {
		Completed.click();
	}
	// Click The Completed
	@FindBy(xpath = "(//mat-option[@role='option'])[3]")
	private WebElement completed;

	public void clickTheComplted() {
		completed.click();
	}
	
	// Click The PrintGreen
	
			
			// Click The Completed
			@FindBy(xpath = "(//a[@class='text-green'])[1]")
			private WebElement print;

			public void clickThePrint() {
				print.click();
			}
}
