package com.maven;

import org.openqa.selenium.By;

public class AddToCartMob extends Parent {

	public void cartAddMob() throws Exception {

		try {
			// Selecting size swatch
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,450)", "");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"tabs-swatches\"]/div/div[1]/div/div[1]")).click();

			// Selecting size
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"controlId-item-17\"]")).click();

			// Click on add to cart button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();

			// Confirming add to cart is working fine for mobile
			System.out.print("Add to cart is working for mobile - Passed\n");

		} catch (Exception e) {

			// Confirming add to cart is not working fine for mobile
			System.out.print("Add to cart is not working for mobile - Failed\n");

			Thread.sleep(2000);
			driver.quit();
			System.out.print("                ***********     \n");

		}

	}

}