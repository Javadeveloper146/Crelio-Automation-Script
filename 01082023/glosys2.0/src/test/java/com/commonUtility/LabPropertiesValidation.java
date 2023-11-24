/**
 * 
 */
package com.commonUtility;

import com.constantProperties.LabConstants;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

public class LabPropertiesValidation {
	public static String retake = "Retake";
	public boolean labPropertiesValidation() {
		
		if(LabConstants.HAEMOGLOBIN_SPECIMEN.equals(retake)&& LabConstants.HAEMOGLOBIN_RETAKE_VALUE.isBlank()) {
			System.err.println("[LAB ERROR]: Hamoglobin Retake Value is Empty Please Enter Hamoglobin Value");
			return false;
		}
		
		return true;
	}

}
