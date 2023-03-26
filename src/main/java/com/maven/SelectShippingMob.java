package com.maven;

import org.openqa.selenium.By;

public class SelectShippingMob extends Parent {

	public void shippingMob() throws Exception {

		try {
			// Selecting shipping of royal mail for next working day
			Thread.sleep(3500);
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("label_method_royalmailnextworkingday_RoyalMailHV")).click();
			Thread.sleep(2500);

			// Confirming select shipping is working for mobile
			System.out.print("Select shipping is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming Select shipping is not working for mobile
			System.out.print("Select shipping is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}
	}
}
