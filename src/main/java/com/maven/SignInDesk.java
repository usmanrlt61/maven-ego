package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignInDesk extends Parent {
	Boolean comparedPromptDesk = false;

	public void signInDesk() throws InterruptedException {

		try {
			// Clicking on account icon
			Thread.sleep(3500);
			WebElement accountIcon = driver
					.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div[1]/button"));
			Actions actions = new Actions(driver);
			actions.moveToElement(accountIcon).perform();

			// Clicking on account
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[3]/div[1]/ul/li[1]/a")).click();
			js.executeScript("window.scrollBy(0,150)", "");

			// Entering email address
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("usman.ali@rltsquare.com");

			// Entering password
			Thread.sleep(500);
			driver.findElement(By.id("pass")).sendKeys("@Mani112233");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,150)", "");

			// Clicking on sign in button
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
			Thread.sleep(2000);
			String expectedURL = stagingURL;
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();

			int comparedURLDesk = actualURL.compareTo(expectedURL);

			if (comparedURLDesk == 0) {

				// Confirming login is successful for desktop user
				System.out.print("Login is successful for desktop user - Passed\n");
				Thread.sleep(1500);

			} else {

				// Comparing current prompt to expected prompt
				String actualString = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div"))
						.getText();

				String expectedString1 = new String(
						"The account sign-in was incorrect or your account is disabled temporarily.");
				String expectedString2 = "reCAPTCHA";
				String expectedString3 = "wrong";
				comparedPromptDesk = actualString.contains(expectedString1) || actualString.contains(expectedString2)
						|| actualString.contains(expectedString3);

				Thread.sleep(2500);

				try {
					if (comparedPromptDesk == true) {

						// Confirming login is not successful for desktop user
						System.out.print("Login is not successful for desktop user - Failed\n");

					}
					// Getting back to stage
					driver.get(stagingURL);

				} catch (Exception e) {
					// Confirming login is not successful for desktop user
					System.out.print("Login is not successful for desktop user - Failed\n");

				}

			}
		}

		catch (Exception e) {
			// Confirming log in page is not working for desktop user
			System.out.print("Log in page is not- working for desktop user - Failed\n ");

		}
	}

	// Function to set compared boolean value for desktop
	public Boolean setterSignInDesk() {

		return comparedPromptDesk;
	}

}
