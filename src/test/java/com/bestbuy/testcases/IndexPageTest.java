/**
 * 
 */
package com.bestbuy.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.bestbuy.base.Base;
import com.bestbuy.pages.LocationPage;

/**
 * 
 */
public class IndexPageTest extends Base{
	LocationPage locationPage =  new LocationPage();

	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void validateURL() throws Throwable {
		String result = locationPage.validateURL();
		String expectedURL = prop.getProperty("url");
		Assert.assertEquals(result, expectedURL);
	}
	
}
