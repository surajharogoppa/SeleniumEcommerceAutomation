package com.cura.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id ="btn-make-appointment")
	WebElement makeappointmentbutton;
	@FindBy(id = "menu-toggle")
	WebElement menubar;
	@FindBy(linkText = "Home") 
	WebElement home;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(xpath = "//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
	WebElement History;
	@FindBy(linkText = "Profile")
	WebElement Profile;
	@FindBy(linkText = "Logout")
	WebElement Logout;
	
	@FindBy(id = "combo_facility")
	public WebElement Facilitydropdown;
	@FindBy(id = "chk_hospotal_readmission")
	public WebElement readmissioncheckbox;
	@FindBy(id = "radio_program_medicare")
	public WebElement medicareradiobutton;
	@FindBy(id = "radio_program_medicaid")
	public WebElement medicaidradiobutton;
	@FindBy(id = "radio_program_none")
	public WebElement noneradiobutton;
	@FindBy(id = "txt_visit_date")
	public WebElement dateField;
	@FindBy(id = "txt_comment")
	public WebElement comment;
	@FindBy(id = "btn-book-appointment")
	public WebElement bookappointment;
	@FindBy(xpath = "//*[@id=\"summary\"]/div/div/div[1]/h2")
	public WebElement confirmationappointment;
	@FindBy(xpath = "//*[@id=\"top\"]/div/h1")
	public WebElement CuraHealthcareText;
	
	
	
	
	public void clickmenubar() {
		clickElement(menubar);
	}
	public void clickmakeappointment() {
		clickElement(makeappointmentbutton);
	}

	public void clickhome() {
		clickElement(home);
	}

	public void clicklogin() {
		clickElement(login);
	}
	public void clickHistory() {
		clickElement(History);
	}
	public void clickProfile() {
		clickElement(Profile);
	}
	public void clickLogout() {
		clickElement(Logout);
	}
	public boolean isCuraHealthcareTextDisplayed() {
        return CuraHealthcareText.isDisplayed();
    }

	
	public boolean isDropDownButtonDisplayed() {
        return Facilitydropdown.isDisplayed();
    }

	

	public void selectDropdownOptionByValue(String value) {
		clickElement(Facilitydropdown);
		Select dropdownSelect = new Select(Facilitydropdown);
		dropdownSelect.selectByValue(value);

	}

	public void clickReadmissionCheckbox(String value) {
		clickElement(readmissioncheckbox);

	}

	public void selectMedicareRadioButton(String value) {

		if (!medicareradiobutton.isSelected()) {
			medicareradiobutton.click();
		}
	}

	public void selectMedicaidRadioButton(String value) {

		if (!medicaidradiobutton.isSelected()) {
			medicaidradiobutton.click();
		}
	}

	public void selectNonedRadioButton(String value) {

		if (!noneradiobutton.isSelected()) {
			noneradiobutton.click();
		}

	}

	public void enterDateField(String date) {
		dateField.clear();
		dateField.sendKeys(date); // dd/mm/yyyy
	}

	public void enterComment(String value) {
		enterText(comment, value);
	}
	public void clickBookAppointment(){
		clickElement(bookappointment);
	}
	
	public boolean AppointmentConfirmed() {
		return confirmationappointment.isDisplayed();
	}
}
