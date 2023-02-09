package org.baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 public static WebDriver driver;
	
	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void openEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	public static  void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void minWindow() {
		driver.manage().window().minimize();
	}
	public static void closeBrowser() {
		driver.quit();
	}
	public static void closeCurrentUrl() {
		driver.close();
	}
	public static void reLoadPage() {
		driver.navigate().refresh();
	}
	public static void fetchTitle() {
		String titlename = driver.getTitle();
		System.out.println("TitleName :"+titlename);
	}
	public static void fetchCurrenturl() {
	String url = driver.getCurrentUrl();
	
	if (url.contains("privacy_mutation_token")) {
		   System.out.println("user is in password incorrect page");
		
		
	}
	}
	public static void fillTextBox(WebElement element , String input) {
		element.sendKeys(input);
		
	}
	public static void launchurl(String pgUrl) {
		driver.get(pgUrl);
	}
	public static void holdExecution(int time) throws InterruptedException {
		Thread.sleep(time);
		
	}
	public static void applyimplicitwait(int sec) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	public static void clickButton(WebElement ele) {
      ele.click();
	}
	
}
