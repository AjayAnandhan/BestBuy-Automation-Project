package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class PaymentPage extends Base{
	
	Action action = new Action();
	
	@FindBy(id = "number")
	WebElement cardNumber;
	
	@FindBy(id = "expMonth")
	WebElement expMonth;
	
	@FindBy(id = "expYear")
	WebElement expYear;
	
	@FindBy(id = "cvv")
	WebElement cvv;
	
	@FindBy(id = "first-name")
	WebElement firstName;
	
	@FindBy(id = "last-name")
	WebElement lastName;
	
	@FindBy(id = "address-input")
	WebElement address;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "state")
	WebElement state;
	
	@FindBy(id = "postalCose")
	WebElement zipCode;
	
	@FindBy(xpath = " //span[text()='Place Your Order']")
	WebElement placeOrder;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickOnPlaceOrderBtn(String fname, String lanme, String cardNum, String month, String year, String secCode, String Address, String City, String State, String Code) throws Throwable {
		action.type(cardNumber, "cardNum");
		action.selectByVisibleText(month, expMonth);
		action.selectByVisibleText(year, expYear);
		action.type(firstName, fname);
		action.type(lastName, lanme);
		action.type(cvv, secCode);
		action.type(address, Address);
		action.type(city, City);
		action.selectByVisibleText(State, state);
		action.type(zipCode, Code);
		action.click(driver, placeOrder);
		return new OrderConfirmationPage();
	}

}
