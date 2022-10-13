package SeleniumWebDriversDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_Demo {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hai hello");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]")).click();
		Thread.sleep(1000);
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(outerframe);
		Thread.sleep(1000);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
		driver.switchTo().frame(innerframe);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hai hello how are u");
		Thread.sleep(1000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href=\"SwitchTo.html\"]")).click();
		
	}

}
