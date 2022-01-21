package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Test_Runner extends BaseClass_1 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		WebDriver cd;
		
	cd=	browserlaunch("chrome");
		explicitwait();

		geturl("http://automationpractice.com/index.php");
		currenturl();

		Pom_1 c = new Pom_1(wd);

		click(c.getSign_In());

		Login_Page l = new Login_Page(wd);

		sendkeys(l.getUsername(), "akash1608@gmail.com");

		sendkeys(l.getPassword(), "Ak9087@123");
		click(l.getLogin());

		Click_Tshirt t = new Click_Tshirt(wd);
		click(t.getTshirt());
		js_down();
		sleep();

		Click_Image c1 = new Click_Image(wd);
		actionmove(c1.getClickImage());
		click(c1.getQuickview());
		sleep();

		Frame f = new Frame(wd);
		outerFrame(f.getFrame());

		clear(f.getQty());
		sendkeys(f.getQty(), "2");
		// ac.clear(); ac.sendKeys("2");

		actionclick(f.getSize());

		keypress();
		keyenter();
		sleep();

		// WebElement btn = wd.findElement(By.xpath("//button[@class='exclusive']"));
		click(f.getClick());
		sleep();
		defaultcontent();

		Summary_Page p = new Summary_Page(wd);
		click(p.getSummaryPage());
		js_down();

		Address_Page p1 = new Address_Page(wd);
		click(p1.getAddress());
		sleep();
		js_down();

		Shipping s = new Shipping(wd);
		click(s.getShipping()); //
		sleep(); // Thread.sleep(3000); // //

		Ship_2 h = new Ship_2(wd);
		click(h.getShip_2());
		sleep();

		js_down();
		click(h.getOk());
		sleep();
		js_down();

		Payment p2 = new Payment(wd);
		click(p2.getPayment());// check click
		sleep();
		js_down();

		click(p2.getEndok());
		js_down();
		screenshot();
		sleep();
		close();

	}

}