package com.commonUtility;

import java.util.Properties;

import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;

public class Credentials {
	public void credentialsProperties() {
		Properties credentialsProperties = new Properties();

		try {

			credentialsProperties.load(getClass().getResourceAsStream("/crendentials.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		CredentialsProperties.TEST_VALUE_1 = credentialsProperties.getProperty("TestValue_1");

		CredentialsProperties.TEST_VALUE_2 = credentialsProperties.getProperty("TestValue_2");

		CredentialsProperties.TEST_VALUE_3 = credentialsProperties.getProperty("TestValue_3");

		CredentialsProperties.TEST_VALUE_4 = credentialsProperties.getProperty("TestValue_4");

		CredentialsProperties.TEST_VALUE_5 = credentialsProperties.getProperty("TestValue_5");

		CredentialsProperties.TEST_VALUE_6 = credentialsProperties.getProperty("TestValue_6");

		CredentialsProperties.TEST_VALUE_7 = credentialsProperties.getProperty("TestValue_7");

		CredentialsProperties.TEST_VALUE_8 = credentialsProperties.getProperty("TestValue_8");

		CredentialsProperties.TEST_VALUE_9 = credentialsProperties.getProperty("TestValue_9");

		CredentialsProperties.TEST_VALUE_10 = credentialsProperties.getProperty("TestValue_10");

		CredentialsProperties.TEST_VALUE_11 = credentialsProperties.getProperty("TestValue_11");

		CredentialsProperties.TEST_VALUE_12 = credentialsProperties.getProperty("TestValue_12");

		CredentialsProperties.TEST_VALUE_13 = credentialsProperties.getProperty("TestValue_13");

		CredentialsProperties.TEST_VALUE_14 = credentialsProperties.getProperty("TestValue_14");

		CredentialsProperties.TEST_VALUE_15 = credentialsProperties.getProperty("TestValue_15");

		CredentialsProperties.TEST_VALUE_16 = credentialsProperties.getProperty("TestValue_16");

		CredentialsProperties.TEST_VALUE_17 = credentialsProperties.getProperty("TestValue_17");

		CredentialsProperties.TEST_VALUE_18 = credentialsProperties.getProperty("TestValue_18");

		CredentialsProperties.TEST_VALUE_19 = credentialsProperties.getProperty("TestValue_19");

		CredentialsProperties.TEST_VALUE_20 = credentialsProperties.getProperty("TestValue_20");

		CredentialsProperties.TEST_VALUE_21 = credentialsProperties.getProperty("TestValue_21");

		CredentialsProperties.TEST_VALUE_22 = credentialsProperties.getProperty("TestValue_22");

		CredentialsProperties.TEST_VALUE_23 = credentialsProperties.getProperty("TestValue_23");

		CredentialsProperties.TEST_VALUE_24 = credentialsProperties.getProperty("TestValue_24");




		CredentialsProperties.CH_GRO_UNAME = credentialsProperties.getProperty("Ch_Gro");
		CredentialsProperties.CH_GRO_PASSWORD = credentialsProperties.getProperty("Ch_Gro_Password");
		CredentialsProperties.CH_NURSE_UNAME = credentialsProperties.getProperty("Ch_Nurse");
		CredentialsProperties.CH_NURSE_PASSWORD = credentialsProperties.getProperty("Ch_Nurse_Password");
		CredentialsProperties.CH_GP_UNAME = credentialsProperties.getProperty("Ch_Gp");
		CredentialsProperties.CH_GP_PASSWORD = credentialsProperties.getProperty("Ch_Gp_Password");
		CredentialsProperties.CH_XRAY_UNAME = credentialsProperties.getProperty("Ch_Xray");
		CredentialsProperties.CH_XRAY_PASSWORD = credentialsProperties.getProperty("Ch_Xray_Password");
		CredentialsProperties.CH_JUNIOR_UNAME = credentialsProperties.getProperty("Ch_Lab_Junior");
		CredentialsProperties.CH_JUNIOR_PASSWORD = credentialsProperties.getProperty("Ch_Lab_Junior_Password");
		CredentialsProperties.CH_SENIOR_UNAME = credentialsProperties.getProperty("Ch_Lab_Senior");
		CredentialsProperties.CH_SENIOR_PASSWORD = credentialsProperties.getProperty("Ch_Senior_Password");

		// Delhi
		CredentialsProperties.DEL_GRO_UNAME = credentialsProperties.getProperty("Del_Gro_Uname");
		CredentialsProperties.DEL_GRO_PASSWORD = credentialsProperties.getProperty("Del_Gro_Password");
		CredentialsProperties.DEL_NURSE_UNAME = credentialsProperties.getProperty("Del_Nurse_Uname");
		CredentialsProperties.DEL_NURSE_PASSWORD = credentialsProperties.getProperty("Del_Nurse_Password");
		CredentialsProperties.DEL_GP_UNAME = credentialsProperties.getProperty("Del_Gp_Uname");
		CredentialsProperties.DEL_GP_PASSWORD = credentialsProperties.getProperty("Del_Gp_Password");
		CredentialsProperties.DEL_XRAY_UNAME = credentialsProperties.getProperty("Del_Xray_Uname");
		CredentialsProperties.DEL_XRAY_PASSWORD = credentialsProperties.getProperty("Del_Xray_Password");
		CredentialsProperties.DEL_JUNIOR_UNAME = credentialsProperties.getProperty("Del_Lab_Junior_Uname");
		CredentialsProperties.DEL_JUNIOR_PASSWORD = credentialsProperties.getProperty("Del_Lab_Junior_Password");
		CredentialsProperties.DEL_SENIOR_UNAME = credentialsProperties.getProperty("Del_Lab_Senior_Uname");
		CredentialsProperties.DEL_SENIOR_PASSWORD = credentialsProperties.getProperty("Del_Senior_Password");

		// Kolkotta
		CredentialsProperties.KOL_GRO_UNAME = credentialsProperties.getProperty("Kol_Gro_Uname");
		CredentialsProperties.KOL_GRO_PASSWORD = credentialsProperties.getProperty("Kol_Gro_Password");
		CredentialsProperties.KOL_NURSE_UNAME = credentialsProperties.getProperty("Kol_Nurse_Uname");
		CredentialsProperties.KOL_NURSE_PASSWORD = credentialsProperties.getProperty("Kol_Nurse_Password");
		CredentialsProperties.KOL_GP_UNAME = credentialsProperties.getProperty("Kol_Gp_Uname");
		CredentialsProperties.KOL_GP_PASSWORD = credentialsProperties.getProperty("Kol_Gp_Password");
		CredentialsProperties.KOL_XRAY_UNAME = credentialsProperties.getProperty("Kol_Xray_Uname");
		CredentialsProperties.KOL_XRAY_PASSWORD = credentialsProperties.getProperty("Kol_Xray_Password");
		CredentialsProperties.KOL_JUNIOR_UNAME = credentialsProperties.getProperty("Kol_Lab_Junior_Uname");
		CredentialsProperties.KOL_JUNIOR_PASSWORD = credentialsProperties.getProperty("Kol_Lab_Junior_Password");
		CredentialsProperties.KOL_SENIOR_UNAME = credentialsProperties.getProperty("Kol_Lab_Senior_Uname");
		CredentialsProperties.KOL_SENIOR_PASSWORD = credentialsProperties.getProperty("Kol_Senior_Password");

		// Manila
		CredentialsProperties.MNL_GRO_UNAME = credentialsProperties.getProperty("MNL_Gro_Uname");
		CredentialsProperties.MNL_GRO_PASSWORD = credentialsProperties.getProperty("MNL_Gro_Password");
		CredentialsProperties.MNL_NURSE_UNAME = credentialsProperties.getProperty("MNL_Nurse_Uname");
		CredentialsProperties.MNL_NURSE_PASSWORD = credentialsProperties.getProperty("MNL_Nurse_Password");
		CredentialsProperties.MNL_GP_UNAME = credentialsProperties.getProperty("MNL_Gp_Uname");
		CredentialsProperties.MNL_GP_PASSWORD = credentialsProperties.getProperty("MNL_Gp_Password");
		CredentialsProperties.MNL_XRAY_UNAME = credentialsProperties.getProperty("MNL_Xray_Uname");
		CredentialsProperties.MNL_XRAY_PASSWORD = credentialsProperties.getProperty("MNL_Xray_Password");
		CredentialsProperties.MNL_JUNIOR_UNAME = credentialsProperties.getProperty("MNL_Lab_Junior_Uname");
		CredentialsProperties.MNL_JUNIOR_PASSWORD = credentialsProperties.getProperty("MNL_Lab_Junior_Password");
		CredentialsProperties.MNL_SENIOR_UNAME = credentialsProperties.getProperty("MNL_Lab_Senior_Uname");
		CredentialsProperties.MNL_SENIOR_PASSWORD = credentialsProperties.getProperty("MNL_Senior_Password");

		// Common
		CredentialsProperties.LAB_SUPERVISOR_UNAME = credentialsProperties.getProperty("LabSupervisor_Uname");
		CredentialsProperties.LAB_SUPERVISOR_PASSWORD = credentialsProperties.getProperty("LabSupervisor_Password");

		CredentialsProperties.KAR_GRO_UNAME = credentialsProperties.getProperty("Kar_Gro");
		CredentialsProperties.KAR_GRO_PASSWORD = credentialsProperties.getProperty("Kar_Gro_Password");
		CredentialsProperties.KAR_NURSE_UNAME = credentialsProperties.getProperty("Kar_Nurse");
		CredentialsProperties.KAR_NURSE_PASSWORD = credentialsProperties.getProperty("Kar_Nurse_Password");
		CredentialsProperties.KAR_GP_UNAME = credentialsProperties.getProperty("Kar_Gp");
		CredentialsProperties.KAR_GP_PASSWORD = credentialsProperties.getProperty("Kar_Gp_Password");
		CredentialsProperties.KAR_XRAY_UNAME = credentialsProperties.getProperty("Kar_Xray");
		CredentialsProperties.KAR_XRAY_PASSWORD = credentialsProperties.getProperty("Kar_Xray_Password");
		CredentialsProperties.KAR_JUNIOR_UNAME = credentialsProperties.getProperty("Kar_Lab_Junior");
		CredentialsProperties.KAR_JUNIOR_PASSWORD = credentialsProperties.getProperty("Kar_Lab_Junior_Password");
		CredentialsProperties.KAR_SENIOR_UNAME = credentialsProperties.getProperty("Kar_Lab_Senior");
		CredentialsProperties.KAR_SENIOR_PASSWORD = credentialsProperties.getProperty("Kar_Senior_Password");

		CredentialsProperties.COLOMBO_GRO_UNAME = credentialsProperties.getProperty("Col_Gro_Uname");
		CredentialsProperties.COLOMBO_GRO_PASSWORD = credentialsProperties.getProperty("Col_Gro_Password");
		CredentialsProperties.COLOMBO_NURSE_UNAME = credentialsProperties.getProperty("Col_Nurse_Uname");
		CredentialsProperties.COLOMBO_NURSE_PASSWORD = credentialsProperties.getProperty("Col_Nurse_Password");
		CredentialsProperties.COLOMBO_GP_UNAME = credentialsProperties.getProperty("Col_Gp_Uname");
		CredentialsProperties.COLOMBO_GP_PASSWORD = credentialsProperties.getProperty("Col_Gp_Password");
		CredentialsProperties.COLOMBO_XRAY_UNAME = credentialsProperties.getProperty("Col_Xray_Uname");
		CredentialsProperties.COLOMBO_XRAY_PASSWORD = credentialsProperties.getProperty("Col_Xray_Password");
		CredentialsProperties.COLOMBO_JUNIOR_UNAME = credentialsProperties.getProperty("Col_Lab_Junior_Uname");
		CredentialsProperties.COLOMBO_JUNIOR_PASSWORD = credentialsProperties.getProperty("Col_Lab_Junior_Password");
		CredentialsProperties.COLOMBO_SENIOR_UNAME = credentialsProperties.getProperty("Col_Lab_Senior_Uname");
		CredentialsProperties.COLOMBO_SENIOR_PASSWORD = credentialsProperties.getProperty("Col_Senior_Password");

		CredentialsProperties.ISL_GRO_UNAME = credentialsProperties.getProperty("Isl_Gro_Uname");
		CredentialsProperties.ISL_GRO_PASSWORD = credentialsProperties.getProperty("Isl_Gro_Password");
		CredentialsProperties.ISL_NURSE_UNAME = credentialsProperties.getProperty("Isl_Nurse_Uname");
		CredentialsProperties.ISL_NURSE_PASSWORD = credentialsProperties.getProperty("Isl_Nurse_Password");
		CredentialsProperties.ISL_GP_UNAME = credentialsProperties.getProperty("Isl_Gp_Uname");
		CredentialsProperties.ISL_GP_PASSWORD = credentialsProperties.getProperty("Isl_Gp_Password");
		CredentialsProperties.ISL_XRAY_UNAME = credentialsProperties.getProperty("Isl_Xray_Uname");
		CredentialsProperties.ISL_XRAY_PASSWORD = credentialsProperties.getProperty("Isl_Xray_Password");
		CredentialsProperties.ISL_JUNIOR_UNAME = credentialsProperties.getProperty("Isl_Lab_Junior_Uname");
		CredentialsProperties.ISL_JUNIOR_PASSWORD = credentialsProperties.getProperty("Isl_Lab_Junior_Password");
		CredentialsProperties.ISL_SENIOR_UNAME = credentialsProperties.getProperty("Isl_Lab_Senior_Uname");
		CredentialsProperties.ISL_SENIOR_PASSWORD = credentialsProperties.getProperty("Isl_Senior_Password");

		// Dhaka
		CredentialsProperties.DHAKA_GRO_UNAME = credentialsProperties.getProperty("Dhaka_Gro_Uname");
		CredentialsProperties.DHAKA_GRO_PASSWORD = credentialsProperties.getProperty("Dhaka_Gro_Password");
		CredentialsProperties.DHAKA_NURSE_UNAME = credentialsProperties.getProperty("Dhaka_Nurse_Uname");
		CredentialsProperties.DHAKA_NURSE_PASSWORD = credentialsProperties.getProperty("Dhaka_Nurse_Password");
		CredentialsProperties.DHAKA_GP_UNAME = credentialsProperties.getProperty("Dhaka_Gp_Uname");
		CredentialsProperties.DHAKA_GP_PASSWORD = credentialsProperties.getProperty("Dhaka_Gp_Password");
		CredentialsProperties.DHAKA_XRAY_UNAME = credentialsProperties.getProperty("Dhaka_Xray_Uname");
		CredentialsProperties.DHAKA_XRAY_PASSWORD = credentialsProperties.getProperty("Dhaka_Xray_Password");
		CredentialsProperties.DHAKA_JUNIOR_UNAME = credentialsProperties.getProperty("Dhaka_Lab_Junior_Uname");
		CredentialsProperties.DHAKA_JUNIOR_PASSWORD = credentialsProperties.getProperty("Dhaka_Lab_Junior_Password");
		CredentialsProperties.DHAKA_SENIOR_UNAME = credentialsProperties.getProperty("Dhaka_Lab_Senior_Uname");
		CredentialsProperties.DHAKA_SENIOR_PASSWORD = credentialsProperties.getProperty("Dhaka_Senior_Password");
		// Center Manager
		CredentialsProperties.CHENNAI_CM_UNAME = credentialsProperties.getProperty("Chennai_Central_Manager_Uname");
		CredentialsProperties.CHENNAI_CM_PASSWORD = credentialsProperties
				.getProperty("Chennai_Central_Manager_Password");
		CredentialsProperties.KOLKOTTA_CM_UNAME = credentialsProperties.getProperty("Kolkotta_Central_Manager_Uname");
		CredentialsProperties.KOLKOTTA_CM_PASSWORD = credentialsProperties
				.getProperty("Kolkotta_Central_Manager_Password");
		CredentialsProperties.MUMBAI_CM_UNAME = credentialsProperties.getProperty("Mumbai_Central_Manager_Uname");
		CredentialsProperties.MUMBAI_CM_PASSWORD = credentialsProperties.getProperty("Mumbai_Central_Manager_Password");
		CredentialsProperties.DELHI_CM_UNAME = credentialsProperties.getProperty("Delhi_Central_Manager_Uname");
		CredentialsProperties.DELHI_CM_PASSWORD = credentialsProperties.getProperty("Delhi_Central_Manager_Password");
		CredentialsProperties.HYDERABAD_CM_UNAME = credentialsProperties.getProperty("Hyderabad_Central_Manager_Uname");
		CredentialsProperties.HYDERABAD_CM_PASSWORD = credentialsProperties
				.getProperty("Hyderabad_Central_Manager_Password");
		CredentialsProperties.KOCHI_CM_UNAME = credentialsProperties.getProperty("Kochi_Central_Manager_Uname");
		CredentialsProperties.KOCHI_CM_PASSWORD = credentialsProperties.getProperty("Kochi_Central_Manager_Password");
		CredentialsProperties.MANILA_CM_UNAME = credentialsProperties.getProperty("Manila_Central_Manager_Uname");
		CredentialsProperties.MANILA_CM_PASSWORD = credentialsProperties.getProperty("Manila_Central_Manager_Password");
		CredentialsProperties.COLOMBO_CM_UNAME = credentialsProperties.getProperty("Colombo_Central_Manager_Uname");
		CredentialsProperties.COLOMBO_CM_PASSWORD = credentialsProperties
				.getProperty("Colombo_Central_Manager_Password");
		CredentialsProperties.KATHMANDU_CM_UNAME = credentialsProperties.getProperty("Kathmandu_Central_Manager_Uname");
		CredentialsProperties.KATHMANDU_CM_PASSWORD = credentialsProperties
				.getProperty("Kathmandu_Central_Manager_Password");
		CredentialsProperties.DHAKA_CM_UNAME = credentialsProperties.getProperty("Dhaka_Central_Manager_Uname");
		CredentialsProperties.DHAKA_CM_PASSWORD = credentialsProperties.getProperty("Dhaka_Central_Manager_Password");
		CredentialsProperties.ISLAMABAD_CM_UNAME = credentialsProperties.getProperty("Islamabad_Central_Manager_Uname");
		CredentialsProperties.ISLAMABAD_CM_PASSWORD = credentialsProperties
				.getProperty("Islamabad_Central_Manager_Password");
		CredentialsProperties.KARACHI_CM_UNAME = credentialsProperties.getProperty("Karachi_Central_Manager_Uname");
		CredentialsProperties.KARACHI_CM_PASSWORD = credentialsProperties
				.getProperty("Karachi_Central_Manager_Password");

		// Autofit
		CredentialsProperties.AUTOFIT_UNAME = credentialsProperties.getProperty("AutoFit_Uname");
		CredentialsProperties.AUTOFIT_PASSWORD = credentialsProperties.getProperty("AutoFit_Password");

		// Lab Director
		CredentialsProperties.LAB_DIRECTOR_UNAME = credentialsProperties.getProperty("Lab_Director_Uname");
		CredentialsProperties.LAB_DIRECTOR_PASSWORD = credentialsProperties.getProperty("Lab_Director_Password");

		CredentialsProperties.CENTRAL_LAB_AUTHORITY_UNAME= credentialsProperties.getProperty("Central_Lab_Authority_Uname");
		CredentialsProperties.CENTRAL_LAB_AUTHORITY_PASSWORD= credentialsProperties.getProperty("Central_Lab_Authority_Password");
		// Central Gp
		CredentialsProperties.CENTRAL_GP_UNAME = credentialsProperties.getProperty("Central_Gp_Uname");
		CredentialsProperties.CENTRAL_GP_PASSWORD = credentialsProperties.getProperty("Central_Gp_Password");

		// MOH
		CredentialsProperties.MOH_UNAME = credentialsProperties.getProperty("MOH_Uname");
		CredentialsProperties.MOH_PASSWORD = credentialsProperties.getProperty("MOH_Password");
		
		// MOH Lab
		CredentialsProperties.MOH_LAB_UNAME = credentialsProperties.getProperty("MOH_Lab_Uname");
		CredentialsProperties.MOH_LAB_PASSWORD = credentialsProperties.getProperty("MOH_Lab_Password");
		
		CredentialsProperties.MOI_UNAME = credentialsProperties.getProperty("MOI_Uname");
		CredentialsProperties.MOI_PASSWORD = credentialsProperties.getProperty("MOI_Password");

	}

}