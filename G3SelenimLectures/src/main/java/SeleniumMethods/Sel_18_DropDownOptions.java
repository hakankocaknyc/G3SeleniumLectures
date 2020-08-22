package SeleniumMethods;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.media.sound.SoftSynthesizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_18_DropDownOptions {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// Writing all values
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select1 = new Select(day);
		Select select2 = new Select(month);
		Select select3 = new Select(year);
		
		// Writing all values 
		
		
		List<WebElement> dayOptions = select1.getOptions();
		System.out.println(dayOptions.size()); //32
		
		
		List<WebElement>mountOptions = select2.getOptions();
		System.out.println(mountOptions.size());
		
				
				for(int i = 0; i<dayOptions.size(); i++){
			//String text = dayOptions.get(i).getText();
			System.out.println(dayOptions.get(i).getText());
		}
		

	}

}