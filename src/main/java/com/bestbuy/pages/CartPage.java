package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class CartPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement closeBtn;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkOutBtn;
	
	public void closeBtn() {
		action.click(driver, closeBtn);
	}
	
	public CheckOutPage clickOnChekout() throws Throwable {
		action.click(driver, checkOutBtn);
		return new CheckOutPage();
	}
	
	public LogInPage ClickOnChecout2() throws Throwable {
		action.click(driver, checkOutBtn);
		return new LogInPage();
	}

}
