package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class StatePrivacyRightsPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"State Privacy Rights\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"State Privacy Rights\" Page";
			
		}
		return msg;
		
	}

}
