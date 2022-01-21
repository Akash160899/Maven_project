package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	WebDriver wd;
	@FindBy(name="processAddress")
	WebElement shipping;

	public WebElement getShipping() {
		return shipping;
	}
	
	public Shipping(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
	}

}
