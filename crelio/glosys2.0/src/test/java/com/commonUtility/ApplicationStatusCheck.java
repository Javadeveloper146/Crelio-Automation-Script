package com.commonUtility;

import java.util.Properties;

import com.constantProperties.ApplicationStatusCheckProperties;

public class ApplicationStatusCheck {
	public void applicationStatusCheck() {
		Properties applicationStatusCheckProperties = new Properties();

		try {

			applicationStatusCheckProperties.load(getClass().getResourceAsStream("/applicationStatusCheck.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	
		ApplicationStatusCheckProperties.APPLICATION_SCENARIO = applicationStatusCheckProperties
				.getProperty("Application_Scenaio");
		
		ApplicationStatusCheckProperties.APPLICANT_STATUS_CHECK_VISA_NUMBER= applicationStatusCheckProperties
				.getProperty("VisaNumber");
	}

}