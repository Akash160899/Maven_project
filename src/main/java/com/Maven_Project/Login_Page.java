package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver wd;
	@FindBy(name="email")
	WebElement Username;
	
	public WebElement getUsername() {
		return Username;
	}



	public Login_Page(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
	}
	@FindBy(name="passwd")
	WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="SubmitLogin")
	WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
}
