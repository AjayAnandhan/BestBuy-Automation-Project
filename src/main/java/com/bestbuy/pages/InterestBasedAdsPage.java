package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class InterestBasedAdsPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Interest-Based Ads\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Interest-Based Ads\" Page";
			
		}
		return msg;
		
	}

}
