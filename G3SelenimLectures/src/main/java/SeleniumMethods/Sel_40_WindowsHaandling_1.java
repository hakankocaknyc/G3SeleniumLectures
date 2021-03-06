package SeleniumMethods;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_40_WindowsHaandling_1 {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String>handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
	    String parentWindowId =	it.next();
	    System.out.println("Parent Window Id : " + parentWindowId);
	    
	    String ChildWindowId = it.next();
	    System.out.println("ChildWindowId Window ID " + ChildWindowId);
//	    driver.close();
	    // switch to window
	    driver.switchTo().window(ChildWindowId);
	    System.out.println("child window title is  " + driver.getTitle());
//	    driver.close();
	    driver.switchTo().window(parentWindowId);
	    System.out.println("Parent Window title is: " + driver.getTitle());
	    
	    driver.quit();
	}

}
