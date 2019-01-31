package com.qa.cucumberDemonstration;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;bv 

public class StepDefinition {
	WebDriver driver;
	LandingPage landingPage;
	MenuPage menuPage;

	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", CONSTANTS.WEBDRIVERLOCATION);
		driver = new ChromeDriver();
	}

@Given("^the correct web address$")
public void the_correct_web_address() throws Throwable {
    driver.get(CONSTANTS.TEATESTINGWEBSITE);
}

@When("^I navigate to the 'Menu' page$")
public void i_navigate_to_the_Menu_page() throws Throwable {
   landingPage = PageFactory.initElements(driver, LandingPage.class);
   landingPage.clickMenu();
}

@Then("^I can browse a list of the available products\\.$")
public void i_can_browse_a_list_of_the_available_products() throws Throwable {
	menuPage = PageFactory.initElements(driver,  MenuPage.class);;
	assertEquals("List not present", true, menuPage.isListPresent());
    throw new PendingException();
}

@When("^I click the checkout button$")
public void i_click_the_checkout_button() throws Throwable {

    throw new PendingException();
}

@Then("^I am taken to the checkout page$")
public void i_am_taken_to_the_checkout_page() throws Throwable {
   
    throw new PendingException();
}

}
