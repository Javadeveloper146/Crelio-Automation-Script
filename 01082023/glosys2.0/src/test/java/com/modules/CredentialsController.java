package com.modules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.appConstants.AppConstants;
import com.commonUtility.CommonUtility;
import com.constantProperties.ConstantProperties;
import com.constantProperties.CredentialsProperties;
import com.pageObjects.LoginPage;

public class CredentialsController {

	private static final Logger LOGGER = LogManager.getLogger(CredentialsController.class);

	public void groCredentialsController(String state) {

		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_GRO_UNAME);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_GRO_PASSWORD);

		}

		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_GRO_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_GRO_PASSWORD);
		}
		// Kolkotta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_GRO_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_GRO_PASSWORD);
		}
		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_GRO_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_GRO_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_GRO_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_GRO_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_GRO_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_GRO_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_GRO_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_GRO_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_GRO_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_GRO_PASSWORD);
			}

		} else {
			LOGGER.error("Credential Error Please check the state : " + state);
		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_GRO_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_GRO_PASSWORD);

		}
		// Dhaka
		if (AppConstants.DHAKA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_GRO_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_GRO_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_GRO_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_GRO_PASSWORD);

		}

	}

	public void nurseCredentialsController(String state) {
		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_NURSE_UNAME);
			
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_NURSE_PASSWORD);

		}
		// Delhi
		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_NURSE_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_NURSE_PASSWORD);
		}
		// Kolkatta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_NURSE_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_NURSE_PASSWORD);
		}
		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_NURSE_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_NURSE_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_NURSE_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_NURSE_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_NURSE_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_NURSE_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_NURSE_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_NURSE_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_NURSE_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_NURSE_PASSWORD);
			}
		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_NURSE_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_NURSE_PASSWORD);

		}
		// Dhaka
		if (AppConstants.DHAKA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_NURSE_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_NURSE_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_NURSE_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_NURSE_PASSWORD);

		}

	}

	public void gpCredentialsController(String state) {
		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_GP_PASSWORD);

		}
		// Delhi
		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_GP_PASSWORD);
		}

		// Kolkotta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_GP_PASSWORD);
		}

		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_GP_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_GP_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_GP_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_GP_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_GP_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_GP_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_GP_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_GP_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_GP_PASSWORD);

			}

		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_GP_PASSWORD);

		}
		// Dhaka
		if (AppConstants.DHAKA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_GP_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_GP_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_GP_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_GP_PASSWORD);

		}
	}

	public void xrayCredentials(String state) {
		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_XRAY_PASSWORD);

		}

		// Delhi
		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_XRAY_PASSWORD);
		}

		// Kolkotta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_XRAY_PASSWORD);
		}
		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_XRAY_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_XRAY_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_XRAY_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_XRAY_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_XRAY_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_XRAY_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_XRAY_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_XRAY_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_XRAY_PASSWORD);
			}
		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_XRAY_PASSWORD);

		}
		// Dhaka
		if (AppConstants.DHAKA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_XRAY_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_XRAY_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_XRAY_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_XRAY_PASSWORD);

		}
	}

	public void labJuniorCredentials(String state) {
		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_JUNIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_JUNIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_JUNIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_JUNIOR_PASSWORD);

		}
		// Delhi
		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_JUNIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_JUNIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_JUNIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_JUNIOR_PASSWORD);
		}
		// Kolkotta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_JUNIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_JUNIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_JUNIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_JUNIOR_PASSWORD);
		}
		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_JUNIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_JUNIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_JUNIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_JUNIOR_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_JUNIOR_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_JUNIOR_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_JUNIOR_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_JUNIOR_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_JUNIOR_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_JUNIOR_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_JUNIOR_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_JUNIOR_PASSWORD);
			}
		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_JUNIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_JUNIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_JUNIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_JUNIOR_PASSWORD);

		}
		// Dhaka
				if (AppConstants.DHAKA_STATE.equals(state)) {
					LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_JUNIOR_UNAME);
					LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_XRAY_UNAME);
					CommonUtility.implicitWait(10);
					LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_JUNIOR_PASSWORD);
					LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_JUNIOR_PASSWORD);

				}
	}

	public void labSeniorCredentials(String state) {
		// Chenani
		if (AppConstants.CHENNAI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.CH_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.CH_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.CH_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.CH_SENIOR_PASSWORD);

		}

		// Delhi
		if (AppConstants.DELHI_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DEL_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DEL_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DEL_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DEL_SENIOR_PASSWORD);
		}
		// Kolkotta
		if (AppConstants.KOLKOTTA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.KOL_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.KOL_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.KOL_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.KOL_SENIOR_PASSWORD);
		}

		// Manila
		if (AppConstants.MANILA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.MNL_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.MNL_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.MNL_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.MNL_SENIOR_PASSWORD);

		}

		if (ConstantProperties.COUNTRY.equals(AppConstants.PAKISTAN_COUNTRY)) {

			if (AppConstants.KARACHI_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.KAR_SENIOR_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.KAR_SENIOR_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.KAR_SENIOR_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.KAR_SENIOR_PASSWORD);

			} else if (AppConstants.ISLAMABAD_STATE.equals(state)) {
				LoginPage.getInstance().enterTheUserName(CredentialsProperties.ISL_SENIOR_UNAME);
				LOGGER.info("Username" + ": " + CredentialsProperties.ISL_SENIOR_UNAME);
				CommonUtility.implicitWait(10);
				LoginPage.getInstance().enterThePassword(CredentialsProperties.ISL_SENIOR_PASSWORD);
				LOGGER.info("Password" + ": " + CredentialsProperties.ISL_SENIOR_PASSWORD);
			}

		}

		// Colombo
		if (AppConstants.COLOMBO_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.COLOMBO_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.COLOMBO_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.COLOMBO_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.COLOMBO_SENIOR_PASSWORD);

		}
		// Dhaka
		if (AppConstants.DHAKA_STATE.equals(state)) {
			LoginPage.getInstance().enterTheUserName(CredentialsProperties.DHAKA_SENIOR_UNAME);
			LOGGER.info("Username" + ": " + CredentialsProperties.DHAKA_SENIOR_UNAME);
			CommonUtility.implicitWait(10);
			LoginPage.getInstance().enterThePassword(CredentialsProperties.DHAKA_SENIOR_PASSWORD);
			LOGGER.info("Password" + ": " + CredentialsProperties.DHAKA_SENIOR_PASSWORD);

		}
	}

}
