package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	//decleration
	@FindBy(name="firstname")
	private WebElement firstNameTextEnt;
	
	@FindBy(name="lastname")
	private WebElement lastNameTxtEnt;
	
	@FindBy(xpath="//input[@accesskey=\"S\"]")
	private WebElement saveBtn;
	
	//initialization
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
   //business libraries
    public WebElement getFirstNameTxtEnt() {
    	return firstNameTextEnt;
    	}
    
    public WebElement getLastNameTxtEnt() {
    	return lastNameTxtEnt;
    }
    
    public WebElement getSaveBtn() {
		return saveBtn;
    	}
    
    //utilization
    public void createAContact(String firstname, String lastname) {
    	firstNameTextEnt.sendKeys(firstname);
    	lastNameTxtEnt.sendKeys(lastname);
    	saveBtn.click();
    }
}
