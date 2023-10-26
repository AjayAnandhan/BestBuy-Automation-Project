package com.bestbuy.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bestbuy.base.Base;
import com.bestbuy.pages.HomePage;

public class HomePageTest extends Base{

	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void validateTitle() throws Throwable {
		String expectedTitle 
	}
	
}
