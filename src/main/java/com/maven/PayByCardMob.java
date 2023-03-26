package com.maven;

import org.openqa.selenium.By;

public class PayByCardMob extends Parent {

	public void cardPayMob() throws InterruptedException {
		Boolean comparedURL = false;

		try {
			// Checkout.com
			// Clicking card payment
			Thread.sleep(1500);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='Pay by Card']")).click();

			// Add card number
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(1500);

			// Entering card number
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleIframe\"]")));
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"checkout-frames-card-number\"]")).sendKeys("4242 4242 4242 4242");
			Thread.sleep(500);
			driver.switchTo().parentFrame();
			Thread.sleep(500);
			driver.switchTo().defaultContent();
			Thread.sleep(1000);

			// Entering expiry date
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleIframe\"]")));
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"checkout-frames-expiry-date\"]")).sendKeys("03/30");
			Thread.sleep(500);
			driver.switchTo().parentFrame();
			Thread.sleep(500);
			driver.switchTo().defaultContent();
			Thread.sleep(500);

			// Entering CVV
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleIframe\"]")));
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"checkout-frames-cvv\"]")).sendKeys("100");
			Thread.sleep(500);
			driver.switchTo().parentFrame();
			Thread.sleep(500);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);

			// Clicking on place order button
			driver.findElement(By.xpath("//span[text()='Place Order']")).click();
			Thread.sleep(10000);

			// Confirming Pay by card on checkout is working
			System.out.print("Select pay by card on checkout is working for mobile - Passed\n");

			// Comparing current URL to expected URL
			Thread.sleep(1500);
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

				// Confirming order success page is working for mobile
				System.out.print("Order success page is working for mobile - Passed\n");
				System.out.print("                ***********     ");

			} else {

				// Confirming order success page is not working for mobile
				System.out.print("Order success page is not working for mobile - Failed\n");
				System.out.print("                ***********     ");
				Thread.sleep(2000);
				driver.quit();

			}

		} catch (Exception e) {

			// Confirming Pay by card on checkout is not working
			System.out.print("Select pay by card on checkout is not working for mobile - Failed\n");
			System.out.print("                ***********     ");
			Thread.sleep(2000);
			driver.quit();
		}
	}

}