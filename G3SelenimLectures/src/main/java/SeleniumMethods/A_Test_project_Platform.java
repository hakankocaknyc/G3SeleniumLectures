package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Test_project_Platform {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtil elementUtil = new ElementUtil();
		
//		JavaScriptUtil javaScriptUtil = new JavaScriptUtil();
		driver.get("https://testproject.io/platform/");
		
		 specificScrollPageDown(driver);
	 // Locator
		 By chatBox = By.cssSelector("div.intercom-lightweight-app-launcher");
		 driver.switchTo().frame(driver.findElement(chatBox));
		 ElementUtil.clikOn(driver, chatBox);
		 
		 
//		 
//		 By intercomChat = By.cssSelector("div.intercom-lightweight-app-launcher");
//			By cookiesBtn = By.id("cc-button");
//
//			public PlatformPage(WebDriver driver) {
//				this.driver = driver;
//				elementUtil = new ElementUtil(driver);
//			}
//			public void verifyTitle() {
//
//				WebDriverWait wait = new WebDriverWait(driver, 20);
//				wait.until(ExpectedConditions.titleContains(AppConstants.HOME_PAGE_TITLE));
//				String title = driver.getTitle();
//				System.out.println("home page title is: " + title);
////				Assert.assertEquals(title, AppConstants.HOME_PAGE_TITLE, "Title is incorrect");
//
//			}
//
//			public void clickIntercomChat() {
//				elementUtil.doClick(cookiesBtn);
//
//				JavaScriptUtil.specificScrollPageDown(driver);
//
//				elementUtil.doClick(intercomChat);
//			}
//
//		}
	}
	public static void specificScrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("scroll(0, 700);");
	}
}
