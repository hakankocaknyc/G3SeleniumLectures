package SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_008_ClassName {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000); // 5 seconds
		
		//form-control private-form__control login-email //en son kisimla calistirmaya calis olmuyorsa hepsinin kullan
		
		By username = By.className("login-email");
		
		ElementUtil.getElement(driver, username).sendKeys("hakan786@yahoo.com");
        //form-control private-form__control login-password m-bottom-3
//		ElementUtil.getElement(driver, locator)
	}

}