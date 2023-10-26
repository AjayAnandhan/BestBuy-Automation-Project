package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;

import com.bestbuy.base.Base;

public class BestBuyOutletPage extends Base{

	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Best Buy Outlet\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Best Buy Outlet\" Page";
			
		}
		return msg;
		
	}
	
}
