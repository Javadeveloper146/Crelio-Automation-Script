package com.modulesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationStatusCheckPom {

	
	private static ApplicationStatusCheckPom  applicationStatusCheckPom;

	// Create Private Constrictor
	private ApplicationStatusCheckPom() {
	}

	// GetInstance
	public static ApplicationStatusCheckPom getInstance() {

		if (applicationStatusCheckPom == null) {
			applicationStatusCheckPom = new ApplicationStatusCheckPom();
		}
		return applicationStatusCheckPom;

		
	
		
		
	}
	// Click The Role Selection 
	@FindBy(xpath = "//a[contains(text(),'Applicant Status Check')]")
	private WebElement ApplicationStatus;

	public void clickApplicationStatus() {
		ApplicationStatus.click();
	}
	
	// Enter The VisaNumber
	@FindBy(xpath = "//*[@formcontrolname='visa_number']")
	private WebElement visaNumber;

	public void enterTheVisaNumber(String enterVisaNumber) {
		visaNumber.sendKeys(enterVisaNumber);
	}
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement Search;

	public void clickSearch() {
		Search.click();
	}
	//1
	@FindBy(xpath = "(//td)[1]")
	private WebElement one;

	public String getTheOneValue() {
		return one.getText();
	}
	//2
		@FindBy(xpath = "(//td)[2]")
		private WebElement two;

		public String getTheTwoValue() {
			return two.getText();
		}
		//3
				@FindBy(xpath = "(//td)[3]")
				private WebElement three;

				public String getThethreeValue() {
					return three.getText();
				}
				//4
				@FindBy(xpath = "(//td)[4]")
				private WebElement four;

				public String getTheFourValue() {
					return four.getText();
				}
				//5
				@FindBy(xpath = "(//td)[5]")
				private WebElement five;

				public String getTheFiveValue() {
					return five.getText();
				}
				//6
				@FindBy(xpath = "(//td)[6]")
				private WebElement six;

				public String getTheSixValue() {
					return six.getText();
				}
				//7
				@FindBy(xpath = "(//td)[7]")
				private WebElement seven;

				public String getTheSevenValue() {
					return seven.getText();
				}
				//8
				@FindBy(xpath = "(//td)[8]")
				private WebElement eight;

				public String getTheEightValue() {
					return eight.getText();
				}
				//9
				@FindBy(xpath = "(//td)[9]")
				private WebElement nine;

				public String getThe9Value() {
					return nine.getText();
				}
				//10
				@FindBy(xpath = "(//td)[10]")
				private WebElement ten;

				public String getThe10Value() {
					return ten.getText();
				}
				//11
				@FindBy(xpath = "(//td)[11]")
				private WebElement eleven;

				public String getThe11Value() {
					return eleven.getText();
				}
				//12
				@FindBy(xpath = "(//td)[12]")
				private WebElement twevele;

				public String getThe12Value() {
					return twevele.getText();
				}
				// click The Application Visit At QMC
				@FindBy(xpath = "//h4[contains(text(),'Applicant Visit at QMC')]")
				private WebElement applicationVisit;

				public void clickApplicationVisitAtQmc() {
					applicationVisit.click();
				}
				
				@FindBy(xpath = "//h4[contains(text(),'Reporting')]")
				private WebElement reporting ;

				public void clickReporting() {
					reporting.click();
				}
				@FindBy(xpath = "//h4[contains(text(),'Certification')]")
				private WebElement certification;

				public void clickCertification() {
					certification.click();
				}
}
