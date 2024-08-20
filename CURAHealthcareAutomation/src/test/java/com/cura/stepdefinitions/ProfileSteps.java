package com.cura.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cura.hooks.HookLogin;
import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;
import com.cura.pageobjects.ProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	ProfilePage profilePage;
	public ProfileSteps(HookLogin hooks) {
		
		
		  	this.driver=hooks.getDriver();
		  	this.loginPage = new LoginPage(driver);
		   this.homePage = new HomePage(driver);
		   this.profilePage=new ProfilePage(driver);
			
		}
	
	
	
	
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() {
	  driver.getTitle();
	}

	@When("User Clicks On MenuBar and clicks On Profile")
	public void user_clicks_on_menu_bar_and_clicks_on_profile() {
		homePage.clickmenubar();
		homePage.clickProfile();
	}

	@Then("User is navigated to the Profile page")
	public void user_is_navigated_to_the_profile_page() {
		profilePage.VerifyProfiletitle();;
	  
	}

}
