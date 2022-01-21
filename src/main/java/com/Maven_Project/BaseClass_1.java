package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass_1 {
	public static WebDriver wd;

	// click...
	public static void click(WebElement element) {
		element.click();

	}
	// sendkeys...

	public static void sendkeys(WebElement values, String sendvalues) {
		values.sendKeys(sendvalues);

	}

	// get current url....
	public static void currenturl() {
		String currentUrl = wd.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// get tittle......
	public static void gettitle() {
		String title = wd.getTitle();
		System.out.println(title);

	}

	// close....
	public static void close() {
		wd.close();
	}

	// quite
	public static void quite() {
		wd.quit();

	}

	// url....

	public static void geturl(String url) {
		wd.get(url);

	}

	// thread.sleep...
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);

	}

	// clear....
	public static void clear(WebElement e) {
		e.clear();

	}

	// java script executor..... scroll up...
	private void js_up() {
		JavascriptExecutor cj = (JavascriptExecutor) wd;
		cj.executeScript("window.scrollBy(0,-1000);");

	}

	// java script executor scroll down....
	public static void js_down() {
		JavascriptExecutor mm = (JavascriptExecutor) wd;
		mm.executeScript("window.scrollBy(0,500);");

	}

	// take screenshot method....//
	public static void screenshot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) wd;

		File start = ts.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Maven_Project\\Screenshots\\pic1.png");
		FileHandler.copy(start, end);

	}

	// actions .....move to element

	public static void actionmove(WebElement k) {
		Actions ac = new Actions(wd);
		ac.moveToElement(k).build().perform();

	}

	// click
	public static void actionclick(WebElement b) {
		Actions rr = new Actions(wd);
		rr.click(b).build().perform();

	}

	// alerts....ok
	public static void ok(WebElement hh) {
		Alert ok = wd.switchTo().alert();
		ok.accept();
	}

	// alerts dismiss...
	public static void dismiss(WebElement p) {
		Alert dis = wd.switchTo().alert();
		dis.dismiss();

	}

	// navigation methods..
	public static void navigateto(String o) {
		wd.navigate().to(o);

	}
	// navigate back..

	public static void navigateback() {
		wd.navigate().back();

	}

	// navigate forward
	public static void navigateforward() {
		wd.navigate().forward();

	}

	// refresh
	public static void refresh() {
		wd.navigate().refresh();

	}

	// get text
	public static void gettext(WebElement f) {
		String text = f.getText();
		System.out.println(text);

	}

	// get attribute...
	public static void getattribute(WebElement d) {
		String attribute = d.getAttribute("value");
		System.out.println(attribute);

	}

	// is displayed or not
	public static void displayornot(WebElement k) {
		boolean o = k.isDisplayed();
		System.out.println(o);

	}

	// is enabled...
	public static void enableornot(WebElement l) {

		boolean b = l.isEnabled();
		System.out.println(b);

	}

	// is selected
	public static void isselected(WebElement b) {
		boolean j = b.isSelected();
		System.out.println(j);

	}

	// dropdown..
	public static void selectbyvalue(WebElement u, String o) {
		Select s = new Select(u);
		s.selectByValue(o);

	}

	// select by index
	public static void selectbyindex(WebElement i, int p) {
		Select c = new Select(i);
		c.selectByIndex(p);

	}

	// select by visible text...
	public static void selectbyvisibletext(WebElement s, String y) {
		Select vv = new Select(s);
		vv.selectByVisibleText(y);

	}

	// de- select by value....
	public static void deselectbyvalue(WebElement d, String y) {
		Select er = new Select(d);
		er.deselectByValue(y);

	}

	// de select by index...
	public static void deselectbyindex(WebElement s, int r) {
		Select we = new Select(s);
		we.deselectByIndex(r);
	}

	// de select by visible text...
	public static void deselectbyvisibletext(WebElement s, String g) {
		Select cv = new Select(s);
		cv.deselectByVisibleText(g);
	}

	// is multiple or not...
	public static void multipleorNot(WebElement y) {
		Select mm = new Select(y);
		boolean multiple = mm.isMultiple();
		System.out.println(multiple);

	}

	// getoptions...
	public static void getoption(WebElement p) {
		Select sr = new Select(p);
		List<WebElement> options = sr.getOptions();
		System.out.println(options);

	}

	// get all selected option...
	public static void getallselected(WebElement e) {
		Select s = new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions);

	}

	// waits...

	public static void implicitWait() {
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	// explicit wait..
	public static void explicitwait() {

		WebDriverWait wait = new WebDriverWait(wd, 30);
	}

	// frames...outer
	public static void outerFrame(WebElement u) {

		wd.switchTo().frame(u);

	}

	// innerframe
	private void innerFrame(WebElement k) {
		wd.switchTo().frame(k);

	}

	// to come outof frame...
	public static void defaultcontent() {

		wd.switchTo().defaultContent();

	}

	// robot class.... key press
	public static void keypress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	// robot class enter...
	public static void keyenter() throws AWTException {
		Robot vv = new Robot();
		vv.keyPress(KeyEvent.VK_ENTER);
		vv.keyRelease(KeyEvent.VK_ENTER);
	}

	// browser launch..
	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					// "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			wd = new ChromeDriver();
			

		} else if (browser.equalsIgnoreCase("firefox")) {
			////
		}
		wd.manage().window().maximize();

		return wd;
	}

}
