package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ship_2 {
	WebDriver wd;
	@FindBy(name="cgv")
	WebElement ship_2;

	public WebElement getShip_2() {
		return ship_2;
	}
	
	public Ship_2(WebDriver wd) {
		
	this.wd=wd;
	
	PageFactory.initElements(wd, this);
	
	}
	@FindBy(name="processCarrier")
	WebElement ok;

	public WebElement getOk() {
		return ok;
	}
}
