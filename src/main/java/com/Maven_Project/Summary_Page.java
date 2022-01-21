package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	WebDriver wd;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
   WebElement SummaryPage;

	public WebElement getSummaryPage() {
		return SummaryPage;
	}
	public Summary_Page(WebDriver wd) {
		
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
		
	}
}
