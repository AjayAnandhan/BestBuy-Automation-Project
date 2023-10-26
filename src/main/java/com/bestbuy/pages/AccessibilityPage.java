package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class AccessibilityPage extends Base{
	
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Accessibility\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Accessibility\" Page";
			
		}
		return msg;
		
	}

}
