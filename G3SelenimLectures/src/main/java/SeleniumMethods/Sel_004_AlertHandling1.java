package SeleniumMethods;
//GOT IT
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_004_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","/Users/mymac/Documents/workspace/Drivers/chromedriver");
//		WebDriverManager.chromedriver().setup();
	
		// once WebDriver tanimlacak  daha sonra get metod ile gidilecek adres yazilacak
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// 1. adim Locators sing buttona gitmek lazim bu da findElement ile yapilacak
		
	 
		driver.findElement(By.name("proceed")).click();   //by xpath //input[@name='proceed']
	 
		Thread.sleep(2000);
		
		// 2. adim  To handle alert we will use alert interface
		
		
		Alert alert = driver.switchTo().alert(); 
		
		String text = alert.getText();
		
		System.out.println(text);
		
		// Verification 
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct text: " +text);
		}else{
			System.out.println("Incorrect text: " +text);
		}
		
//		alert.accept();   //means do it  
//		alert.dismiss();  //means cancel it
		
		driver.quit();
		
		

	}

}
