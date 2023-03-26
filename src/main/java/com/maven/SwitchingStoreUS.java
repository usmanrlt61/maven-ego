package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchingStoreUS extends Parent {

	public void switchStoreUS() throws InterruptedException {

		// Mouse over on store switcher
		Thread.sleep(3500);
		WebElement accountIcon = driver.findElement(By.xpath("//*[@id=\"switcher-currency\"]/div/div[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(accountIcon).perform();

		// Clicking on US store
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"switcher-currency\"]/div/div[2]/ul/li[1]/a")).click();

	}

}
