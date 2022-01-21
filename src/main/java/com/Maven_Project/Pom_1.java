package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_1 {
	WebDriver wd;
	@FindBy(xpath="//a[@class='login']")
	private WebElement Sign_In;

	public WebElement getSign_In() {
		return Sign_In;
	}

	public void setSign_In(WebElement sign_In) {
		Sign_In = sign_In;
	}
	
	public Pom_1(WebDriver wd) {
		
		this.wd=wd;
		
		PageFactory.initElements(wd, this);
		
	}

}


	
	
	
