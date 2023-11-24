package com.stepDefinition;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.appConstants.AppConstants;
import com.appConstants.ApplicationScenarioConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ApplicationStatusCheckProperties;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.driverManager.DriverManager;
import com.flowContoller.FlowController;
import com.modules.ApplicationStatusCheck;
import com.modules.CredentialsController;
import com.modules.XrayModule;
import com.pageObjects.ExternalSpecialityPageObject;
import com.pageObjects.GRODashBoard;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.LoginPage;
import com.pageObjects.NurseModule;
import com.pageObjects.PatientProfiles;
import com.pageObjects.PrintReceiptPOM;
import com.referral.ExternalSpeciality;
import com.referralHandler.ReferralCount;
import com.tokenVerify.NurseTokenVerify;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GpModuleStepDefinition {
	public static boolean ND_Status;

	public static String negativeScenarioYes = "Yes";
	public static String negativeScenarioNo = "No";
	String ConsltationOptionIsNo = "No";

	public static String colorVisionNormal = "Normal";
	public static String colorVisionAbNormal = "Poor";
	public static String getNoReferralCreateText;

	public static Long start;
	public static Long end;
	public static Long millisecondsStemzGP;
	public static boolean referralStatus;
	GROStepDefinition definition = new GROStepDefinition();

	public static int cardilogyReferralCount;
	public static int deformatoryReferralCount;
	public static int respitoryRefCount;
	public static int skinRefCount;
	public static int earRefCount;
	public static int PsychiatryRefCount;
	public static int PreviousIllnessRefCount;
	public static int NeurologicalRefCount;
	public static int stemzBpReferralCount;
	public static int referralCountAutoIncreament;
	public static boolean popUpStatus;
	public static boolean cardiologyReferralStatus;
	public static boolean deformityReferralStatus;
	public static boolean respitoryRefStatus;
	public static boolean skinRefStatus;
	public static boolean earRefStatus;
	public static boolean PsychiatryRefStatus;
	public static boolean PreviousIllnessStatus;
	public static boolean NeurologicalRefStatus;
	public static boolean bpReferralStatus;
	public static boolean referralCertificateStatus;
	public static long gpTotalSeconds;

	public static String correctToken; 
	public static boolean gpSpecility;
	ReferralCount count = new ReferralCount();

	public String getConsltationOptionIsNo() {
		return ConsltationOptionIsNo;
	}

	private static final Logger LOGGER = LogManager.getLogger(GpModuleStepDefinition.class);

	@Given("enter the userName and Password in Gp Login")
	public void enter_the_user_name_and_password_in_gp_login() throws Throwable {

		String token = GROStepDefinition.getTheTokenDetails;
		 correctToken = token.substring(13, 16);
		System.err.println("Token Flow" + correctToken);
		// QC Reject

		if(correctToken.equals(AppConstants.TOKEN_NNXD)) {
		// ------------ X Ray ------------------
		
			switch (GROStepDefinition.gender) {
			case AppConstants.FEMALE_GENDER:
				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {

					XrayModule module = new XrayModule();
					module.xrayModuleFlows();

				} else {
					LOGGER.info("Female Applicant & Pregnant :" + ConstantProperties.PREGNANT_STATUS);
				}
				break;

			case AppConstants.MALE_GENDER:
				XrayModule module = new XrayModule();
				module.xrayModuleFlows();

			default:
				System.err.println("Token And Gender Issue");

			}
		
		}
		// --------------------------------------------------------------
		start = System.currentTimeMillis();
		LOGGER.info("Start Time  = " + start);
		// Single Module Run
		// DriverManager.getDriver().get(ConstantProperties.APPURL);

		// Credential
		CommonUtility.sleepControl(500);
		CredentialsController controller = new CredentialsController();
		controller.gpCredentialsController(ConstantProperties.STATE);

		CommonUtility.sleepControl(500);
		LoginPage.getInstance().clickTheSignInButton();

		LOGGER.info("Stemz GP Module");
	}

	@When("select the role selection StemzGp")
	public void select_the_role_selection_stemz_gp() throws Throwable {

//		CommonUtility.sleepControl(1500);
//		GRODashBoard.getInstance().clickTheRoleSelction();
//		CommonUtility.sleepControl(500);
//		GpModule.getInstance().clickTheStemzGpChennai();
//		LOGGER.info("Role Section" + ": " + GRODashBoard.getInstance().GetTheRoleSelction());
//
//		switch (ConstantProperties.COUNTRY) {
//		case "India":
//			CommonDefinition.countryIndia();
//			break;
//		case "Manila":
//			CommonDefinition.countryPhilippines();
//			break;
//
//		case "Srilanka":
//			CommonDefinition.srilankaCountry();
//			break;
//		case "Pakistan":
//			CommonDefinition.pakistan_Country();
//			break;
//		default:
//
//			break;
//		}
//
//		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_LOCATION)) {
//			CommonUtility.sleepControl(500);
//			GRODashBoard.getInstance().clickTheState();
//			CommonUtility.sleepControl(200);
//			GRODashBoard.getInstance().clickTheKarachi();
//
//		}
//		CommonUtility.sleepControl(500);
//		GRODashBoard.getInstance().clickTheProceedButton();
//
	}

	@When("select the counter for gp selection")
	public void select_the_counter_for_gp_selection() throws Throwable {
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2800);
		} else {
			CommonUtility.sleepControl(2000);
		}
		CommonDefinition.counterAutoRefreshAndHandle();
		CommonUtility.sleepControl(1500);

		try {
			CommonUtility.sleepControl(1000);
			popUpStatus = GpModule.getInstance().getThePopClose();
			System.err.println("Eoor" + popUpStatus);
			if (popUpStatus == true) {
				System.err.println("Eoor in " + popUpStatus);
//				CommonUtility.sleepControl(700);
//				GpModule.getInstance().clickThemsgPopUP();
				CommonUtility.sleepControl(500);
				GpModule.getInstance().clicThePopClose();
			}
		} catch (Exception e) {

		}
	}

	@Then("gp token verify page")
	public void gp_token_verify_page() throws Throwable {

		// CommonDefinition.recallToken();
		// Verify The Token
		NurseTokenVerify tokenVerify = new NurseTokenVerify();
		tokenVerify.next_token();
//		CommonDefinition commonDefinition = new CommonDefinition();
//		commonDefinition.recallFunction();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2000);
		} else {
			CommonUtility.sleepControl(1000);
		}
		NurseModule.getInstance().clickTheVerifyTokenButton();
		LOGGER.info("Successfully Verified The Token");
		if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_10)) {

			ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
			applicationStatusCheck.applicationStatusCheck();
		}
	}

	@When("Biometric verification")
	public void biometric_verification() throws Throwable {

		CommonUtility.sleepControl(1200);
		GRODashBoard.getInstance().clickTheFingerPrintSkipButton();

	}

	@When("Gp Consulation Process")
	public void gp_consulation_process() throws Throwable {
		ExternalSpeciality deformityReferralCreate = new ExternalSpeciality();
		LOGGER.info("Gp Consulation Process");

		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(2500);
		} else {
			CommonUtility.sleepControl(2000);
		}
		GpModule.getInstance().clicTheConsulationOption();

		if (negativeScenarioYes.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			// Check The Condition
			// Preset Option "Normal" else "Abnormal"
			String presetOptionIsNormal = "Normal";
			if (presetOptionIsNormal.equals(AppConstants.PRESENT_OPTION)) {
				LOGGER.info("PresetOptionIsNormal" + ": " + AppConstants.PRESENT_OPTION);
				LOGGER.info("Consulation Preset" + ": " + AppConstants.PRESENT_OPTION);
				CommonUtility.scrollDown400();
				CommonUtility.sleepControl(2000);
				GpModule.getInstance().clickTheSelectPreset();
				CommonUtility.sleepControl(500);
				GpModule.getInstance().chooseTheNormalOption();
				
				CommonUtility.sleepControl(1000);
				if (AppConstants.CARDILOGY_PROBLEM.equals(ConstantProperties.CARDIOLOGY)) {

					LOGGER.info("Cardiovascular System" + ": " + "Speciality =  Cardiology");
					// Enter The Cardiology Problem
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().ClearTheCardiologyDetails();
					CommonUtility.sleepControl(1000);
					ExternalSpecialityPageObject.getInstance().enterTheCardiologyDetails(ConstantProperties.CARDIOLOGY);
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().clickTheAddButton();
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
					CommonUtility.sleepControl(2000);
					LOGGER.error(ExternalSpecialityPageObject.getInstance().getErrorMessage());
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().enterTheClinicalNotes(AppConstants.COMMON_COMMENTS);
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
					LOGGER.info("Successfully Cardilogy Referral Created");
					gpSpecility = true;

				}

				if (AppConstants.DEFORMITY_PROBLEM.equals(ConstantProperties.DEFORMITY)) {
					referralCertificateStatus = true;
					LOGGER.info("Deformities" + ": " + "Speciality =  Orthopedic");
					// Click The Yes Option
					CommonUtility.sleepControl(3000);
					ExternalSpecialityPageObject.getInstance().clickTheYesOption();

					// Enter The Deformity
					CommonUtility.sleepControl(3000);
					ExternalSpecialityPageObject.getInstance().enterTheDeformity(ConstantProperties.DEFORMITY);

					// Click The Add Button
					CommonUtility.sleepControl(3000);
					ExternalSpecialityPageObject.getInstance().clickTheAddButton();
					CommonUtility.sleepControl(2000);
					ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
					CommonUtility.sleepControl(1000);
					LOGGER.error(ExternalSpecialityPageObject.getInstance().getErrorMessage());
					CommonUtility.sleepControl(1000);
					ExternalSpecialityPageObject.getInstance().enterTheClinicalNotes(AppConstants.COMMON_COMMENTS);
					CommonUtility.sleepControl(1000);
					ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
					LOGGER.info("Successfully Deformity Referral Created");
					gpSpecility = true;
				}

				CommonUtility.sleepControl(3000);
				CommonUtility.scrollDown400();
				CommonUtility.sleepControl(2000);
				GpModule.getInstance().clickTheSaveButton();

				CommonUtility.sleepControl(2000);
				LOGGER.error(GpModule.getInstance().getTheIllnessError());
				LOGGER.error(GpModule.getInstance().getTheYourMealsInLast10LoursError());
				LOGGER.error(GpModule.getInstance().getThePsyNeuroDisorderError());
				LOGGER.error(GpModule.getInstance().getTheCommentsError());

				switch (ConstantProperties.MEDICAL_HISTORY) {

				case "Yes":
					LOGGER.info("Medical History" + ": " + "Yes");
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().clickThePerviousIllnessYesOption();
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().enterThePerviousIllnessDetails(AppConstants.COMMON_COMMENTS);
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().clickTheYourMealsInLast10LoursYesOPtion();
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().clickThePsychiatricOrNeurologicalDisorderYESOption();
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().enterThePsychiatrciOrNeurological(AppConstants.COMMON_COMMENTS);
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().enterTheComment(AppConstants.COMMON_COMMENTS);
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().clickTheSaveButton();
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheYesButton();
					break;
				case "No":
					LOGGER.info("Medical History" + ": " + "No");
					// Click The Pervious Illness
					CommonUtility.sleepControl(3000);
					GpModule.getInstance().clickThePerviousIllnessNoOption();

					// Click The Did you have your meals in last 10 hours "No" OPtion
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheYourMealsInLast10LoursNoOPtion();

					// Click The Psychiatric or Neurological Disorder "No" OPtion
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickThePsychiatricOrNeurologicalDisorderNoOption();

					// Enter The Comments
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().enterTheComment(AppConstants.COMMON_COMMENTS);

					if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO
							.equals(ApplicationScenarioConstants.SC_11)) {
						CommonUtility.sleepControl(1000);
						ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
						applicationStatusCheck.applicationStatusCheck();
					}

					// Click The Save Button
					CommonUtility.sleepControl(2000);
					GpModule.getInstance().clickTheSaveButton();
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheYesButton();
					break;
				default:
					break;
				}
			}
		}
		// Referral Create Negative Flow
		if (negativeScenarioYes.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

		}

		if (negativeScenarioNo.equals(ConstantProperties.NEGATIVE_SCENARIO_STATUS)) {

			// Driver Applicant color vision Click

			// The Color Vision
			// Click The Normal Radio Button
			if (GROStepDefinition.JobPosition.equals(AppConstants.DRIVER_APPLICANT)) {
				if (ConstantProperties.COLOR.equals(colorVisionNormal)) {
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheColorVisionNormalRadioButton();
					// Click The Color Plate
					CommonUtility.sleepControl(1000);
					NurseModule.getInstance().clickTheColorPlateBox();
					CommonUtility.sleepControl(1000);
					GRODashBoard.getInstance().clickFirstDropDownOption();
					LOGGER.info("Color Vision  : " + ConstantProperties.COLOR);
					// Poor
				} else if (ConstantProperties.COLOR.equals(colorVisionAbNormal)) {
					CommonUtility.sleepControl(1000);
					GpModule.getInstance().clickTheColorVisionPoorRadioButtonInGpModule();
					// Click The Color Plate
					CommonUtility.sleepControl(1000);
					NurseModule.getInstance().clickTheColorPlateBox();
					CommonUtility.sleepControl(1000);
					GRODashBoard.getInstance().clickFirstDropDownOption();
					LOGGER.info("Color Vision  : " + ConstantProperties.COLOR);

				}
			}

//			// Bp
//			if (ConstantProperties.SYSTOLIC_PRESSURE.equals(AppConstants.NORMAL_SYSTOLIC_PRESSURE)
//					&& ConstantProperties.DIASTOLIC_PRESSURE.equals(AppConstants.NORMAL_DIASTOLIC_PRESSURE)) {
//				CommonUtility.sleepControl(2000);
//				GpModule.getInstance().enterTheSystolicPressureValue(ConstantProperties.SYSTOLIC_PRESSURE);
//				LOGGER.info(
//						"Stemz Gp Assign The AbNormal Blood Pressure Value" + ": " + ConstantProperties.SYSTOLIC_PRESSURE);
//				CommonUtility.sleepControl(1000);
//				GpModule.getInstance().enterTheDiastolicPressureValue(ConstantProperties.DIASTOLIC_PRESSURE);
//				LOGGER.info(
//						" Stemz Gp Assign The Diastolic Pressure Value" + ": " + ConstantProperties.DIASTOLIC_PRESSURE);
//			} else {
//				boolean bmiRefStatus = NurseModuleStepDefinition.bmiReferralStatus;
//				referralCountAutoIncreament += 2;
//				if (bmiRefStatus == true) {
//					stemzBpReferralCount = 1;
//
//				} else {
//					stemzBpReferralCount = 2;
//				}
//				referralStatus = true;
//				bpReferralStatus = true;
//				GpModule.getInstance().enterTheSystolicPressureValue(ConstantProperties.SYSTOLIC_PRESSURE);
//				LOGGER.info(
//						"Stemz Gp Assign The AbNormal Blood Pressure Value" + ": " + ConstantProperties.SYSTOLIC_PRESSURE);
//				CommonUtility.sleepControl(500);
//				GpModule.getInstance().enterTheDiastolicPressureValue(ConstantProperties.DIASTOLIC_PRESSURE);
//				LOGGER.info("Stemz Gp Assign The AbNormal Systolic Pressure Value" + ": "
//						+ ConstantProperties.DIASTOLIC_PRESSURE);
//
//			}
// 
			// Check The Condition
			// Preset Option "Normal" else "Abnormal"
			String PresetOptionIsNormal = "Normal";
			if (PresetOptionIsNormal.equals(AppConstants.PRESENT_OPTION)) {
				LOGGER.info("Consulation : ");
				CommonUtility.sleepControl(1000);
				CommonUtility.scrollDown400();
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(2000);
				} else {
					CommonUtility.sleepControl(1000);
				}
				GpModule.getInstance().clickTheSelectPreset();
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(500);
				}
				GpModule.getInstance().chooseTheNormalOption();
				LOGGER.info("Preset " + ": " + AppConstants.PRESENT_OPTION);

				// Incase Cardiology Problem
				// Enter The Cardiology Problem

				if (AppConstants.CARDILOGY_PROBLEM.equals(ConstantProperties.CARDIOLOGY)) {
					referralCertificateStatus = true;
					ND_Status = true;
					referralCountAutoIncreament += 1;
					cardiologyReferralStatus = true;
					cardilogyReferralCount = 1;
					LOGGER.info("Cardiology Problem");
					// Incase Cardiology Problem
					// Enter The Cardiology Problem
					referralStatus = true;
					ExternalSpeciality cardiologyReferral = new ExternalSpeciality();
					cardiologyReferral.cardilogyReferralCreate();
					gpSpecility = true;
				}

				// Incase Deformity Problem
				// Enter The Deformity Problem

				if (AppConstants.DEFORMITY_PROBLEM.equals(ConstantProperties.DEFORMITY)) {
					referralCertificateStatus = true;
					ND_Status = true;
					deformityReferralStatus = true;
					referralCountAutoIncreament += 1;
					deformatoryReferralCount = 1;
					referralStatus = true;
					LOGGER.info("Deformity Problem");
					gpSpecility = true;
					deformityReferralCreate.deformityReferralCreate();

				}

				if (AppConstants.RESPIRATORY_ISSUE.equals(ConstantProperties.RESPIRATORY)) {
					ND_Status = true;
					referralCertificateStatus = true;
					respitoryRefCount = 1;
					respitoryRefStatus = true;
					referralStatus = true;
					CommonUtility.scrollDown50();
					deformityReferralCreate.respiratorySystem();
					gpSpecility = true;
				}

				if (AppConstants.SKIN_ISSUE.equals(ConstantProperties.SKIN)) {
					ND_Status = true;
					referralCertificateStatus = true;
					skinRefCount = 1;
					skinRefStatus = true;
					referralStatus = true;
					deformityReferralCreate.skin();
					gpSpecility = true;
				}

				if (AppConstants.EAR_ISSUE.equals(ConstantProperties.EAR)) {
					ND_Status = true;
					earRefCount = 1;
					referralCertificateStatus = true;
					earRefStatus = true;
					referralStatus = true;
					deformityReferralCreate.ear();
					gpSpecility = true;
				}

				if (AppConstants.PSYCHIATRY_ISSUE.equals(ConstantProperties.PSYCHIATRY)) {
					ND_Status = true;
					referralCertificateStatus = true;
					PsychiatryRefCount = 1;
					PsychiatryRefStatus = true;
					referralStatus = true;
					deformityReferralCreate.pshychiatry();
					gpSpecility = true;
				}

				CommonUtility.sleepControl(1200);
				CommonUtility.scrollDown400();
				LOGGER.info("Medical History" + ": " + ConstantProperties.MEDICAL_HISTORY);
				if (AppConstants.PREVIOUS_ILLNESS_ISSUE.equals(ConstantProperties.PREVIOUS_ILLNESS)) {
					PreviousIllnessRefCount = 1;
					PreviousIllnessStatus = true;
					referralStatus = true;
					if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
						CommonUtility.sleepControl(1500);
					} else {
						CommonUtility.sleepControl(1000);
					}
					GpModule.getInstance().clickThePerviousIllnessYesOption();
					if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
						CommonUtility.sleepControl(1000);
					} else {
						CommonUtility.sleepControl(500);
					}
					GpModule.getInstance().enterThePerviousIllnessDetails(AppConstants.COMMON_COMMENTS);
					LOGGER.info("Successfully Pervious Illness Referral Created");
				} else {
					if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
						CommonUtility.sleepControl(1000);
					} else {
						CommonUtility.sleepControl(500);
					}
					GpModule.getInstance().clickThePerviousIllnessNoOption();
					LOGGER.info("Pervious Illness" + ": " + "No");

				}
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1000);
				} else {
					CommonUtility.sleepControl(500);
				}
				GpModule.getInstance().clickTheYourMealsInLast10LoursNoOPtion();
				LOGGER.info("Your Meals In Last 10 Hours" + ": " + "No");

				if (AppConstants.NEUROLOGICAL_DISORDER_ISSUE.equals(ConstantProperties.NEUROLOGICAL_DISORDER)) {
					referralCertificateStatus = true;
					NeurologicalRefCount = 1;
					NeurologicalRefStatus = true;
					referralStatus = true;
					CommonUtility.sleepControl(500);
					GpModule.getInstance().clickThePsychiatricOrNeurologicalDisorderYESOption();
					CommonUtility.sleepControl(200);
					GpModule.getInstance().enterThePsychiatrciOrNeurological(AppConstants.COMMON_COMMENTS);
					LOGGER.info("Successfully Psychiatric Or Neurological DisorderReferral Created");

				} else {
					CommonUtility.sleepControl(400);
					GpModule.getInstance().clickThePsychiatricOrNeurologicalDisorderNoOption();
					LOGGER.info("Psychiatric Or Neurological Disorder" + ": " + "No");
				}

				CommonUtility.sleepControl(200);
				GpModule.getInstance().enterTheComment(AppConstants.COMMON_COMMENTS);
				LOGGER.info("Comments" + ": " + AppConstants.COMMON_COMMENTS);
				CommonUtility.sleepControl(100);
				CommonUtility.scrollDown400();

				if (ApplicationStatusCheckProperties.APPLICATION_SCENARIO.equals(ApplicationScenarioConstants.SC_11)) {

					ApplicationStatusCheck applicationStatusCheck = new ApplicationStatusCheck();
					applicationStatusCheck.applicationStatusCheck();
				}

//					if (AppConstants.CARDILOGY_PROBLEM.equals(ConstantProperties.CARDIOLOGY)) {
//						CommonUtility.sleepControl(2000);
//						GpModule.getInstance().clickTheReferralIcon();
//						// Close The Referral Letter
//						CommonDefinition commonDefinition = new CommonDefinition();
//						commonDefinition.windowsPageHanding();
//					}
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(1500);
				} else {
					CommonUtility.sleepControl(700);
				}
				GpModule.getInstance().clickTheSaveButton();
				if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
					CommonUtility.sleepControl(2800);
				} else {
					CommonUtility.sleepControl(2000);
				}
				GpModule.getInstance().clickTheYesButton();
				// Check The referral Row Enable or Disable
				LOGGER.info("Consultation details updated successfully");
//				CommonUtility.sleepControl(1000);
//				getNoReferralCreateText = GpModule.getInstance().chechTheReferralCreateorNot();

				// Pervious Referral Letter Cardiology Text
//					String getTheCardiologyPerviousReferralText = (GpModule.getInstance()
//							.getTheCardiologyPerviousReferralText());
//
//					String getTheReferralsCreatedText = (GpModule.getInstance().getTheReferralsCreatedText());
//					String compareBothLetterCondition = getTheCardiologyPerviousReferralText = getTheReferralsCreatedText;
//					LOGGER.info("Pervious Referral Letter & ReferralsCreate" + ": "
//							+ getTheCardiologyPerviousReferralText + " = " + getTheReferralsCreatedText);

			}

		}
	}

	@When("Gp Module Feedback")
	public void gp_module_feedback() throws Throwable {
		// Click The FeedBack
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(4200);
		} else {
			CommonUtility.sleepControl(4000);
		}
		GpModule.getInstance().clickTheGoToFeedbackButton();
		if (ConstantProperties.TIME_CONFIGURATION.equals(AppConstants.YES)) {
			CommonUtility.sleepControl(1500);
		} else {
			CommonUtility.sleepControl(1000);
		}
		PatientProfiles.getInstance().clickTheCollectFeedbackButton();

		LOGGER.info("Stemz GP Feedback collected successfully");

	}

	@When("Gp Module Logout")
	public void gp_module_logout() throws Throwable {
		// LogOut
		CommonUtility.sleepControl(9000);
		CommonDefinition commonDefinition = new CommonDefinition();
		commonDefinition.logOut();

		end = System.currentTimeMillis();
		LOGGER.info("Stemz Gp Run Time : ");
		millisecondsStemzGP = (end - start);
		gpRunTime(millisecondsStemzGP);

		LOGGER.info(GROStepDefinition.millisecondsForGro);
		long gro = GROStepDefinition.millisecondsForGro;

		LOGGER.info(NurseModuleStepDefinition.millisecondsForNurse);

		long nurse = NurseModuleStepDefinition.millisecondsForNurse;
		long groAndNurseTotalTime = (gro + nurse);
		System.err.println("GRO And Nurse Time : " + groAndNurseTotalTime);

//		FlowController controller = new FlowController();
//		controller.flowControllerBaseOnTheModule();
		if (correctToken.equals(AppConstants.TOKEN_FLOW_NNDX)) {
			switch (GROStepDefinition.gender) {
			case AppConstants.FEMALE_GENDER:
				if (ConstantProperties.PREGNANT_STATUS.equals(AppConstants.PREGNANT_NO)) {

					XrayModule module = new XrayModule();
					module.xrayModuleFlows();

				} else {
					LOGGER.info("Female Applicant & Pregnant :" + ConstantProperties.PREGNANT_STATUS);
				}
				break;

			case AppConstants.MALE_GENDER:
				XrayModule module = new XrayModule();
				module.xrayModuleFlows();

			default:
				System.err.println("Token And Gender Issue");

			}
		}
		// -----------------------------------------

//		LabJuniorStepDefinition definition3 = new LabJuniorStepDefinition();
//		long labJuniorTime = definition3.millisecondsJunior;
//
//		LabSeniorStepDefinition definition4 = new LabSeniorStepDefinition();
//		long labSeniorTime = definition4.millisecondsSenior;
//		long labJuniorAndLabSenior = (labJuniorTime + labSeniorTime);
//		System.err.println("Lab Junior & Lab Senior Time : " + labJuniorAndLabSenior);
//		System.err.println("G & N & LJ & LS Time : " + (groAndNurseTotalTime + labJuniorAndLabSenior));

//	    LabSupervisorStepDefinition definition5 = new LabSupervisorStepDefinition();
//	    Long labSupervisorTime  = definition5.millisecondsSupervisor;
//	    
//	    GpModuleStepDefinition definition6 = new GpModuleStepDefinition();
//	    Long stemzGpTime = definition6.millisecondsStemzGP;
//	    
//	    Long totalModuleRunTime  = groTime+nurseTime+labJuniorTime+labSeniorTime+labSupervisorTime+stemzGpTime;
//	    
//	    System.err.println(totalModuleRunTime);
//	    
//	    CommonDefinition commonDefinition10 = new CommonDefinition();
//		commonDefinition10.getTotalTime(millisecondsStemzGP);

//		boolean nurseReferralStatus = NurseModuleStepDefinition.referralStatus;
//		boolean gpReferralStatus = GpModuleStepDefinition.referralStatus;
//		if (nurseReferralStatus == false && gpReferralStatus == false) {
//			System.err.println("No Referral Flow");
//		} else {
//			System.err.println("GRO Referral Flow Start");
//			commonDefinition.groReferral();
//
//			AutoReferralHandler autoReferralHandler = new AutoReferralHandler();
//			autoReferralHandler.referralHandlerAutomatic();
//
//			// Stemz Gp Certificate Page
//			StemzGPCertificatePage certificatePage = new StemzGPCertificatePage();
//			certificatePage.referralCertificatePage();
//		}

	}

	public void recheckVisionRecheckAndBpRevisitForGp() throws Throwable {
		LOGGER.info("Nurse Outcome : ");
		if (NurseModuleStepDefinition.colorVisionReferralStatus == true) {
			CommonUtility.sleepControl(2500);
			GpModule.getInstance().clickColorVisionRecheck();
			LOGGER.info("Color Vision Recheck : ");
			// Click Normal
			CommonUtility.sleepControl(2000);
			GpModule.getInstance().clickRecheckColorvisionNormal();
			CommonUtility.sleepControl(1000);
			GpModule.getInstance().clickColorPlates();
			CommonUtility.sleepControl(1000);
			GRODashBoard.getInstance().clickFirstDropDownOption();
			CommonUtility.sleepControl(1000);
			NurseModule.getInstance().clickRecheckSavaButton();
			LOGGER.info("Color Vision Recheck : Normal");
			LOGGER.info("Color Plate : 13/14");

		}

		// Bp Recheck

		if (NurseModuleStepDefinition.bpReferralStatus == true) {
			LOGGER.info("Bp Recheck");
			CommonUtility.sleepControl(1000);
			GpModule.getInstance().clickBPRecheck();
			CommonUtility.sleepControl(1000);
			GpModule.getInstance().enterTheRecheckSysyolicValue("120");
			CommonUtility.sleepControl(200);
			GpModule.getInstance().enterTheRecheckDiastolic("80");
			CommonUtility.sleepControl(1000);

			NurseModule.getInstance().clickSaveButton2();
			LOGGER.info("Bp Recheck Value : ");
			LOGGER.info("Systolic Value : 120");
			LOGGER.info("Systolic Value : 80");

		}

	}

	public void gpRunTime(long milliseconds) {
		long totalTime = (milliseconds / 1000) / 60;

		long totalTimeforSec = (milliseconds / 1000) % 60;

		LOGGER.info("Total Time Mints = " + "Mints : " + totalTime + "  " + totalTimeforSec + " seconds");

		gpTotalSeconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
		LOGGER.info(" Total Time in  Seconds = " + gpTotalSeconds + " " + "seconds");

	}

}
