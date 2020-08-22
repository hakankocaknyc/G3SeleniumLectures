package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Sel_49_HeadlessChrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/hakankocak/Documents/workspace/Driver/chromedriver");

		
			FirefoxOptions op = new FirefoxOptions();
			op.addArguments("--headless");
			
			WebDriver driver = new FirefoxDriver(op);
			
			driver.get("https://www.amazon.com/");
			System.out.println(driver.getTitle());
	}

}