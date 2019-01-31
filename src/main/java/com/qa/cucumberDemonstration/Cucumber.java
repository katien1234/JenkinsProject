package com.qa.cucumberDemonstration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber {
	WebDriver driver;
	LandingPage landingPage;
	MenuPage menuPage;

	//("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	@Before
	public void setup() {
		System.setProperty("phantomjs.binary.path", "C:\\Users\\Admin\\Desktop\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		driver = new PhantomJSDriver();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) throws Throwable {
	    driver.get(arg1);
	  
	   
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
	    landingPage = PageFactory.initElements(driver, LandingPage.class);
	    landingPage.searchBing(arg1);
		
		 
	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
