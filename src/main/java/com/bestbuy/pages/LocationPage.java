package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class LocationPage extends Base{

	static Action action = new Action();
	
	@FindBy(xpath = "(//*[text()='United States'])[1]")
	WebElement USBtn;
	
	public HomePage clickLocation() throws Throwable {
		action.click(driver, USBtn);
		return new HomePage();
	}
	
	public String validateURL() {
		String actualURL = driver.getCurrentUrl();
		return actualURL;
	}

}
