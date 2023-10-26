package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class SignUpPage extends Base{
	
	Action action = new Action();

	@FindBy(id = "firstName")
	WebElement firstName;
	
	@FindBy(id = "lastName")
	WebElement lastName;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "fld-p1")
	WebElement password;
	
	@FindBy(id = "reenterPassword")
	WebElement reEnterPassword;
	
	@FindBy(xpath = "//button[text()='Create an Account']")
	WebElement createAccountBtn;
	
	@FindBy(id = "phone")
	WebElement phoneNumber;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage createAccount(String fname, String lname, String uname, String pwd, String num) throws Throwable {
		action.type(firstName, fname);
		action.type(lastName, lname);
		action.type(email, uname);
		action.type(password, pwd);
		action.type(reEnterPassword, pwd);
		action.type(phoneNumber, num);
		action.click(driver, createAccountBtn);
		return new HomePage();
	}
	
}
