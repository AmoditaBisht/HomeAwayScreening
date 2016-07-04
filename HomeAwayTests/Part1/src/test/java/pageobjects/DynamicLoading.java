package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading extends Base {
	By buyNowButton = By.cssSelector(".buynow");
	By addToCartButton = By.cssSelector(".input-button-buy");

	public DynamicLoading(WebDriver driver) {
		super(driver);
	}

	public void loadHomePage() {
		visit("http://store.demoqa.com/");
		waitForIsDisplayed(buyNowButton, 10);
		click(buyNowButton);
	}

	public Boolean addToCartButtonPresent() {
		return waitForIsDisplayed(addToCartButton, 10);
	}
}