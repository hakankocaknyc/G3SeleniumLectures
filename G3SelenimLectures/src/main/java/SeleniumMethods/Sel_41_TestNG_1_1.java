package SeleniumMethods;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_41_TestNG_1_1 {
	
	 public static WebDriver driver;
	 By email = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		By bodyText = By.xpath("//div[@class='private-alert__inner']/h5");
	 
	@BeforeMethod// before mrthod runs before all test cases
	
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https:// app.hupspot.com/login");
		
		
		
		
	}

	
	@Test 
	public void InvalidCredentialsException(){
		getElement(driver, email).sendKeys("haka@gmail.com");
		 getElement(driver, password).sendKeys("aboo123");
		   getElement(driver, loginBtn).click();
		   String text = getElement(driver, bodyText).getText();
		   System.out.println(text);
		   Assert.assertEquals(text, "That email address doesn't exist.");
		
	}
	
	@AfterMethod
	
	
	
public static WebElement getElement(WebDriver driver, By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
		
	}

	public void tearDown(){
		driver.quit();
		}
}
