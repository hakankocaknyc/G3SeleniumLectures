package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_18_DropDownMenuWirthoutSelect {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> dayList = driver .findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(dayList.size());
		
		// For loop to print
		
		for (int i = 0; i < dayList.size(); i++) {
			
			String text = dayList.get(i).getText();
			System.out.println(text);
			
			if (text.equals("9")) {
				dayList.get(i).click();
				break;
				
			}
			
		}
		
		
	}

}
