package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gdrive {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/drive/");
			driver.manage().window().maximize();
			WebElement gtd = driver.findElement(By.xpath("//a[@data-label='hero'][2]"));
			gtd.click();
			WebElement sign = driver.findElement(By.name("identifier"));
			sign.sendKeys("manorajesh008@gmail.com");
			
			WebElement next = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
			next.click();
			
	}

}
