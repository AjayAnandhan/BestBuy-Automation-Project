package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class LogInPage extends Base {
	
	Action action = new Action();

	@FindBy(id = "fld-e")
	WebElement userName;
	
	@FindBy(id = "fld-p1")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInBtn;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage logIn(String uname, String pwd) throws Throwable {
		action.type(userName, uname);
		action.type(password, pwd);
		action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public CheckOutPage logIn1(String uname, String pwd) throws Throwable {
		action.type(userName, uname);
		action.type(password, pwd);
		action.click(driver, signInBtn);
		return new CheckOutPage();
	}
}
