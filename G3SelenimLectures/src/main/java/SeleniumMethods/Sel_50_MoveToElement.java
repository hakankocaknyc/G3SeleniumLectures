 package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_50_MoveToElement {
	public static WebDriver driver;
	 
	
	
	public static void main(String[] args) throws InterruptedException {
	 
		  WebDriverManager.chromedriver().setup();
		  
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  driver.get("https://www.verizonwireless.com/");
//		  WebElement phoneMenu = driver.findElement(By.xpath("//button[contains(text(), 'Phones list')]"));
//			
//			Actions actions = new Actions(driver);
//			actions.moveToElement(phoneMenu).build().perform();
//			
//			By smartPhone = By.id("thirdLevel00");
//			WebElement locator = driver.findElement(smartPhone);
//			locator.click();
////			actions.click().build().perform();
//		  
		  
		  
		  
	}

}
