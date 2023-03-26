package com.maven;

import org.openqa.selenium.By;

public class CheckoutDesk extends Parent {

	public void proceedCheckoutDesk() throws Exception {
		Boolean comparedURL = false;

		try {
			// Clicking on checkout button
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='CHECKOUT SECURELY']")).click();

			// Comparing current URL to expected URL
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "checkout/#shipping");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(500);

			if (comparedURL == true) {

				// Confirming checkout page is working for desktop
				System.out.print("On checkout securely: Checkout page is working for desktop - Passed\n");

			} else {

				// Confirming checkout page is not working for desktop
				System.out.print("On checkout securely: Checkout page is not working for desktop - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");

			}

			// Confirming check out is working
			System.out.print("Checkout securely button is working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming checkout button is not working
			System.out.print("Checkout securely button is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}

	}
}