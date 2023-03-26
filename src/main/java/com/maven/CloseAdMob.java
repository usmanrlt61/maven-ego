package com.maven;

import org.openqa.selenium.By;

public class CloseAdMob extends Parent {

	public void adMob() throws Exception {

		try {
			// Closing notification of site
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();

			// Confirming close add is working for mobile
			System.out.print("Close ad is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming close add is not working for mobile
			System.out.print("Close ad is not working for mobile - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
		}

	}
}
