package com.cura.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cura.hooks.HookLogin;
import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class LogoutStep {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	public LogoutStep(HookLogin hooks) {
		
		
		  	this.driver=hooks.getDriver();
		  	this.loginPage = new LoginPage(driver);
		   this.homePage = new HomePage(driver);
			
		}
	


	@Given("user navigated home page and Click on Menubar")
	public void user_navigated_home_page_and_click_on_menubar() {
	   homePage.clickmenubar();
	}

	@When("User Cliks On Logout")
	public void user_cliks_on_logout() {
	
	  homePage.clickLogout();
	}

	@Then("User Will Logout")
	public void user_will_logout() {
		
	Assert.assertTrue(homePage.isCuraHealthcareTextDisplayed());
		driver.getTitle();
	}

}
