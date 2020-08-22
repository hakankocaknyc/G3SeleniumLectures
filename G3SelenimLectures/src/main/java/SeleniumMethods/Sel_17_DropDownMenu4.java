package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_17_DropDownMenu4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		By day = By.id("day");
		By mount = By.id("month");
		By year = By.id("year");
		
		
		
		Thread.sleep(2000);
		 
		selectDropDownByIndex(driver, mount, 9 );
		Thread.sleep(2000);
		selectDropDownByIndex(driver, day, 9);
		
		Thread.sleep(2000);
		selectDropDownByIndex(driver, year, 9);
	}
	public static void selectDropDownByIndex(WebDriver driver,By locator, int index){
		
		WebElement element = getElement(driver, locator);
		
		Select select = new Select(element);
		 select.selectByIndex(index);
		 
	}
	/**
	 * Get Element
	 * @param driver
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(WebDriver driver, By locator){
		WebElement element = driver.findElement(locator);
		return element;
	}
	}