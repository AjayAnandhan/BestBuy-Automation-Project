package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class HealthDataPrivacyPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Health data Privacy\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Health data Privacy\" Page";
			
		}
		return msg;
		
	}

}
