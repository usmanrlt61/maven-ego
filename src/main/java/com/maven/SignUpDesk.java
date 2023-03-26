package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignUpDesk extends Parent {
	int signUpDesk = 0;

	public void signUpDesk() throws InterruptedException {
		Boolean comparedPromptDesk = false;

		try {
			// clicking on account icon
			Thread.sleep(5000);
			WebElement accountIcon = driver
					.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div/div[3]/div[1]/button"));
			Actions actions = new Actions(driver);
			actions.moveToElement(accountIcon).perform();

			// Click on create account button
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div/div[3]/div[1]/ul/li[2]/a")).click();

			// Setting First name
			Thread.sleep(1500);
			driver.findElement(By.id("firstname")).sendKeys("Test");

			// Setting Last name
			Thread.sleep(500);
			driver.findElement(By.id("lastname")).sendKeys("Test");
			// Setting email
			Thread.sleep(500);
			driver.findElement(By.id("email_address")).sendKeys("usman.ali@rltsquare.com");

			// Setting password
			Thread.sleep(500);
			driver.findElement(By.id("password")).sendKeys("@Mani112233");

			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,100)", "");

			// Setting DOB
			Thread.sleep(1000);
			driver.findElement(By.id("dob")).sendKeys("10/01/1990");

			// Setting password confirmation
			Thread.sleep(500);
			driver.findElement(By.id("password-confirmation")).sendKeys("@Mani112233");
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,200)", "");

			// Un-checking remember me check box
			Thread.sleep(500);
			driver.findElement(By.xpath("//span[text()='Remember Me']")).click();
			Thread.sleep(500);
			js.executeScript("window.scrollBy(0,100)", "");

			// clicking on create account button
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[text()='Create an Account']")).click();

			String expectedURL = stagingURL + "customer/account/";
			String actualURL = driver.getCurrentUrl();

			Thread.sleep(500);

			int comparedURL = expectedURL.compareTo(actualURL);

			if (comparedURL == 0) {

				// Confirming Sign up is successful for desktop user
				System.out.print("Sign up is  successful for desktop user - Passed\n");
				signUpDesk = 1;
				Thread.sleep(1500);

			} else {

				Thread.sleep(1500);
				String actualPrompt = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"))
						.getText();
				String expectedPrompt1 = "There is already an account with this email address. If you are sure that it is your email address, ";
				String expectedPrompt2 = "reCaptcha";
				String expectedPrompt3 = "wrong";
				comparedPromptDesk = actualPrompt.contains(expectedPrompt1) || actualPrompt.contains(expectedPrompt2)
						|| actualPrompt.contains(expectedPrompt3);

				try {
					if (comparedPromptDesk == true) {

						// Confirming sign up is not working for desktop
						System.out.print("Sign up is not successful for desktop - Failed\n");
						signUpDesk = 2;

					}

				} catch (Exception e) {

					// Confirming sign up is not working for desktop
					System.out.print("Sign up is not successful for desktop  - Failed\n");
					signUpDesk = 2;

				}

				// Getting back to stage
				Thread.sleep(3000);
				driver.get(stagingURL);
				Thread.sleep(3000);
			}

		} catch (Exception e) {

			// Confirming sign up is not working for desktop
			System.out.print("Sign up is not working for desktop  - Failed\n");
			signUpDesk = 2;

		}
	}

	// Function to set singed up value for desktop
	public int setterSignUpDesk() {
		return signUpDesk;

	}
}