package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class ProductPage extends Base{

	Action action = new Action();
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement addToCart;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isAddToCartBtnVisible() {
		return action.isDisplayed(driver, addToCart);
	}
	
	public CartPage clickAddToCart( ) {
		action.click(driver, addToCart);
		return new CartPage();
	}
	
}
