package SeleniumMethods;

import javax.swing.plaf.basic.BasicButtonUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.tools.jar.resources.jar;

public class Sel_44_JavaScriptExample_1 {
	public static WebDriver driver;
	public static String url;
	
	public static void main(String[] args) throws InterruptedException {
		
 WebDriverManager.chromedriver().setup();
 
 	driver= new ChromeDriver();
 	url= "https://darksky.net/";
	driver.get(url);
	
	driver.manage().window().fullscreen();
	
//	Thread.sleep(5000);
	
//	System.out.println(driver.getTitle());  
	
	// get title with JS 
	
	String title = JavaScriptUtil.getTitleByJS(driver);
	System.out.println(title);
	
	// click with JS
	
//	WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
//	
//	JavaScriptUtil.clickElementByJS(signUpLink, driver);
//	Thread.sleep(2000);
	// refresh with JS 
	
//	JavaScriptUtil.refreshBrowserByJS(driver);
	
	// Generate Alert 
	
	
//	JavaScriptUtil.generateAlert(driver, "this page is sign up page");
//	JavaScriptUtil.drawBorder(signUpLink, driver);
	
	// send keys method
	

//	WebElement email = driver .findElement(By.id("username"));
//	WebElement password = driver .findElement(By.id("password"));
//	WebElement loginBtn = driver .findElement(By.id("loginBtn"));
//	JavaScriptUtil.sendKeysUsingJSWithID(driver, "username", "hakan@gmail.com");
	
//	JavaScriptUtil.drawBorder(email, driver);
	
	// flash method with JS
//	
//	WebElement email = driver .findElement(By.id("username"));
//	WebElement password = driver .findElement(By.id("password"));
//	WebElement loginBtn = driver .findElement(By.id("loginBtn"));
//	
//	JavaScriptUtil.flash(email, driver);
//	email.sendKeys("ohgfdias@gmail.com");
//	
//	
//	JavaScriptUtil.flash(password, driver);
//	password.sendKeys("1234test");
//	
//	JavaScriptUtil.flash(loginBtn, driver);
//	loginBtn.click();
	
	
//	System.out.println(JavaScriptUtil.getPageInnerText(driver));
	
//	System.out.println(JavaScriptUtil.getBrowserInfo(driver));
	
//	JavaScriptUtil.scrollPageDown(driver);
//	JavaScriptUtil.specificScrollPageDown(driver);
	
	WebElement privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
	JavaScriptUtil.scrollPageDown(driver);
//	JavaScriptUtil.scrollIntoView(privacy, driver);
	JavaScriptUtil.clickElementByJS(privacy, driver);
	
	}

}
