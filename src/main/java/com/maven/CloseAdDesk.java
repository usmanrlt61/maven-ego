package com.maven;

import org.openqa.selenium.By;

public class CloseAdDesk extends Parent {

	public void adDesk() throws Exception {

		try {
			// Closing notification of site
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@data-testid='om-overlays-close']")).click();

			// Confirming close add is working for desktop
			System.out.print("Close ad is working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming close add is not working for desktop
			System.out.print("Close ad is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}

	}
}
