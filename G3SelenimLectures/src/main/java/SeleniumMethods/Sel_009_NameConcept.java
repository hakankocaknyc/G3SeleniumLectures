package SeleniumMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_NameConcept {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/login");
		
		
		Thread.sleep(3000);
		
		//First usage
		 
	  /*
	   * 
	 
		
		WebElement userElement = driver.findElement(By.name("username"));
		userElement.sendKeys("hakan@gmail.com");
		Thread.sleep(3000);
		
		WebElement userPassword = driver.findElement(By.name("password"));
		userPassword.sendKeys("233333");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.className("radius"));
		login.click();
		//WebElement text = driver.findElement(By.id("flash"));
		//text.getText(); // text nasil alinacak
//		ElementUtil.getAlertText(driver);
		 
		  */
		//Second 
		 
	 /*
	  * 

		
		driver.findElement(By.name("username")).sendKeys("hk@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("e34fet");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	
 	  */
		
		//Third usage
	 
	/*
	 	  
	 
		
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
		
		WebElement userElement = driver.findElement(username);
		Thread.sleep(3000);
		userElement.sendKeys("Bizbunlaribiliriz@gmail.com");
		Thread.sleep(3000);
		WebElement userPassword = driver.findElement(password);
		userPassword.sendKeys("7865@&5");
		Thread.sleep(3000);
		WebElement userLogin = driver.findElement(login);
		userLogin.click();
		*/
		//Fourth Usage
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
		
		ElementUtil.getElement(driver, username).sendKeys("LastPart@gmail.com");
		ElementUtil.getElement(driver,password).sendKeys("23r44tgv");
		ElementUtil.getElement(driver, login).click();
		 

	}

}
