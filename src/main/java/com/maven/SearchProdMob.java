package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchProdMob extends Parent {

	public void searchMob() throws Exception {
		Boolean comparedURL = false;

		try {
			// Selecting search button
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[2]/div/div[2]/form/div[1]/label"))
					.click();

			// Entering keyword in search field
			driver.findElement(By.name("q")).sendKeys("heels");

			// Calling enter on search field
			Thread.sleep(2000);
			WebElement textbox = driver.findElement(By.name("q"));
			textbox.sendKeys(Keys.RETURN);
			// Comparing current URL to expected URL
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "catalogsearch/result/?q=heels");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(2500);

			if (comparedURL == true) {

				// Confirming search is working for mobile
				System.out.print("Search is working for mobile - Passed\n");

			} else {

				// Confirming search is not working for mobile
				System.out.print("Search is not working for mobile - Failed\n");
				Thread.sleep(2000);
				driver.quit();
				System.out.print("                ***********     \n");

			}
		}

		catch (Exception e) {

			// Confirming search is not working for mobile
			System.out.print("Search is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			Thread.sleep(1500);
			System.out.print("                ***********     \n");
		}

	}
}