package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_52_CustomizeXpath {
	public static void main(String[] args) {
		
		/* 
		  Xpath is used to find location of any element on a web page using html structure
		  
		  Absolute Xpath: start with single slash (/) starting from root element and all 
		 the way to the element
		Relative Xpath : start double slash(//) starting selection matching anywhere in the document
		
		 absolute xpath : html /body/di/div[5]/div[2]/li/div[1]/a
		
		Relative xpath :  //tagname[@attribute ='value']
		  
		 */
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		
		
		 //  //htmltagname[@attribute=''value]
		 
		 // //input[@id='username'] id xpath  username
		 // //input[@id='password'] id xpath  password
		 // //input[@id='password'and @type='password'] eger ilk bolum yeterli olmazsa 2 attributes kullan
		 // //button[@id='loginBtn']---> login button 
		 // //button[@id='loginBtn'and @data-test-id='password-login-button']  
		 
		 //  //input[@name='username']
		 
		 // Contains()
		 
		 // //input[contains(@id,'username')]
		 // //input[contains(@id,'password')]
		//input[contains(@id,'password')and @type='password']  
		//input[@class='btn btn-small' and  @value='Login'] 
		 
		 // Some value are available which return false or true
		 // Dynamic xpath dimanic oldugu icin safayiyeniledigin zaman xpath degisir
		 // before----> <input id = test_123> -----> after <input id = test_123> degisimi cozmek icin
		 // sample  // input[contains(@id,'test_')] contains functions kullanmaliyiz 
		 
		 // Contains is used for dynamic elements properties
		 
		 // text function
		 // text()
		 // //a[text()='Sign up']
//		 //i18n-string[text()='Sign up']    first usage
		//a//i18n-string[text()='Sign up'] second usage
		//a//i18n-string[text()='Privacy Policy']
		 
		 // h2[text()]
		 
		 // star -with function
		 
		 // input [start -with(@id,'username')]
		 
		 // and with
		
		
	}

}
