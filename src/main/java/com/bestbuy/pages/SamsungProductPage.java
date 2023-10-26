package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class SamsungProductPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = "//a[text()='Samsung - 55\" Class S95C OLED 4K UHD Smart Tizen TV']")
	WebElement selectProduct;
	
	public ProductPage clickOnProduct() {
		action.click(driver, selectProduct);
		return new ProductPage();
	}

}
