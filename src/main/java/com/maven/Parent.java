package com.maven;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Parent {

	// Initiating Web driver instance
	public static WebDriver driver;
	
	// Static URLs
	static String URL = "https://egoadmins:QSuY67dT@m2.staging.ego.co.uk.cfstack.com/";
	static String stagingURL = "https://m2.staging.ego.co.uk.cfstack.com/";

	// Initiating Java script executor instance
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void main(String[] args) throws Exception {

		// Guest on Desktop
	URLInDesktop.desktopScreenOpen();
		FunCallDeskGuest fdg = new FunCallDeskGuest();
		fdg.callDeskGuest();
	
		// User on desktop
		URLInDesktop.desktopScreenOpen();
		FunCallDeskUser fdu = new FunCallDeskUser();
		fdu.callDeskUser();
	
		// Guest on mobile
		URLInMobile.mobileScreenOpen();
		FunCallMobGuest fmg = new FunCallMobGuest();
		fmg.callMobGuest();
	
		// User on mobile
		URLInMobile.mobileScreenOpen();
		FunCallMobUser fmu = new FunCallMobUser();
		fmu.callMobUser();
	
	}

}
