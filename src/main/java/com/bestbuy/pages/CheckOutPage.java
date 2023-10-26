package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class CheckOutPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = " //span[text()='Continue to Payment Information']")
	WebElement checkoutBtn;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}
	
	public PaymentPage clickOnPaymentBtn() throws Throwable{
		action.click(driver, checkoutBtn);
		return new PaymentPage();
	}

}
