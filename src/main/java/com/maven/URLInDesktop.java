package com.maven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class URLInDesktop extends Parent {
	
	public static void desktopScreenOpen() {
		
		try {
			// Setting chrome driver and path for driver
			System.setProperty("webdriver.chrome.driver", "./chromedriver");

			// Chrome initialization
			ChromeOptions options = new ChromeOptions();

			// Disable browser level notification
			options.addArguments("--disable-notifications");

			// Setting chrome driver to web driver instance
			driver = new ChromeDriver(options);
		
			// Maximizing the window
			driver.manage().window().maximize();
			driver.get(URL);

			// Confirming browser is opened for desktop
			System.out.print("Opening chrome browser is working for desktop - Passed\n");

		} catch (Exception e) {
			
			// Confirming browser is not opened for desktop
			System.out.print("Opening chrome browser is not working for desktop - Passed\n");
		}
	}

}
