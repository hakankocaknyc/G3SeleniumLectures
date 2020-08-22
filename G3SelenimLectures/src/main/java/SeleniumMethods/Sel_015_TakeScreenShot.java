package SeleniumMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_015_TakeScreenShot {
	
  public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // will maximize webpage fullscreen
		driver.manage().deleteAllCookies(); // Clean test
		
		driver.get("https://www.ebay.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//bunu ezberle
		FileUtils.copyFile(src, new File("/Users/hakankocak/Desktop/Pictures/hakan.png"));
		
		driver.close();
		// jpeg - png tif
		
		

	}


}
