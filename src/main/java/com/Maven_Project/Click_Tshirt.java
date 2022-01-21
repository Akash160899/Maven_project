package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Tshirt {

	@FindBy(xpath=("(//a[text()='T-shirts'])[2]"))
	WebElement Tshirt;
	WebDriver wd;
	

	public WebElement getTshirt() {
		return Tshirt;
	}
	
	public Click_Tshirt(WebDriver wd) {
  
	this.wd=wd;
		
		PageFactory.initElements(wd, this);
		
	}
	
}
