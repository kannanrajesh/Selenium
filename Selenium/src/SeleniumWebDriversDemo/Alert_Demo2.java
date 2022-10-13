package SeleniumWebDriversDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Alert_Demo2 {

	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		//options.addArguments("incognito");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		//Thread.sleep(2000);
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		WebElement ok = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		ac.moveToElement(ok);
		ac.click(ok).build().perform();		
	}
}
