package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_32_ImplicitlyWaitForElement_1 {
  public static void main(String[] args) throws InterruptedException {
	  
	  
	 WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// imp wait will be applied for all the web elements by default global wait
		 
		
		driver.get("https://app.hubspot.com/login");
 Thread.sleep(5000);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// nullify imp wait 
 	driver.findElement(By.id("username")).sendKeys("hakan@sample.com");
}
}
