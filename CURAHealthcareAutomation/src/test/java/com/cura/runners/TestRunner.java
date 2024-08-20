package com.cura.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",  // Path to your feature files
    glue = {"com.cura.stepdefinitions","com.cura.hooks"}, // Path to your step definitions
    tags="@Smoke or @Regression or @Critical or @Login or @Booking or @History or @Logout or @Profile", 
   plugin = {"pretty", "html:target/cucumber-reports.html"}  // Plugins for reporting
    //monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
	
    // This class will run the Cucumber tests using TestNG
} 
