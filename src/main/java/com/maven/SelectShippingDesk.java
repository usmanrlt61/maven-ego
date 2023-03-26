package com.maven;

import org.openqa.selenium.By;

public class SelectShippingDesk extends Parent {

	public void shippingDesk() throws Exception {

		try {
			// Selecting shipping of royal mail for next working day
			Thread.sleep(3500);
			js.executeScript("window.scrollBy(0,-500)", "");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,500)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("label_method_royalmailnextworkingday_RoyalMailHV")).click();
			Thread.sleep(2500);

			// Confirming select shipping is working for desktop
			System.out.print("Select shipping is working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming Select shipping is not working for desktop
			System.out.print("Select shipping is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}
	}
}