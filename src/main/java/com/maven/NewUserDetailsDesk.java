package com.maven;

import org.openqa.selenium.By;

public class NewUserDetailsDesk extends Parent {

	public void newDetailsDesk() throws Exception {

		try {
			// selecting country drop down
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,-250)", "");
			driver.findElement(By.className("select")).click();

			// selecting United kingdom
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[1]/div/select/option[234]"))
					.click();
			Thread.sleep(2500);
			js.executeScript("window.scrollBy(0,200)", "");

			// Entering post code
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[4]/div/input"))
					.sendKeys("M32 0JT");

			// Entering address line one
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input"))
					.sendKeys("Unit A1, Thomas Street");

			// Entering address line two
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/fieldset/div/div[2]/div/input"))
					.sendKeys("Longford Trading Estate Stretford");

			// Entering state
			Thread.sleep(500);
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[6]/div/input"))
					.sendKeys("Greater Manchester");

			// Entering city
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,100)", "");
			Thread.sleep(500);
			driver.findElement(By
					.xpath("/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[7]/div/input"))
					.sendKeys("Manchester");

			// Entering mobile number
			Thread.sleep(500);
			driver.findElement(By.xpath(
					"/html/body/div[3]/main/div[3]/div/div[3]/div[3]/ol/li[1]/div[2]/form/div/div[8]/div/div[1]/input"))
					.sendKeys("+443222204317");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,50)", "");
			Thread.sleep(500);

			// Confirming new user details is working for desktop
			System.out.print("New user details is working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming new user details is not working for desktop
			System.out.print("New user details is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}

	}

}
