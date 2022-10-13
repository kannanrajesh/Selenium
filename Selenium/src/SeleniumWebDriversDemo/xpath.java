package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("rajesh.5672");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("rajesh1992");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(1000);
		WebElement lognfb = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		lognfb.click();
		Thread.sleep(1000);
		WebElement fblog = driver.findElement(By.xpath("//input[@name='email']"));
		fblog.sendKeys("manorajesh008@gmail.com");
		Thread.sleep(1000);
		WebElement lgpswd = driver.findElement(By.xpath("//input[@name='pass']"));
		lgpswd.sendKeys("rajesh1992");
		Thread.sleep(1000);
		WebElement fblgbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		fblgbtn.click();
		
		Thread.sleep(1000);
		WebElement popup = driver.findElement(By.xpath("//div[@class='_a9-v']"));
		popup.wait();
		WebElement notnow = driver.findElement(By.xpath("//button[@class='_a9-- _a9_1'][1]"));
		notnow.click();
		driver.close();
}
}
