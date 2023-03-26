package com.maven;

import org.openqa.selenium.By;

public class AddToCartDesk extends Parent {

	public void cartAddDesk() throws Exception {

		try {
			// Selecting size swatch
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tabs-swatches\"]/div/div[1]/div/div[1]")).click();

			// Selecting size
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"controlId-item-17\"]/div[2]")).click();

			// Click on add to cart button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

			// Confirming add to cart is working fine for desktop
			System.out.print("Add to cart is working for desktop - Passed\n");

		} catch (Exception e) {

			// Confirming add to cart is not working fine for desktop
			System.out.print("Add to cart is not working for desktop - Failed\n");
			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}

	}

}
