package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.utils.Constants;

public class FlightBookingPage {

	
	@FindBy(id= "inputName" )
	WebElement nameField;
	
	@FindBy(id="address")
	WebElement addressField;
	
	
	@FindBy(id="city")
	WebElement cityField;
	
	@FindBy(id="state")
	WebElement stateField;
	
	@FindBy(id="zipCode")
	WebElement zipCodeField;
	
	@FindBy(id="cardType")
	WebElement cardTypeDropdown;
	
	@FindBy(id="creditCardNumber")
	WebElement cardNumField;
	
	@FindBy(id="creditCardMonth")
	WebElement cardMonthField;
	
	@FindBy(id="creditCardYear")
	WebElement cardYearField;
	
	@FindBy(id ="nameOnCard")
	WebElement nameonCardField;
	
	@FindBy (css=".checkbox")
	WebElement rememberMemClick;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitField;
	
	@FindBy(xpath ="//div//h1")
	WebElement pageAcctualMessage;
	
	
	
	// Class Constructor
	
	public FlightBookingPage() {
		
		PageFactory.initElements(Constants.driver, this);
	}

	public void enterName(String name ) {
		nameField.sendKeys(name);
	}

	public void enterAddresss(String address ) {
		addressField.sendKeys(address);
	}
	
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	
	
	public void enterState(String state) {
		stateField.sendKeys(state);
	}
	
	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}
	
	public void chooseCardType(String cardType) {
		
		Select select = new Select (cardTypeDropdown);
		select.selectByVisibleText(cardType);
		
	}
	public void enterCardNum(String cardNum) {
		cardNumField.sendKeys(cardNum);
	}
	
	public void enterCardMonth(String month) {
		cardMonthField.sendKeys(month);
	}
	public void enterCardYear(String year) {
		cardYearField.sendKeys(year);
	}
	
	public void enterNameOnCard(String nameOnCard) {
		nameonCardField.sendKeys(nameOnCard);
	}
	
	public void clickRememberMeBox() {
		rememberMemClick.click();
	}
	
	public void clickSubmitButton() {
		submitField.click();
	}
	

	public void verifySuccessMessage(String expMessage) {
		if(pageAcctualMessage.getText().equals(expMessage)) {
		System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
	}
	
}
