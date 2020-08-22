package SeleniumMethods;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_39_AuthPopup_1 {

	public static void main(String[] args) {
		
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 
	 // username is admin
	 // password is admin
	 
	 //https://admin:admin@the-internet.herokuapp.com/basic_auth
//	 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	 
	 String username = "admin";
	 String password = "admin";
	 
	 driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
