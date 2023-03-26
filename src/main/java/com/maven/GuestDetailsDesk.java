package com.maven;

import org.openqa.selenium.By;

public class GuestDetailsDesk extends Parent {

	public void guestDetailsDesk() throws Exception {

		try {
			// Entering Email
			Thread.sleep(2500);
			js.executeScript("window.scrollBy(0,-150)", "");
			Thread.sleep(500);
			driver.findElement(By.id("customer-email")).sendKeys("usman.ali@rltsquare.com");
			Thread.sleep(2500);
			js.executeScript("window.scrollBy(0,250)", "");

			// Selecting country drop down
			Thread.sleep(2500);
			driver.findElement(By.name("country_id")).click();

			// Selecting United kingdom
			Thread.sleep(1000);
			driver.findElement(By.xpath("//option[@value='GB']")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,75)", "");

			// Setting First name
			Thread.sleep(1000);
			driver.findElement(By.name("firstname")).sendKeys("Test");

			// Setting Last name
			Thread.sleep(500);
			driver.findElement(By.name("lastname")).sendKeys("Test");

			// Entering post code
			Thread.sleep(500);
			driver.findElement(By.name("postcode")).sendKeys("M32 0JT");
			Thread.sleep(250);
			js.executeScript("window.scrollBy(0,75)", "");

			// Entering address line one
			Thread.sleep(500);
			driver.findElement(By.name("street[0]")).sendKeys("Unit A1, Thomas Street");

			// Entering address line two
			Thread.sleep(500);
			driver.findElement(By.name("street[1]")).sendKeys("Longford Trading Estate Stretford");

			// Entering state
			Thread.sleep(500);
			driver.findElement(By.name("region")).sendKeys("Greater Manchester");

			// Entering city
			Thread.sleep(250);
			js.executeScript("window.scrollBy(0,75)", "");
			Thread.sleep(500);
			driver.findElement(By.name("city")).sendKeys("Manchester");

			// Entering mobile number
			Thread.sleep(500);
			driver.findElement(By.name("telephone")).sendKeys("+443222204317");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,75)", "");
			Thread.sleep(500);

			// Confirming Guest details on checkout is working
			System.out.print("Guest details on checkout are working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming Guest details on checkout is not working
			System.out.print("Guest details on checkout are not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}
	}

}
