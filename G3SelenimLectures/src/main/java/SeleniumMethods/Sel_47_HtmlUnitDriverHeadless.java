package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_47_HtmlUnitDriverHeadless {

	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
	}

}
