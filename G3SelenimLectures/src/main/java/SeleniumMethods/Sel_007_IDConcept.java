package SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_IDConcept {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().fullscreen();// ChromeOptions-- maximize parameter  interview sorusu
//		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//ID ilk once ID check et sonra uygunsa kullan
		//ID is a locator in DOM (HTML) id is unique (benzersiz)
		
		//First Usage
		/*
		 * 
		
		WebElement userElement = driver.findElement(By.id("username"));//locator her zaman String
		 
		userElement.sendKeys("boblerry@gmail.com");
		Thread.sleep(2000);
		WebElement userPass = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		userPass.sendKeys("test@123");
		Thread.sleep(2000);
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		loginBtn.click();
	
		 */
		//Second usage
		  // WebDriver ile WebElement arasindaki fark
		/*
		 * 
		 
		driver.findElement(By.id("username")).sendKeys("hakank78@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("2334@4");
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
 
		//		ElementUtil.getAlertText(driver);** text nasil aliniyor
		*/
		//Third Usage
		
		/* 
		By username = By.id("username");
		By password = By .id("password");
		By loginBtn = By .id("loginBtn");
		
	
 

 * 

		WebElement userElement = driver.findElement(username);
		userElement.sendKeys("hakan@gmail.com");
		WebElement userPassword = driver.findElement(password);
		userPassword.sendKeys("2233@wert");
		WebElement  login = driver.findElement(loginBtn);
		login.click();
		   */
		//Fouth Approach
		  
		
		By username = By.id("username");
		By password = By .id("password");
		By loginBtn1 = By .id("loginBtn");
		
		ElementUtil.getElement(driver, username).sendKeys("hakan@gmail.com");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, password).sendKeys("test1233#");
		Thread.sleep(2000);
		ElementUtil.getElement(driver, loginBtn1).click();
		Thread.sleep(2000);
		
		ElementUtil.clikOn(driver, loginBtn1);
 
	}

}