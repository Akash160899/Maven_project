package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	WebDriver wd;
	@FindBy(xpath=("(//a[@title='Proceed to checkout'])[2]"))
	WebElement Address;

	public WebElement getAddress() {
		return Address;
	}
	public Address_Page(WebDriver wd) {
		this.wd=wd;
	PageFactory.initElements(wd, this);
	}
	
}
