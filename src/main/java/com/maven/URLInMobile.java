package com.maven;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URLInMobile extends Parent {

	public static void mobileScreenOpen() {

		try {
			// Setting chrome driver and path for driver
			System.setProperty("webdriver.chrome.driver", "./chromedriver");

			// Map initialization for iphone 8
			Map<String, String> mobileEmulation = new HashMap<>();
			mobileEmulation.put("deviceName", "iPhone 8");

			// Chrome options initialization
			ChromeOptions options = new ChromeOptions();

			// For mobile emulation - call this, it will convert screen in mobile
			options.setExperimentalOption("mobileEmulation", mobileEmulation);

			// Setting chrome driver to web driver instance
			driver = new ChromeDriver(options);

			// Maximizing the window
			driver.manage().window().maximize();

			// site calling
			driver.get(URL);

			// Confirming browser is opened for mobile
			System.out.print("Opening chrome browser is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming browser is not opened for mobile
			System.out.print("Opening chrome browser is not working for mobile - Passed\n");
		}

	}
}
