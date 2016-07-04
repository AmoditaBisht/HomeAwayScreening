package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobjects.Login;

public class TestLogin {
	private WebDriver driver;
	private Login login;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		login = new Login(driver);
	}

	@Test
	public void succeeded() {
		login.with("puneet8", "Pearson123");
		assertTrue("success message not present", login.successMessagePresent());
	}

	@Test
	public void failed() {
		login.with("puneet8", "badpassword");
		assertFalse("failure message wasn't present after providing bogus credentials", login.failureMessagePresent());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}