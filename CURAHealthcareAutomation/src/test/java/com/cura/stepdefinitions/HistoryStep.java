package com.cura.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cura.hooks.HookLogin;
import com.cura.pageobjects.HistoryPage;
import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class HistoryStep {
	
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	HistoryPage historyPage; 
	public HistoryStep(HookLogin hooks) {
		
		
	  	this.driver=hooks.getDriver();
	  	this.loginPage = new LoginPage(driver);
	   this.homePage = new HomePage(driver);
	  this.historyPage=new HistoryPage(driver); 
		
	}
	

	@Given("User on Homepage")
	public void user_on_homepage() throws InterruptedException {
		 driver.getTitle(); 
}
	@When("User click on menubar and click on History")
	public void user_click_on_menubar_and_click_on_history() {
		homePage.clickmenubar();
		homePage.clickHistory();
	}

	@Then("User should be navigated to the History page")
	public void user_should_be_navigated_to_the_history_page() {
		
		historyPage.VerifyHistorytitle();
		
	}

}
