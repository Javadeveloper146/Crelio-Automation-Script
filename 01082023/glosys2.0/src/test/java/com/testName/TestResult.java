package com.testName;

import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.record.PageBreakRecord.Break;

import com.commonUtility.CommonUtility;
import com.constantProperties.CredentialsProperties;
import com.modulesPOM.RegistrationPOM;
import com.stepDefinition.GROStepDefinition;
import com.testName.pom.TestResultPOM;

public class TestResult {
	private static final Logger LOGGER = LogManager.getLogger(TestResult.class);

	public void testResultValue(String testName) throws Throwable {
		CommonUtility.sleepControl(2000);
		switch (testName) {

		case "Hemogram (CBC with ESR)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue5(CredentialsProperties.TEST_VALUE_5);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_5);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue6(CredentialsProperties.TEST_VALUE_6);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_6);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue7(CredentialsProperties.TEST_VALUE_7);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_7);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue8(CredentialsProperties.TEST_VALUE_8);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_8);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue9(CredentialsProperties.TEST_VALUE_9);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_9);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue10(CredentialsProperties.TEST_VALUE_10);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_10);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue11(CredentialsProperties.TEST_VALUE_11);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_11);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue12(CredentialsProperties.TEST_VALUE_12);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_12);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue13(CredentialsProperties.TEST_VALUE_13);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_13);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue14(CredentialsProperties.TEST_VALUE_14);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_14);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue15(CredentialsProperties.TEST_VALUE_15);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_15);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue16(CredentialsProperties.TEST_VALUE_16);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_16);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue17(CredentialsProperties.TEST_VALUE_17);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_17);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue18(CredentialsProperties.TEST_VALUE_18);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_18);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue19(CredentialsProperties.TEST_VALUE_19);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_19);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue20(CredentialsProperties.TEST_VALUE_20);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_20);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue21(CredentialsProperties.TEST_VALUE_21);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_21);
			break;
		case "Albumin 24 hr Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Neutrophils Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Neutrophils Count Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Eosinophil":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Eosinophil  Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Monocyte Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Lymphocyte":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;

		case "Absolute Basophils Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Thyroid Screening Panel":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Thyroid Panel II":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;

		case "Thyroid Panel":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;

		case "Drugs of Abuse screen - 10 Drug Panel":

			LOGGER.info(testName + " Test Value : ");
			break;
		case "INSULIN- PP":
			LOGGER.info(testName + " Test Value : ");
			break;

		case "Absolute Neutrophils Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;

		case "Creatinine in Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			

			break;
		case "Urea in Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;

		case "Albumin CSF":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Basophils Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);

			LOGGER.info(testName + " Test Value : ");

			break;
		case "Absolute Eosinophils Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Mean Cell Haemoglobin Concentration (MCHC)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Mean Cell Haemoglobin (MCH)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Mean Cell Volume (MCV)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Absolute Monocytes Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Mean platelet Volume (MPV)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Red Cell distribution width (RDW -CV )":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Calcium Ionized":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Non- HDL Cholesterol":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "HDL/LDL Cholesterol Ratio":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "AST/ALT Ratio":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);

			break;

		case "In-Direct Bilirubin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);

			break;
		case "Albumin / Globulin Ration (A:G Ratio)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);

			break;

		case "Amphetamine(AMP)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Globulin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "BUN/Creatinine Ratio":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "VLDL - Very Low Density Lipoprotein":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Torch IgG":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Glucose in 24 hr Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Opiates(OPI)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "% Saturation":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Torch IgM":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Glucose in spot urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Benzodiazepines(BZ0)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "FILARIAL ANTIGEN":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Chickungunya IgG and IgM":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;
		case "Cortisol":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");

			break;

		case "Urine Amylase":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Methaqualone(MQL)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Toxo IgM":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Troponin-I":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "HOMA IR":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Phosphate":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "HCV Ag":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "TIBC":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "URINE Sodium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Magnesium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Methadone (MTD)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Cocaine (COC)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "AMF":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Cannabinoids (THC)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Barbiturates (BAR)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Phencyclidine (PCP)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Chagas":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Ova and cyst":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "PH":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Cortisol":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine C peptide":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "LDL Calculated":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Cholesterol Total/HDL Ratio":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Chloride":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Potassium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "BICARBONATE (CO2)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Microalbumin / Creatinine Ratio - spot":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "LDL/HDL Ratio":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hrs Urine Calcium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Microalbumin - Spot Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "RF":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hrs Urine Uric Acid":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "24 hr Urine Microalbumin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "STAT CK-MB":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Fructosamine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Albumin Spot Urine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Haematocrit (HCT)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Platelets Counts":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "RED BLOOD CELL COUNT (RBC's)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "White Blood Cells (WBC)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Haemoglobin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "GROWTH":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "NO GROWTH":

			break;
		case "Fecalysis ( Stool R/M)":

			break;
		case "Semen Analysis":

			break;
		case "Urine Analysis":

			break;
		case "Blood Group (ABO&RH) by (Reverse& Forward)":

			break;
		case "CERULOPLASMIN (CER)":

			break;
		case "HBSAG - Qualitative (Screening Test)":

			break;
		case "Serum UIBC (unsaturated iron-binding capacity )":

			break;
		case "HIV - Qualitative (Screening Test)":

			break;
		case "Serum IgG":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Serum IRON":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Trop I":
			
			break;
		case "G6PD (glucose-6-phosphate dehydrogenase)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "D-DIMER Quantitative":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "BNP - Natriuretic peptide tests":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Alkaline phosphatase (ALP)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "VAGINAL DISCHARGE CULTURE & SENSITIVITY(Manual Test Only)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Glomerular Filtration Rate(GFR)":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "AT-III - Antithrombine - III":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Toxo IgG Avidity":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Trop T":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Total Bilirubin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Dengue Serology IgG&IgM":
		LOGGER.info(testName + " Test Value : ");
			break;
		case "Toxo IgG - Toxoplasma gondii Immunoglobulin G":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Serum HDL - High Density Lipoprotein":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "PT - Prothrombine Time":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Aspartate Aminotransferase(AST)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Rubella IgG":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "LFT (Liver Function Test)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue5(CredentialsProperties.TEST_VALUE_5);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_5);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue6(CredentialsProperties.TEST_VALUE_6);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_6);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue7(CredentialsProperties.TEST_VALUE_7);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_7);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue8(CredentialsProperties.TEST_VALUE_8);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_8);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue9(CredentialsProperties.TEST_VALUE_9);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_9);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue10(CredentialsProperties.TEST_VALUE_10);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_10);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue11(CredentialsProperties.TEST_VALUE_11);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_11);
			
			break;
		case "Serum IgA":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Syphilis TP":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Rheumatoid Arthritis (Ra) Factor Qualitative":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Malaria Antigen Detection":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Coagulation Profile (PT/INR & APTT)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			
			break;
		case "Chickungunya":
			
			break;
		case "Body Fluids CULTURE & SENSITIVITY":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Gonorrhoeae/Chlamydia Antigen (Urine)":
			
			break;
		case "Bleeding Time":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Serum Triglyceride":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "E. Histolytica":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Glucose Fasting":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "CMV IgG Avidity - Cytomegalovirus IgG Avidity":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "Quantia ASO - Antistreptolysin O":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : ");
			break;
		case "NEISSERIA/CHLAMYDIA TEST":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "APO B":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "HAVAb-IgG - Hepatitis A Virus Antibody IgG":
			LOGGER.info(testName + " Test Value : ");
			break;
		case "HAPTOGLOBIN":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Urine Nitrite":
			LOGGER.info(testName + " Test Value : Positive");
			break;
		case "Gastric Bx - H.Pylori":
			LOGGER.info(testName + " Test Value : Negative");

			break;
		case "DHEA's- Dehydroepiandrosterone Sulfate":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "HBsAg Qualitative II (Confirmatory )":
			LOGGER.info(testName + " Test Value ");
			break;
		case "Serum Cholesterol":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Blood Group (ABO&RH) by Slide Method":

			break;
		case "ANTl-CCP":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Typhi dot IgG & IgM":

			break;
		case "CRP - C reactive Protein":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "CMV IgM- Cytomegalovirus- IgM":

			break;
		case "Glucose ( PP- Postprandial)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Complete Blood Count - CBC":

			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue5(CredentialsProperties.TEST_VALUE_5);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_5);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue6(CredentialsProperties.TEST_VALUE_6);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_6);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue7(CredentialsProperties.TEST_VALUE_7);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_7);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue8(CredentialsProperties.TEST_VALUE_8);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_8);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue9(CredentialsProperties.TEST_VALUE_9);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_9);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue10(CredentialsProperties.TEST_VALUE_10);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_10);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue11(CredentialsProperties.TEST_VALUE_11);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_11);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue12(CredentialsProperties.TEST_VALUE_12);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_12);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue13(CredentialsProperties.TEST_VALUE_13);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_13);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue14(CredentialsProperties.TEST_VALUE_14);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_14);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue15(CredentialsProperties.TEST_VALUE_15);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_15);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue16(CredentialsProperties.TEST_VALUE_16);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_16);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue17(CredentialsProperties.TEST_VALUE_17);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_17);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue18(CredentialsProperties.TEST_VALUE_18);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_18);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue19(CredentialsProperties.TEST_VALUE_19);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_19);
			break;
		case "APO A1":

			break;
		case "INDIA INK":

			break;
		case "Anti-HCV - Hepatitis C antibody":

			break;
		case "Hemo-spot/ Occult blood":

			break;
		case "Fungal Stain / KOH":

			break;
		case "CA 19.9- Cancer Antigen 19.9":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info(testName + " Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Globulin (Total Protein - Albumin)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);

			break;
		case "Electrolytes (Na, K, Cl)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);

			break;
		case "D-DIMER":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Smear for Malaria Parasite":

			break;
		case "WET SMEAR":

			break;
		case "Widal - Slide":

			break;
		case "CMV IgG - Cytomegalovirus- IgG":

			break;
		case "Anti-HBc II-Total Hepatitis B core antibody":

			break;
		case "Total Protein (TP)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "LACTATE (LACT)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "CEA- Carcinoembryonic antigen":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Lactate Dehydrogenase(LDH)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "HBsAg - Hepatitis B Surface Antigen":

			break;
		case "Serum IgM":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Progesterone":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Rubella IgM":

			break;
		case "H. pylori Stool Antigen":

			break;
		case "FUNGAL CULTURE":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Anti-HBs - Hepatitis B surface antibody":

			break;
		case "BUN (Blood Urea Nitrogen)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Glucose (Fasting & PP)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "CA 125- Cancer Antigen 125":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Wound CULTURE & SENSITIVITY (MANUAL )":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();

			break;
		case "Gamma-glutamyltransferase (GGT)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "CA 15.3- Cancer Antigen 15.3":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "AFP - Alpha Feto Protein":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "24 hr Urine Protein":

			break;
		case "HIV Ag/Ab Combo":

			break;
		case "Bacteriological WATER ANALYSIS":

			break;
		case "Urine 24 hr Phosphorus":

			break;
		case "APTT - Activated Partial Thromboplastin Time":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Urine Pregnancy Test (UPT) - Qualitative":

			break;
		case "MicroAlbumin- Random":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Reticulocyte Count":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "H. pylori (Quali)":

			break;
		case "URETHRAL DISCHARGE CULTURE & SENSITIVITY (Manual)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Anti-Streptolysin O (ASO)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Anti-Hbe- Anti-Hepatitis B e-antigen":

			break;
		case "Environmental Analysis":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Urine Uric Acid":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "GRAM STAIN":

			break;
		case "Testosterone Total":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "HBeAg - Hepatitis B e antigen":

			break;
		case "Alanine aminotransferase (ALT)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "STOOL PH":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum Lipase":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "TSH- Thyroid Stimulating Hormone":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Myoglobin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "Group B Streptococcus Ag":

			break;
		case "Anti-HBc IgM - IgM antibody against hepatitis B core antigen":

			break;
		case "CULTURE & SENSITIVITY":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();

			break;
		case "KFT/ RFT (Kidney / Renal Function Test)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue5(CredentialsProperties.TEST_VALUE_5);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_5);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue6(CredentialsProperties.TEST_VALUE_6);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_6);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue7(CredentialsProperties.TEST_VALUE_7);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_7);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue8(CredentialsProperties.TEST_VALUE_8);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_8);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue9(CredentialsProperties.TEST_VALUE_9);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_9);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue10(CredentialsProperties.TEST_VALUE_10);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_10);
			break;
		case "Ferritin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "THROAT SWAB CULTURE & SENSITIVITY (Manual)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Stool CULTURE & SENSITIVITY (MANUAL)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "HAVAb-IgM- Hepatitis A Virus Antibody IgM":

			break;
		case "Testosterone Free":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "Free T4 - Thyroxine, FREE":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "T4- Thyroxine, Total":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Spot Urine- Protein":

			break;
		case "Folate":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Prealbumin(PALB)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "NASAL SWAB CULTURE & SENSITIVITY (MANUAL TEST ONLY)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "CRP - Qualitative":

			break;
		case "Serum LDL - Low Density Lipoprotein":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Direct Bilirubin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "PRL - Prolactin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

		case "Aerobic BLOOD CULTURE & Sensitivity (Manual)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();

			break;
		case "T3- Triiodothyronine, Total":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "PSA Total - Prostate-Specific Antigen":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "25-OH Vitamin D":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Free T3 - Triiodothyronine free":

			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum Total Bile Acids(TBA)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Total Calcium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum Creatine Kinase":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum Amylase":
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Albumin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "ABSCESS FLUID CULTURE & SENSITIVITY":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();

			break;
		case "ASO - Qualitative":

			break;
		case "ACID FAST BACILLI (AFB) STAIN":
			break;
		case "C-Peptide":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "LH - Luteinizing hormone":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;
		case "Intact PTH":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Free Thyroid Function Test ( FT3,FT4,TSH)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);

			break;
		case "Aerobic CULTURE & SENSITIVITY- DISCHARGE":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "URIC ACID":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum TRANSFERRIN":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum In Organic Phosphorous":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Anti-TPO - Thyroid Peroxidase Antibody":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "IgA - Immunoglobulin-A":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Lipid Profile":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue5(CredentialsProperties.TEST_VALUE_5);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_5);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue6(CredentialsProperties.TEST_VALUE_6);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_6);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue7(CredentialsProperties.TEST_VALUE_7);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_7);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue8(CredentialsProperties.TEST_VALUE_8);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_8);

			break;
		case "Drugs of Abuse (DOA) (methamphetamine/tetrahydrocannabinol)":
			break;

		case "Cortisol PM (Evening)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		
		case "Urine CULTURE & SENSITIVITY - URINE (Manual)":
			RegistrationPOM.getInstance().clickSelect();
			CommonUtility.sleepControl(500);
			CommonUtility.enterFunction();
			break;
		case "Glucose in CSF":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum Magnesium":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Anti-Tg - Antithyroglobulin antibody":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "C4 - Complement 4":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "CREATININE":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Clostridium Defficile":

			break;
		case "Syphilis - Qualitative":
			break;
		case "Cortisol AM (Morning)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "CSF VDRL":
			break;
		case "IgM- Immunoglobulin-M":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Total IgE":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Serum CHLORIDE - Cl":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "GTT(Glucose Tolerence Test )":
			break;
		case "C3- Complement 3":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);

			break;
		case "UREA":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "HCV - Qualitative (Screening Test)":
			break;
		case "Dengue NS1":
			break;
		case "Total β-hCG":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);

			break;
		case "Vitamin B12":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			break;

		case "RA - Qualitative":
			break;
			
		case "HBAIC (Glycated Hemoglobin)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Cryptococcal Antigen":
			
			break;
		case "STAT High sensitive Troponin-I":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Serum POTASSIUM - K+":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Hs- Crp":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "INSULIN- Fasting":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "PCT - Procalcitonin":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Protein in Amnoitic Fluid":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "GCT(Glucose Challenging Test)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Protein in CSF":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Concentration Technique":
		
			break;
		case "Peripherial Smear (P/S)":
			
			break;
		case "Serum SODIUM- Na":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Total Thyroid Function Test ( T3, T4,TSH)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			
			break;
		case "Rheumatoid Arthritis (Ra) Factor Quantitative":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Estradiol":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Glucose Random":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "CHLAMYDIA ANTIGEN (SWAB)":
			
			break;
		case "Erythrocyte Sedimentation Rate (ESR)":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "IgG - Immunoglobulin-G":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "FSH - Follicle-Stimulating Hormone":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Homocysteine":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "Clotting Time":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			
			break;
		case "SHBG- Sex Hormone Binding Globulin":
				TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
				LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
				
			break;
		case "Iron Study":
			TestResultPOM.getInstance().enterValue1(CredentialsProperties.TEST_VALUE_1);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_1);
			CommonUtility.sleepControl(500);
			TestResultPOM.getInstance().enterValue2(CredentialsProperties.TEST_VALUE_2);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_2);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue3(CredentialsProperties.TEST_VALUE_3);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_3);
			CommonUtility.sleepControl(200);
			TestResultPOM.getInstance().enterValue4(CredentialsProperties.TEST_VALUE_4);
			LOGGER.info("Test Value : " + CredentialsProperties.TEST_VALUE_4);
			
			break;

		default:
			break;
		}

	}

}
