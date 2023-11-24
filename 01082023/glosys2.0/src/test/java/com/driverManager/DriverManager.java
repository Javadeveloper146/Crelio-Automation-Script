package com.driverManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.constantProperties.ConstantProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchTheBrowser() {

		try {

			String ksd = ConstantProperties.BROWSER;
			System.err.println(ksd);

			switch (ksd) {

			case "Chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "MicrosoftEdge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				LOGGER.error("Browser Status condition is Null Or Invaild  Browser please enter correct Browser" + ": "
						+ ConstantProperties.BROWSER);
				break;
			}

		} catch (Exception e) {

		}

	}

	public static void browserMaxize() {
		driver.manage().window().maximize();
	}

	public static void allCookiesClear() {
		driver.manage().deleteAllCookies();

	}

}
