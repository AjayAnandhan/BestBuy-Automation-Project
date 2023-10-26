package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class OrderConfirmationPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = " //span[text()='Thanks for your order!']")
	WebElement msg;
	
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateMessage() throws Throwable{
		String msgStr = msg.getText();
		if (msgStr.contains("Thanks for your order!")) {
			System.out.println("Order was placed successfully");
		} else {
			System.out.println("Order was not places successfully");
		}
		return msgStr;
	}

}
