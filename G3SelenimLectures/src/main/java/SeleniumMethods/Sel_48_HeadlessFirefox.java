package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_48_HeadlessFirefox {
	// you can execute your test case without browser
	
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "/Users/hakankocak/Documents/workspace/Driver/geckodriver");
  WebDriverManager.chromedriver().setup();

  ChromeOptions co  = new ChromeOptions();
  co.addArguments("--headless");
		WebDriver driver = new ChromeDriver(co);
		 driver.get("https://siliconelabs.com");
		System.out.println(driver.getTitle());
		
			 
	}

}
