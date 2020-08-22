package SeleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_46_LaunchBrowserConcept_1 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		String browser = "firefox";
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if (browser.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		
		
	}else if (browser.equalsIgnoreCase("IE")) {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();

	} 	else {
	System.out.println("no defined browser");
			}	
		driver.get("https://www.amazon.com");
}
	}
 
