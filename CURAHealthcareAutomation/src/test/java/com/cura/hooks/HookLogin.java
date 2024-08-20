package com.cura.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookLogin {

	public WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;

	    @Before("@Booking or @History or @Logout or @Profile or @Smoke or @Regression or @Critical")
	    public void setUp() {
	    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://katalon-demo-cura.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			homePage=new HomePage(driver);
			loginPage=new LoginPage(driver);
			homePage.clickmenubar();
			homePage.clicklogin();
			loginPage.enterusername("John Doe");
			loginPage.enterpassword("ThisIsNotAPassword");
			loginPage.clickloginbutton();
	    }

	    @After("@Booking or @History or @Logout or @Profile or @Smoke or @Regression or @Critical")
	    public void tearDown() {
	      
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
	}


