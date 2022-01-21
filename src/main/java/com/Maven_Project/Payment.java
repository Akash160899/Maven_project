package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	WebDriver wd;
	@FindBy(xpath="//a[@class='cheque']")
	WebElement payment;

	public WebElement getPayment() {
		return payment;
	}
	
	
	public Payment(WebDriver wd) {
		
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
		
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement endok;

	public WebElement getEndok() {
		return endok;
	}

}
