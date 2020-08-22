package SeleniumMethods;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_44_JavaScriptExample {

	public static WebDriver driver;
	public static String url;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		 
		
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
//	url= "https://darksky.net";
	url= "https://app.hubspot.com/login/";
	driver.get(url);
	
	driver.manage().window().fullscreen();
	
	Thread.sleep(5000);
	System.out.println(JavaScriptUtil.getTitleByJS(driver));
	
//	JavaScriptUtil.scrollPageDown(driver);
	
//	JavaScriptUtil.specificScrollPageDown(driver);
	
//	System.out.println(JavaScriptUtil.getPageInnerText(driver));
	
//	JavaScriptUtil.refreshBrowserByJS(driver);
//	WebElement signUpLink = driver.findElement(By.linkText("Sign up"));
//	JavaScriptUtil.clickElementByJS(signUpLink, driver);
//	JavaScriptUtil.drawBorder(signUpLink, driver);
	
//	WebElement email = driver .findElement(By.id("username"));
//	WebElement password = driver .findElement(By.id("password"));
//	WebElement loginBtn = driver .findElement(By.id("loginBtn"));
//	
//	JavaScriptUtil.flash(email, driver);
//	email.sendKeys("ohgfdias@gmail.com");
//	JavaScriptUtil.flash(password, driver);
//	password.sendKeys("1234test");
//	
//	JavaScriptUtil.flash(loginBtn, driver);
//	loginBtn.click();
//	
//	JavaScriptUtil.generateAlert(driver, "pls tester get warning from the page");
//	
	String browserInfo = JavaScriptUtil.getBrowserInfo(driver);
	System.out.println(browserInfo);
	
	}

}
