package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class SamsungBrandPage extends Base{
	
	Action action = new Action();
	
	@FindBy(xpath = "//a[text()='Ultimate TVs']")
	WebElement tvBtn;
	
	public SamsungBrandPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SamsungProductPage clickOnCellPhone() throws Throwable {
		action.click(driver, tvBtn);
		return new SamsungProductPage();
	}
	
}
