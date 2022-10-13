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

public class intagram {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("manorajesh008mail.com");
		//Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("rajesh1992");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		TakesScreenshot inst = (TakesScreenshot) driver;
		File screenshotAs = inst.getScreenshotAs(OutputType.FILE);
		File data = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium\\screenshot\\test.png");
		FileUtils.copyFile(screenshotAs,data);
	}
	

}
