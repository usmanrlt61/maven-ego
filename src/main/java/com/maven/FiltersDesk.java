package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FiltersDesk extends Parent {

	public void filterDesk() throws Exception {

		try {
			// selecting size swatch
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
			Thread.sleep(750);
			driver.findElement(By.xpath("//div[@option-label='4']")).click();
			Thread.sleep(750);
			js.executeScript("window.scrollBy(0,-150)", "");

			// selecting color swatch
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[1]/a")).click();
//			driver.findElement(By.xpath(
//					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[2]/div[2]/ol/li[1]/a"))
//					.click();

			// selecting bar
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[3]/div[1]"))
					.click();
			Thread.sleep(500);
			Actions actions = new Actions(driver);
			WebElement element;
			element = driver.findElement(By.xpath(
					"/html/body/div[2]/main/div[3]/div/div[1]/div[1]/div/div[3]/div[2]/div[3]/div[2]/ol/li/div/div/input[1]"));
			Thread.sleep(500);
			actions.clickAndHold(element).moveByOffset(1, 0).release().perform();
			Thread.sleep(5000);

			// Confirming filter product is working for desktop
			System.out.print("Filter product is  working for desktop - Passed\n");
			Thread.sleep(1500);

		} catch (Exception e) {

			// Confirming filter product is not working for desktop
			System.out.print("Filter product is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");
					}
	}
}
