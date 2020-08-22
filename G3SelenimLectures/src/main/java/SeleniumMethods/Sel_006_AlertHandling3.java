package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sel_006_AlertHandling3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		//URL 
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		
		//locator
		By goBtn = By.name("proceed");
		
		//launch browser
		driver = ElementUtil.launchBrowser(driver, "chrome");
		ElementUtil.launchURL(driver, url);
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clikOn(driver, goBtn);
		
		Thread.sleep(2000);
		
		String text = ElementUtil.getAlertText(driver);
		if(text.equals("Please enter a valid user name")){
			System.out.println("Text is correct");
		}else{
			System.out.println("Text is incorrect");

		}
		ElementUtil.quitBrowser(driver);
		
	}

}
