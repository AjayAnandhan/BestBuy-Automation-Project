/**
 * 
 */
package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

/**
 * 
 */
public class DealOfTheDayPAge extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Deal of the Day\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Deal of the Day\" Page";
			
		}
		return msg;
		
	}

}
