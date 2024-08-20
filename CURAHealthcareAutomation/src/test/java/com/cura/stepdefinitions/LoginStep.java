package com.cura.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.cura.hooks.Hooks;
import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class LoginStep {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginStep(Hooks hooks) {
		
		
		  	this.driver=hooks.getDriver();
		  	this.loginPage = new LoginPage(driver);
		   this.homePage = new HomePage(driver);
			
		}


	@Given("User is on Login page")
	public void user_is_on_login_page() throws InterruptedException {
	
		homePage.clickmenubar();
		homePage.clicklogin();
	    Thread.sleep(3000);
	    String expected=driver.getTitle();
		String actual="CURA Healthcare Service";
		Assert.assertEquals(actual,expected);
		
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) { 
		
		loginPage.enterusername(string);
		loginPage.enterpassword(string2);
		loginPage.clickloginbutton();
        
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(homePage.isDropDownButtonDisplayed());

	}

	@Then("User should see the error Massage {string}")
	public void user_should_see_the_error_massage(String expectedErrorMessege) throws InterruptedException {

		String actualErrorMessage = loginPage.InvalidlogintextDisplayed();
		Assert.assertEquals(actualErrorMessage, expectedErrorMessege);
	}

}
