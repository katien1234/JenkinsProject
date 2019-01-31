package com.qa.cucumberDemonstration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	public void clickMenu() {
		// TODO Auto-generated method stub
		
	}

	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menu;
	
	@FindBy(id="sb_form_q")
	private WebElement searchBox; 
	
	public void searchBing(String searchText) {
		searchBox.sendKeys(searchText);
		searchBox.submit(); 
	}
}
