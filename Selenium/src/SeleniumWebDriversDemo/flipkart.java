package SeleniumWebDriversDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	}
	public void searchProducts()   {
		driver.findElement(By.name("q")).sendKeys("jbl speakers");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	public void navigate() throws InterruptedException {
		driver.navigate().to("https://www.enqos.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement spkrbtn = driver.findElement(By.linkText("Speakers"));
		spkrbtn.click();
	}
	public void close() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException  {
		flipkart obj =new flipkart();
		obj.launchBrowser();
		obj.searchProducts();
		
		obj.navigate();
		obj.close();
	}

}
