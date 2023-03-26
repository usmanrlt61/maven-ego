package com.maven;

import org.openqa.selenium.By;

public class EditCartMob extends Parent {

	public void editCartMob() throws Exception {
		Boolean comparedURL = false;

		try {
			// Closing the pop up
			Thread.sleep(4000);
			driver.findElement(By.className("action-close")).click();

			// Clicking on my cart
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div[2]/a")).click();

			// Clicking on view bag
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='VIEW BAG']")).click();

			// Comparing current URL to expected URL
			Thread.sleep(1500);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "checkout/cart/");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(1500);

			if (comparedURL == true) {

				// Confirming cart page is working for mobile
				System.out.print("On view bag: Cart page is working for mobile - Passed\n");

			} else {

				// Confirming cart page is not working for mobile
				System.out.print("On view bag: Cart page is not working for mobile - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");

			}

			// Clicking QTY drop down
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select"))
					.click();

			// Clicking QTY 2
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[2]/main/div/div/div[3]/form/div[2]/div/div/div/div/div[2]/div[2]/div[2]/select/option[2]"))
					.click();
			Thread.sleep(2500);

			// Confirming edit cart is working for mobile
			System.out.print("Edit cart is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming edit cart is not working for desktop
			System.out.print("Edit cart is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}
	}
}
