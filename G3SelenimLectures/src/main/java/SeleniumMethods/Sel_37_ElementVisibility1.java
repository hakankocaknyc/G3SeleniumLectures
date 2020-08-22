package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_37_ElementVisibility1 {
	public static void main(String[] args) {
		// isDisplayed
		// isEnabed
		// isSelected
		
		// Element visibility
		
		WebDriverManager. chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver. get("https://classic.crmpro.com/register/");
		
		WebElement submitElement = driver.findElement(By.id("submitButton"));
		
		System.out.println("Before Submit Button");
		
		System.out.println(submitElement.isDisplayed()); // true
		System.out.println(submitElement.isEnabled()); // false
		
		
		System.out.println("lane 30  is  " + driver.findElement(By.name("agreeTerms")).isSelected());
		 driver.findElement(By.name("agreeTerms")).click();
		 
		 System.out.println("lane 33  is  " + driver.findElement(By.name("agreeTerms")).isSelected());
		
		 System.out.println("After Submit Button");
			
			System.out.println(submitElement.isDisplayed()); // true
			System.out.println(submitElement.isEnabled()); // true
	}

}
