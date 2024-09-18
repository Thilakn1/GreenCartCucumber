package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	private By search = By.xpath("//input[@placeholder=\"Search for Vegetables and Fruits\"]");
	private By productName = By.xpath("//h4[@class=\"product-name\"]");
	private By topDeals = By.linkText("Top Deals");
	private By increment = By.xpath("//a[@class=\"increment\"]");
	private By addTocart = By.xpath("//button[text()=\"ADD TO CART\"]");
	
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	public String getLandingPageTitle() {
		return driver.getTitle();
		
	}
	public void incrementQuantity(int quantity) {
		
		for(int i=1; i<quantity; i++) {
			driver.findElement(increment).click();
		}
		
	}
	public void addToCart() {
		driver.findElement(addTocart).click();
	}
}
