package com.maven;

import org.openqa.selenium.By;

public class ShippingDeskNewUser extends Parent {
	public void shippingDeskNewUser() throws Exception {

		try {
			// Selecting shipping of royal mail for next working day
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(1000);
			driver.findElement(By.id("label_method_royalmailnextworkingday_RoyalMailHV")).click();
			Thread.sleep(2500);

			// Confirming Select shipping on checkout is working
			System.out.print("Select shipping on checkout is working for new desktop user/guest - Passed\n");
		
		} catch (Exception e) {

			// Confirming Select shipping on checkout is not working
			System.out.print("Select shipping on checkout is not working for new desktop user/guest - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		
		}
	}
}
