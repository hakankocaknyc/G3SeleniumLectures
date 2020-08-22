package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_17_DropDownMenu2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		selectDropDownValueBYText(day, "9");
		selectDropDownValueBYText(month, "Sep");
		selectDropDownValueBYText(year, "2012");

	}

	 public static void selectDropDownValueBYText(WebElement element, String value){
		 Select select = new Select(element);
		 select.selectByVisibleText(value);
		 
		 
	 }
	 
	 public static void selectDropdownByIndex(WebElement element, int index){
		 Select select = new Select(element);
		 select.deselectByIndex(index);
		 
	 }
}
