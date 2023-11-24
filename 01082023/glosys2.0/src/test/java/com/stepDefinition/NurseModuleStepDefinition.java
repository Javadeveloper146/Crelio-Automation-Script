package com.stepDefinition;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.modules.ApplicationStatusCheck;
import com.modules.CredentialsController;
import com.pageObjects.GRODashBoard;
import com.pageObjects.LabJunior;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.NurseSampleOutgoingPageObject;
import com.pageObjects.PatientProfiles;
import com.referralHandler.ReferralCount;
import com.tokenVerify.GROReferralTokenVerify;
import com.tokenVerify.NurseTokenVerify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NurseModuleStepDefinition {
	public static Long nurseStartTime;
	public static Long nurseEndTime;
	static Long millisecondsForNurse;
	GROStepDefinition definition;

	public static String plasmaSpecimenNumber;
	public static String serumSpecimenNumberPlainTube;
	public static String serumSpecimenNumberSST;
	public static String wholeBloodSpecimenNumber;

	public static String tokenPregnacyYesAndMaybe;
	public static String tokenFemalePregnacyNo;
	public static String tokenMalePregnacy;

	public static String variableTokenInFemalePregnacyNo;
	public static String variableTokenInFemalePregnacyYes;
	public static String variableTokenInMale;

	public static boolean referralStatus;
	public static String getTheToken;

	public static int bmiReferralCount;
	public static int bpReferralCount;
	public static int visionReferralCount;
	public static int colorVisionReferralCount;

	public static boolean bmiReferralStatus;
	public static boolean visionReferralStatus;
	public static boolean colorVisionReferralStatus;
	public static boolean bpReferralStatus;
	public static boolean speclityStatus;
	public static long nurseTotalSeconds;
	public static boolean referralCertificateStatus;
	public static int referralCountAutoIncreament;
	public static boolean bpConditionStatus;
	public static boolean bmi_ND_Status;
	public static boolean vision_ND_Status;
	public static boolean bp_ND_Status;
	public static boolean colorVision_NND_Status;
	private static final Logger LOGGER = LogManager.getLogger(NurseModuleStepDefinition.class);
	ReferralCount referralCount = new ReferralCount();

	@Given("enter the userName and Password in Nurse Login")
	public void enter_the_user_name_and_password_in_nurse_login() throws Throwable {
		nurseStartTime = System.currentTimeMillis();
		LOGGER.info("Nurse Module");

		// DriverManager.getDriver().get(ConstantProperties.APPURL);
		// Login UserName And Password
		CredentialsController controller = new CredentialsController();
		controller.nurseCredentialsController(ConstantProperties.STATE);
		LoginPage.getInstance().clickTheSignInButton();

		LOGGER.info("Country" + ": " + ConstantProperties.COUNTRY);
		LOGGER.info("State" + ": " + ConstantProperties.STATE);

		LOGGER.info("Token " + ": " + GROStepDefinition.groTokenLastTwoNumberFinal);
	}

	@When("select the role selection nurse")
	public void select_the_role_selection_nurse() throws Throwable {

	}

	@When("select the counter	selection nurse")
	public void select_the_counter_selection_nurse() throws Throwable {

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3500);
		} else {
			CommonUtility.sleepControl(2000);
		}
		CommonDefinition.counterAutoRefreshAndHandle();

	}

	@Then("token verify page")
	public void token_verify_page() throws Throwable {

		// Token Verify Flow
		NurseTokenVerify tokenVerify = new NurseTokenVerify();
		tokenVerify.next_token();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		NurseModule.getInstance().clickTheVerifyTokenButton();
		LOGGER.info("Successfully Verified The Token");
		// BioMateric Verfication Skip Button
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();

		// Appliction Staus

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_5)) {
			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
	}

	@Then("record Vitals enter the details")
	public void record_vitals_enter_the_details() throws Throwable {

		// Record Vitals
		// Body Mass Index
		LOGGER.info("Record Vitals:");
		// Click The Save Button
		// Get The All Error Meesage

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			CommonUtility.sleepControl(3000);
			CommonUtility.scrollDown400();
			CommonUtility.sleepControl(2000);
			NurseModule.getInstance().clickTheSaveButton();

			// All Error Message
			LOGGER.error(NurseModule.getInstance().getTheHeightError());
			LOGGER.error(NurseModule.getInstance().getTheWeightError());
			LOGGER.error(NurseModule.getInstance().getTheRigthVisionError());
			LOGGER.error(NurseModule.getInstance().getTheLeftVisionError());
			LOGGER.error(NurseModule.getInstance().getTheSystolicPressureError());
			LOGGER.error(NurseModule.getInstance().getTheDiatolicPressureError());

		}
// Temperature
		LOGGER.error("Temperature : ");

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(2500);
		}
		NurseModule.getInstance().enterTheTemperatureValue(ConstantProperties.TEMPERATURE);

		LOGGER.error("Temperature Value : " + ConstantProperties.TEMPERATURE);
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickTheSaveButton();

		// Click The Height Box
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(1500);
		}
		if (ConstantProperties.HEIGHT.equals(AppConstants.NORMAL_HEIGHT)
				&& ConstantProperties.WEIGHT.equals(AppConstants.NORMAL_WEIGHT)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheHeightValue(ConstantProperties.HEIGHT);
			LOGGER.info("Height" + ": " + ConstantProperties.HEIGHT);

			NurseModule.getInstance().enterTheWeightValue(ConstantProperties.WEIGHT);
			LOGGER.info("Weight" + ": " + ConstantProperties.WEIGHT);

		} else if (ConstantProperties.WEIGHT.equals(AppConstants.ABNORMAL_HEIGHT)
				&& ConstantProperties.WEIGHT.equals(AppConstants.ABNORMAL_WEIGHT)) {
			bmi_ND_Status = true;
			referralCertificateStatus = true;
			speclityStatus = true;
			referralCountAutoIncreament += 1;
			bmiReferralStatus = true;
			bmiReferralCount = 1;
			referralStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheHeightValue(ConstantProperties.HEIGHT);
			LOGGER.info(" Ab Noraml Height" + ": " + ConstantProperties.HEIGHT);

			NurseModule.getInstance().enterTheWeightValue(ConstantProperties.WEIGHT);
			LOGGER.info("Ab Normal Weight" + ": " + ConstantProperties.WEIGHT);
		}

		// Click The Weight Box
		LOGGER.info("Successfully enter the Body Mass Index");

		// Vision Module
		// Vision (R)

		if (ConstantProperties.VISION.equals(AppConstants.VISION_NORMAL)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVision_R_Box();
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(3500);
			} else {
				CommonUtility.sleepControl(200);
			}
			GRODashBoard.getInstance().clickTheCounter();
			// NurseModule.getInstance().clickTheVision_R_Option();
			LOGGER.info("Vision (R)" + ": " + NurseModule.getInstance().getTheNormalVisionR());

			// Vision (L)
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVision_L_Box();
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			GRODashBoard.getInstance().clickTheCounter();
			LOGGER.info("Vision (L)" + ": " + NurseModule.getInstance().getTheNormalVisionL());
			// NurseModule.getInstance().clickTheVision_L_Option();

		}
		// Abnormal Vision 6/36

		if (ConstantProperties.VISION.equals(AppConstants.VISION_ABNORMAL)) {
			referralCertificateStatus = true;
			vision_ND_Status = true;

			referralCountAutoIncreament += 1;
			visionReferralCount = 2;
			speclityStatus = true;
			referralStatus = true;
			visionReferralStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVision_R_Box();
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVisionAbnoraml_R_Option();
			LOGGER.info("AbNormal Vision (R)" + ": " + NurseModule.getInstance().getTheNormalVisionR());
			// Vision (L)
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1500);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVision_L_Box();
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().clickTheVisionAbnormal_L_Option();

			LOGGER.info("AbNormal Vision (L)" + ": " + NurseModule.getInstance().getTheNormalVisionL());

		}

		LOGGER.info("Successfully enter the Vision Module");

		// The Color Vision
		// Click The Normal Radio Button
		String driverApplicant = GROStepDefinition.JobPosition;
		// LOGGER.info("Job Describtion : " + driverApplicant);
		if (driverApplicant.equals(AppConstants.DRIVER_APPLICANT)) {

			if (ConstantProperties.COLOR.equals(AppConstants.COLOR_VISION_NORMAL)) {

				CommonUtility.sleepControl(500);
				NurseModule.getInstance().clickTheColorVisionNormalRadioButton();
				// Click The Color Plate
				CommonUtility.sleepControl(500);
				NurseModule.getInstance().clickTheColorPlateBox();
				CommonUtility.sleepControl(500);
				GRODashBoard.getInstance().clickFirstDropDownOption();
				LOGGER.info("Color Vision : " + ConstantProperties.COLOR);

				// Poor
			} else if (ConstantProperties.COLOR.equals(AppConstants.COLOR_VISION_POOR)) {
				colorVision_NND_Status = true;
				referralCertificateStatus = true;
				referralCountAutoIncreament += 1;
				if (visionReferralStatus == true) {
					colorVisionReferralCount = 1;

				} else {
					colorVisionReferralCount = 2;
				}
				referralStatus = true;
				speclityStatus = true;
				colorVisionReferralStatus = true;
				CommonUtility.sleepControl(1000);
				NurseModule.getInstance().clickTheColorVisionPoorRadioButton();
				// Click The Color Plate
				CommonUtility.sleepControl(500);
				NurseModule.getInstance().clickTheColorPlateBox();
				CommonUtility.sleepControl(500);
				GRODashBoard.getInstance().clickFirstDropDownOption();
				LOGGER.info("Color Vision : " + ConstantProperties.COLOR);
			}
		}

		// Other Modules
		// Blood Pressure
		// Systolic Pressure

		if (ConstantProperties.SYSTOLIC_PRESSURE.equals(AppConstants.NORMAL_SYSTOLIC_PRESSURE)
				&& ConstantProperties.DIASTOLIC_PRESSURE.equals(AppConstants.NORMAL_DIASTOLIC_PRESSURE)) {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheSystolicPressureValue(ConstantProperties.SYSTOLIC_PRESSURE);
			LOGGER.info("Nurse Assign The Systolic Pressure Value" + ": " + ConstantProperties.SYSTOLIC_PRESSURE);

			// Diastolic Pressure
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheDiastolicPressureValue(ConstantProperties.DIASTOLIC_PRESSURE);
			LOGGER.info("Nurse Assign The Diastolic Pressure Value" + ": " + ConstantProperties.DIASTOLIC_PRESSURE);

		} else {
			bp_ND_Status = true;
			referralCertificateStatus = true;
			referralStatus = true;
			bpReferralStatus = true;
			boolean bmiRefStatus = NurseModuleStepDefinition.bmiReferralStatus;
			if (bmiRefStatus == true) {
				bpReferralCount = 1;

			} else {
				bpConditionStatus = true;
				bpReferralCount = 2;
			}
			referralStatus = true;
			bpReferralStatus = true;
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheSystolicPressureValue(ConstantProperties.SYSTOLIC_PRESSURE);
			LOGGER.info("Nurse Assign The AbNormal Blood Pressure Value" + ": " + ConstantProperties.SYSTOLIC_PRESSURE);
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1000);
			} else {
				CommonUtility.sleepControl(500);
			}
			NurseModule.getInstance().enterTheDiastolicPressureValue(ConstantProperties.DIASTOLIC_PRESSURE);
			LOGGER.info(
					"Nurse Assign The AbNormal Systolic Pressure Value" + ": " + ConstantProperties.DIASTOLIC_PRESSURE);
		}
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		NurseModule.getInstance().clickTheSaveButton();

		LOGGER.info("Successfully enter the Other Module");
		LOGGER.info("New applicant vitals details created successfully");

	}

	@Then("speciman Genaration")
	public void speciman_genaration() throws Throwable {

		// Speciman Genaration
		// Click The Speciman Genaration button

		LOGGER.info("Speciman Genaration :");
		// Negative Scenarios
		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			CommonUtility.sleepControl(2500);
			NurseModule.getInstance().clickTheSpecimanGenarationButton();
			LOGGER.error("Please select atleast one specimen generation to continue");
			CommonUtility.sleepControl(1500);
			NurseModule.getInstance().clickTheCloseButton();
		}

		// NurseModule.getInstance().clickTheSpecimanGenarationSelectAllOption();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4500);
		} else {
			CommonUtility.sleepControl(4000);
		}
		LOGGER.info("Order ID : " + NurseSampleOutgoingPageObject.getInstance().getTheOrderId());
		LOGGER.info("Whole Blood (EDTA) Specimen Number" + ": " + "Yet to be Generated");
		LOGGER.info("Serum (PLT) Specimen Number" + ": " + "Yet to be Generated");
		LOGGER.info("Plasma(FLU) Specimen Number" + ": " + "Yet to be Generated");
		LOGGER.info("Serum (SST) Specimen Number" + ": " + "Yet to be Generated");
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheSpecimanGenarationButton();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(6800);
		} else {
			CommonUtility.sleepControl(6000);

		}
		LOGGER.info("Speciman Genarated Successfully");

	}

	@Then("Speciman Collection")
	public void speciman_collection() throws Throwable {

		// Speciman Collectiond
		LOGGER.info("Speciman Collection :");

		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			CommonUtility.sleepControl(1000);
			NurseModule.getInstance().clickTheCollectedButton();
			LOGGER.error("Please select atleast one specimen collection to continue");
			CommonUtility.sleepControl(1500);
			NurseModule.getInstance().clickTheCloseButton();
		}

		// Get The Specimen Numbers
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1200);
		}
		WebElement pathToken1 = DriverManager.getDriver().findElement(By.xpath("(//td)[13]"));
		wholeBloodSpecimenNumber = pathToken1.getAttribute("id");
		WebElement pathToken2 = DriverManager.getDriver().findElement(By.xpath("(//td)[27]"));
		serumSpecimenNumberPlainTube = pathToken2.getAttribute("id");
		if (GROStepDefinition.gender.equals(AppConstants.FEMALE_GENDER)) {
			WebElement pathToken3 = DriverManager.getDriver().findElement(By.xpath("(//td)[47]"));
			plasmaSpecimenNumber = pathToken3.getAttribute("id");
			WebElement pathToken4 = DriverManager.getDriver().findElement(By.xpath("(//td)[59]"));
			serumSpecimenNumberSST = pathToken4.getAttribute("id");
		} else if (GROStepDefinition.gender.equals(AppConstants.MALE_GENDER)) {
			WebElement pathToken3 = DriverManager.getDriver().findElement(By.xpath("(//td)[45]"));
			plasmaSpecimenNumber = pathToken3.getAttribute("id");
			WebElement pathToken4 = DriverManager.getDriver().findElement(By.xpath("(//td)[57]"));
			serumSpecimenNumberSST = pathToken4.getAttribute("id");
		}
		LOGGER.info("Whole Blood (EDTA) Specimen Number : " + wholeBloodSpecimenNumber + " - " + "Generated");
		LOGGER.info("Serum (Plain Tube) Specimen Number : " + serumSpecimenNumberPlainTube + " - " + "Generated");
		LOGGER.info("Plasma(FLU) Specimen Number : " + plasmaSpecimenNumber + " - " + "Generated");
		LOGGER.info("Serum (SST) Specimen Number : " + serumSpecimenNumberSST + " - " + "Generated");

		// Click The Select All Box
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1200);
		} else {
			CommonUtility.sleepControl(900);
		}
		NurseModule.getInstance().clickTheSpecimanCollectionAllSelectOption();

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		NurseModule.getInstance().clickTheCollectedButton();
		LOGGER.info("Speciman Collected Successfully");
	}

	@Then("enter The Vaccination details")
	public void enter_the_vaccination_details() throws Throwable {

		LOGGER.info("Vaccination" + ": ");

		if (AppConstants.NEGATIVE_SCENARIO_NO.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			// H/O fever in past 1 week?
			if (GROStepDefinition.gender.equals(AppConstants.FEMALE_GENDER)) {
				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {
					if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
						LOGGER.info("Pre Vaccination CheckList" + ": ");
						preVaccinationCheckList();

					}
				}
			}
			if (GROStepDefinition.gender.equals(AppConstants.MALE_GENDER)) {
				if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
					LOGGER.info("Pre Vaccination CheckList" + ": ");
					preVaccinationCheckList();

				}
			}
		}

		if (AppConstants.NEGATIVE_SCENARIO_NO.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			// Female
			String genderDetails = GROStepDefinition.gender;
			if (genderDetails.equals(AppConstants.FEMALE_GENDER)) {

				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {

					switch (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS) {
					case "Yes":
						CommonDefinition commonDefinition = new CommonDefinition();
						commonDefinition
								.vaccinationDocumentUploadedInGROModuleAndNurseModuleNoOptionChooseAndResonSelected();
						break;
					case "No":
						// Document Not Upload in GRO click The "Yes" Option
						// TD Vaccine
						// Click The TD Vaccine "Yes" Radio Button

						CommonDefinition commonDefinition1 = new CommonDefinition();
						commonDefinition1.vaccinationDocumentNotUploadInGROModuleByNurseModuleEnterTheBatchNumber();

					default:
						break;

					}
				}
			}
			if (genderDetails.equals(AppConstants.MALE_GENDER)) {
				switch (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS) {
				case "Yes":

					CommonDefinition commonDefinition = new CommonDefinition();
					commonDefinition
							.vaccinationDocumentUploadedInGROModuleAndNurseModuleNoOptionChooseAndResonSelected();
					break;

				case "No":

					// Document Not Upload in GRO click The "Yes" Option
					// TD Vaccine
					// Click The TD Vaccine "Yes" Radio Button
					CommonDefinition commonDefinition1 = new CommonDefinition();
					commonDefinition1.vaccinationDocumentNotUploadInGROModuleByNurseModuleEnterTheBatchNumber();
				default:
					break;
				}
			}
		}

		// Vaccination
		// Negative Scenario
		// "Yes" And Properties file also "Yes"
		if (AppConstants.NEGATIVE_SCENARIO_YES.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {
			// Female
			String genderDetails = GROStepDefinition.gender;
			if (genderDetails.equals(AppConstants.FEMALE_GENDER)) {

				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {

					switch (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS) {
					case "Yes":
						// Negative Scenario
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
						LOGGER.error(NurseModule.getInstance().getTheVaccineError());
						LOGGER.error(NurseModule.getInstance().getTheVaccine1Error());
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheTDVaccineNoRadioButton();
						CommonUtility.sleepControl(1000);
						NurseModule.getInstance().clickTheMMRVaccineNoRadioButton();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
						LOGGER.error(NurseModule.getInstance().getTheBatchError());
						LOGGER.error(NurseModule.getInstance().getTheBatch1Error());
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSelectReason();
						CommonUtility.sleepControl(1000);
						CommonUtility.enterFunction();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSelectReason();
						CommonUtility.sleepControl(1000);
						CommonUtility.enterFunction();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineInformationYesOption();

						break;
					case "No":
						// Negative Scenario
						// Click The TD Vaccine "Yes" Radio Button
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
						LOGGER.error(NurseModule.getInstance().getTheVaccineError());
						LOGGER.error(NurseModule.getInstance().getTheVaccine1Error());
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheTDVaccineYesRadioButton();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheMMRVaccineYesRadioButton();
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
						LOGGER.error(NurseModule.getInstance().getTheBatchError());
						LOGGER.error(NurseModule.getInstance().getTheBatch1Error());
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheTDVaccineTextBox();
						CommonUtility.sleepControl(1000);
						NurseModule.getInstance().enterTheTDVaccineDetails(AppConstants.TD_VACCINE_BATCH_NUMBER);
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheMMRVaccineTextBox();
						CommonUtility.sleepControl(1000);
						NurseModule.getInstance().enterTheMMRVaccineDetails(AppConstants.MMR_VACCINE_BATCH_NUMBER);
						CommonUtility.sleepControl(2000);
						NurseModule.getInstance().clickTheVaccineSaveButton();
					default:

						break;

					}
				}
			}
			if (genderDetails.equals(AppConstants.MALE_GENDER)) {
				switch (ConstantProperties.VACCINATION_DOCUMENT_UPLOAD_STATUS) {
				case "Yes":
					// Negative Scenario
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					LOGGER.error(NurseModule.getInstance().getTheVaccineError());
					LOGGER.error(NurseModule.getInstance().getTheVaccine1Error());
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheTDVaccineNoRadioButton();
					CommonUtility.sleepControl(1000);
					NurseModule.getInstance().clickTheMMRVaccineNoRadioButton();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					LOGGER.error(NurseModule.getInstance().getTheBatchError());
					LOGGER.error(NurseModule.getInstance().getTheBatch1Error());
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSelectReason();
					CommonUtility.sleepControl(1000);
					CommonUtility.enterFunction();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSelectReason();
					CommonUtility.sleepControl(1000);
					CommonUtility.enterFunction();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineInformationYesOption();
					break;

				case "No":
					// Negative Scenario
					// Click The TD Vaccine "Yes" Radio Button
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					LOGGER.error(NurseModule.getInstance().getTheVaccineError());
					LOGGER.error(NurseModule.getInstance().getTheVaccine1Error());
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheTDVaccineYesRadioButton();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheMMRVaccineYesRadioButton();
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					LOGGER.error(NurseModule.getInstance().getTheBatchError());
					LOGGER.error(NurseModule.getInstance().getTheBatch1Error());
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheTDVaccineTextBox();
					CommonUtility.sleepControl(1000);
					NurseModule.getInstance().enterTheTDVaccineDetails(AppConstants.TD_VACCINE_BATCH_NUMBER);
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheMMRVaccineTextBox();
					CommonUtility.sleepControl(1000);
					NurseModule.getInstance().enterTheMMRVaccineDetails(AppConstants.MMR_VACCINE_BATCH_NUMBER);
					CommonUtility.sleepControl(2000);
					NurseModule.getInstance().clickTheVaccineSaveButton();
					LOGGER.info("Successfully enter the MMR Vaccine Details");

				default:
					break;
				}
			}
		}
	}

	@Then("feedback")
	public void feedback() throws Throwable {

		// Click The Nurse Module Collect Feedback
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();

		LOGGER.info("Nurse Module Feedback collected successfully");
		CommonUtility.sleepControl(8000);

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_6)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

	}

	@Then("Sample Outgoing")
	public void sample_outgoing() throws Throwable {
		LOGGER.info("Sample Outgoing");

		// click The Sample Outgoing
		CommonUtility.sleepControl(1000);
		NurseSampleOutgoingPageObject.getInstance().clickTheSampleOutgoing();
		if (ConstantProperties.NEGATIVE_SCENARIO_STATUS.equals(AppConstants.NEGATIVE_SCENARIO_YES)) {
			CommonUtility.scrollDown1000();
			CommonUtility.sleepControl(2000);
			NurseSampleOutgoingPageObject.getInstance().clickTheCollectedButton();
			CommonUtility.scrollDown400();
			CommonUtility.sleepControl(1000);
			LOGGER.info("Kindly scan any one of the specimen number");
		}

//		LOGGER.info("Plasma Specimen Number" + ": " + plasmaSpecimenNumber);
//		LOGGER.info("Serum Specimen Number" + ": " + serumSpecimenNumber);
//		LOGGER.info("Whole Blood Specimen Number" + ": " + wholeBloodSpecimenNumber);

	}

	@Then("Scan Speciman Number")
	public void scan_speciman_number() throws Throwable {

		LOGGER.info("Scan Specimen Number");

		// Scan The plasmaSpecimenNumber
		try {
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(3500);
			} else {
				CommonUtility.sleepControl(3500);
			}
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(wholeBloodSpecimenNumber);
//			CommonUtility.sleepControl(500);
//			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Successfully scan the Whole Blood (EDTA) Specimen Number" + ": " + wholeBloodSpecimenNumber);
			// Scan The serumSpecimenNumber
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(300);
			}
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberPlainTube);
//			CommonUtility.sleepControl(200);
//			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info(
					"Successfully scan the Serum (Plain Tube) Specimen Number" + ": " + serumSpecimenNumberPlainTube);
			// Scan The wholeBloodSpecimenNumber
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(300);
			}
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(plasmaSpecimenNumber);
//			CommonUtility.sleepControl(200);
//			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Suceessfully scan the Plasma(FLU) Specimen Numberr" + ": " + plasmaSpecimenNumber);
			if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
				CommonUtility.sleepControl(1200);
			} else {
				CommonUtility.sleepControl(300);
			}
			NurseSampleOutgoingPageObject.getInstance().scanTheSpecimenNumber(serumSpecimenNumberSST);
//			CommonUtility.sleepControl(200);
//			NurseSampleOutgoingPageObject.getInstance().clickTheScanButton();
			LOGGER.info("Suceessfully scan the Serum (SST) Specimen Number" + ": " + serumSpecimenNumberSST);
		} catch (Exception e) {

		}

	}

	@Then("Lab Technician and GRO info and Collected")
	public void lab_technician_and_gro_info_and_collected() throws Throwable {
		LOGGER.info("Lab Technician and GRO Information");
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1500);
		} else {
			CommonUtility.sleepControl(500);
		}
		CommonUtility.scrollDown1000();

		// Click The Lab tech Name
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		NurseSampleOutgoingPageObject.getInstance().ClickTheLabTechName();

		// Click The Lab Technician Glossys
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		NurseSampleOutgoingPageObject.getInstance().clickTheLabTechnicianGlossys();
		LOGGER.info("Lab Tech Name" + ": " + "Lab Technician Glossys");
		// Click The GRO Name
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		NurseSampleOutgoingPageObject.getInstance().clickTheGROName();

		// Click The GRO Glossys
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1000);
		} else {
			CommonUtility.sleepControl(500);
		}
		NurseSampleOutgoingPageObject.getInstance().clickTheGROGlossys();
		LOGGER.info("GRO Name" + ": " + "GRO Glossys");
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2800);
		} else {
			CommonUtility.sleepControl(2000);
		}

		NurseSampleOutgoingPageObject.getInstance().clickTheCollectedButton();
		LOGGER.info(" Sample's Sent to LAB successfully");
		
	}

	@Then("Logout in nurse module")
	public void logout_in_nurse_module() throws Throwable {
		CommonDefinition commonDefinition = new CommonDefinition();
		CommonUtility.sleepControl(700);
		commonDefinition.logOut();

		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_8)) {

			LabJuniorStepDefinition definition = new LabJuniorStepDefinition();
			definition.enter_the_user_name_and_password_in_lab_junior_login();
			definition.lab_junior_role_selection();
			definition.specimen_inscan_process();

			if (ConstantProperties.REJECT_FOR_PLASMA.equals(AppConstants.APPROVAL_REJECT)) {
				CommonUtility.sleepControl(1000);
				LabJunior.getInstance().enterTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);//
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().clickTheSearchButton();
				CommonUtility.sleepControl(2000);
				LabJunior.getInstance().scanTheSpecimenNumber(NurseModuleStepDefinition.plasmaSpecimenNumber);
				LOGGER.info("Plasma Specimen Number" + ": " + NurseModuleStepDefinition.plasmaSpecimenNumber);
			}
			if (ConstantProperties.REJECT_FOR_PLASMA.equals(AppConstants.APPROVAL_REJECT)) {

				LabJuniorStepDefinition definition3 = new LabJuniorStepDefinition();
				definition3.rejectSample();
				CommonUtility.sleepControl(1000);

			}
			CommonDefinition commonDefinition1 = new CommonDefinition();
			commonDefinition1.logOut();

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}

		nurseEndTime = System.currentTimeMillis();
		millisecondsForNurse = (nurseEndTime - nurseStartTime);
		LOGGER.info("Nurse Runing Time:");
		nurseRunTime(millisecondsForNurse);

	}

	public void nurseRevisitForRecheck() throws Throwable {
		CommonUtility.sleepControl(3000);
		NurseModule.getInstance().clickVisionDetails();
		LOGGER.info("Color Vision Recheck : ");
		// Click The Vision details
		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickThe_Rechcek_Vision_R_Box();
		CommonUtility.sleepControl(200);
		GRODashBoard.getInstance().clickTheCounter();
		CommonUtility.sleepControl(500);
		NurseModule.getInstance().clickThe_Recheck_Vision_L_Box();
		CommonUtility.sleepControl(500);
		GRODashBoard.getInstance().clickTheCounter();
		CommonUtility.sleepControl(500);
		LOGGER.info("Color Vision Recheck : Normal");
		LOGGER.info("Color Plate : 13/14");
		NurseModule.getInstance().clickTheSaveButton();
		CommonUtility.sleepControl(2000);

	}

	public void nurseRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		nurseTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + nurseTotalSeconds + " " + "seconds");

	}

	public void preVaccinationCheckList() throws Throwable {

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(3000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		NurseModule.getInstance().clickButtonNo1();
		LOGGER.info("H/O fever in past 1 week? " + ": " + ConstantProperties.PRE_VACCINATION_CHECKLIST);

		// Present history of chronic cough/TB
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo2();
			LOGGER.info("Present history of chronic cough/TB " + ": " + ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}

		// Known H/O allergy to drugs?
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo3();
			LOGGER.info("Known H/O allergy to drugs? " + ": " + ConstantProperties.PRE_VACCINATION_CHECKLIST);

		}
		// H/O steroid intake?
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo4();
			LOGGER.info("H/O steroid intake? " + ": " + ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}

		// H/O Cancer / ongoing Cancer treatment (Chema or radiotheraphy) ?
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(500);
			CommonUtility.scrollDown100();
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo5();
			LOGGER.info("H/O Cancer / ongoing Cancer treatment (Chema or radiotheraphy) ?" + ": "
					+ ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}
		// H/O blood transfusion in the recent past (past 1 month)?

		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo6();
			LOGGER.info("H/O blood transfusion in the recent past (past 1 month)? " + ": "
					+ ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}

		// H/O organ transplantation (immunomodulator drugs administered)?
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo7();

			LOGGER.info("H/O organ transplantation (immunomodulator drugs administered)? " + ": "
					+ ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}

		// History of previous or know vaccine allergy?
		if (ConstantProperties.PRE_VACCINATION_CHECKLIST.equals(AppConstants.NO)) {
			CommonUtility.sleepControl(200);
			NurseModule.getInstance().clickButtonNo8();
			LOGGER.info("History of previous or know vaccine allergy?" + ": "
					+ ConstantProperties.PRE_VACCINATION_CHECKLIST);
		}

		CommonUtility.sleepControl(1000);
		NurseModule.getInstance().clickTheVaccineSaveButton();

	}

	public static boolean tExpiry() {

		return true;
	}
}