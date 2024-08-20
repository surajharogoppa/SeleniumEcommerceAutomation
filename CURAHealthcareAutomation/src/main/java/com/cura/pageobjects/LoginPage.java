package com.cura.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "txt-username")
	WebElement username;

	@FindBy(id = "txt-password")
	WebElement password;

	@FindBy(id = "btn-login") 
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"login\"]/div/div/div[1]/p[2]") 
	WebElement Invalidlogintext;
	

	public void enterusername(String enterusername) {
		enterText(username, enterusername);
	}

	public void enterpassword(String enterpassword) {
		enterText(password, enterpassword);

	}

	public void clickloginbutton() {
		clickElement(loginbutton);
	}
	
	public String InvalidlogintextDisplayed() {
		
		
		return Invalidlogintext.getText();
		
	}
}
