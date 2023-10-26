package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class SearchResultPage extends Base{

	Action action = new Action();
	
	@FindBy(xpath = "//a[text()='Sony - PlayStation 5 Console - White']")
	WebElement product;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void isProductAvailable() {
		action.isDisplayed(driver, product);
	}
	
	public ProductPage clickOnProduct() throws Throwable {
		action.click(driver, product);
		return new ProductPage();
	}
	
	
	
}
