package com.bestbuy.pages;
import org.openqa.selenium.WebDriver;
import com.bestbuy.base.Base;

public class TermsAndConditionsPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"Terms and Conditions\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"Terms and Conditions\" Page";
			
		}
		return msg;
		
	}

}
