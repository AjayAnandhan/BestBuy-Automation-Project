/**
 * 
 */
package com.bestbuy.pages;
import org.openqa.selenium.WebDriver;
import com.bestbuy.base.Base;

/**
 * 
 */
public class MembershipPage extends Base{
	
	public String validateTitle (WebDriver driver, String expTitle) {
		String msg = "Can't open \"My Best Buy Memberships\" Page";
		if(driver.getTitle().contains(expTitle)) {
			msg = "Successfully landed on \"My Best By Memberships\" Page";
			
		}
		return msg;
		
	}

}
