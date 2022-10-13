package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElement {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("manorajesh008@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("rajesh1992");
		WebElement loginbutton = driver.findElement(By.name("login"));
			loginbutton.click();
			
			
	}

}
