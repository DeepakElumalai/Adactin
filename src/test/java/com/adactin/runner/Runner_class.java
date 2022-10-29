package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\features", glue = "com.adactin.stepdefinition")

public class Runner_class {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		

	}

	@AfterClass

	public static void teardown() {
		driver.close();

	}

}
