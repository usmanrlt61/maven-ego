package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PaypalPopUpGuest extends Parent {
	public void paypalPopUpGuest() throws InterruptedException {
		Thread.sleep(4000);
		String clicklnk = Keys.chord(Keys.CONTROL, Keys.ENTER);

//		Thread.sleep(3000);
//		js.executeScript("document.getElementByXpath(/html/body/div/div/div/div/div[1]).click();");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementById('ppfnfnclspbfiframe').click();");

		// open the link in new tab, Keys.Chord string passed to sendKeys
		driver.switchTo().frame(driver.findElement(By.xpath(
				"/html/body/div[2]/header/div[2]/div/div[3]/div[2]/div[2]/aside/div[2]/div/div/div[3]/div[2]/div/div/iframe[1]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/img")).click();		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/img")).sendKeys(clicklnk);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

	}

}
