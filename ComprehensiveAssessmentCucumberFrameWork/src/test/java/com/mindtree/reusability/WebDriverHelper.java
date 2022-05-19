package com.mindtree.reusability;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.utilities.BaseClass;

public class WebDriverHelper extends BaseClass{
	
	public void clckOn(By element) {
		driver.findElement(element).click();
	}
	
   public void sendText(By element, String text) {
	   driver.findElement(element).sendKeys(text);
   }

   public void hover(By element) {
	   Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(element)).perform();
   }
   
   public String getText(By element) {
	 String text =   driver.findElement(element).getText();
	 return text;
   }
}
