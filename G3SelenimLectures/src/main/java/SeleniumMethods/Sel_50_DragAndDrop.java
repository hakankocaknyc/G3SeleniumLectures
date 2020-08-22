package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_50_DragAndDrop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceE = driver.findElement(By.id("draggable"));
		WebElement targetE = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceE, targetE).release().build().perform();
		
//		actions.clickAndHold(sourceE).moveToElement(targetE).build().perform();
		
		
	}

}
