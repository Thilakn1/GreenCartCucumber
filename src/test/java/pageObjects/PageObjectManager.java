package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class PageObjectManager {

	public LandingPage lamdingPage;
	public WebDriver driver;
	public OffersPage offersPage;
	public CheckoutPage checkoutPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		lamdingPage = new LandingPage(driver);
		return lamdingPage;
	}

	public OffersPage OffersPage() {
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage() {
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
