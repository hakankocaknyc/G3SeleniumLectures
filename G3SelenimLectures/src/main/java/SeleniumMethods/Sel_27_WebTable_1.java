package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Sel_27_WebTable_1 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1] //tr means table row td means table column
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		System.out.println("Company name is.....");
		for(int i = 2; i<=7; i++) {
			String actualXpath = beforeXpath+ i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			    if(element.getText().equals("Island Trading")) {
			    	System.out.println("company name :"+ element.getText()+ " is found"+ "at position "+ (i-1));
			    	break;
			    }
		}
		
		System.out.println("=================================");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		
		String afterXpathContact = "]/td[2]";
		System.out.println("Contact name is.....");
		for(int i = 2; i<=7; i++) {
			String actualXpath = beforeXpath+ i + afterXpathContact;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			    
		}
		
       System.out.println("=================================");
		
        //*[@id="customers"]/tbody/tr[2]/td[3]
		
		String afterXpathCountry = "]/td[3]";
		
		System.out.println("Country name is.....");
		for(int i = 2; i<=7; i++) {
			String actualXpath = beforeXpath+ i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			    
		}
		

	}

}