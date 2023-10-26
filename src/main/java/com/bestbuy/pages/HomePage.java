package com.bestbuy.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bestbuy.actiondriver.Action;
import com.bestbuy.base.Base;

public class HomePage extends Base {
	
	Action action = new Action();
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	WebElement topDeals;
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealOfTheDay;
	
	@FindBy(xpath = "//a[text()='My Best By Membership']")
	WebElement membership;
	
	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditCards;
	
	@FindBy(xpath = "//a[text()='Best Buy Outlet']")
	WebElement outlet;
	
	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;
	
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement logIn;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createAccountBtn;
	
	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement searchBar;
	
	@FindBy(xpath = "//span[@class='header-search-icon']")
	WebElement  searchBtn;
	
	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;
	
	@FindBy(xpath = "//a[text()='Accessibility']")
	WebElement accessibility;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement TC;
	
	@FindBy(xpath = "//a[text()='Privacy']")
	WebElement privacy;
	
	@FindBy(xpath = "//a[text()='Interest-Based Ads']")
	WebElement ads;
	
	@FindBy(xpath = "//a[text()='State Privacy Rights']")
	WebElement statePrivacyRights;
	
	@FindBy(xpath = "//a[text()='Health Data Privacy']")
	WebElement healthDataPrivacy;
	
	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menuBtn;
	
	@FindBy(xpath = "//button[text()='TV & Home Theater']")
	WebElement tvAndHomeTheaterBtn;
	
	@FindBy(xpath = "//button[text()='Home Theater Audio & Video']")
	WebElement homeTheaterAudioVideoBtn;
	
	@FindBy(xpath = "//a[text()='Sound Bars']")
	WebElement soundBarsBtn;
	
	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brandsBtn;
	
	@FindBy(xpath = "//a[text()='Samsung']")
	WebElement samsungBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateHomePageMenu() throws Throwable{
		return action.isDisplayed(driver, menuBtn);
	}
	
	public boolean validateCart() throws Throwable {
		return action.isDisplayed(driver, cart);
	}
	
	public boolean validateSearchBar() throws Throwable {
		return action.isDisplayed(driver, searchBar);
	}
	
	public String validateTitle() throws Throwable {
		return driver.getTitle();
	}
	
	public SignUpPage clickOnCreateAccount() throws Throwable {
		action.click(driver, account);
		action.click(driver, createAccountBtn);
		return new SignUpPage();
	}
	
	public LogInPage clickSignInBtn() throws Throwable {
		action.click(driver, account);
		action.click(driver, logIn);
		return new LogInPage();
	}
	
	public TopDealsPage clickTopDeals() throws Throwable {
		action.click(driver, topDeals);
		return new TopDealsPage();
	}
	
	public DealOfTheDayPAge clickDealOfTheDay() throws Throwable {
		action.click(driver, dealOfTheDay);
		return new DealOfTheDayPAge();
	}
	
	public MembershipPage clickMyMembership() throws Throwable {
		action.click(driver, membership);
		return new MembershipPage();
	}
	
	public CreditCardsPage clickCreditCards() throws Throwable {
		action.click(driver, creditCards);
		return new CreditCardsPage();
	}
	
	public CreditCardsPage clickOutlet() throws Throwable {
		action.click(driver, outlet);
		return new CreditCardsPage();
	}
	public AccessibilityPage clickAccessibility() throws Throwable {
		action.click(driver, accessibility);
		return new AccessibilityPage();
	}
	
	public TermsAndConditionsPage clickTC() throws Throwable {
		action.click(driver, TC);
		return new TermsAndConditionsPage();
	}
	
	public PrivacyPage clickPrivacy() throws Throwable {
		action.click(driver, privacy);
		return new PrivacyPage();
	}
	
	public InterestBasedAdsPage clickAds() throws Throwable {
		action.click(driver, ads);
		return new InterestBasedAdsPage();
	}
	
	public StatePrivacyRightsPage clickStatePrivacyRights() throws Throwable {
		action.click(driver, statePrivacyRights);
		return new StatePrivacyRightsPage();
	}
	
	public HealthDataPrivacyPage clickHealthDataPrivacy() throws Throwable {
		action.click(driver, healthDataPrivacy);
		return new HealthDataPrivacyPage();
	}
	
	public SearchResultPage typeInSearchBar() throws Throwable {
		action.type(searchBar, prop.getProperty("searchBarText"));
		action.click(driver, searchBtn);
		return new SearchResultPage();
	}
	
	public SoundBarsProductPage clickSoundBarBtn() throws Throwable {
		action.click(driver, menuBtn);
		action.click(driver, tvAndHomeTheaterBtn);
		action.click(driver, homeTheaterAudioVideoBtn);
		action.click(driver, soundBarsBtn);
		return new SoundBarsProductPage();
	}
	
	public SamsungBrandPage clickSamsungProductBtn() throws Throwable {
		action.click(driver, menuBtn);
		action.click(driver, brandsBtn);
		action.click(driver, samsungBtn);
		return new SamsungBrandPage();
	}
	 
}
