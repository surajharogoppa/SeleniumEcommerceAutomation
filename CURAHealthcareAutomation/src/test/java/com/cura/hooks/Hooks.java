package com.cura.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cura.pageobjects.HomePage;
import com.cura.pageobjects.LoginPage;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public WebDriver driver;

	    @Before("@Login or @Smoke or Regression or @Negetive or @Positive")
	    public void setUp() {
	    WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://katalon-demo-cura.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @After("@Login or @Smoke or Regression or @Negetive or @Positive")
	    public void tearDown() {
	      
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    public WebDriver getDriver() {
	        return driver;
	    }
	}

