package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");

		
 
 
		WebElement signIn= driver.findElement(By .xpath("//span[contains(text(),'Hello, Sign in')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signIn).build().perform();
		
		
		By accunt = By .xpath("//span[contains(text(),'Your Account')]");
		
		WebElement yourAccount = driver.findElement(accunt);
		yourAccount.click();
		
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
		
		driver.close();
		
	}

}
