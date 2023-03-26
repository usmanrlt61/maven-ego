package com.maven;

import org.openqa.selenium.By;

public class CashOnDelivery extends Parent {

	public void COD() throws Exception {
		Boolean comparedURL = false;

		try {

			// clicking on COD button
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,600)", "");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Cash On Delivery']")).click();

			// clicking on place order
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Place Order']")).click();
			Thread.sleep(5000);

			// Comparing current URL to expected URL
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "checkout/onepage/success/");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(1500);

			if (comparedURL == true) {

				// Confirming order ID
				String orderID = driver
						.findElement(By.xpath(
								"//*[@id=\"maincontent\"]/div[3]/div/div[3]/div/div[2]/div[1]/div[1]/div[2]/span[1]"))
						.getText();
				System.out.println("Test " + orderID);

				// Confirming order success page is working for desktop
				System.out.print("Order success page is working for desktop - Passed\n");
				System.out.print("                ***********     \n");

			} else {

				// Confirming order success page is not working for desktop
				System.out.print("Order success page is not working for desktop - Failed\n");
				System.out.print("                ***********     \n");
				Thread.sleep(2000);
				driver.quit();

			}

		} catch (Exception e) {

			// Confirming Pay by card on checkout is not working
			System.out.print("Order success page is not working for desktop - Failed\n");
			System.out.print("                ***********     \n");
			Thread.sleep(2000);
			driver.quit();

		}
	}
}
