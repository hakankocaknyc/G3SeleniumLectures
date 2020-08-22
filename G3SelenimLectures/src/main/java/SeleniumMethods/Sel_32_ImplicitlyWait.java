package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_32_ImplicitlyWait {
public static void main(String[] args) {
		
		//This wait tells web driver to wait if the element is not available immidiatelly
		//and web driver waits till the element is visible in specific time
		// it will throw NoSuchElementException
		//Imp wait can be used only web element == NOT= NON- ELEMENT
	     //implicitly sadece element ile calisiyor
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//Imp wait can be used only web element == NOT= NON- ELEMENT
		
		
		driver.get("https://app.hubspot.com/login");
		
 
		System.out.println("title is :"+ driver.getTitle());

	}

}