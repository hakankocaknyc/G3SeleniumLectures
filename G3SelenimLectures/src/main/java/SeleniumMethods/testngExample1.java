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

public class testngExample1 {
	
	public static WebDriver driver;
	By email = By.xpath("//input[@id='email']");
	By password = By.id("pass");
	By loginBtn = By.id("u_0_b");
	By bodyText = By.xpath("//h2[@class='uiHeaderTitle']");
	
	
	// Your username is invalid!
	@BeforeMethod
	public void setup () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
//		Thread.sleep(5000);
	}
	@Test(priority=1,description="This method gets title")
	public void getTitle(){
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}
	
	
	@Test(priority=2,description="This method gets title")
	public void invalidCredential(){
		
	getElement(driver, email).click();
	driver.findElement(email).sendKeys("hakan@gmail.com");
	getElement(driver, password).sendKeys("hk1234");
	getElement(driver, loginBtn).click();
	String text = getElement(driver,bodyText ).getText();
	System.out.println(text);
	Assert.assertEquals(text, "Enter Security Code");
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public static WebElement getElement(WebDriver driver, By locator) {
//		WebDriverWait wait = new WebDriverWait(driver, 1);
//		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}

}
