package com.bestbuy.pages;

import org.openqa.selenium.WebDriver;
import com.bestbuy.base.Base;

public class TopDealsPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Top Deals\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Top Deals\" Page";
			
		}
		return msg;
		
	}
	
}
