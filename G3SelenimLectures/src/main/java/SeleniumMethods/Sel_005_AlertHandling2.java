package SeleniumMethods;

import org.openqa.selenium.Alert;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author hakankocak
 *
 */

public class Sel_005_AlertHandling2 {

	
	public static WebDriver driver;  //GENERIC METHOD

	public static void main(String[] args) throws InterruptedException {

//	    System.setProperty("webdriver.chrome.driver","/Users/mymac/Documents/workspace/Drivers/chromedriver");
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		if(ElementUtil.getAlertText(driver).equals("Please enter a valid user name")){
			System.out.println("Correct text");
		}else{
			System.out.println("Incorrect text");
		}
//		driver.quit();

	}
	public static String getAlertText(){
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		return text;
	}

}
