package com.maven;

import org.openqa.selenium.By;

public class CheckoutMob extends Parent {

	public void proceedCheckoutMob() throws Exception {
		Boolean comparedURL = false;

		try {
			// Clicking on checkout button
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,600)", "");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='CHECKOUT SECURELY']")).click();

			// Comparing current URL to expected URL
			Thread.sleep(3000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "checkout/#shipping");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(500);

			if (comparedURL == true) {

				// Confirming checkout page is working for mobile
				System.out.print("On checkout securely: Checkout page is working for mobile - Passed\n");
			} else {

				// Confirming checkout page is not working for mobile
				System.out.print("On checkout securely: Checkout page is not working for mobile - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");

			}

			// Confirming check out is working
			System.out.print("Checkout securely button is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming checkout button is not working
			System.out.print("Checkout securely button is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}

	}
}