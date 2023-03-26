package com.maven;

import org.openqa.selenium.By;

public class FindProdMob extends Parent {

	public void findProductMob() throws Exception {
		Boolean comparedURL = false;

		try {
			// Selecting product
			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(1000);

			// Clicking on Fiat product
			try {
				driver.findElement(By.xpath(
						"//img[@src='https://m2.staging.ego.co.uk.cfstack.com/media/catalog/product/cache/9cc5c48cbc0f8827b6fef13f0b5440ce/h/a/harmony_4201_ptImg.jpg']"))
						.click();

			} catch (Exception e) {

				driver.findElement(By.xpath(
						"//img[@src='https://m2.staging.ego.co.uk.cfstack.com/media/catalog/product/cache/9cc5c48cbc0f8827b6fef13f0b5440ce/h/a/harmony_4201_ptImg.jpg']"))
						.click();
			}
			// Comparing current URL to expected URL
			Thread.sleep(2500);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(
					stagingURL + "hab478-fiat-lace-up-square-toe-sculptured-heel-in-black-faux-leather.html");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(500);

			if (comparedURL == true) {

				// Confirming find product is working for mobile
				System.out.print("Find product is working for mobile - Passed\n");

			} else {

				// Confirming find product is not working for mobile
				System.out.print("Find product is not working for mobile - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");

			}

		} catch (Exception e) {

			// Confirming find product is not working for desktop
			System.out.print("Find product is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}
	}

}
