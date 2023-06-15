package com.noorteck.qa.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.FlightBookingPage;
import com.noorteck.utils.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingSteps {
	
	FlightBookingPage pageObj;
	
	@Given("User navigate to {string}")
	public void user_navigate_to(String url) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		
		pageObj = new FlightBookingPage();
	   
	}

	@When("User enter Full name{string}")
	public void enterFullName(String name) {
		
		pageObj.enterName(name);
	  
	}

	@When("User enter address{string}")
	public void enterAddress(String address) {
		pageObj.enterAddresss(address);
	 
	}

	@When("User enter city {string}")
	public void enterCity(String city) {
		pageObj.enterCity(city);
	
	}

	@When("User enter state {string}")
	public void enterState(String state) {
	   
		pageObj.enterState(state);
	}

	@When("User enter zipCode {string}")
	public void enterZipCode(String zipCode) {
		
		pageObj.enterZipCode(zipCode);
	   
	}

	@When("User chooses cardType {string}")
	public void chooseCardType(String cardType) {
		
		pageObj.chooseCardType(cardType);
	   
	}

	@When("User enter cardNum	 {string}")
	public void enterCardNum(String cardNum) {
		pageObj.enterCardNum(cardNum);
	  
	}

	@When("User enter cardMonth  {string}")
	public void enterCardMonth(String cardMonth) {
		
		pageObj.enterCardMonth(cardMonth);
	   
	}

	@When("User enter cardYear  {string}")
	public void enterCardYear(String cardYear) {
		pageObj.enterCardYear(cardYear);
	  
	}

	@When("User enter nameOnCard {string}")
	public void enterNameOnCard(String nameOnCard) {
		pageObj.enterNameOnCard(nameOnCard);
	   
	}

	@When("User click  rememberMe")
	public void clickRememberMe() {
		
		pageObj.clickRememberMeBox();
	  
	}

	@When("User clicks Purchase button")
	public void submitPurchaseButton() throws InterruptedException {
		
		pageObj.clickSubmitButton();
		
		Thread.sleep(6000);
	   
	}

	@Then("User verifies success message {string}")
	public void verifyMessage(String message) {
		
		pageObj.verifySuccessMessage(message);
		
		Constants.driver.quit();
		
	  
	}

	

	

}
