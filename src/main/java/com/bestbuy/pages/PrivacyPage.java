package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class PrivacyPage extends Base{

	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Privacy\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Privacy\" Page";
			
		}
		return msg;
		
	}
	
}
