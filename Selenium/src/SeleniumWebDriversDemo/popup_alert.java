package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https:admin:admin @the-internet.herokuapp.com/");
		Thread.sleep(2000);
	}

}
