package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	//decleration
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement OgnHeaderTxt;
	
	public OrganizationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getOgnHeaderTxt() {
		return OgnHeaderTxt;
		
	}
	
}
