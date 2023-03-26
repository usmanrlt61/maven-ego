package com.maven;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchProdDesk extends Parent {

	public void searchDesk() throws Exception {
		Boolean comparedURL = false;

		try {
			// Entering keyword in search field
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("heels");

			Thread.sleep(2000);
			// Calling enter on search field
			WebElement textbox = driver.findElement(By.name("q"));
			textbox.sendKeys(Keys.RETURN);

			// Comparing current URL to expected URL
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			String expectedURL = new String(stagingURL + "catalogsearch/result/?q=heels");
			comparedURL = actualURL.equals(expectedURL);
			Thread.sleep(2500);

			if (comparedURL == true) {

				// Confirming search is working for desktop
				System.out.print("Search is working for desktop - Passed\n");

			} else {

				// Confirming search is not working for desktop
				System.out.print("Search is not working for desktop - Failed\n");
				Thread.sleep(1000);
				driver.quit();
				System.out.print("                ***********     \n");

			}
		}

		catch (Exception e) {
			// Confirming search is not working for desktop
			System.out.print("Search is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}

	}
}