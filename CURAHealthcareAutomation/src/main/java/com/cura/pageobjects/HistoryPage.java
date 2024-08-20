package com.cura.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HistoryPage extends BasePage{

	public HistoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void VerifyHistorytitle() {
		
		String actual=driver.getTitle();
		String expected="CURA Healthcare Service";
		Assert.assertEquals(actual, expected);
	}
}
