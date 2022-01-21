package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Image {
	WebDriver wd;
	@FindBy(xpath="//div[@class='product-image-container']")
	WebElement ClickImage;

	public WebElement getClickImage() {
		return ClickImage;
	}
   
	public Click_Image(WebDriver wd) {
	
		this.wd=wd;
		PageFactory.initElements(wd, this);
		
	}
	@FindBy(xpath="//a[@class='quick-view']")
	WebElement Quickview;

	public WebElement getQuickview() {
		return Quickview;
	}
	
}
