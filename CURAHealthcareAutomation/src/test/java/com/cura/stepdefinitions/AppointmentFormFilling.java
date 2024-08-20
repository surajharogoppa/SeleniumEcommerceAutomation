package com.cura.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.cura.hooks.HookLogin;
import com.cura.hooks.Hooks;
import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.en.*;

public class AppointmentFormFilling {
	
	WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	
	public  AppointmentFormFilling(HookLogin hooks) {
		
		
		  this.driver=hooks.getDriver();
		    this.loginPage = new LoginPage(driver);
			this.homePage = new HomePage(driver);
			
		}
	@Given("User is on home page")
	public void user_is_on_home_page() throws InterruptedException {
		
	    Thread.sleep(3000);
	    String expected=driver.getTitle();
		String actual="CURA Healthcare Service";
		Assert.assertEquals(actual,expected);
	   
	}

	@When("User Select The Facility as {string}")
	public void user_select_the_facility_as(String string) {
	 homePage.selectDropdownOptionByValue(string);
	}

	@When("User Click on Checkbox")
	public void user_click_on_checkbox() {
	   homePage.clickReadmissionCheckbox(null);
	}

	@When("User Select Health program RadioButton")
	public void user_select_health_program_radio_button() {
	    homePage.selectMedicaidRadioButton(null);
	}

	@When("User Enters the Date as {string}")
	public void user_enters_the_date_as(String string) {
	   homePage.enterDateField(string);
	}

	@When("User Enters The Comment As {string}")
	public void user_enters_the_comment_as(String string) {
	   homePage.enterComment(string);
	}

	@When("Click on BookAppointment")
	public void click_on_book_appointment() {
	   homePage.clickBookAppointment();
	}

	@Then("Appointment Should be Confirmed")
	public void appointment_should_be_confirmed() {
	   homePage.AppointmentConfirmed();
	}

	
	 

}
