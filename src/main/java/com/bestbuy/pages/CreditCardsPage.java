package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class CreditCardsPage extends Base{

	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Credit Cards\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Credit Card\" Page";
			
		}
		return msg;
		
	}
	
}
