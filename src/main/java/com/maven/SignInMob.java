package com.maven;

import org.openqa.selenium.By;

public class SignInMob extends Parent {
	Boolean comparedPromptMob = false;

	public void signInMob() throws InterruptedException {

		try {
			// Clicking on side menu
			Thread.sleep(4500);
			driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[1]/span")).click();

			// Clicking on account
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/a/i")).click();

			// Click on login
			Thread.sleep(1000);
			driver.findElement(By.className("login")).click();

			// Entering email address
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(500);

			driver.findElement(By.id("email")).sendKeys("usman.ali@rltsquare.com");

			// Entering password
			Thread.sleep(1000);
			driver.findElement(By.id("pass")).sendKeys("@Mani112233");

			// Clicking on sign in button
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Sign In']")).click();
			Thread.sleep(2000);
			String expectedURL = stagingURL + "customer/account/";
			Thread.sleep(2000);
			String actualURL = driver.getCurrentUrl();
			int comparedURLMob = actualURL.compareTo(expectedURL);
			Thread.sleep(1000);

			if (comparedURLMob == 0) {

				// Confirming login is successful for mobile user
				System.out.print("Login is  successful for mobile user - Passed\n");
				Thread.sleep(1500);

			} else {

				// Comparing current prompt to expected prompt
				String actualString = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expectedString1 = new String(
						"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.");
				String expectedString2 = "reCAPTCHA";
				String expectedString3 = "wrong";
				comparedPromptMob = actualString.contains(expectedString1) || actualString.contains(expectedString2)
						|| actualString.contains(expectedString3);

				Thread.sleep(1500);

				try {
					if (comparedPromptMob == true) {

						// Confirming login is not successful for mobile user
						System.out.print("Login is not successful for mobile user - Failed\n");

					}
					// Getting back to stage
					driver.get(URL);

				} catch (Exception e) {
					// Confirming login is not successful for mobile user
					System.out.print("Login is not successful for mobile user - Failed\n");

				}

			}
		}

		catch (Exception e) {
			// Confirming log in page is not working for mobile user
			System.out.print("Login is not working for mobile user - Failed\n ");
		}
	}

	// Function to set compared boolean value for mobile
	public Boolean setterSignInMob() {

		return comparedPromptMob;
	}

}
