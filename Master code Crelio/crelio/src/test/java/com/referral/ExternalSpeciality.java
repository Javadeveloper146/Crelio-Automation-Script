package com.referral;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.pageObjects.ExternalSpecialityPageObject;
import com.pageObjects.GROReferral;
import com.pageObjects.GpModule;
import com.pageObjects.PatientProfiles;
import com.stepDefinition.CommonDefinition;

public class ExternalSpeciality {
	private static final Logger LOGGER = LogManager.getLogger(ExternalSpeciality.class);

	// Cardilogy Referral Create
	public void cardilogyReferralCreate() throws Throwable {
		// Incase Cardiology Problem
		// Enter The Cardiology Problem
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().ClearTheCardiologyDetails();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().enterTheCardiologyDetails(ConstantProperties.CARDIOLOGY);
		CommonUtility.sleepControl(500);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();
		CommonUtility.sleepControl(1000);

		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();

		LOGGER.info("Successfully Cardilogy Referral Created");
	}

	// Create Deformity Referral Create
	public void deformityReferralCreate() throws Throwable {

		// Click The Yes Option
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheYesOption();
		// Enter The Deformity
		CommonUtility.sleepControl(500);
		ExternalSpecialityPageObject.getInstance().enterTheDeformity(ConstantProperties.DEFORMITY);

		// Click The Add Button
		CommonUtility.sleepControl(500);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
		LOGGER.info("Successfully Deformity Referral Created");
	}

	// Respiratory System
	public void respiratorySystem() throws Throwable {
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clearTheRespiratorySystem();
		CommonUtility.sleepControl(500);
		ExternalSpecialityPageObject.getInstance().enterTheRespiratorySystem(ConstantProperties.RESPIRATORY);
		CommonUtility.sleepControl(500);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickSpeciality();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickThePulmonology();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
		LOGGER.info("Successfully Respiratory System Referral Created");
	}

	// Skin
	public void skin() throws Throwable {
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clearSkin();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().enterTheSkin(ConstantProperties.SKIN);
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();
		CommonUtility.sleepControl(1500);
		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
		LOGGER.info("Successfully Skin Dermatology Referral Created");
	}

	// Ear
	public void ear() throws Throwable {
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clearEar();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().enterTheEar(ConstantProperties.EAR);
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();

		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
		LOGGER.info("Successfully Ear (ENT) Referral Created");
	}

	// Phychiatry
	public void pshychiatry() throws Throwable {
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clearPsychiatry();
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().enterThePhychiatry(ConstantProperties.PSYCHIATRY);
		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheAddButton2();

		CommonUtility.sleepControl(1000);
		ExternalSpecialityPageObject.getInstance().clickTheSaveButtonForClinicalNotes();
		LOGGER.info("Successfully Psychiatry  Referral Created");
	}

}
