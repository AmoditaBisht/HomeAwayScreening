package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends Base {
	By loginFormLocator = By.id("login_form");
	By usernameLocator = By.id("log");
	By passwordLocator = By.id("pwd");
	By submitButton = By.id("login");
	By successMessageLocator = By.cssSelector(".entry-title");
	By failureMessageLocator = By.cssSelector(".response");

	public Login(WebDriver driver) {
		super(driver);
		visit("http://store.demoqa.com/products-page/your-account/");
		assertTrue("The login form is not present", isDisplayed(loginFormLocator));
	}

	public void with(String username, String password) {
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(submitButton);
	}

	public Boolean successMessagePresent() {
		return isDisplayed(successMessageLocator);
	}

	public Boolean failureMessagePresent() {
		return isDisplayed(failureMessageLocator);
	}
}