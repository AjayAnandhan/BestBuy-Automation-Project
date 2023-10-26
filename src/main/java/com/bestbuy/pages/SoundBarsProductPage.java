package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class SoundBarsProductPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = "//a[text()='JBL']")
	WebElement jbl;
	
	@FindBy(xpath = " //button[text()='Continue shopping']")
	WebElement continueShopping;
	
	@FindBy(xpath = "//span[text()='JBL - PartyBox 110 Portable Party Speaker - Black']")
	WebElement jblProduct;
	
	public SoundBarsProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBrand() {
		action.click(driver, jbl);
	}
	
	public ProductPage clickOnProduect() throws Throwable {
		action.click(driver, jblProduct);
		return new ProductPage();
	}
	
	public void clickOnContinueShopping() {
		action.JSClick(driver, continueShopping);
	}

}
