package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_33_ExplicitlyWait_1 {

public static void main(String[] args) {
		
		//It works with web element and non-web element
		//It waits available in web driver wait class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		//Non-Web Element
		WebDriverWait wait = new WebDriverWait(driver, 15);// 1.adim once zaman tanimlanacak 
		wait.until(ExpectedConditions.titleContains("HubSpot"));// 2.adim once zaman tanimlanacak 
		
//		//Web Element
		
		By email= By . id("username");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		 WebElement username = driver.findElement(email);
		 username.sendKeys("newjersey@gmail.com");
//		By email = By.id("username");
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		WebElement username = driver.findElement(email);
//		username.sendKeys("ilhan@sample.com");
//		//System.out.println(username);
		
		
		System.out.println("title is: "+ driver.getTitle());

	}

}
