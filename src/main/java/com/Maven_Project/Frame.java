package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frame {
	WebDriver wd;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	WebElement frame;

	public WebElement getFrame() {
		return frame;
	}

	public Frame(WebDriver wd) {
		this.wd=wd;
		
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(name="qty")
	WebElement qty;

	public WebElement getQty() {
		return qty;
	}
	
	
	@FindBy(xpath="//select[@name='group_1']")
	WebElement size;

	public WebElement getSize() {
		return size;
	}
	
	  @FindBy(xpath="//button[@class='exclusive']")
	 WebElement click;

	public WebElement getClick() {
		return click;
	}
}














