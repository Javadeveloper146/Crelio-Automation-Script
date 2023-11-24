package com.modules;

import com.stepDefinition.CommonDefinition;

public class CountryController {
	
	public void countryController(String country) throws Throwable {
		
		switch (country) {
		case "India":
			CommonDefinition.countryIndia();
			break;
			
		case "Philippines":
			CommonDefinition.countryPhilippines();
			break;
		case "Srilanka":
			CommonDefinition.srilankaCountry();
			break;
		case "Pakistan":
			CommonDefinition.pakistan_Country();
			
			
			break;
		default:

			break;
		}

		
	}

}
