package com.maven;

import org.openqa.selenium.By;

public class SignUpMob extends Parent {
	int signUpMob = 0;

	public void signUpMob() throws InterruptedException {
		Boolean comparedPromptMob = false;

		try {
			// Clicking on side menu
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[1]/span")).click();

			// Clicking on account
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"store.menu\"]/nav/ul/li[1]/a/i")).click();

			// click on login
			Thread.sleep(1000);
			driver.findElement(By.className("login")).click();
			js.executeScript("window.scrollBy(0,600)", "");

			// Click on create account button
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Create an Account']")).click();

			// Setting First name
			Thread.sleep(3000);
			driver.findElement(By.id("firstname")).sendKeys("Test");

			// Setting Last name
			Thread.sleep(500);
			driver.findElement(By.id("lastname")).sendKeys("Test");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,200)", "");

			// Setting DOB
			Thread.sleep(500);
			driver.findElement(By.id("dob")).sendKeys("10/01/1990");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,200)", "");

			// Setting email
			Thread.sleep(500);
			driver.findElement(By.id("email_address")).sendKeys("usman.ali@rltsquare.com");

			// Setting password
			Thread.sleep(500);
			driver.findElement(By.id("password")).sendKeys("@Mani112233");

			// Setting password confirmation
			Thread.sleep(500);
			driver.findElement(By.id("password-confirmation")).sendKeys("@Mani112233");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,200)", "");

			// Un-checking remember me check box
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='Remember Me']")).click();

			// clicking on create account button
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='Create an Account']")).click();

			Thread.sleep(2500);
			String expectedURL = stagingURL + "customer/account/";
			String actualURL = driver.getCurrentUrl();
			Thread.sleep(500);

			int comparedURLMob = expectedURL.compareTo(actualURL);

			if (comparedURLMob == 0) {

				// Confirming Signup is successful for mobile user
				System.out.print("Signup is successful for mobile user - Passed\n");
				signUpMob = 1;
				Thread.sleep(1500);

			} else {

				Thread.sleep(1500);
				String actualPrompt = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expectedPrompt1 = "There is already an account with this email address. If you are sure that it is your email address, ";
				String expectedPrompt2 = "reCaptcha";
				String expectedPrompt3 = "wrong";
				comparedPromptMob = actualPrompt.contains(expectedPrompt1) || actualPrompt.contains(expectedPrompt2)
						|| actualPrompt.contains(expectedPrompt3);

				try {
					if (comparedPromptMob == true) {

						// Confirming sign up is not successful for mobile
						System.out.print("Sign up is not successful for mobile - Failed\n");
						signUpMob = 2;

					}
				} catch (Exception e) {

					// Confirming sign up is not successful for mobile
					System.out.print("Sign up is not successful for mobile  - Failed\n");
					signUpMob = 2;

				}

				// Getting back to stage
				Thread.sleep(3000);
				driver.get(stagingURL);
				Thread.sleep(2500);
			}

		} catch (Exception e) {

			// Confirming sign up is not working for mobile
			System.out.print("Sign up is not working for mobile  - Failed\n");
			signUpMob = 2;

		}
	}

	// Function to set singed up value for mobile
	public int setterSignUpMob() {
		return signUpMob;

	}
}