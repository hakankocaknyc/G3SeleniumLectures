package SeleniumMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

public class Sel_002_WebDriverBasicWithFirefox {

	public static void main(String[] args) {
		
		// Set property
		System.setProperty("webdriver.gecko.driver", "/Users/hakankocak/Documents/workspace/Driver/geckodriver");
		//Exception in thread "main"	java.lang.IllegalStateException
		// Setup browser
		WebDriver driver = new FirefoxDriver();
		
		// Launch browser
		driver.get("http://www.google.com/");
		
		// get title 
		String title = driver.getTitle();
		System.out.println(title);
		
		
		// Verify title 
		
		if (title.equals("Homepage - SiliconeLabs")) {
			System.out.println("correct title");
			
		}
		else {
			System.out.println("incorrect title");
		}
		
		String URL = driver.getCurrentUrl();
		System.out.println("current URL: " +URL);
		
//	System.out.println(driver.getPageSource());
		
//		driver.close();
		driver.quit();
	}

}
