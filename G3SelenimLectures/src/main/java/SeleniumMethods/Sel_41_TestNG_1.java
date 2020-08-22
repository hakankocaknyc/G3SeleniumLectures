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

public class Sel_41_TestNG_1 {
	
	public static WebDriver driver;
	By email = By.id("email");
	By password = By.id("pass");
	By loginBtn = By.id("u_0_b");
	By bodyText = By.xpath("//h2[@class='uiHeaderTitle']");
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	}
	
	
	@Test(priority=1, description="This method gets title")
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
	}
	
	 @Test(priority=2, description="Login system using invalid username invalid pass")
	 public void invalidCredentials() throws InterruptedException {
	   getElement(driver, email).sendKeys("ilhan@sample.com");
	   getElement(driver, password).sendKeys("aboo123");
	   getElement(driver, loginBtn).click();
	   String text = getElement(driver, bodyText).getText();
	   System.out.println(text);
	   Assert.assertEquals(text, "That email address doesn't exist.");
		 
	   Thread.sleep(3000);
	 }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	/**
	 * 
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement element = driver.findElement(locator);
		return element;
	}

}
