package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_45_FrameHandling {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		 
		//h2[contains(text(),'Title bar ')]
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		System.out.println(driver.getTitle());//Sample frames page
		
		
		WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Title bar ')]"));
		System.out.println(header.getText());//Title bar (top.html)
		System.out.println(driver.getTitle());//Sample frames page
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
	}

}
