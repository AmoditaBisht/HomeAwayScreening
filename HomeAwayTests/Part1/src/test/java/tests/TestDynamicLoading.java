package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobjects.DynamicLoading;

public class TestDynamicLoading {
	private WebDriver driver;
	private DynamicLoading dynamicLoading;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		dynamicLoading = new DynamicLoading(driver);
	}

	@Test
	public void hiddenElementLoads() {
		dynamicLoading.loadHomePage();
		assertTrue("addToCart button didn't display after loading", dynamicLoading.addToCartButtonPresent());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}