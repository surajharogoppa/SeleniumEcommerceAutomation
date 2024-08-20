package com.cura.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProfilePage extends BasePage{

	public ProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void VerifyProfiletitle() {
		
		String actual=driver.getTitle();
		String expected="CURA Healthcare Service";
		Assert.assertEquals(actual, expected);
	}
}
