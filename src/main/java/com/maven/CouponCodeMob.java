package com.maven;

import org.openqa.selenium.By;

public class CouponCodeMob extends Parent {

	public void addCouponMob() throws Exception {
		Boolean comparedURL = false;

		try {
			// Entering coupon code
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(1500);
			driver.findElement(By.id("discount-code")).sendKeys("social10");

			// Clicking submit button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Submit']")).click();

			// Continue to payment
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(1000);

			// Clicking on checkout button
			driver.findElement(By.xpath("//span[text()='CONTINUE TO PAYMENT SECURELY']")).click();
			Thread.sleep(3000);

			// Comparing current URL to expected URL
			Thread.sleep(1500);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "checkout/#payment");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(500);

			if (comparedURL == true) {

				// Confirming on continue to payment securely, Payment page on checkout is
				// working for mobile
				System.out.print(
						"On continue to payment securely: Payment page on checkout is working for mobile - Passed\n");

			} else {
				// Confirming on continue to payment securely, Payment page on checkout is not
				// working for mobile
				System.out.print(
						"On continue to payment securely: Payment page on checkout is not working for mobile - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");
			}

			// Confirming Coupon code on checkout is working
			System.out.print("Select coupon code on checkout is working for mobile - Passed\n");
			Thread.sleep(500);

		} catch (Exception e) {

			// Confirming Coupon code on checkout is not working
			System.out.print("Select coupon code on checkout is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}
	}

}
